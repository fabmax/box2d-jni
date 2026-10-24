package box2dandroid;


/**
 * Optional world capacities that can be used to avoid run-time allocations.
 * @ingroup world
 */
public class b2Capacity extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Capacity wrapPointer(long address) {
        return address != 0L ? new b2Capacity(address) : null;
    }
    
    public static b2Capacity arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Capacity(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Capacity
     */
    public static b2Capacity createAt(long address) {
        Raw.b2Capacity_placed(address);
        b2Capacity createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Capacity
     */
    public static <T> b2Capacity createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Capacity_placed(address);
        b2Capacity createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Capacity() {
        address = Raw.b2Capacity();
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
     * Number of expected static shapes.
     */
    public int getStaticShapeCount() {
        checkNotNull();
        return Raw.getStaticShapeCount(address);
    }

    /**
     * Number of expected static shapes.
     */
    public void setStaticShapeCount(int value) {
        checkNotNull();
        Raw.setStaticShapeCount(address, value);
    }

    /**
     * Number of expected dynamic and kinematic shapes.
     */
    public int getDynamicShapeCount() {
        checkNotNull();
        return Raw.getDynamicShapeCount(address);
    }

    /**
     * Number of expected dynamic and kinematic shapes.
     */
    public void setDynamicShapeCount(int value) {
        checkNotNull();
        Raw.setDynamicShapeCount(address, value);
    }

    /**
     * Number of expected static bodies.
     */
    public int getStaticBodyCount() {
        checkNotNull();
        return Raw.getStaticBodyCount(address);
    }

    /**
     * Number of expected static bodies.
     */
    public void setStaticBodyCount(int value) {
        checkNotNull();
        Raw.setStaticBodyCount(address, value);
    }

    /**
     * Number of expected dynamic and kinematic bodies.
     */
    public int getDynamicBodyCount() {
        checkNotNull();
        return Raw.getDynamicBodyCount(address);
    }

    /**
     * Number of expected dynamic and kinematic bodies.
     */
    public void setDynamicBodyCount(int value) {
        checkNotNull();
        Raw.setDynamicBodyCount(address, value);
    }

    /**
     * Number of expected contacts.
     */
    public int getContactCount() {
        checkNotNull();
        return Raw.getContactCount(address);
    }

    /**
     * Number of expected contacts.
     */
    public void setContactCount(int value) {
        checkNotNull();
        Raw.setContactCount(address, value);
    }

    /**
     * Reserve arena allocator space, used for temporary allocations.
     */
    public int getArenaByteCount() {
        checkNotNull();
        return Raw.getArenaByteCount(address);
    }

    /**
     * Reserve arena allocator space, used for temporary allocations.
     */
    public void setArenaByteCount(int value) {
        checkNotNull();
        Raw.setArenaByteCount(address, value);
    }

    public static class Raw {
        public static native void b2Capacity_placed(long address);
        public static native long b2Capacity();
        public static native void destroy(long address);
        public static native int getStaticShapeCount(long address);
        public static native void setStaticShapeCount(long address, int value);
        public static native int getDynamicShapeCount(long address);
        public static native void setDynamicShapeCount(long address, int value);
        public static native int getStaticBodyCount(long address);
        public static native void setStaticBodyCount(long address, int value);
        public static native int getDynamicBodyCount(long address);
        public static native void setDynamicBodyCount(long address, int value);
        public static native int getContactCount(long address);
        public static native void setContactCount(long address, int value);
        public static native int getArenaByteCount(long address);
        public static native void setArenaByteCount(long address, int value);
    }
}
