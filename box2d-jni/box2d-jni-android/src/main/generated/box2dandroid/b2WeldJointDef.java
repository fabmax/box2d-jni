package box2dandroid;


/**
 * Weld joint definition
 * A weld joint connect to bodies together rigidly. This constraint provides springs to mimic
 * soft-body simulation.
 * @note The approximate solver in Box2D cannot hold many bodies together rigidly
 * @ingroup weld_joint
 */
public class b2WeldJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2WeldJointDef wrapPointer(long address) {
        return address != 0L ? new b2WeldJointDef(address) : null;
    }
    
    public static b2WeldJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2WeldJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2WeldJointDef
     */
    public static b2WeldJointDef createAt(long address) {
        Raw.b2WeldJointDef_placed(address);
        b2WeldJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2WeldJointDef
     */
    public static <T> b2WeldJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2WeldJointDef_placed(address);
        b2WeldJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2WeldJointDef() {
        address = Raw.b2WeldJointDef();
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
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float getAngularDampingRatio() {
        checkNotNull();
        return Raw.getAngularDampingRatio(address);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void setAngularDampingRatio(float value) {
        checkNotNull();
        Raw.setAngularDampingRatio(address, value);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float getAngularHertz() {
        checkNotNull();
        return Raw.getAngularHertz(address);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void setAngularHertz(float value) {
        checkNotNull();
        Raw.setAngularHertz(address, value);
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
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float getLinearDampingRatio() {
        checkNotNull();
        return Raw.getLinearDampingRatio(address);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void setLinearDampingRatio(float value) {
        checkNotNull();
        Raw.setLinearDampingRatio(address, value);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float getLinearHertz() {
        checkNotNull();
        return Raw.getLinearHertz(address);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void setLinearHertz(float value) {
        checkNotNull();
        Raw.setLinearHertz(address, value);
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
     * The bodyB angle minus bodyA angle in the reference state (radians)
     * todo maybe make this a b2Rot
     */
    public float getReferenceAngle() {
        checkNotNull();
        return Raw.getReferenceAngle(address);
    }

    /**
     * The bodyB angle minus bodyA angle in the reference state (radians)
     * todo maybe make this a b2Rot
     */
    public void setReferenceAngle(float value) {
        checkNotNull();
        Raw.setReferenceAngle(address, value);
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
        public static native void b2WeldJointDef_placed(long address);
        public static native long b2WeldJointDef();
        public static native void destroy(long address);
        public static native float getAngularDampingRatio(long address);
        public static native void setAngularDampingRatio(long address, float value);
        public static native float getAngularHertz(long address);
        public static native void setAngularHertz(long address, float value);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native boolean getCollideConnected(long address);
        public static native void setCollideConnected(long address, boolean value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
        public static native float getLinearDampingRatio(long address);
        public static native void setLinearDampingRatio(long address, float value);
        public static native float getLinearHertz(long address);
        public static native void setLinearHertz(long address, float value);
        public static native long getLocalAnchorA(long address);
        public static native void setLocalAnchorA(long address, long value);
        public static native long getLocalAnchorB(long address);
        public static native void setLocalAnchorB(long address, long value);
        public static native float getReferenceAngle(long address);
        public static native void setReferenceAngle(long address, float value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
