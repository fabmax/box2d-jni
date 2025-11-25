package box2d;


/**
 * A mouse joint is used to make a point on a body track a specified world point.
 * This a soft constraint and allows the constraint to stretch without
 * applying huge forces. This also applies rotation constraint heuristic to improve control.
 * @ingroup mouse_joint
 */
public class b2MouseJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2MouseJointDef wrapPointer(long address) {
        return address != 0L ? new b2MouseJointDef(address) : null;
    }
    
    public static b2MouseJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2MouseJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2MouseJointDef
     */
    public static b2MouseJointDef createAt(long address) {
        Raw.b2MouseJointDef_placed(address);
        b2MouseJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2MouseJointDef
     */
    public static <T> b2MouseJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2MouseJointDef_placed(address);
        b2MouseJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2MouseJointDef() {
        address = Raw.b2MouseJointDef();
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
     * The first attached body. This is assumed to be static.
     */
    public b2BodyId getBodyIdA() {
        checkNotNull();
        return b2BodyId.wrapPointer(Raw.getBodyIdA(address));
    }

    /**
     * The first attached body. This is assumed to be static.
     */
    public void setBodyIdA(b2BodyId value) {
        checkNotNull();
        Raw.setBodyIdA(address, value.getAddress());
    }

    /**
     * The second attached body.
     */
    public b2BodyId getBodyIdB() {
        checkNotNull();
        return b2BodyId.wrapPointer(Raw.getBodyIdB(address));
    }

    /**
     * The second attached body.
     */
    public void setBodyIdB(b2BodyId value) {
        checkNotNull();
        Raw.setBodyIdB(address, value.getAddress());
    }

    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public boolean getCollideConnected() {
        checkNotNull();
        return Raw.getCollideConnected(address);
    }

    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public void setCollideConnected(boolean value) {
        checkNotNull();
        Raw.setCollideConnected(address, value);
    }

    /**
     * Damping ratio, non-dimensional
     */
    public float getDampingRatio() {
        checkNotNull();
        return Raw.getDampingRatio(address);
    }

    /**
     * Damping ratio, non-dimensional
     */
    public void setDampingRatio(float value) {
        checkNotNull();
        Raw.setDampingRatio(address, value);
    }

    /**
     * Stiffness in hertz
     */
    public float getHertz() {
        checkNotNull();
        return Raw.getHertz(address);
    }

    /**
     * Stiffness in hertz
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
     * Maximum force, typically in newtons
     */
    public float getMaxForce() {
        checkNotNull();
        return Raw.getMaxForce(address);
    }

    /**
     * Maximum force, typically in newtons
     */
    public void setMaxForce(float value) {
        checkNotNull();
        Raw.setMaxForce(address, value);
    }

    /**
     * The initial target point in world space
     */
    public b2Vec2 getTarget() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getTarget(address));
    }

    /**
     * The initial target point in world space
     */
    public void setTarget(b2Vec2 value) {
        checkNotNull();
        Raw.setTarget(address, value.getAddress());
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
        public static native void b2MouseJointDef_placed(long address);
        public static native long b2MouseJointDef();
        public static native void destroy(long address);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native boolean getCollideConnected(long address);
        public static native void setCollideConnected(long address, boolean value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native float getHertz(long address);
        public static native void setHertz(long address, float value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
        public static native float getMaxForce(long address);
        public static native void setMaxForce(long address, float value);
        public static native long getTarget(long address);
        public static native void setTarget(long address, long value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
