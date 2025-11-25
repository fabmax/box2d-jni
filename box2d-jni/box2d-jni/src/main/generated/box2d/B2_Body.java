package box2d;


public class B2_Body extends NativeObject {

    protected B2_Body() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Body wrapPointer(long address) {
        return address != 0L ? new B2_Body(address) : null;
    }
    
    public static B2_Body arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Body(long address) {
        super(address);
    }

    // Functions

    /**
     * Use this to initialize your body definition
     * @ingroup body
     */
    public static void defaultBodyDef(b2BodyDef result) {
        Raw.defaultBodyDef(result.getAddress());
    }

    /**
     * Create a rigid body given a definition. No reference to the definition is retained. So you can create the definition
     * on the stack and pass it as a pointer.
     * @code{.c}
     * b2BodyDef bodyDef = b2DefaultBodyDef();
     * uint64_t myBodyId = b2CreateBody(myWorldId, &amp;bodyDef);
     * @endcode
     * @warning This function is locked during callbacks.
     */
    public static long createBody(long worldId, b2BodyDef def) {
        return Raw.createBody(worldId, def.getAddress());
    }

    /**
     * Destroy a rigid body given an id. This destroys all shapes and joints attached to the body.
     * Do not keep references to the associated shapes and joints.
     */
    public static void destroyBody(long bodyId) {
        Raw.destroyBody(bodyId);
    }

    /**
     * Body identifier validation. Can be used to detect orphaned ids. Provides validation for up to 64K allocations.
     */
    public static boolean isValid(long bodyId) {
        return Raw.isValid(bodyId);
    }

    /**
     * Get the body type: static, kinematic, or dynamic
     */
    public static b2BodyType getType(long bodyId) {
        return b2BodyType.forValue(Raw.getType(bodyId));
    }

    /**
     * Change the body type. This is an expensive operation. This automatically updates the mass
     * properties regardless of the automatic mass setting.
     */
    public static void setType(long bodyId, b2BodyType type) {
        Raw.setType(bodyId, type.value);
    }

    /**
     * Get the world position of a body. This is the location of the body origin.
     */
    public static b2Vec2 getPosition(long bodyId) {
        return b2Vec2.wrapPointer(Raw.getPosition(bodyId));
    }

    /**
     * Get the world rotation of a body as a cosine/sine pair (complex number)
     */
    public static b2Rot getRotation(long bodyId) {
        return b2Rot.wrapPointer(Raw.getRotation(bodyId));
    }

    /**
     * Get the world transform of a body.
     */
    public static b2Transform getTransform(long bodyId) {
        return b2Transform.wrapPointer(Raw.getTransform(bodyId));
    }

    /**
     * Set the world transform of a body. This acts as a teleport and is fairly expensive.
     * @note Generally you should create a body with then intended transform.
     */
    public static void setTransform(long bodyId, b2Vec2 position, b2Rot rotation) {
        Raw.setTransform(bodyId, position.getAddress(), rotation.getAddress());
    }

    /**
     * Get the current world AABB that contains all the attached shapes. Note that this may not encompass the body origin.
     * If there are no shapes attached then the returned AABB is empty and centered on the body origin.
     */
    public static b2AABB computeAABB(long bodyId) {
        return b2AABB.wrapPointer(Raw.computeAABB(bodyId));
    }

    /**
     * Get a local point on a body given a world point
     */
    public static b2Vec2 getLocalPoint(long bodyId, b2Vec2 worldPoint) {
        return b2Vec2.wrapPointer(Raw.getLocalPoint(bodyId, worldPoint.getAddress()));
    }

    /**
     * Get a world point on a body given a local point
     */
    public static b2Vec2 getWorldPoint(long bodyId, b2Vec2 localPoint) {
        return b2Vec2.wrapPointer(Raw.getWorldPoint(bodyId, localPoint.getAddress()));
    }

    /**
     * Get a local vector on a body given a world vector
     */
    public static b2Vec2 getLocalVector(long bodyId, b2Vec2 worldVector) {
        return b2Vec2.wrapPointer(Raw.getLocalVector(bodyId, worldVector.getAddress()));
    }

    /**
     * Get a world vector on a body given a local vector
     */
    public static b2Vec2 getWorldVector(long bodyId, b2Vec2 localVector) {
        return b2Vec2.wrapPointer(Raw.getWorldVector(bodyId, localVector.getAddress()));
    }

