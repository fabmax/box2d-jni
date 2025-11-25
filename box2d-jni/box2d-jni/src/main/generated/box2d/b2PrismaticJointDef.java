package box2d;


/**
 * Prismatic joint definition
 * This requires defining a line of motion using an axis and an anchor point.
 * The definition uses local anchor points and a local axis so that the initial
 * configuration can violate the constraint slightly. The joint translation is zero
 * when the local anchor points coincide in world space.
 * @ingroup prismatic_joint
 */
public class b2PrismaticJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PrismaticJointDef wrapPointer(long address) {
        return address != 0L ? new b2PrismaticJointDef(address) : null;
    }
    
    public static b2PrismaticJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PrismaticJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2PrismaticJointDef
     */
    public static b2PrismaticJointDef createAt(long address) {
        Raw.b2PrismaticJointDef_placed(address);
        b2PrismaticJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2PrismaticJointDef
     */
    public static <T> b2PrismaticJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2PrismaticJointDef_placed(address);
        b2PrismaticJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2PrismaticJointDef() {
        address = Raw.b2PrismaticJointDef();
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
     * Enable a linear spring along the prismatic joint axis
     */
    public boolean getEnableSpring() {
        checkNotNull();
        return Raw.getEnableSpring(address);
    }

    /**
     * Enable a linear spring along the prismatic joint axis
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
     * The local translation unit axis in bodyA
     */
    public b2Vec2 getLocalAxisA() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLocalAxisA(address));
    }

    /**
     * The local translation unit axis in bodyA
     */
    public void setLocalAxisA(b2Vec2 value) {
        checkNotNull();
        Raw.setLocalAxisA(address, value.getAddress());
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
     * The maximum motor force, typically in newtons
     */
    public float getMaxMotorForce() {
        checkNotNull();
        return Raw.getMaxMotorForce(address);
    }

    /**
     * The maximum motor force, typically in newtons
     */
    public void setMaxMotorForce(float value) {
        checkNotNull();
        Raw.setMaxMotorForce(address, value);
    }

    /**
     * The desired motor speed, typically in meters per second
     */
    public float getMotorSpeed() {
        checkNotNull();
        return Raw.getMotorSpeed(address);
    }

    /**
     * The desired motor speed, typically in meters per second
     */
    public void setMotorSpeed(float value) {
        checkNotNull();
        Raw.setMotorSpeed(address, value);
    }

    /**
     * The constrained angle between the bodies: bodyB_angle - bodyA_angle
     */
    public float getReferenceAngle() {
        checkNotNull();
        return Raw.getReferenceAngle(address);
    }

    /**
     * The constrained angle between the bodies: bodyB_angle - bodyA_angle
     */
    public void setReferenceAngle(float value) {
        checkNotNull();
        Raw.setReferenceAngle(address, value);
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
        public static native void b2PrismaticJointDef_placed(long address);
        public static native long b2PrismaticJointDef();
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
        public static native long getLocalAnchorA(long address);
        public static native void setLocalAnchorA(long address, long value);
        public static native long getLocalAnchorB(long address);
        public static native void setLocalAnchorB(long address, long value);
        public static native long getLocalAxisA(long address);
        public static native void setLocalAxisA(long address, long value);
        public static native float getLowerTranslation(long address);
        public static native void setLowerTranslation(long address, float value);
        public static native float getMaxMotorForce(long address);
        public static native void setMaxMotorForce(long address, float value);
        public static native float getMotorSpeed(long address);
        public static native void setMotorSpeed(long address, float value);
        public static native float getReferenceAngle(long address);
        public static native void setReferenceAngle(long address, float value);
        public static native float getUpperTranslation(long address);
        public static native void setUpperTranslation(long address, float value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
