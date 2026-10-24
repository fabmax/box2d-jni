package box2dandroid;


public class B2_Shape extends NativeObject {

    protected B2_Shape() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Shape wrapPointer(long address) {
        return address != 0L ? new B2_Shape(address) : null;
    }
    
    public static B2_Shape arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Shape(long address) {
        super(address);
    }

    // Functions

    /**
     * Use this to initialize your shape definition
     */
    public static void defaultShapeDef(b2ShapeDef result) {
        Raw.defaultShapeDef(result.getAddress());
    }

    /**
     * Create a circle shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape
     */
    public static long createCircleShape(long bodyId, b2ShapeDef def, b2Circle circle) {
        return Raw.createCircleShape(bodyId, def.getAddress(), circle.getAddress());
    }

    /**
     * Create a line segment shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id or b2_nullShapeId if the segment is too short.
     */
    public static long createSegmentShape(long bodyId, b2ShapeDef def, b2Segment segment) {
        return Raw.createSegmentShape(bodyId, def.getAddress(), segment.getAddress());
    }

    /**
     * Create a chain segment shape and attach it to a body. The shape definition and geometry are
     * fully cloned. The segment is not owned by any chain shape (b2Shape_GetParentChain returns
     * b2_nullChainId). Contacts are not created until the next time step. The chainId on the segment
     * is ignored. This uses more memory than using a chain shape, so I don't recommend using this.
     * @return the shape id, or b2_nullShapeId if the segment is too short.
     */
    public static long createChainSegmentShape(long bodyId, b2ShapeDef def, b2ChainSegment chainSegment) {
        return Raw.createChainSegmentShape(bodyId, def.getAddress(), chainSegment.getAddress());
    }

    /**
     * Create a capsule shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape, this will be b2_nullShapeId if the length is too small.
     */
    public static long createCapsuleShape(long bodyId, b2ShapeDef def, b2Capsule capsule) {
        return Raw.createCapsuleShape(bodyId, def.getAddress(), capsule.getAddress());
    }

    /**
     * Create a polygon shape and attach it to a body. The shape definition and geometry are fully cloned.
     * Contacts are not created until the next time step.
     * @return the shape id for accessing the shape
     */
    public static long createPolygonShape(long bodyId, b2ShapeDef def, b2Polygon polygon) {
        return Raw.createPolygonShape(bodyId, def.getAddress(), polygon.getAddress());
    }

    /**
     * Destroy a shape. You may defer the body mass update which can improve performance if several shapes on a
     * body are destroyed at once.
     */
    public static void destroyShape(long shapeId, boolean updateBodyMass) {
        Raw.destroyShape(shapeId, updateBodyMass);
    }

    /**
     * Shape identifier validation. Provides validation for up to 64K allocations.
     */
    public static boolean isValid(long id) {
        return Raw.isValid(id);
    }

    /**
     * Get the type of a shape
     */
    public static b2ShapeType getType(long shapeId) {
        return b2ShapeType.forValue(Raw.getType(shapeId));
    }

    /**
     * Get the id of the body that a shape is attached to
     */
    public static long getBody(long shapeId) {
        return Raw.getBody(shapeId);
    }

    /**
     * Get the world that owns this shape
     */
    public static b2WorldId getWorld(long shapeId) {
        return b2WorldId.wrapPointer(Raw.getWorld(shapeId));
    }

    /**
     * Returns true if the shape is a sensor. It is not possible to change a shape
     * from sensor to solid dynamically because this breaks the contract for
     * sensor events.
     */
    public static boolean isSensor(long shapeId) {
        return Raw.isSensor(shapeId);
    }

    /**
     * Set the user data for a shape
     */
    public static void setUserData(long shapeId, NativeObject userData) {
        Raw.setUserData(shapeId, userData.getAddress());
    }

    /**
     * Get the user data for a shape. This is useful when you get a shape id
     * from an event or query.
     */
    public static NativeObject getUserData(long shapeId) {
        return NativeObject.wrapPointer(Raw.getUserData(shapeId));
    }

    /**
     * Set the mass density of a shape, usually in kg/m^2.
     * This will optionally update the mass properties on the parent body.
     */
    public static void setDensity(long shapeId, float density, boolean updateBodyMass) {
        Raw.setDensity(shapeId, density, updateBodyMass);
    }