    /**
     * Get the linear velocity of a body's center of mass. Usually in meters per second.
     */
    public static b2Vec2 getLinearVelocity(long bodyId) {
        return b2Vec2.wrapPointer(Raw.getLinearVelocity(bodyId));
    }

    /**
     * Get the angular velocity of a body in radians per second
     */
    public static float getAngularVelocity(long bodyId) {
        return Raw.getAngularVelocity(bodyId);
    }

    /**
     * Set the linear velocity of a body. Usually in meters per second.
     */
    public static void setLinearVelocity(long bodyId, b2Vec2 linearVelocity) {
        Raw.setLinearVelocity(bodyId, linearVelocity.getAddress());
    }

    /**
     * Set the angular velocity of a body in radians per second
     */
    public static void setAngularVelocity(long bodyId, float angularVelocity) {
        Raw.setAngularVelocity(bodyId, angularVelocity);
    }

    /**
     * Set the velocity to reach the given transform after a given time step.
     * The result will be close but maybe not exact. This is meant for kinematic bodies.
     * The target is not applied if the velocity would be below the sleep threshold.
     * This will automatically wake the body if asleep.
     */
    public static void setTargetTransform(long bodyId, b2Transform target, float timeStep) {
        Raw.setTargetTransform(bodyId, target.getAddress(), timeStep);
    }

    /**
     * Get the linear velocity of a local point attached to a body. Usually in meters per second.
     */
    public static b2Vec2 getLocalPointVelocity(long bodyId, b2Vec2 localPoint) {
        return b2Vec2.wrapPointer(Raw.getLocalPointVelocity(bodyId, localPoint.getAddress()));
    }

    /**
     * Get the linear velocity of a world point attached to a body. Usually in meters per second.
     */
    public static b2Vec2 getWorldPointVelocity(long bodyId, b2Vec2 worldPoint) {
        return b2Vec2.wrapPointer(Raw.getWorldPointVelocity(bodyId, worldPoint.getAddress()));
    }

    /**
     * Apply a force at a world point. If the force is not applied at the center of mass,
     * it will generate a torque and affect the angular velocity. This optionally wakes up the body.
     * The force is ignored if the body is not awake.
     * @param bodyId The body id
     * @param force The world force vector, usually in newtons (N)
     * @param point The world position of the point of application
     * @param wake Option to wake up the body
     */
    public static void applyForce(long bodyId, b2Vec2 force, b2Vec2 point, boolean wake) {
        Raw.applyForce(bodyId, force.getAddress(), point.getAddress(), wake);
    }

    /**
     * Apply a force to the center of mass. This optionally wakes up the body.
     * The force is ignored if the body is not awake.
     * @param bodyId The body id
     * @param force the world force vector, usually in newtons (N).
     * @param wake also wake up the body
     */
    public static void applyForceToCenter(long bodyId, b2Vec2 force, boolean wake) {
        Raw.applyForceToCenter(bodyId, force.getAddress(), wake);
    }

    /**
     * Apply a torque. This affects the angular velocity without affecting the linear velocity.
     * This optionally wakes the body. The torque is ignored if the body is not awake.
     * @param bodyId The body id
     * @param torque about the z-axis (out of the screen), usually in N*m.
     * @param wake also wake up the body
     */
    public static void applyTorque(long bodyId, float torque, boolean wake) {
        Raw.applyTorque(bodyId, torque, wake);
    }

    /**
     * Apply an impulse at a point. This immediately modifies the velocity.
     * It also modifies the angular velocity if the point of application
     * is not at the center of mass. This optionally wakes the body.
     * The impulse is ignored if the body is not awake.
     * @param bodyId The body id
     * @param impulse the world impulse vector, usually in N*s or kg*m/s.
     * @param point the world position of the point of application.
     * @param wake also wake up the body
     * @warning This should be used for one-shot impulses. If you need a steady force,
     * use a force instead, which will work better with the sub-stepping solver.
     */
    public static void applyLinearImpulse(long bodyId, b2Vec2 impulse, b2Vec2 point, boolean wake) {
        Raw.applyLinearImpulse(bodyId, impulse.getAddress(), point.getAddress(), wake);
    }

