package box2dandroid;


/**
 * Distance joint definition
 * This requires defining an anchor point on both
 * bodies and the non-zero distance of the distance joint. The definition uses
 * local anchor points so that the initial configuration can violate the
 * constraint slightly. This helps when saving and loading a game.
 * @ingroup distance_joint
 */
public class b2DistanceJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2DistanceJointDef wrapPointer(long address) {
        return address != 0L ? new b2DistanceJointDef(address) : null;
    }
    
    public static b2DistanceJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2DistanceJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2DistanceJointDef
     */
    public static b2DistanceJointDef createAt(long address) {
        Raw.b2DistanceJointDef_placed(address);
        b2DistanceJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2DistanceJointDef
     */
    public static <T> b2DistanceJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2DistanceJointDef_placed(address);
        b2DistanceJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2DistanceJointDef() {
        address = Raw.b2DistanceJointDef();
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
     * The first attached body
     */
    public b2BodyId getBodyIdA() {
        checkNotNull();
        return b2BodyId.wrapPointer(Raw.getBodyIdA(address));
    }

    /**
     * The first attached body
     */
    public void setBodyIdA(b2BodyId value) {
        checkNotNull();
        Raw.setBodyIdA(address, value.getAddress());
    }

    /**
     * The second attached body
     */
    public b2BodyId getBodyIdB() {
        checkNotNull();
        return b2BodyId.wrapPointer(Raw.getBodyIdB(address));
    }

    /**
     * The second attached body
     */
    public void setBodyIdB(b2BodyId value) {
        checkNotNull();
        Raw.setBodyIdB(address, value.getAddress());
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public boolean getCollideConnected() {
        checkNotNull();
        return Raw.getCollideConnected(address);
    }

    /**
     * Set this flag to true if the attached bodies should collide
     */
    public void setCollideConnected(boolean value) {
        checkNotNull();
        Raw.setCollideConnected(address, value);
    }

    /**
     * The spring linear damping ratio, non-dimensional
     */
    public float getDampingRatio() {
        checkNotNull();
        return Raw.getDampingRatio(address);
    }

    /**
     * The spring linear damping ratio, non-dimensional
     */
    public void setDampingRatio(float value) {
        checkNotNull();
        Raw.setDampingRatio(address, value);
    }

    /**
     * Enable/disable the joint limit
     */
    public boolean getEnableLimit() {
        checkNotNull();
        return Raw.getEnableLimit(address);
    }

    /**
     * Enable/disable the joint limit
     */
    public void setEnableLimit(boolean value) {
        checkNotNull();
        Raw.setEnableLimit(address, value);
    }

    /**
     * Enable/disable the joint motor
     */
    public boolean getEnableMotor() {
        checkNotNull();
        return Raw.getEnableMotor(address);
    }

    /**
     * Enable/disable the joint motor
     */
    public void setEnableMotor(boolean value) {
        checkNotNull();
        Raw.setEnableMotor(address, value);
    }

    /**
     * Enable the distance constraint to behave like a spring. If false
     * then the distance joint will be rigid, overriding the limit and motor.
     */
    public boolean getEnableSpring() {
        checkNotNull();
        return Raw.getEnableSpring(address);
    }

    /**
     * Enable the distance constraint to behave like a spring. If false
     * then the distance joint will be rigid, overriding the limit and motor.
     */
    public void setEnableSpring(boolean value) {
        checkNotNull();
        Raw.setEnableSpring(address, value);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second
     */
    public float getHertz() {
        checkNotNull();
        return Raw.getHertz(address);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second
     */
    public void setHertz(float value) {
        checkNotNull();
        Raw.setHertz(address, value);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int getInternalValue() {
        checkNotNull();
        return Raw.getInternalValue(address);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void setInternalValue(int value) {
        checkNotNull();
        Raw.setInternalValue(address, value);
    }

    /**
     * The rest length of this joint. Clamped to a stable minimum value.
     */
    public float getLength() {
        checkNotNull();
        return Raw.getLength(address);
    }

    /**
     * The rest length of this joint. Clamped to a stable minimum value.
     */
    public void setLength(float value) {
        checkNotNull();
        Raw.setLength(address, value);
    }

    /**
     * The local anchor point relative to bodyA's origin
     */
    public b2Vec2 getLocalAnchorA() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLocalAnchorA(address));
    }

    /**
     * The local anchor point relative to bodyA's origin
     */
    public void setLocalAnchorA(b2Vec2 value) {
        checkNotNull();
        Raw.setLocalAnchorA(address, value.getAddress());
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public b2Vec2 getLocalAnchorB() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLocalAnchorB(address));
    }

    /**
     * The local anchor point relative to bodyB's origin
     */
    public void setLocalAnchorB(b2Vec2 value) {
        checkNotNull();
        Raw.setLocalAnchorB(address, value.getAddress());
    }

    /**
     * Maximum length. Must be greater than or equal to the minimum length.
     */
    public float getMaxLength() {
        checkNotNull();
        return Raw.getMaxLength(address);
    }

    /**
     * Maximum length. Must be greater than or equal to the minimum length.
     */
    public void setMaxLength(float value) {
        checkNotNull();
        Raw.setMaxLength(address, value);
    }

    /**
     * The maximum motor force, usually in newtons
     */
    public float getMaxMotorForce() {
        checkNotNull();
        return Raw.getMaxMotorForce(address);
    }

    /**
     * The maximum motor force, usually in newtons
     */
    public void setMaxMotorForce(float value) {
        checkNotNull();
        Raw.setMaxMotorForce(address, value);
    }

    /**
     * Minimum length. Clamped to a stable minimum value.
     */
    public float getMinLength() {
        checkNotNull();
        return Raw.getMinLength(address);
    }

    /**
     * Minimum length. Clamped to a stable minimum value.
     */
    public void setMinLength(float value) {
        checkNotNull();
        Raw.setMinLength(address, value);
    }

    /**
     * The desired motor speed, usually in meters per second
     */
    public float getMotorSpeed() {
        checkNotNull();
        return Raw.getMotorSpeed(address);
    }

    /**
     * The desired motor speed, usually in meters per second
     */
    public void setMotorSpeed(float value) {
        checkNotNull();
        Raw.setMotorSpeed(address, value);
    }

    /**
     * User data pointer
     */
    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    /**
     * User data pointer
     */
    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2DistanceJointDef_placed(long address);
        public static native long b2DistanceJointDef();
        public static native void destroy(long address);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native boolean getCollideConnected(long address);
        public static native void setCollideConnected(long address, boolean value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native boolean getEnableLimit(long address);
        public static native void setEnableLimit(long address, boolean value);
        public static native boolean getEnableMotor(long address);
        public static native void setEnableMotor(long address, boolean value);
        public static native boolean getEnableSpring(long address);
        public static native void setEnableSpring(long address, boolean value);
        public static native float getHertz(long address);
        public static native void setHertz(long address, float value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
        public static native float getLength(long address);
        public static native void setLength(long address, float value);
        public static native long getLocalAnchorA(long address);
        public static native void setLocalAnchorA(long address, long value);
        public static native long getLocalAnchorB(long address);
        public static native void setLocalAnchorB(long address, long value);
        public static native float getMaxLength(long address);
        public static native void setMaxLength(long address, float value);
        public static native float getMaxMotorForce(long address);
        public static native void setMaxMotorForce(long address, float value);
        public static native float getMinLength(long address);
        public static native void setMinLength(long address, float value);
        public static native float getMotorSpeed(long address);
        public static native void setMotorSpeed(long address, float value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
