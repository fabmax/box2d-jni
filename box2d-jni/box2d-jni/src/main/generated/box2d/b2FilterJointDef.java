package box2d;


/**
 * A filter joint is used to disable collision between two specific bodies.
 * @ingroup filter_joint
 */
public class b2FilterJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2FilterJointDef wrapPointer(long address) {
        return address != 0L ? new b2FilterJointDef(address) : null;
    }
    
    public static b2FilterJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2FilterJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2FilterJointDef
     */
    public static b2FilterJointDef createAt(long address) {
        Raw.b2FilterJointDef_placed(address);
        b2FilterJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2FilterJointDef
     */
    public static <T> b2FilterJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2FilterJointDef_placed(address);
        b2FilterJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2FilterJointDef() {
        address = Raw.b2FilterJointDef();
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
     * The first attached body.
     */
    public b2BodyId getBodyIdA() {
        checkNotNull();
        return b2BodyId.wrapPointer(Raw.getBodyIdA(address));
    }

    /**
     * The first attached body.
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
        public static native void b2FilterJointDef_placed(long address);
        public static native long b2FilterJointDef();
        public static native void destroy(long address);
        public static native long getBodyIdA(long address);
        public static native void setBodyIdA(long address, long value);
        public static native long getBodyIdB(long address);
        public static native void setBodyIdB(long address, long value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
