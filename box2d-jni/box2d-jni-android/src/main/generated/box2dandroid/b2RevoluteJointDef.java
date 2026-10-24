package box2dandroid;


/**
 * Revolute joint definition A point on body B is fixed to a point on body A. Allows relative
 * rotation.
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
     * The target angle for the joint in radians. The spring-damper will drive to this angle.
     */
    public float getTargetAngle() {
        checkNotNull();
        return Raw.getTargetAngle(address);
    }

    /**
     * The target angle for the joint in radians. The spring-damper will drive to this angle.
     */
    public void setTargetAngle(float value) {
        checkNotNull();
        Raw.setTargetAngle(address, value);
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

    public static class Raw {
        public static native void b2RevoluteJointDef_placed(long address);
        public static native long b2RevoluteJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native float getTargetAngle(long address);
        public static native void setTargetAngle(long address, float value);
        public static native boolean getEnableSpring(long address);
        public static native void setEnableSpring(long address, boolean value);
        public static native float getHertz(long address);
        public static native void setHertz(long address, float value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native boolean getEnableLimit(long address);
        public static native void setEnableLimit(long address, boolean value);
        public static native float getLowerAngle(long address);
        public static native void setLowerAngle(long address, float value);
        public static native float getUpperAngle(long address);
        public static native void setUpperAngle(long address, float value);
        public static native boolean getEnableMotor(long address);
        public static native void setEnableMotor(long address, boolean value);
        public static native float getMaxMotorTorque(long address);
        public static native void setMaxMotorTorque(long address, float value);
        public static native float getMotorSpeed(long address);
        public static native void setMotorSpeed(long address, float value);
    }
}
