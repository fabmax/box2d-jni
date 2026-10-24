package box2d;


/**
 * Distance joint definition Connects a point on body A with a point on body B by a segment. Useful
 * for ropes and springs.
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
     * Enable the distance constraint to behave like a spring. If false then the distance joint
     * will be rigid, overriding the limit and motor.
     */
    public boolean getEnableSpring() {
        checkNotNull();
        return Raw.getEnableSpring(address);
    }

    /**
     * Enable the distance constraint to behave like a spring. If false then the distance joint
     * will be rigid, overriding the limit and motor.
     */
    public void setEnableSpring(boolean value) {
        checkNotNull();
        Raw.setEnableSpring(address, value);
    }

    /**
     * The lower spring force controls how much tension it can sustain.
     */
    public float getLowerSpringForce() {
        checkNotNull();
        return Raw.getLowerSpringForce(address);
    }

    /**
     * The lower spring force controls how much tension it can sustain.
     */
    public void setLowerSpringForce(float value) {
        checkNotNull();
        Raw.setLowerSpringForce(address, value);
    }

    /**
     * The upper spring force controls how much compression it can sustain.
     */
    public float getUpperSpringForce() {
        checkNotNull();
        return Raw.getUpperSpringForce(address);
    }

    /**
     * The upper spring force controls how much compression it can sustain.
     */
    public void setUpperSpringForce(float value) {
        checkNotNull();
        Raw.setUpperSpringForce(address, value);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second.
     */
    public float getHertz() {
        checkNotNull();
        return Raw.getHertz(address);
    }

    /**
     * The spring linear stiffness Hertz, cycles per second.
     */
    public void setHertz(float value) {
        checkNotNull();
        Raw.setHertz(address, value);
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
     * Minimum length for limit. Clamped to a stable minimum value.
     */
    public float getMinLength() {
        checkNotNull();
        return Raw.getMinLength(address);
    }

    /**
     * Minimum length for limit. Clamped to a stable minimum value.
     */
    public void setMinLength(float value) {
        checkNotNull();
        Raw.setMinLength(address, value);
    }

    /**
     * Maximum length for limit. Must be greater than or equal to the minimum length.
     */
    public float getMaxLength() {
        checkNotNull();
        return Raw.getMaxLength(address);
    }

    /**
     * Maximum length for limit. Must be greater than or equal to the minimum length.
     */
    public void setMaxLength(float value) {
        checkNotNull();
        Raw.setMaxLength(address, value);
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

    public static class Raw {
        public static native void b2DistanceJointDef_placed(long address);
        public static native long b2DistanceJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native float getLength(long address);
        public static native void setLength(long address, float value);
        public static native boolean getEnableSpring(long address);
        public static native void setEnableSpring(long address, boolean value);
        public static native float getLowerSpringForce(long address);
        public static native void setLowerSpringForce(long address, float value);
        public static native float getUpperSpringForce(long address);
        public static native void setUpperSpringForce(long address, float value);
        public static native float getHertz(long address);
        public static native void setHertz(long address, float value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native boolean getEnableLimit(long address);
        public static native void setEnableLimit(long address, boolean value);
        public static native float getMinLength(long address);
        public static native void setMinLength(long address, float value);
        public static native float getMaxLength(long address);
        public static native void setMaxLength(long address, float value);
        public static native boolean getEnableMotor(long address);
        public static native void setEnableMotor(long address, boolean value);
        public static native float getMaxMotorForce(long address);
        public static native void setMaxMotorForce(long address, float value);
        public static native float getMotorSpeed(long address);
        public static native void setMotorSpeed(long address, float value);
    }
}
