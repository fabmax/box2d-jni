package box2dandroid;


/**
 * A solid convex polygon. It is assumed that the interior of the polygon is to
 * the left of each edge.
 * Polygons have a maximum number of vertices equal to B2_MAX_POLYGON_VERTICES.
 * In most cases you should not need many vertices for a convex polygon.
 * @warning DO NOT fill this out manually, instead use a helper function like
 * b2MakePolygon or b2MakeBox.
 */
public class b2Polygon extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Polygon wrapPointer(long address) {
        return address != 0L ? new b2Polygon(address) : null;
    }
    
    public static b2Polygon arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Polygon(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Polygon
     */
    public static b2Polygon createAt(long address) {
        Raw.b2Polygon_placed(address);
        b2Polygon createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Polygon
     */
    public static <T> b2Polygon createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Polygon_placed(address);
        b2Polygon createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Polygon() {
        address = Raw.b2Polygon();
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
     * @param index Array index
     * @return WebIDL type: {@link b2Vec2} [Value]
     */
    public b2Vec2 getVertices(int index) {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getVertices(address, index));
    }

    /**
     * @param index Array index
     * @param value WebIDL type: {@link b2Vec2} [Value]
     */
    public void setVertices(int index, b2Vec2 value) {
        checkNotNull();
        Raw.setVertices(address, index, value.getAddress());
    }

    /**
     * @param index Array index
     * @return WebIDL type: {@link b2Vec2} [Value]
     */
    public b2Vec2 getNormals(int index) {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormals(address, index));
    }

    /**
     * @param index Array index
     * @param value WebIDL type: {@link b2Vec2} [Value]
     */
    public void setNormals(int index, b2Vec2 value) {
        checkNotNull();
        Raw.setNormals(address, index, value.getAddress());
    }

    /**
     * The centroid of the polygon
     */
    public b2Vec2 getCentroid() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCentroid(address));
    }

    /**
     * The centroid of the polygon
     */
    public void setCentroid(b2Vec2 value) {
        checkNotNull();
        Raw.setCentroid(address, value.getAddress());
    }

    /**
     * The external radius for rounded polygons
     */
    public float getRadius() {
        checkNotNull();
        return Raw.getRadius(address);
    }

    /**
     * The external radius for rounded polygons
     */
    public void setRadius(float value) {
        checkNotNull();
        Raw.setRadius(address, value);
    }

    /**
     * The number of polygon vertices
     */
    public int getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * The number of polygon vertices
     */
    public void setCount(int value) {
        checkNotNull();
        Raw.setCount(address, value);
    }

    public static class Raw {
        public static native void b2Polygon_placed(long address);
        public static native long b2Polygon();
        public static native void destroy(long address);
        public static native long getVertices(long address, int index);
        public static native void setVertices(long address, int index, long value);
        public static native long getNormals(long address, int index);
        public static native void setNormals(long address, int index, long value);
        public static native long getCentroid(long address);
        public static native void setCentroid(long address, long value);
        public static native float getRadius(long address);
        public static native void setRadius(long address, float value);
        public static native int getCount(long address);
        public static native void setCount(long address, int value);
    }
}
