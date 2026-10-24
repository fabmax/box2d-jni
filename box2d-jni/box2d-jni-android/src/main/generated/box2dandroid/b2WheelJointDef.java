package box2dandroid;


/**
 * Wheel joint definition Body B is a wheel that may rotate freely and slide along the local x-axis
 * in frame A. The joint translation is zero when the local frame origins coincide in world space.
 * @ingroup wheel_joint
 */
public class b2WheelJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2WheelJointDef wrapPointer(long address) {
        return address != 0L ? new b2WheelJointDef(address) : null;
    }
    
    public static b2WheelJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2WheelJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2WheelJointDef
     */
    public static b2WheelJointDef createAt(long address) {
        Raw.b2WheelJointDef_placed(address);
        b2WheelJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2WheelJointDef
     */
    public static <T> b2WheelJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2WheelJointDef_placed(address);
        b2WheelJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2WheelJointDef() {
        address = Raw.b2WheelJointDef();
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
     * Enable a linear spring along the local axis
     */
    public boolean getEnableSpring() {
        checkNotNull();
        return Raw.getEnableSpring(address);
    }

    /**
     * Enable a linear spring along the local axis
     */
    public void setEnableSpring(boolean value) {
        checkNotNull();
        Raw.setEnableSpring(address, value);
    }

    /**
     * Spring stiffness in Hertz
     */
    public float getHertz() {
        checkNotNull();
        return Raw.getHertz(address);
    }

    /**
     * Spring stiffness in Hertz
     */
    public void setHertz(float value) {
        checkNotNull();
        Raw.setHertz(address, value);
    }

    /**
     * Spring damping ratio, non-dimensional
     */
    public float getDampingRatio() {
        checkNotNull();
        return Raw.getDampingRatio(address);
    }

    /**
     * Spring damping ratio, non-dimensional
     */
    public void setDampingRatio(float value) {
        checkNotNull();
        Raw.setDampingRatio(address, value);
    }

    /**
     * Enable/disable the joint linear limit
     */
    public boolean getEnableLimit() {
        checkNotNull();
        return Raw.getEnableLimit(address);
    }

    /**
     * Enable/disable the joint linear limit
     */
    public void setEnableLimit(boolean value) {
        checkNotNull();
        Raw.setEnableLimit(address, value);
    }

    /**
     * The lower translation limit
     */
    public float getLowerTranslation() {
        checkNotNull();
        return Raw.getLowerTranslation(address);
    }

    /**
     * The lower translation limit
     */
    public void setLowerTranslation(float value) {
        checkNotNull();
        Raw.setLowerTranslation(address, value);
    }

    /**
     * The upper translation limit
     */
    public float getUpperTranslation() {
        checkNotNull();
        return Raw.getUpperTranslation(address);
    }

    /**
     * The upper translation limit
     */
    public void setUpperTranslation(float value) {
        checkNotNull();
        Raw.setUpperTranslation(address, value);
    }

    /**
     * Enable/disable the joint rotational motor
     */
    public boolean getEnableMotor() {
        checkNotNull();
        return Raw.getEnableMotor(address);
    }

    /**
     * Enable/disable the joint rotational motor
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

    public static class Raw {
        public static native void b2WheelJointDef_placed(long address);
        public static native long b2WheelJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native boolean getEnableSpring(long address);
        public static native void setEnableSpring(long address, boolean value);
        public static native float getHertz(long address);
        public static native void setHertz(long address, float value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native boolean getEnableLimit(long address);
        public static native void setEnableLimit(long address, boolean value);
        public static native float getLowerTranslation(long address);
        public static native void setLowerTranslation(long address, float value);
        public static native float getUpperTranslation(long address);
        public static native void setUpperTranslation(long address, float value);
        public static native boolean getEnableMotor(long address);
        public static native void setEnableMotor(long address, boolean value);
        public static native float getMaxMotorTorque(long address);
        public static native void setMaxMotorTorque(long address, float value);
        public static native float getMotorSpeed(long address);
        public static native void setMotorSpeed(long address, float value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
    }
}
