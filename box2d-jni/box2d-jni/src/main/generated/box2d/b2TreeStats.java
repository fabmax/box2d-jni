package box2d;


/**
 * These are performance results returned by dynamic tree queries.
 */
public class b2TreeStats extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2TreeStats wrapPointer(long address) {
        return address != 0L ? new b2TreeStats(address) : null;
    }
    
    public static b2TreeStats arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2TreeStats(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2TreeStats
     */
    public static b2TreeStats createAt(long address) {
        Raw.b2TreeStats_placed(address);
        b2TreeStats createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2TreeStats
     */
    public static <T> b2TreeStats createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2TreeStats_placed(address);
        b2TreeStats createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2TreeStats() {
        address = Raw.b2TreeStats();
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
     * Number of leaf nodes visited during the query
     */
    public int getLeafVisits() {
        checkNotNull();
        return Raw.getLeafVisits(address);
    }

    /**
     * Number of leaf nodes visited during the query
     */
    public void setLeafVisits(int value) {
        checkNotNull();
        Raw.setLeafVisits(address, value);
    }

    /**
     * Number of internal nodes visited during the query
     */
    public int getNodeVisits() {
        checkNotNull();
        return Raw.getNodeVisits(address);
    }

    /**
     * Number of internal nodes visited during the query
     */
    public void setNodeVisits(int value) {
        checkNotNull();
        Raw.setNodeVisits(address, value);
    }

    public static class Raw {
        public static native void b2TreeStats_placed(long address);
        public static native long b2TreeStats();
        public static native void destroy(long address);
        public static native int getLeafVisits(long address);
        public static native void setLeafVisits(long address, int value);
        public static native int getNodeVisits(long address);
        public static native void setNodeVisits(long address, int value);
    }
}