    /**
     * Apply an impulse to the center of mass. This immediately modifies the velocity.
     * The impulse is ignored if the body is not awake. This optionally wakes the body.
     * @param bodyId The body id
     * @param impulse the world impulse vector, usually in N*s or kg*m/s.
     * @param wake also wake up the body
     * @warning This should be used for one-shot impulses. If you need a steady force,
     * use a force instead, which will work better with the sub-stepping solver.
     */
    public static void applyLinearImpulseToCenter(long bodyId, b2Vec2 impulse, boolean wake) {
        Raw.applyLinearImpulseToCenter(bodyId, impulse.getAddress(), wake);
    }

    /**
     * Apply an angular impulse. The impulse is ignored if the body is not awake.
     * This optionally wakes the body.
     * @param bodyId The body id
     * @param impulse the angular impulse, usually in units of kg*m*m/s
     * @param wake also wake up the body
     * @warning This should be used for one-shot impulses. If you need a steady force,
     * use a force instead, which will work better with the sub-stepping solver.
     */
    public static void applyAngularImpulse(long bodyId, float impulse, boolean wake) {
        Raw.applyAngularImpulse(bodyId, impulse, wake);
    }

    /**
     * Get the mass of the body, usually in kilograms
     */
    public static float getMass(long bodyId) {
        return Raw.getMass(bodyId);
    }

    /**
     * Get the rotational inertia of the body, usually in kg*m^2
     */
    public static float getRotationalInertia(long bodyId) {
        return Raw.getRotationalInertia(bodyId);
    }

    /**
     * Get the center of mass position of the body in local space
     */
    public static b2Vec2 getLocalCenterOfMass(long bodyId) {
        return b2Vec2.wrapPointer(Raw.getLocalCenterOfMass(bodyId));
    }

    /**
     * Get the center of mass position of the body in world space
     */
    public static b2Vec2 getWorldCenterOfMass(long bodyId) {
        return b2Vec2.wrapPointer(Raw.getWorldCenterOfMass(bodyId));
    }

    /**
     * Override the body's mass properties. Normally this is computed automatically using the
     * shape geometry and density. This information is lost if a shape is added or removed or if the
     * body type changes.
     */
    public static void setMassData(long bodyId, b2MassData massData) {
        Raw.setMassData(bodyId, massData.getAddress());
    }

    /**
     * Get the mass data for a body
     */
    public static b2MassData getMassData(long bodyId) {
        return b2MassData.wrapPointer(Raw.getMassData(bodyId));
    }

    /**
     * This update the mass properties to the sum of the mass properties of the shapes.
     * This normally does not need to be called unless you called SetMassData to override
     * the mass and you later want to reset the mass.
     * You may also use this when automatic mass computation has been disabled.
     * You should call this regardless of body type.
     * Note that sensor shapes may have mass.
     */
    public static void applyMassFromShapes(long bodyId) {
        Raw.applyMassFromShapes(bodyId);
    }

    /**
     * Adjust the linear damping. Normally this is set in b2BodyDef before creation.
     */
    public static void setLinearDamping(long bodyId, float linearDamping) {
        Raw.setLinearDamping(bodyId, linearDamping);
    }

    /**
     * Get the current linear damping.
     */
    public static float getLinearDamping(long bodyId) {
        return Raw.getLinearDamping(bodyId);
    }

    /**
     * Adjust the angular damping. Normally this is set in b2BodyDef before creation.
     */
    public static void setAngularDamping(long bodyId, float angularDamping) {
        Raw.setAngularDamping(bodyId, angularDamping);
    }

    /**
     * Get the current angular damping.
     */
    public static float getAngularDamping(long bodyId) {
        return Raw.getAngularDamping(bodyId);
    }

    /**
     * Adjust the gravity scale. Normally this is set in b2BodyDef before creation.
     */
    public static void setGravityScale(long bodyId, float gravityScale) {
        Raw.setGravityScale(bodyId, gravityScale);
    }

    /**
     * Get the current gravity scale
     */
    public static float getGravityScale(long bodyId) {
        return Raw.getGravityScale(bodyId);
    }

    /**
     * @return true if this body is awake
     */
    public static boolean isAwake(long bodyId) {
        return Raw.isAwake(bodyId);
    }

    /**
     * Wake a body from sleep. This wakes the entire island the body is touching.
     * @warning Putting a body to sleep will put the entire island of bodies touching this body to sleep,
     * which can be expensive and possibly unintuitive.
     */
    public static void setAwake(long bodyId, boolean awake) {
        Raw.setAwake(bodyId, awake);
    }