    /**
     * Get the density of a shape, usually in kg/m^2
     */
    public static float getDensity(long shapeId) {
        return Raw.getDensity(shapeId);
    }

    /**
     * Set the friction on a shape
     */
    public static void setFriction(long shapeId, float friction) {
        Raw.setFriction(shapeId, friction);
    }

    /**
     * Get the friction of a shape
     */
    public static float getFriction(long shapeId) {
        return Raw.getFriction(shapeId);
    }

    /**
     * Set the shape restitution (bounciness)
     */
    public static void setRestitution(long shapeId, float restitution) {
        Raw.setRestitution(shapeId, restitution);
    }

    /**
     * Get the shape restitution
     */
    public static float getRestitution(long shapeId) {
        return Raw.getRestitution(shapeId);
    }

    /**
     * Set the user material identifier
     */
    public static void setUserMaterial(long shapeId, long material) {
        Raw.setUserMaterial(shapeId, material);
    }

    /**
     * Get the user material identifier
     */
    public static long getUserMaterial(long shapeId) {
        return Raw.getUserMaterial(shapeId);
    }

    /**
     * Set the shape surface material
     */
    public static void setSurfaceMaterial(long shapeId, b2SurfaceMaterial surfaceMaterial) {
        Raw.setSurfaceMaterial(shapeId, surfaceMaterial.getAddress());
    }

    /**
     * Get the shape surface material
     */
    public static b2SurfaceMaterial getSurfaceMaterial(long shapeId) {
        return b2SurfaceMaterial.wrapPointer(Raw.getSurfaceMaterial(shapeId));
    }

    /**
     * Get the shape filter
     */
    public static b2Filter getFilter(long shapeId) {
        return b2Filter.wrapPointer(Raw.getFilter(shapeId));
    }

    /**
     * Set the current filter. This is almost as expensive as recreating the shape. This may cause
     * contacts to be immediately destroyed. However contacts are not created until the next world step.
     * Sensor overlap state is also not updated until the next world step.
     */
    public static void setFilter(long shapeId, b2Filter filter) {
        Raw.setFilter(shapeId, filter.getAddress());
    }

    /**
     * Enable sensor events for this shape.
     */
    public static void enableSensorEvents(long shapeId, boolean flag) {
        Raw.enableSensorEvents(shapeId, flag);
    }

