package box2dandroid;


/**
 * A line segment with two-sided collision.
 */
public class b2Segment extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Segment wrapPointer(long address) {
        return address != 0L ? new b2Segment(address) : null;
    }
    
    public static b2Segment arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Segment(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Segment
     */
    public static b2Segment createAt(long address) {
        Raw.b2Segment_placed(address);
        b2Segment createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Segment
     */
    public static <T> b2Segment createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Segment_placed(address);
        b2Segment createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Segment() {
        address = Raw.b2Segment();
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
     * The first point
     */
    public b2Vec2 getPoint1() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint1(address));
    }

    /**
     * The first point
     */
    public void setPoint1(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint1(address, value.getAddress());
    }

    /**
     * The second point
     */
    public b2Vec2 getPoint2() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint2(address));
    }

    /**
     * The second point
     */
    public void setPoint2(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint2(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2Segment_placed(long address);
        public static native long b2Segment();
        public static native void destroy(long address);
        public static native long getPoint1(long address);
        public static native void setPoint1(long address, long value);
        public static native long getPoint2(long address);
        public static native void setPoint2(long address, long value);
    }
}