    /**
     * Enable or disable sleeping for this body. If sleeping is disabled the body will wake.
     */
    public static void enableSleep(long bodyId, boolean enableSleep) {
        Raw.enableSleep(bodyId, enableSleep);
    }

    /**
     * Returns true if sleeping is enabled for this body
     */
    public static boolean isSleepEnabled(long bodyId) {
        return Raw.isSleepEnabled(bodyId);
    }

    /**
     * Set the sleep threshold, usually in meters per second
     */
    public static void setSleepThreshold(long bodyId, float sleepThreshold) {
        Raw.setSleepThreshold(bodyId, sleepThreshold);
    }

    /**
     * Get the sleep threshold, usually in meters per second.
     */
    public static float getSleepThreshold(long bodyId) {
        return Raw.getSleepThreshold(bodyId);
    }

    /**
     * Returns true if this body is enabled
     */
    public static boolean isEnabled(long bodyId) {
        return Raw.isEnabled(bodyId);
    }

    /**
     * Disable a body by removing it completely from the simulation. This is expensive.
     */
    public static void disable(long bodyId) {
        Raw.disable(bodyId);
    }

    /**
     * Enable a body by adding it to the simulation. This is expensive.
     */
    public static void enable(long bodyId) {
        Raw.enable(bodyId);
    }

    /**
     * Set this body to have fixed rotation. This causes the mass to be reset in all cases.
     */
    public static void setFixedRotation(long bodyId, boolean flag) {
        Raw.setFixedRotation(bodyId, flag);
    }

    /**
     * Does this body have fixed rotation?
     */
    public static boolean isFixedRotation(long bodyId) {
        return Raw.isFixedRotation(bodyId);
    }

    /**
     * Set this body to be a bullet. A bullet does continuous collision detection
     * against dynamic bodies (but not other bullets).
     */
    public static void setBullet(long bodyId, boolean flag) {
        Raw.setBullet(bodyId, flag);
    }

    /**
     * Is this body a bullet?
     */
    public static boolean isBullet(long bodyId) {
        return Raw.isBullet(bodyId);
    }

    /**
     * Get the world that owns this body
     */
    public static b2WorldId getWorld(long bodyId) {
        return b2WorldId.wrapPointer(Raw.getWorld(bodyId));
    }

    /**
     * Get the number of shapes on this body
     */
    public static int getShapeCount(long bodyId) {
        return Raw.getShapeCount(bodyId);
    }

    /**
     * Get the shape ids for all shapes on this body, up to the provided capacity.
     * @returns the number of shape ids stored in the user array
     */
    public static int getShapes(long bodyId, b2ShapeIdArray shapeArray) {
        return Raw.getShapes(bodyId, shapeArray.getAddress());
    }

    /**
     * Get the number of joints on this body
     */
    public static int getJointCount(long bodyId) {
        return Raw.getJointCount(bodyId);
    }

    /**
     * Get the joint ids for all joints on this body, up to the provided capacity
     * @returns the number of joint ids stored in the user array
     */
    public static int getJoints(long bodyId, b2JointIdArray jointArray) {
        return Raw.getJoints(bodyId, jointArray.getAddress());
    }

    /**
     * Enable/disable contact events on all shapes.
     * @warning changing this at runtime may cause mismatched begin/end touch events
     */
    public static void enableContactEvents(long bodyId, boolean flag) {
        Raw.enableContactEvents(bodyId, flag);
    }

    /**
     * Enable/disable hit events on all shapes
     */
    public static void enableHitEvents(long bodyId, boolean flag) {
        Raw.enableHitEvents(bodyId, flag);
    }

    /**
     * Get the maximum capacity required for retrieving all the touching contacts on a body
     */
    public static int getContactCapacity(long bodyId) {
        return Raw.getContactCapacity(bodyId);
    }

    /**
     * Get the touching contact data for a body.
     * @note Box2D uses speculative collision so some contact points may be separated.
     * @returns the number of elements filled in the provided array
     * @warning do not ignore the return value, it specifies the valid number of elements
     */
    public static int getContactData(long bodyId, b2ContactDataArray contactData) {
        return Raw.getContactData(bodyId, contactData.getAddress());
    }

    /**
     * Set the body name. Up to 31 characters excluding 0 termination.
     */
    public static void setName(long bodyId, String name) {
        Raw.setName(bodyId, name);
    }

