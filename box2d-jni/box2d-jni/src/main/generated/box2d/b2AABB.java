package box2d;


/**
 * Axis-aligned bounding box
 */
public class b2AABB extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2AABB wrapPointer(long address) {
        return address != 0L ? new b2AABB(address) : null;
    }
    
    public static b2AABB arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2AABB(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2AABB
     */
    public static b2AABB createAt(long address) {
        Raw.b2AABB_placed(address);
        b2AABB createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2AABB
     */
    public static <T> b2AABB createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2AABB_placed(address);
        b2AABB createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2AABB() {
        address = Raw.b2AABB();
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

    public b2Vec2 getLowerBound() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLowerBound(address));
    }

    public void setLowerBound(b2Vec2 value) {
        checkNotNull();
        Raw.setLowerBound(address, value.getAddress());
    }

    public b2Vec2 getUpperBound() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getUpperBound(address));
    }

    public void setUpperBound(b2Vec2 value) {
        checkNotNull();
        Raw.setUpperBound(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2AABB_placed(long address);
        public static native long b2AABB();
        public static native void destroy(long address);
        public static native long getLowerBound(long address);
        public static native void setLowerBound(long address, long value);
        public static native long getUpperBound(long address);
        public static native void setUpperBound(long address, long value);
    }
}
