package box2d;


/**
 * Used to warm start the GJK simplex. If you call this function multiple times with nearby
 * transforms this might improve performance. Otherwise you can zero initialize this.
 * The distance cache must be initialized to zero on the first call.
 * Users should generally just zero initialize this structure for each call.
 */
public class b2SimplexCache extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2SimplexCache wrapPointer(long address) {
        return address != 0L ? new b2SimplexCache(address) : null;
    }
    
    public static b2SimplexCache arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2SimplexCache(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2SimplexCache
     */
    public static b2SimplexCache createAt(long address) {
        Raw.b2SimplexCache_placed(address);
        b2SimplexCache createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2SimplexCache
     */
    public static <T> b2SimplexCache createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2SimplexCache_placed(address);
        b2SimplexCache createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2SimplexCache() {
        address = Raw.b2SimplexCache();
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
     * The number of stored simplex points
     */
    public short getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * The number of stored simplex points
     */
    public void setCount(short value) {
        checkNotNull();
        Raw.setCount(address, value);
    }

    /**
     * @param index Array index
     * @return WebIDL type: octet
     */
    public byte getIndexA(int index) {
        checkNotNull();
        return Raw.getIndexA(address, index);
    }

    /**
     * @param index Array index
     * @param value WebIDL type: octet
     */
    public void setIndexA(int index, byte value) {
        checkNotNull();
        Raw.setIndexA(address, index, value);
    }

    /**
     * @param index Array index
     * @return WebIDL type: octet
     */
    public byte getIndexB(int index) {
        checkNotNull();
        return Raw.getIndexB(address, index);
    }

    /**
     * @param index Array index
     * @param value WebIDL type: octet
     */
    public void setIndexB(int index, byte value) {
        checkNotNull();
        Raw.setIndexB(address, index, value);
    }

    public static class Raw {
        public static native void b2SimplexCache_placed(long address);
        public static native long b2SimplexCache();
        public static native void destroy(long address);
        public static native short getCount(long address);
        public static native void setCount(long address, short value);
        public static native byte getIndexA(long address, int index);
        public static native void setIndexA(long address, int index, byte value);
        public static native byte getIndexB(long address, int index);
        public static native void setIndexB(long address, int index, byte value);
    }
}
