package box2dandroid;


/**
 * Base joint definition used by all joint types. The local frames are measured from the body's
 * origin rather than the center of mass because:
 * 1. you might not know where the center of mass will be.
 * 2. if you add/remove shapes from a body and recompute the mass, the joints will be broken.
 * @ingroup joint
 */
public class b2JointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2JointDef wrapPointer(long address) {
        return address != 0L ? new b2JointDef(address) : null;
    }
    
    public static b2JointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2JointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2JointDef
     */
    public static b2JointDef createAt(long address) {
        Raw.b2JointDef_placed(address);
        b2JointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2JointDef
     */
    public static <T> b2JointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2JointDef_placed(address);
        b2JointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2JointDef() {
        address = Raw.b2JointDef();
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
     * The first local joint frame
     */
    public b2Transform getLocalFrameA() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getLocalFrameA(address));
    }

    /**
     * The first local joint frame
     */
    public void setLocalFrameA(b2Transform value) {
        checkNotNull();
        Raw.setLocalFrameA(address, value.getAddress());
    }

    /**
     * The second local joint frame
     */
    public b2Transform getLocalFrameB() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getLocalFrameB(address));
    }

    /**
     * The second local joint frame
     */
    public void setLocalFrameB(b2Transform value) {
        checkNotNull();
        Raw.setLocalFrameB(address, value.getAddress());
    }

    /**
     * Force threshold for joint events
     */
    public float getForceThreshold() {
        checkNotNull();
        return Raw.getForceThreshold(address);
    }

    /**
     * Force threshold for joint events
     */
    public void setForceThreshold(float value) {
        checkNotNull();
        Raw.setForceThreshold(address, value);
    }

    /**
     * Torque threshold for joint events
     */
    public float getTorqueThreshold() {
        checkNotNull();
        return Raw.getTorqueThreshold(address);
    }

    /**
     * Torque threshold for joint events
     */
    public void setTorqueThreshold(float value) {
        checkNotNull();
        Raw.setTorqueThreshold(address, value);
    }

    /**
     * Constraint hertz (advanced feature)
     */
    public float getConstraintHertz() {
        checkNotNull();
        return Raw.getConstraintHertz(address);
    }

    /**
     * Constraint hertz (advanced feature)
     */
    public void setConstraintHertz(float value) {
        checkNotNull();
        Raw.setConstraintHertz(address, value);
    }

    /**
     * Constraint damping ratio (advanced feature)
     */
    public float getConstraintDampingRatio() {
        checkNotNull();
        return Raw.getConstraintDampingRatio(address);
    }

    /**
     * Constraint damping ratio (advanced feature)
     */
    public void setConstraintDampingRatio(float value) {
        checkNotNull();
        Raw.setConstraintDampingRatio(address, value);
    }

    /**
     * Debug draw scale
     */
    public float getDrawScale() {
        checkNotNull();
        return Raw.getDrawScale(address);
    }

    /**
     * Debug draw scale
     */
    public void setDrawScale(float value) {
        checkNotNull();
        Raw.setDrawScale(address, value);
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

    public static class Raw {
        public static native void b2JointDef_placed(long address);
        public static native long b2JointDef();
        public static native void destroy(long address);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native long getLocalFrameA(long address);
        public static native void setLocalFrameA(long address, long value);
        public static native long getLocalFrameB(long address);
        public static native void setLocalFrameB(long address, long value);
        public static native float getForceThreshold(long address);
        public static native void setForceThreshold(long address, float value);
        public static native float getTorqueThreshold(long address);
        public static native void setTorqueThreshold(long address, float value);
        public static native float getConstraintHertz(long address);
        public static native void setConstraintHertz(long address, float value);
        public static native float getConstraintDampingRatio(long address);
        public static native void setConstraintDampingRatio(long address, float value);
        public static native float getDrawScale(long address);
        public static native void setDrawScale(long address, float value);
        public static native boolean getCollideConnected(long address);
        public static native void setCollideConnected(long address, boolean value);
    }
}
