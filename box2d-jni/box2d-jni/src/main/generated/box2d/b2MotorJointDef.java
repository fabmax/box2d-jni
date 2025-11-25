package box2d;


/**
 * A motor joint is used to control the relative motion between two bodies
 * A typical usage is to control the movement of a dynamic body with respect to the ground.
 * @ingroup motor_joint
 */
public class b2MotorJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2MotorJointDef wrapPointer(long address) {
        return address != 0L ? new b2MotorJointDef(address) : null;
    }
    
    public static b2MotorJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2MotorJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2MotorJointDef
     */
    public static b2MotorJointDef createAt(long address) {
        Raw.b2MotorJointDef_placed(address);
        b2MotorJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2MotorJointDef
     */
    public static <T> b2MotorJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2MotorJointDef_placed(address);
        b2MotorJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2MotorJointDef() {
        address = Raw.b2MotorJointDef();
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
     * The bodyB angle minus bodyA angle in radians
     */
    public float getAngularOffset() {
        checkNotNull();
        return Raw.getAngularOffset(address);
    }

    /**
     * The bodyB angle minus bodyA angle in radians
     */
    public void setAngularOffset(float value) {
        checkNotNull();
        Raw.setAngularOffset(address, value);
    }

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
     * Position correction factor in the range [0,1]
     */
    public float getCorrectionFactor() {
        checkNotNull();
        return Raw.getCorrectionFactor(address);
    }

    /**
     * Position correction factor in the range [0,1]
     */
    public void setCorrectionFactor(float value) {
        checkNotNull();
        Raw.setCorrectionFactor(address, value);
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
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public b2Vec2 getLinearOffset() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLinearOffset(address));
    }

    /**
     * Position of bodyB minus the position of bodyA, in bodyA's frame
     */
    public void setLinearOffset(b2Vec2 value) {
        checkNotNull();
        Raw.setLinearOffset(address, value.getAddress());
    }

    /**
     * The maximum motor force in newtons
     */
    public float getMaxForce() {
        checkNotNull();
        return Raw.getMaxForce(address);
    }

    /**
     * The maximum motor force in newtons
     */
    public void setMaxForce(float value) {
        checkNotNull();
        Raw.setMaxForce(address, value);
    }

    /**
     * The maximum motor torque in newton-meters
     */
    public float getMaxTorque() {
        checkNotNull();
        return Raw.getMaxTorque(address);
    }

    /**
     * The maximum motor torque in newton-meters
     */
    public void setMaxTorque(float value) {
        checkNotNull();
        Raw.setMaxTorque(address, value);
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
        public static native void b2MotorJointDef_placed(long address);
        public static native long b2MotorJointDef();
        public static native void destroy(long address);
        public static native float getAngularOffset(long address);
        public static native void setAngularOffset(long address, float value);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native boolean getCollideConnected(long address);
        public static native void setCollideConnected(long address, boolean value);
        public static native float getCorrectionFactor(long address);
        public static native void setCorrectionFactor(long address, float value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
        public static native long getLinearOffset(long address);
        public static native void setLinearOffset(long address, long value);
        public static native float getMaxForce(long address);
        public static native void setMaxForce(long address, float value);
        public static native float getMaxTorque(long address);
        public static native void setMaxTorque(long address, float value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