    /**
     * Returns true if sensor events are enabled.
     */
    public static boolean areSensorEventsEnabled(long shapeId) {
        return Raw.areSensorEventsEnabled(shapeId);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors.
     * @warning changing this at run-time may lead to lost begin/end events
     */
    public static void enableContactEvents(long shapeId, boolean flag) {
        Raw.enableContactEvents(shapeId, flag);
    }

    /**
     * Returns true if contact events are enabled
     */
    public static boolean areContactEventsEnabled(long shapeId) {
        return Raw.areContactEventsEnabled(shapeId);
    }

    /**
     * Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * and must be carefully handled due to multithreading. Ignored for sensors.
     */
    public static void enablePreSolveEvents(long shapeId, boolean flag) {
        Raw.enablePreSolveEvents(shapeId, flag);
    }

    /**
     * Returns true if pre-solve events are enabled
     */
    public static boolean arePreSolveEventsEnabled(long shapeId) {
        return Raw.arePreSolveEventsEnabled(shapeId);
    }

    /**
     * Enable contact hit events for this shape. Ignored for sensors.
     */
    public static void enableHitEvents(long shapeId, boolean flag) {
        Raw.enableHitEvents(shapeId, flag);
    }

    /**
     * Returns true if hit events are enabled
     */
    public static boolean areHitEventsEnabled(long shapeId) {
        return Raw.areHitEventsEnabled(shapeId);
    }

    /**
     * Test a world point for overlap with a shape
     */
    public static boolean testPoint(long shapeId, b2Vec2 point) {
        return Raw.testPoint(shapeId, point.getAddress());
    }

    /**
     * Ray cast a single shape. The ray starts at the origin and extends by the translation. The output
     * point is a world position.
     */
    public static b2CastOutput castRay(long shapeId, b2Vec2 origin, b2Vec2 translation) {
        return b2CastOutput.wrapPointer(Raw.castRay(shapeId, origin.getAddress(), translation.getAddress()));
    }

    /**
     * Get a copy of the shape's circle. Asserts the type is correct.
     */
    public static b2Circle getCircle(long shapeId) {
        return b2Circle.wrapPointer(Raw.getCircle(shapeId));
    }

    /**
     * Get a copy of the shape's line segment. Asserts the type is correct.
     */
    public static b2Segment getSegment(long shapeId) {
        return b2Segment.wrapPointer(Raw.getSegment(shapeId));
    }

    /**
     * Get a copy of the shape's chain segment. These come from chain shapes.
     * Asserts the type is correct.
     */
    public static b2ChainSegment getChainSegment(long shapeId) {
        return b2ChainSegment.wrapPointer(Raw.getChainSegment(shapeId));
    }

    /**
     * Get a copy of the shape's capsule. Asserts the type is correct.
     */
    public static b2Capsule getCapsule(long shapeId) {
        return b2Capsule.wrapPointer(Raw.getCapsule(shapeId));
    }

    /**
     * Get a copy of the shape's convex polygon. Asserts the type is correct.
     */
    public static b2Polygon getPolygon(long shapeId) {
        return b2Polygon.wrapPointer(Raw.getPolygon(shapeId));
    }

    /**
     * Allows you to change a shape to be a circle or update the current circle.
     * This does not modify the mass properties.
     */
    public static void setCircle(long shapeId, b2Circle circle) {
        Raw.setCircle(shapeId, circle.getAddress());
    }

    /**
     * Allows you to change a shape to be a capsule or update the current capsule.
     * This does not modify the mass properties.
     */
    public static void setCapsule(long shapeId, b2Capsule capsule) {
        Raw.setCapsule(shapeId, capsule.getAddress());
    }

    /**
     * Allows you to change a shape to be a segment or update the current segment.
     */
    public static void setSegment(long shapeId, b2Segment segment) {
        Raw.setSegment(shapeId, segment.getAddress());
    }

    /**
     * Allows you to change a shape to be a polygon or update the current polygon.
     * This does not modify the mass properties.
     */
    public static void setPolygon(long shapeId, b2Polygon polygon) {
        Raw.setPolygon(shapeId, polygon.getAddress());
    }

    /**
     * Allows you to change a shape to be a loose chain segment or update the current chain segment.
     * The resulting shape does not belong to a chain shape. Asserts if the shape is already a chain
     * segment owned by a chain shape (chainId != B2_NULL_INDEX).
     */
    public static void setChainSegment(long shapeId, b2ChainSegment chainSegment) {
        Raw.setChainSegment(shapeId, chainSegment.getAddress());
    }

    /**
     * Get the parent chain id if the shape type is a chain segment, otherwise
     * returns b2_nullChainId.
     */
    public static long getParentChain(long shapeId) {
        return Raw.getParentChain(shapeId);
    }

    /**
     * Get the maximum capacity required for retrieving all the touching contacts on a shape
     */
    public static int getContactCapacity(long shapeId) {
        return Raw.getContactCapacity(shapeId);
    }

    /**
     * Get the touching contact data for a shape. The provided shapeId will be either shapeIdA or shapeIdB on the contact data.
     * @note Box2D uses speculative collision so some contact points may be separated.
     * @returns the number of elements filled in the provided array
     * @warning do not ignore the return value, it specifies the valid number of elements
     */
    public static int getContactData(long shapeId, b2ContactDataArray contactData) {
        return Raw.getContactData(shapeId, contactData.getAddress());
    }

    /**
     * Get the maximum capacity required for retrieving all the overlapped shapes on a sensor shape.
     * This returns 0 if the provided shape is not a sensor.
     * @param shapeId the id of a sensor shape
     * @returns the required capacity to get all the overlaps in b2Shape_GetSensorData
     */
    public static int getSensorCapacity(long shapeId) {
        return Raw.getSensorCapacity(shapeId);
    }

    /**
     * Get the overlap data for a sensor shape computed during the previous world step.
     * @param shapeId the id of a sensor shape
     * @param visitorIds a user allocated array that is filled with the overlapping shapes (visitors)
     * @returns the number of elements filled in the provided array
     * @warning do not ignore the return value, it specifies the valid number of elements
     * @warning overlaps may contain destroyed shapes so use b2Shape_IsValid to confirm each overlap
     */
    public static int getSensorData(long shapeId, b2ShapeIdArray visitorIds) {
        return Raw.getSensorData(shapeId, visitorIds.getAddress());
    }

    /**
     * Get the current world AABB
     */
    public static b2AABB getBounds(long shapeId) {
        return b2AABB.wrapPointer(Raw.getBounds(shapeId));
    }

    /**
     * Compute the mass data for a shape
     */
    public static b2MassData computeMassData(long shapeId) {
        return b2MassData.wrapPointer(Raw.computeMassData(shapeId));
    }

    /**
     * Get the closest point on a shape to a target point. Target and result are world positions.
     */
    public static b2Vec2 getClosestPoint(long shapeId, b2Vec2 target) {
        return b2Vec2.wrapPointer(Raw.getClosestPoint(shapeId, target.getAddress()));
    }

    /**
     * Apply a wind force to the body for this shape using the density of air. This considers the
     * projected area of the shape in the wind direction. This also considers the relative velocity of
     * the shape.
     * @param shapeId the shape id
     * @param wind the wind velocity in world space
     * @param drag the drag coefficient, the force that opposes the relative velocity
     * @param lift the lift coefficient, the force that is perpendicular to the relative velocity
     * @param wake should this wake the body
     */
    public static void applyWind(long shapeId, b2Vec2 wind, float drag, float lift, boolean wake) {
        Raw.applyWind(shapeId, wind.getAddress(), drag, lift, wake);
    }

    public static class Raw {
        public static native void defaultShapeDef(long result);
        public static native long createCircleShape(long bodyId, long def, long circle);
        public static native long createSegmentShape(long bodyId, long def, long segment);
        public static native long createChainSegmentShape(long bodyId, long def, long chainSegment);
        public static native long createCapsuleShape(long bodyId, long def, long capsule);
        public static native long createPolygonShape(long bodyId, long def, long polygon);
        public static native void destroyShape(long shapeId, boolean updateBodyMass);
        public static native boolean isValid(long id);
        public static native int getType(long shapeId);
        public static native long getBody(long shapeId);
        public static native long getWorld(long shapeId);
        public static native boolean isSensor(long shapeId);
        public static native void setUserData(long shapeId, long userData);
        public static native long getUserData(long shapeId);
        public static native void setDensity(long shapeId, float density, boolean updateBodyMass);
        public static native float getDensity(long shapeId);
        public static native void setFriction(long shapeId, float friction);
        public static native float getFriction(long shapeId);
        public static native void setRestitution(long shapeId, float restitution);
        public static native float getRestitution(long shapeId);
        public static native void setUserMaterial(long shapeId, long material);
        public static native long getUserMaterial(long shapeId);
        public static native void setSurfaceMaterial(long shapeId, long surfaceMaterial);
        public static native long getSurfaceMaterial(long shapeId);
        public static native long getFilter(long shapeId);
        public static native void setFilter(long shapeId, long filter);
        public static native void enableSensorEvents(long shapeId, boolean flag);
        public static native boolean areSensorEventsEnabled(long shapeId);
        public static native void enableContactEvents(long shapeId, boolean flag);
        public static native boolean areContactEventsEnabled(long shapeId);
        public static native void enablePreSolveEvents(long shapeId, boolean flag);
        public static native boolean arePreSolveEventsEnabled(long shapeId);
        public static native void enableHitEvents(long shapeId, boolean flag);
        public static native boolean areHitEventsEnabled(long shapeId);
        public static native boolean testPoint(long shapeId, long point);
        public static native long castRay(long shapeId, long origin, long translation);
        public static native long getCircle(long shapeId);
        public static native long getSegment(long shapeId);
        public static native long getChainSegment(long shapeId);
        public static native long getCapsule(long shapeId);
        public static native long getPolygon(long shapeId);
        public static native void setCircle(long shapeId, long circle);
        public static native void setCapsule(long shapeId, long capsule);
        public static native void setSegment(long shapeId, long segment);
        public static native void setPolygon(long shapeId, long polygon);
        public static native void setChainSegment(long shapeId, long chainSegment);
        public static native long getParentChain(long shapeId);
        public static native int getContactCapacity(long shapeId);
        public static native int getContactData(long shapeId, long contactData);
        public static native int getSensorCapacity(long shapeId);
        public static native int getSensorData(long shapeId, long visitorIds);
        public static native long getBounds(long shapeId);
        public static native long computeMassData(long shapeId);
        public static native long getClosestPoint(long shapeId, long target);
        public static native void applyWind(long shapeId, long wind, float drag, float lift, boolean wake);
    }
}
