package box2d;


/**
 * Motion locks to restrict the body movement
 * @ingroup body
 */
public class b2MotionLocks extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2MotionLocks wrapPointer(long address) {
        return address != 0L ? new b2MotionLocks(address) : null;
    }
    
    public static b2MotionLocks arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2MotionLocks(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2MotionLocks
     */
    public static b2MotionLocks createAt(long address) {
        Raw.b2MotionLocks_placed(address);
        b2MotionLocks createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2MotionLocks
     */
    public static <T> b2MotionLocks createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2MotionLocks_placed(address);
        b2MotionLocks createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2MotionLocks() {
        address = Raw.b2MotionLocks();
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
     * Prevent translation along the x-axis
     */
    public boolean getLinearX() {
        checkNotNull();
        return Raw.getLinearX(address);
    }

    /**
     * Prevent translation along the x-axis
     */
    public void setLinearX(boolean value) {
        checkNotNull();
        Raw.setLinearX(address, value);
    }

    /**
     * Prevent translation along the y-axis
     */
    public boolean getLinearY() {
        checkNotNull();
        return Raw.getLinearY(address);
    }

    /**
     * Prevent translation along the y-axis
     */
    public void setLinearY(boolean value) {
        checkNotNull();
        Raw.setLinearY(address, value);
    }

    /**
     * Prevent rotation around the z-axis
     */
    public boolean getAngularZ() {
        checkNotNull();
        return Raw.getAngularZ(address);
    }

    /**
     * Prevent rotation around the z-axis
     */
    public void setAngularZ(boolean value) {
        checkNotNull();
        Raw.setAngularZ(address, value);
    }

    public static class Raw {
        public static native void b2MotionLocks_placed(long address);
        public static native long b2MotionLocks();
        public static native void destroy(long address);
        public static native boolean getLinearX(long address);
        public static native void setLinearX(long address, boolean value);
        public static native boolean getLinearY(long address);
        public static native void setLinearY(long address, boolean value);
        public static native boolean getAngularZ(long address);
        public static native void setAngularZ(long address, boolean value);
    }
}
