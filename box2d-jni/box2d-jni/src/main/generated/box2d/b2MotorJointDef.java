package box2d;


/**
 * A motor joint is used to control the relative velocity and/or transform between two bodies. With
 * a velocity of zero this acts like top-down friction.
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
     * Base joint definition
     */
    public b2JointDef getBase() {
        checkNotNull();
        return b2JointDef.wrapPointer(Raw.getBase(address));
    }

    /**
     * Base joint definition
     */
    public void setBase(b2JointDef value) {
        checkNotNull();
        Raw.setBase(address, value.getAddress());
    }

    /**
     * The desired linear velocity
     */
    public b2Vec2 getLinearVelocity() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLinearVelocity(address));
    }

    /**
     * The desired linear velocity
     */
    public void setLinearVelocity(b2Vec2 value) {
        checkNotNull();
        Raw.setLinearVelocity(address, value.getAddress());
    }

    /**
     * The maximum motor force in newtons
     */
    public float getMaxVelocityForce() {
        checkNotNull();
        return Raw.getMaxVelocityForce(address);
    }

    /**
     * The maximum motor force in newtons
     */
    public void setMaxVelocityForce(float value) {
        checkNotNull();
        Raw.setMaxVelocityForce(address, value);
    }

    /**
     * The desired angular velocity
     */
    public float getAngularVelocity() {
        checkNotNull();
        return Raw.getAngularVelocity(address);
    }

    /**
     * The desired angular velocity
     */
    public void setAngularVelocity(float value) {
        checkNotNull();
        Raw.setAngularVelocity(address, value);
    }

    /**
     * The maximum motor torque in newton-meters
     */
    public float getMaxVelocityTorque() {
        checkNotNull();
        return Raw.getMaxVelocityTorque(address);
    }

    /**
     * The maximum motor torque in newton-meters
     */
    public void setMaxVelocityTorque(float value) {
        checkNotNull();
        Raw.setMaxVelocityTorque(address, value);
    }

    /**
     * Linear spring hertz for position control
     */
    public float getLinearHertz() {
        checkNotNull();
        return Raw.getLinearHertz(address);
    }

    /**
     * Linear spring hertz for position control
     */
    public void setLinearHertz(float value) {
        checkNotNull();
        Raw.setLinearHertz(address, value);
    }

    /**
     * Linear spring damping ratio
     */
    public float getLinearDampingRatio() {
        checkNotNull();
        return Raw.getLinearDampingRatio(address);
    }

    /**
     * Linear spring damping ratio
     */
    public void setLinearDampingRatio(float value) {
        checkNotNull();
        Raw.setLinearDampingRatio(address, value);
    }

    /**
     * Maximum spring force in newtons
     */
    public float getMaxSpringForce() {
        checkNotNull();
        return Raw.getMaxSpringForce(address);
    }

    /**
     * Maximum spring force in newtons
     */
    public void setMaxSpringForce(float value) {
        checkNotNull();
        Raw.setMaxSpringForce(address, value);
    }

    /**
     * Angular spring hertz for position control
     */
    public float getAngularHertz() {
        checkNotNull();
        return Raw.getAngularHertz(address);
    }

    /**
     * Angular spring hertz for position control
     */
    public void setAngularHertz(float value) {
        checkNotNull();
        Raw.setAngularHertz(address, value);
    }

    /**
     * Angular spring damping ratio
     */
    public float getAngularDampingRatio() {
        checkNotNull();
        return Raw.getAngularDampingRatio(address);
    }

    /**
     * Angular spring damping ratio
     */
    public void setAngularDampingRatio(float value) {
        checkNotNull();
        Raw.setAngularDampingRatio(address, value);
    }

    /**
     * Maximum spring torque in newton-meters
     */
    public float getMaxSpringTorque() {
        checkNotNull();
        return Raw.getMaxSpringTorque(address);
    }

    /**
     * Maximum spring torque in newton-meters
     */
    public void setMaxSpringTorque(float value) {
        checkNotNull();
        Raw.setMaxSpringTorque(address, value);
    }

    public static class Raw {
        public static native void b2MotorJointDef_placed(long address);
        public static native long b2MotorJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native long getLinearVelocity(long address);
        public static native void setLinearVelocity(long address, long value);
        public static native float getMaxVelocityForce(long address);
        public static native void setMaxVelocityForce(long address, float value);
        public static native float getAngularVelocity(long address);
        public static native void setAngularVelocity(long address, float value);
        public static native float getMaxVelocityTorque(long address);
        public static native void setMaxVelocityTorque(long address, float value);
        public static native float getLinearHertz(long address);
        public static native void setLinearHertz(long address, float value);
        public static native float getLinearDampingRatio(long address);
        public static native void setLinearDampingRatio(long address, float value);
        public static native float getMaxSpringForce(long address);
        public static native void setMaxSpringForce(long address, float value);
        public static native float getAngularHertz(long address);
        public static native void setAngularHertz(long address, float value);
        public static native float getAngularDampingRatio(long address);
        public static native void setAngularDampingRatio(long address, float value);
        public static native float getMaxSpringTorque(long address);
        public static native void setMaxSpringTorque(long address, float value);
    }
}
