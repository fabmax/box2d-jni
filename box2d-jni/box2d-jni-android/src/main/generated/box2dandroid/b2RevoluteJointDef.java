package box2dandroid;


/**
 * Revolute joint definition
 * This requires defining an anchor point where the bodies are joined.
 * The definition uses local anchor points so that the
 * initial configuration can violate the constraint slightly. You also need to
 * specify the initial relative angle for joint limits. This helps when saving
 * and loading a game.
 * The local anchor points are measured from the body's origin
 * rather than the center of mass because:
 * 1. you might not know where the center of mass will be
 * 2. if you add/remove shapes from a body and recompute the mass, the joints will be broken
 * @ingroup revolute_joint
 */
public class b2RevoluteJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2RevoluteJointDef wrapPointer(long address) {
        return address != 0L ? new b2RevoluteJointDef(address) : null;
    }
    
    public static b2RevoluteJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2RevoluteJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2RevoluteJointDef
     */
    public static b2RevoluteJointDef createAt(long address) {
        Raw.b2RevoluteJointDef_placed(address);
        b2RevoluteJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2RevoluteJointDef
     */
    public static <T> b2RevoluteJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2RevoluteJointDef_placed(address);
        b2RevoluteJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2RevoluteJointDef() {
        address = Raw.b2RevoluteJointDef();
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
     * The spring damping ratio, non-dimensional
     */
    public float getDampingRatio() {
        checkNotNull();
        return Raw.getDampingRatio(address);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public void setDampingRatio(float value) {
        checkNotNull();
        Raw.setDampingRatio(address, value);
    }

    /**
     * Scale the debug draw
     */
    public float getDrawSize() {
        checkNotNull();
        return Raw.getDrawSize(address);
    }

    /**
     * Scale the debug draw
     */
    public void setDrawSize(float value) {
        checkNotNull();
        Raw.setDrawSize(address, value);
    }

    /**
     * A flag to enable joint limits
     */
    public boolean getEnableLimit() {
        checkNotNull();
        return Raw.getEnableLimit(address);
    }

    /**
     * A flag to enable joint limits
     */
    public void setEnableLimit(boolean value) {
        checkNotNull();
        Raw.setEnableLimit(address, value);
    }

    /**
     * A flag to enable the joint motor
     */
    public boolean getEnableMotor() {
        checkNotNull();
        return Raw.getEnableMotor(address);
    }

    /**
     * A flag to enable the joint motor
     */
    public void setEnableMotor(boolean value) {
        checkNotNull();
        Raw.setEnableMotor(address, value);
    }

    /**
     * Enable a rotational spring on the revolute hinge axis
     */
    public boolean getEnableSpring() {
        checkNotNull();
        return Raw.getEnableSpring(address);
    }

    /**
     * Enable a rotational spring on the revolute hinge axis
     */
    public void setEnableSpring(boolean value) {
        checkNotNull();
        Raw.setEnableSpring(address, value);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public float getHertz() {
        checkNotNull();
        return Raw.getHertz(address);
    }

    /**
     * The spring stiffness Hertz, cycles per second
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
     * The lower angle for the joint limit in radians. Minimum of -0.99*pi radians.
     */
    public float getLowerAngle() {
        checkNotNull();
        return Raw.getLowerAngle(address);
    }

    /**
     * The lower angle for the joint limit in radians. Minimum of -0.99*pi radians.
     */
    public void setLowerAngle(float value) {
        checkNotNull();
        Raw.setLowerAngle(address, value);
    }

    /**
     * The maximum motor torque, typically in newton-meters
     */
    public float getMaxMotorTorque() {
        checkNotNull();
        return Raw.getMaxMotorTorque(address);
    }

    /**
     * The maximum motor torque, typically in newton-meters
     */
    public void setMaxMotorTorque(float value) {
        checkNotNull();
        Raw.setMaxMotorTorque(address, value);
    }

    /**
     * The desired motor speed in radians per second
     */
    public float getMotorSpeed() {
        checkNotNull();
        return Raw.getMotorSpeed(address);
    }

    /**
     * The desired motor speed in radians per second
     */
    public void setMotorSpeed(float value) {
        checkNotNull();
        Raw.setMotorSpeed(address, value);
    }

    /**
     * The bodyB angle minus bodyA angle in the reference state (radians).
     * This defines the zero angle for the joint limit.
     */
    public float getReferenceAngle() {
        checkNotNull();
        return Raw.getReferenceAngle(address);
    }

    /**
     * The bodyB angle minus bodyA angle in the reference state (radians).
     * This defines the zero angle for the joint limit.
     */
    public void setReferenceAngle(float value) {
        checkNotNull();
        Raw.setReferenceAngle(address, value);
    }

    /**
     * The upper angle for the joint limit in radians. Maximum of 0.99*pi radians.
     */
    public float getUpperAngle() {
        checkNotNull();
        return Raw.getUpperAngle(address);
    }

    /**
     * The upper angle for the joint limit in radians. Maximum of 0.99*pi radians.
     */
    public void setUpperAngle(float value) {
        checkNotNull();
        Raw.setUpperAngle(address, value);
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
        public static native void b2RevoluteJointDef_placed(long address);
        public static native long b2RevoluteJointDef();
        public static native void destroy(long address);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native boolean getCollideConnected(long address);
        public static native void setCollideConnected(long address, boolean value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native float getDrawSize(long address);
        public static native void setDrawSize(long address, float value);
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
        public static native long getLocalAnchorA(long address);
        public static native void setLocalAnchorA(long address, long value);
        public static native long getLocalAnchorB(long address);
        public static native void setLocalAnchorB(long address, long value);
        public static native float getLowerAngle(long address);
        public static native void setLowerAngle(long address, float value);
        public static native float getMaxMotorTorque(long address);
        public static native void setMaxMotorTorque(long address, float value);
        public static native float getMotorSpeed(long address);
        public static native void setMotorSpeed(long address, float value);
        public static native float getReferenceAngle(long address);
        public static native void setReferenceAngle(long address, float value);
        public static native float getUpperAngle(long address);
        public static native void setUpperAngle(long address, float value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