    /**
     * Get the body name. May be null.
     */
    public static String getName(long bodyId) {
        return Raw.getName(bodyId);
    }

    /**
     * Set the user data for a body
     */
    public static void setUserData(long bodyId, NativeObject userData) {
        Raw.setUserData(bodyId, userData.getAddress());
    }

    /**
     * Get the user data stored in a body
     */
    public static NativeObject getUserData(long bodyId) {
        return NativeObject.wrapPointer(Raw.getUserData(bodyId));
    }

    public static class Raw {
        public static native void defaultBodyDef(long result);
        public static native long createBody(long worldId, long def);
        public static native void destroyBody(long bodyId);
        public static native boolean isValid(long bodyId);
        public static native int getType(long bodyId);
        public static native void setType(long bodyId, int type);
        public static native long getPosition(long bodyId);
        public static native long getRotation(long bodyId);
        public static native long getTransform(long bodyId);
        public static native void setTransform(long bodyId, long position, long rotation);
        public static native long computeAABB(long bodyId);
        public static native long getLocalPoint(long bodyId, long worldPoint);
        public static native long getWorldPoint(long bodyId, long localPoint);
        public static native long getLocalVector(long bodyId, long worldVector);
        public static native long getWorldVector(long bodyId, long localVector);
        public static native long getLinearVelocity(long bodyId);
        public static native float getAngularVelocity(long bodyId);
        public static native void setLinearVelocity(long bodyId, long linearVelocity);
        public static native void setAngularVelocity(long bodyId, float angularVelocity);
        public static native void setTargetTransform(long bodyId, long target, float timeStep);
        public static native long getLocalPointVelocity(long bodyId, long localPoint);
        public static native long getWorldPointVelocity(long bodyId, long worldPoint);
        public static native void applyForce(long bodyId, long force, long point, boolean wake);
        public static native void applyForceToCenter(long bodyId, long force, boolean wake);
        public static native void applyTorque(long bodyId, float torque, boolean wake);
        public static native void applyLinearImpulse(long bodyId, long impulse, long point, boolean wake);
        public static native void applyLinearImpulseToCenter(long bodyId, long impulse, boolean wake);
        public static native void applyAngularImpulse(long bodyId, float impulse, boolean wake);
        public static native float getMass(long bodyId);
        public static native float getRotationalInertia(long bodyId);
        public static native long getLocalCenterOfMass(long bodyId);
        public static native long getWorldCenterOfMass(long bodyId);
        public static native void setMassData(long bodyId, long massData);
        public static native long getMassData(long bodyId);
        public static native void applyMassFromShapes(long bodyId);
        public static native void setLinearDamping(long bodyId, float linearDamping);
        public static native float getLinearDamping(long bodyId);
        public static native void setAngularDamping(long bodyId, float angularDamping);
        public static native float getAngularDamping(long bodyId);
        public static native void setGravityScale(long bodyId, float gravityScale);
        public static native float getGravityScale(long bodyId);
        public static native boolean isAwake(long bodyId);
        public static native void setAwake(long bodyId, boolean awake);
        public static native void enableSleep(long bodyId, boolean enableSleep);
        public static native boolean isSleepEnabled(long bodyId);
        public static native void setSleepThreshold(long bodyId, float sleepThreshold);
        public static native float getSleepThreshold(long bodyId);
        public static native boolean isEnabled(long bodyId);
        public static native void disable(long bodyId);
        public static native void enable(long bodyId);
        public static native void setFixedRotation(long bodyId, boolean flag);
        public static native boolean isFixedRotation(long bodyId);
        public static native void setBullet(long bodyId, boolean flag);
        public static native boolean isBullet(long bodyId);
        public static native long getWorld(long bodyId);
        public static native int getShapeCount(long bodyId);
        public static native int getShapes(long bodyId, long shapeArray);
        public static native int getJointCount(long bodyId);
        public static native int getJoints(long bodyId, long jointArray);
        public static native void enableContactEvents(long bodyId, boolean flag);
        public static native void enableHitEvents(long bodyId, boolean flag);
        public static native int getContactCapacity(long bodyId);
        public static native int getContactData(long bodyId, long contactData);
        public static native void setName(long bodyId, String name);
        public static native String getName(long bodyId);
        public static native void setUserData(long bodyId, long userData);
        public static native long getUserData(long bodyId);
    }
}
