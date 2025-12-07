package box2d;


/**
 * Output for b2ShapeDistance
 */
public class b2DistanceOutput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2DistanceOutput wrapPointer(long address) {
        return address != 0L ? new b2DistanceOutput(address) : null;
    }
    
    public static b2DistanceOutput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2DistanceOutput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2DistanceOutput
     */
    public static b2DistanceOutput createAt(long address) {
        Raw.b2DistanceOutput_placed(address);
        b2DistanceOutput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2DistanceOutput
     */
    public static <T> b2DistanceOutput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2DistanceOutput_placed(address);
        b2DistanceOutput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2DistanceOutput() {
        address = Raw.b2DistanceOutput();
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
     */
    public b2Vec2 getPointA() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPointA(address));
    }

    /**
     */
    public void setPointA(b2Vec2 value) {
        checkNotNull();
        Raw.setPointA(address, value.getAddress());
    }

    /**
     * &lt; Closest point on shapeA
     */
    public b2Vec2 getPointB() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPointB(address));
    }

    /**
     * &lt; Closest point on shapeA
     */
    public void setPointB(b2Vec2 value) {
        checkNotNull();
        Raw.setPointB(address, value.getAddress());
    }

    /**
     * &lt; Closest point on shapeB
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * &lt; Closest point on shapeB
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * &lt; Normal vector that points from A to B. Invalid if distance is zero.
     */
    public float getDistance() {
        checkNotNull();
        return Raw.getDistance(address);
    }

    /**
     * &lt; Normal vector that points from A to B. Invalid if distance is zero.
     */
    public void setDistance(float value) {
        checkNotNull();
        Raw.setDistance(address, value);
    }

    /**
     * &lt; The final distance, zero if overlapped
     */
    public int getIterations() {
        checkNotNull();
        return Raw.getIterations(address);
    }

    /**
     * &lt; The final distance, zero if overlapped
     */
    public void setIterations(int value) {
        checkNotNull();
        Raw.setIterations(address, value);
    }

    /**
     * &lt; Number of GJK iterations used
     */
    public int getSimplexCount() {
        checkNotNull();
        return Raw.getSimplexCount(address);
    }

    /**
     * &lt; Number of GJK iterations used
     */
    public void setSimplexCount(int value) {
        checkNotNull();
        Raw.setSimplexCount(address, value);
    }

    public static class Raw {
        public static native void b2DistanceOutput_placed(long address);
        public static native long b2DistanceOutput();
        public static native void destroy(long address);
        public static native long getPointA(long address);
        public static native void setPointA(long address, long value);
        public static native long getPointB(long address);
        public static native void setPointB(long address, long value);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native float getDistance(long address);
        public static native void setDistance(long address, float value);
        public static native int getIterations(long address);
        public static native void setIterations(long address, int value);
        public static native int getSimplexCount(long address);
        public static native void setSimplexCount(long address, int value);
    }
}
