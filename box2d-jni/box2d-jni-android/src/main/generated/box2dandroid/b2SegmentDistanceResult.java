package box2dandroid;


/**
 * Result of computing the distance between two line segments
 */
public class b2SegmentDistanceResult extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2SegmentDistanceResult wrapPointer(long address) {
        return address != 0L ? new b2SegmentDistanceResult(address) : null;
    }
    
    public static b2SegmentDistanceResult arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2SegmentDistanceResult(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2SegmentDistanceResult
     */
    public static b2SegmentDistanceResult createAt(long address) {
        Raw.b2SegmentDistanceResult_placed(address);
        b2SegmentDistanceResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2SegmentDistanceResult
     */
    public static <T> b2SegmentDistanceResult createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2SegmentDistanceResult_placed(address);
        b2SegmentDistanceResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2SegmentDistanceResult() {
        address = Raw.b2SegmentDistanceResult();
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
     * The closest point on the first segment
     */
    public b2Vec2 getClosest1() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getClosest1(address));
    }

    /**
     * The closest point on the first segment
     */
    public void setClosest1(b2Vec2 value) {
        checkNotNull();
        Raw.setClosest1(address, value.getAddress());
    }

    /**
     * The closest point on the second segment
     */
    public b2Vec2 getClosest2() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getClosest2(address));
    }

    /**
     * The closest point on the second segment
     */
    public void setClosest2(b2Vec2 value) {
        checkNotNull();
        Raw.setClosest2(address, value.getAddress());
    }

    /**
     * The barycentric coordinate on the first segment
     */
    public float getFraction1() {
        checkNotNull();
        return Raw.getFraction1(address);
    }

    /**
     * The barycentric coordinate on the first segment
     */
    public void setFraction1(float value) {
        checkNotNull();
        Raw.setFraction1(address, value);
    }

    /**
     * The barycentric coordinate on the second segment
     */
    public float getFraction2() {
        checkNotNull();
        return Raw.getFraction2(address);
    }

    /**
     * The barycentric coordinate on the second segment
     */
    public void setFraction2(float value) {
        checkNotNull();
        Raw.setFraction2(address, value);
    }

    /**
     * The squared distance between the closest points
     */
    public float getDistanceSquared() {
        checkNotNull();
        return Raw.getDistanceSquared(address);
    }

    /**
     * The squared distance between the closest points
     */
    public void setDistanceSquared(float value) {
        checkNotNull();
        Raw.setDistanceSquared(address, value);
    }

    public static class Raw {
        public static native void b2SegmentDistanceResult_placed(long address);
        public static native long b2SegmentDistanceResult();
        public static native void destroy(long address);
        public static native long getClosest1(long address);
        public static native void setClosest1(long address, long value);
        public static native long getClosest2(long address);
        public static native void setClosest2(long address, long value);
        public static native float getFraction1(long address);
        public static native void setFraction1(long address, float value);
        public static native float getFraction2(long address);
        public static native void setFraction2(long address, float value);
        public static native float getDistanceSquared(long address);
        public static native void setDistanceSquared(long address, float value);
    }
}
