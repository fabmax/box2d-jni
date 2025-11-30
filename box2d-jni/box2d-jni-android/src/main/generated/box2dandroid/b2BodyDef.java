package box2dandroid;


/**
 * A body definition holds all the data needed to construct a rigid body.
 * You can safely re-use body definitions. Shapes are added to a body after construction.
 * Body definitions are temporary objects used to bundle creation parameters.
 * Must be initialized using b2DefaultBodyDef().
 * @ingroup body
 */
public class b2BodyDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2BodyDef wrapPointer(long address) {
        return address != 0L ? new b2BodyDef(address) : null;
    }
    
    public static b2BodyDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2BodyDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2BodyDef
     */
    public static b2BodyDef createAt(long address) {
        Raw.b2BodyDef_placed(address);
        b2BodyDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2BodyDef
     */
    public static <T> b2BodyDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2BodyDef_placed(address);
        b2BodyDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2BodyDef() {
        address = Raw.b2BodyDef();
    }

    // Destructor

    public void destroy() {
        if (address == 0L) {
            throw new IllegalStateException(this + " is already deleted");
        }
        if (isExternallyAllocated) {
            throw new IllegalStateException(this + " is externally allocated and cannot be manually destroyed");
        }
        Raw.destroy(address);
        address = 0L;
    }

    // Attributes

    /**
     * The body type: static, kinematic, or dynamic.
     */
    public b2BodyType getType() {
        checkNotNull();
        return b2BodyType.forValue(Raw.getType(address));
    }

    /**
     * The body type: static, kinematic, or dynamic.
     */
    public void setType(b2BodyType value) {
        checkNotNull();
        Raw.setType(address, value.value);
    }

    /**
     * The initial world position of the body. Bodies should be created with the desired position.
     * @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * if the body is moved after shapes have been added.
     */
    public b2Vec2 getPosition() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPosition(address));
    }

    /**
     * The initial world position of the body. Bodies should be created with the desired position.
     * @note Creating bodies at the origin and then moving them nearly doubles the cost of body creation, especially
     * if the body is moved after shapes have been added.
     */
    public void setPosition(b2Vec2 value) {
        checkNotNull();
        Raw.setPosition(address, value.getAddress());
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public b2Rot getRotation() {
        checkNotNull();
        return b2Rot.wrapPointer(Raw.getRotation(address));
    }

    /**
     * The initial world rotation of the body. Use b2MakeRot() if you have an angle.
     */
    public void setRotation(b2Rot value) {
        checkNotNull();
        Raw.setRotation(address, value.getAddress());
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public b2Vec2 getLinearVelocity() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLinearVelocity(address));
    }

    /**
     * The initial linear velocity of the body's origin. Usually in meters per second.
     */
    public void setLinearVelocity(b2Vec2 value) {
        checkNotNull();
        Raw.setLinearVelocity(address, value.getAddress());
    }

    /**
     * The initial angular velocity of the body. Radians per second.
     */
    public float getAngularVelocity() {
        checkNotNull();
        return Raw.getAngularVelocity(address);
    }

    /**
     * The initial angular velocity of the body. Radians per second.
     */
    public void setAngularVelocity(float value) {
        checkNotNull();
        Raw.setAngularVelocity(address, value);
    }

    /**
     * Linear damping is used to reduce the linear velocity. The damping parameter
     * can be larger than 1 but the damping effect becomes sensitive to the
     * time step when the damping parameter is large.
     * Generally linear damping is undesirable because it makes objects move slowly
     * as if they are floating.
     */
    public float getLinearDamping() {
        checkNotNull();
        return Raw.getLinearDamping(address);
    }

    /**
     * Linear damping is used to reduce the linear velocity. The damping parameter
     * can be larger than 1 but the damping effect becomes sensitive to the
     * time step when the damping parameter is large.
     * Generally linear damping is undesirable because it makes objects move slowly
     * as if they are floating.
     */
    public void setLinearDamping(float value) {
        checkNotNull();
        Raw.setLinearDamping(address, value);
    }

    /**
     * Angular damping is used to reduce the angular velocity. The damping parameter
     * can be larger than 1.0f but the damping effect becomes sensitive to the
     * time step when the damping parameter is large.
     * Angular damping can be use slow down rotating bodies.
     */
    public float getAngularDamping() {
        checkNotNull();
        return Raw.getAngularDamping(address);
    }

    /**
     * Angular damping is used to reduce the angular velocity. The damping parameter
     * can be larger than 1.0f but the damping effect becomes sensitive to the
     * time step when the damping parameter is large.
     * Angular damping can be use slow down rotating bodies.
     */
    public void setAngularDamping(float value) {
        checkNotNull();
        Raw.setAngularDamping(address, value);
    }

    /**
     * Scale the gravity applied to this body. Non-dimensional.
     */
    public float getGravityScale() {
        checkNotNull();
        return Raw.getGravityScale(address);
    }

    /**
     * Scale the gravity applied to this body. Non-dimensional.
     */
    public void setGravityScale(float value) {
        checkNotNull();
        Raw.setGravityScale(address, value);
    }

    /**
     * Sleep speed threshold, default is 0.05 meters per second
     */
    public float getSleepThreshold() {
        checkNotNull();
        return Raw.getSleepThreshold(address);
    }

    /**
     * Sleep speed threshold, default is 0.05 meters per second
     */
    public void setSleepThreshold(float value) {
        checkNotNull();
        Raw.setSleepThreshold(address, value);
    }

    /**
     * Optional body name for debugging. Up to 31 characters (excluding null termination)
     */
    public String getName() {
        checkNotNull();
        return Raw.getName(address);
    }

    /**
     * Optional body name for debugging. Up to 31 characters (excluding null termination)
     */
    public void setName(String value) {
        checkNotNull();
        Raw.setName(address, value);
    }

    /**
     * Use this to store application specific body data.
     */
    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    /**
     * Use this to store application specific body data.
     */
    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    /**
     * Set this flag to false if this body should never fall asleep.
     */
    public boolean getEnableSleep() {
        checkNotNull();
        return Raw.getEnableSleep(address);
    }

    /**
     * Set this flag to false if this body should never fall asleep.
     */
    public void setEnableSleep(boolean value) {
        checkNotNull();
        Raw.setEnableSleep(address, value);
    }

    /**
     * Is this body initially awake or sleeping?
     */
    public boolean getIsAwake() {
        checkNotNull();
        return Raw.getIsAwake(address);
    }

    /**
     * Is this body initially awake or sleeping?
     */
    public void setIsAwake(boolean value) {
        checkNotNull();
        Raw.setIsAwake(address, value);
    }

    /**
     * Should this body be prevented from rotating? Useful for characters.
     */
    public boolean getFixedRotation() {
        checkNotNull();
        return Raw.getFixedRotation(address);
    }

    /**
     * Should this body be prevented from rotating? Useful for characters.
     */
    public void setFixedRotation(boolean value) {
        checkNotNull();
        Raw.setFixedRotation(address, value);
    }

    /**
     * Treat this body as high speed object that performs continuous collision detection
     * against dynamic and kinematic bodies, but not other bullet bodies.
     * @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
     * continuous collision. They may interfere with joint constraints.
     */
    public boolean getIsBullet() {
        checkNotNull();
        return Raw.getIsBullet(address);
    }

    /**
     * Treat this body as high speed object that performs continuous collision detection
     * against dynamic and kinematic bodies, but not other bullet bodies.
     * @warning Bullets should be used sparingly. They are not a solution for general dynamic-versus-dynamic
     * continuous collision. They may interfere with joint constraints.
     */
    public void setIsBullet(boolean value) {
        checkNotNull();
        Raw.setIsBullet(address, value);
    }

    /**
     * Used to disable a body. A disabled body does not move or collide.
     */
    public boolean getIsEnabled() {
        checkNotNull();
        return Raw.getIsEnabled(address);
    }

    /**
     * Used to disable a body. A disabled body does not move or collide.
     */
    public void setIsEnabled(boolean value) {
        checkNotNull();
        Raw.setIsEnabled(address, value);
    }

    /**
     * This allows this body to bypass rotational speed limits. Should only be used
     * for circular objects, like wheels.
     */
    public boolean getAllowFastRotation() {
        checkNotNull();
        return Raw.getAllowFastRotation(address);
    }

    /**
     * This allows this body to bypass rotational speed limits. Should only be used
     * for circular objects, like wheels.
     */
    public void setAllowFastRotation(boolean value) {
        checkNotNull();
        Raw.setAllowFastRotation(address, value);
    }

    public static class Raw {
        public static native void b2BodyDef_placed(long address);
        public static native long b2BodyDef();
        public static native void destroy(long address);
        public static native int getType(long address);
        public static native void setType(long address, int value);
        public static native long getPosition(long address);
        public static native void setPosition(long address, long value);
        public static native long getRotation(long address);
        public static native void setRotation(long address, long value);
        public static native long getLinearVelocity(long address);
        public static native void setLinearVelocity(long address, long value);
        public static native float getAngularVelocity(long address);
        public static native void setAngularVelocity(long address, float value);
        public static native float getLinearDamping(long address);
        public static native void setLinearDamping(long address, float value);
        public static native float getAngularDamping(long address);
        public static native void setAngularDamping(long address, float value);
        public static native float getGravityScale(long address);
        public static native void setGravityScale(long address, float value);
        public static native float getSleepThreshold(long address);
        public static native void setSleepThreshold(long address, float value);
        public static native String getName(long address);
        public static native void setName(long address, String value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
        public static native boolean getEnableSleep(long address);
        public static native void setEnableSleep(long address, boolean value);
        public static native boolean getIsAwake(long address);
        public static native void setIsAwake(long address, boolean value);
        public static native boolean getFixedRotation(long address);
        public static native void setFixedRotation(long address, boolean value);
        public static native boolean getIsBullet(long address);
        public static native void setIsBullet(long address, boolean value);
        public static native boolean getIsEnabled(long address);
        public static native void setIsEnabled(long address, boolean value);
        public static native boolean getAllowFastRotation(long address);
        public static native void setAllowFastRotation(long address, boolean value);
    }
}
