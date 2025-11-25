package box2d;


/**
 * The query filter is used to filter collisions between queries and shapes. For example,
 * you may want a ray-cast representing a projectile to hit players and the static environment
 * but not debris.
 * @ingroup shape
 */
public class b2QueryFilter extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2QueryFilter wrapPointer(long address) {
        return address != 0L ? new b2QueryFilter(address) : null;
    }
    
    public static b2QueryFilter arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2QueryFilter(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2QueryFilter
     */
    public static b2QueryFilter createAt(long address) {
        Raw.b2QueryFilter_placed(address);
        b2QueryFilter createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2QueryFilter
     */
    public static <T> b2QueryFilter createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2QueryFilter_placed(address);
        b2QueryFilter createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2QueryFilter() {
        address = Raw.b2QueryFilter();
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
     * The collision category bits of this query. Normally you would just set one bit.
     */
    public long getCategoryBits() {
        checkNotNull();
        return Raw.getCategoryBits(address);
    }

    /**
     * The collision category bits of this query. Normally you would just set one bit.
     */
    public void setCategoryBits(long value) {
        checkNotNull();
        Raw.setCategoryBits(address, value);
    }

    /**
     * The collision mask bits. This states the shape categories that this
     * query would accept for collision.
     */
    public long getMaskBits() {
        checkNotNull();
        return Raw.getMaskBits(address);
    }

    /**
     * The collision mask bits. This states the shape categories that this
     * query would accept for collision.
     */
    public void setMaskBits(long value) {
        checkNotNull();
        Raw.setMaskBits(address, value);
    }

    public static class Raw {
        public static native void b2QueryFilter_placed(long address);
        public static native long b2QueryFilter();
        public static native void destroy(long address);
        public static native long getCategoryBits(long address);
        public static native void setCategoryBits(long address, long value);
        public static native long getMaskBits(long address);
        public static native void setMaskBits(long address, long value);
    }
}
