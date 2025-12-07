package de.fabmax.box2djni;

import box2d.*;
import org.junit.jupiter.api.Test;
import org.lwjgl.system.MemoryStack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterCallbackTest {
    @Test
    public void simpleWorldTest() {
        try (var stack = MemoryStack.stackPush()) {
            var worldDef = b2WorldDef.createAt(stack, MemoryStack::nmalloc);
            B2_World.defaultWorldDef(worldDef);
            var grav = b2Vec2.createAt(stack, MemoryStack::nmalloc);
            grav.setX(0.0f);
            grav.setY(-10.0f);
            worldDef.setGravity(grav);
            var worldId = B2_World.createWorld(worldDef);

            var customFilterCb = new CustomFilterCb();
            B2_World.setCustomFilterCallback(worldId, customFilterCb);

            var groundBodyDef = b2BodyDef.createAt(stack, MemoryStack::nmalloc);
            B2_Body.defaultBodyDef(groundBodyDef);
            var groundPos = b2Vec2.createAt(stack, MemoryStack::nmalloc);
            groundPos.setX(0.0f);
            groundPos.setY(-10.0f);
            groundBodyDef.setPosition(groundPos);
            var groundId = B2_Body.createBody(worldId, groundBodyDef);

            var groundBox = b2Polygon.createAt(stack, MemoryStack::nmalloc);
            B2_Geometry.makeBox(50.0f, 10.0f, groundBox);
            var groundShapeDef = b2ShapeDef.createAt(stack, MemoryStack::nmalloc);
            B2_Shape.defaultShapeDef(groundShapeDef);
            B2_Shape.createPolygonShape(groundId, groundShapeDef, groundBox);

            var bodyDef = b2BodyDef.createAt(stack, MemoryStack::nmalloc);
            B2_Body.defaultBodyDef(bodyDef);
            bodyDef.setType(b2BodyType.b2_dynamicBody);
            var bodyPos = b2Vec2.createAt(stack, MemoryStack::nmalloc);
            bodyPos.setX(0.0f);
            bodyPos.setY(10.0f);
            bodyDef.setPosition(bodyPos);
            var bodyId = B2_Body.createBody(worldId, bodyDef);

            var dynamicBox = b2Polygon.createAt(stack, MemoryStack::nmalloc);
            B2_Geometry.makeBox(1f, 1f, dynamicBox);
            var shapeDef = b2ShapeDef.createAt(stack, MemoryStack::nmalloc);
            B2_Shape.defaultShapeDef(shapeDef);
            shapeDef.setDensity(1.0f);
            var material = shapeDef.getMaterial();
            material.setFriction(0.3f);
            shapeDef.setMaterial(material);
            B2_Shape.createPolygonShape(bodyId, shapeDef, dynamicBox);

            float timeStep = 1f / 60f;
            int subStepCount = 4;
            for (int i = 0; i < 100; i++) {
                B2_World.step(worldId, timeStep, subStepCount);
            }

            assertTrue(customFilterCb.calls > 0);

            B2_World.destroyWorld(worldId);
            customFilterCb.destroy();
        }
    }

    static class CustomFilterCb extends b2CustomFilterFcnImpl {
        int calls = 0;

        @Override
        public boolean customFilterFcn(long shapeIdA, long shapeIdB) {
            calls++;
            return true;
        }
    }
}