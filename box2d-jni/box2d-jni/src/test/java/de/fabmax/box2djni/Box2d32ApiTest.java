package de.fabmax.box2djni;

import box2d.*;
import org.junit.jupiter.api.Test;
import org.lwjgl.system.MemoryStack;

import static org.junit.jupiter.api.Assertions.*;

public class Box2d32ApiTest {
    @Test
    public void jointsQueriesAndDebugDraw() {
        try (var stack = MemoryStack.stackPush()) {
            var worldDef = b2WorldDef.createAt(stack, MemoryStack::nmalloc);
            B2_World.defaultWorldDef(worldDef);
            var worldId = B2_World.createWorld(worldDef);

            var bodyDef = b2BodyDef.createAt(stack, MemoryStack::nmalloc);
            B2_Body.defaultBodyDef(bodyDef);
            var pos = b2Vec2.createAt(stack, MemoryStack::nmalloc);
            pos.setX(0.0f);
            pos.setY(-1.0f);
            bodyDef.setPosition(pos);
            var groundId = B2_Body.createBody(worldId, bodyDef);

            var box = b2Polygon.createAt(stack, MemoryStack::nmalloc);
            B2_Geometry.makeBox(10.0f, 1.0f, box);
            var shapeDef = b2ShapeDef.createAt(stack, MemoryStack::nmalloc);
            B2_Shape.defaultShapeDef(shapeDef);
            shapeDef.setEnableContactEvents(true);
            B2_Shape.createPolygonShape(groundId, shapeDef, box);

            bodyDef.setType(b2BodyType.b2_dynamicBody);
            pos.setY(2.0f);
            bodyDef.setPosition(pos);
            var bodyId = B2_Body.createBody(worldId, bodyDef);
            B2_Geometry.makeBox(0.5f, 0.5f, box);
            B2_Shape.createPolygonShape(bodyId, shapeDef, box);

            // revolute joint pinning the dynamic body to the ground, using the new local joint frames
            var jointDef = b2RevoluteJointDef.createAt(stack, MemoryStack::nmalloc);
            B2_RevoluteJoint.defaultRevoluteJointDef(jointDef);
            var base = jointDef.getBase();
            B2_Base.loadBodyId(groundId, base.getBodyIdA());
            B2_Base.loadBodyId(bodyId, base.getBodyIdB());
            var frameA = base.getLocalFrameA();
            frameA.getP().setX(0.0f);
            frameA.getP().setY(3.0f);
            var jointId = B2_RevoluteJoint.createRevoluteJoint(worldId, jointDef);
            assertTrue(B2_Joint.isValid(jointId));
            assertEquals(b2JointType.b2_revoluteJoint, B2_Joint.getType(jointId));
            assertEquals(3.0f, B2_Joint.getLocalFrameA(jointId).getP().getY(), 1e-6f);

            for (int i = 0; i < 60; i++) {
                B2_World.step(worldId, 1f / 60f, 4);
            }
            // body hangs from the pin instead of falling onto the ground
            assertTrue(B2_Body.getPosition(bodyId).getY() > 1.5f);
            assertTrue(B2_Body.getWorldCenter(bodyId).getY() > 1.5f);

            // ray cast with a callback that clips the ray (callback now returns a float fraction)
            var origin = b2Vec2.createAt(stack, MemoryStack::nmalloc);
            origin.setX(0.0f);
            origin.setY(10.0f);
            var translation = b2Vec2.createAt(stack, MemoryStack::nmalloc);
            translation.setX(0.0f);
            translation.setY(-20.0f);
            var filter = b2QueryFilter.createAt(stack, MemoryStack::nmalloc);
            filter.setCategoryBits(1L);
            filter.setMaskBits(-1L);
            var rayCb = new RayCb();
            B2_World.castRay(worldId, origin, translation, filter, rayCb);
            assertTrue(rayCb.hits > 0);
            rayCb.destroy();

            var closest = B2_World.castRayClosest(worldId, origin, translation, filter);
            assertTrue(closest.getHit());
            assertEquals(bodyId, B2_Shape.getBody(B2_Base.storeShapeId(closest.getShapeId())));

            // debug draw with defaults from b2DefaultDebugDraw (otherwise drawing bounds are empty)
            var debugDraw = b2DebugDraw.createAt(stack, MemoryStack::nmalloc);
            B2_World.defaultDebugDraw(debugDraw);
            debugDraw.setDrawShapes(true);
            debugDraw.setDrawBounds(true);
            var drawCb = new DrawCb();
            B2_World.draw(worldId, debugDraw, drawCb);
            assertTrue(drawCb.polygons >= 2);
            assertTrue(drawCb.bounds >= 2);
            drawCb.destroy();

            B2_World.destroyWorld(worldId);
        }
    }

    static class RayCb extends b2CastResultFcnImpl {
        int hits = 0;

        @Override
        public float castResultFcn(long shapeId, b2Vec2 point, b2Vec2 normal, float fraction) {
            hits++;
            return fraction;
        }
    }

    static class DrawCb extends b2DebugDrawCallbacksImpl {
        int polygons = 0;
        int bounds = 0;

        @Override
        public void drawSolidPolygon(b2Transform transform, b2Vec2 vertices, int vertexCount, float radius, int color) {
            polygons++;
        }

        @Override
        public void drawBounds(b2AABB aabb, int color) {
            bounds++;
        }
    }
}
