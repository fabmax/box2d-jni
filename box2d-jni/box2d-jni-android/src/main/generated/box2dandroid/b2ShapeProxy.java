package box2dandroid;


/**
 * A distance proxy is used by the GJK algorithm. It encapsulates any shape.
 * You can provide between 1 and B2_MAX_POLYGON_VERTICES and a radius.
 */
public class b2ShapeProxy extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ShapeProxy wrapPointer(long address) {
        return address != 0L ? new b2ShapeProxy(address) : null;
    }
    
    public static b2ShapeProxy arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ShapeProxy(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ShapeProxy
     */
    public static b2ShapeProxy createAt(long address) {
        Raw.b2ShapeProxy_placed(address);
        b2ShapeProxy createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ShapeProxy
     */
    public static <T> b2ShapeProxy createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ShapeProxy_placed(address);
        b2ShapeProxy createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ShapeProxy() {
        address = Raw.b2ShapeProxy();
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
     * The number of points. Must be greater than 0.
     */
    public int getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * The number of points. Must be greater than 0.
     */
    public void setCount(int value) {
        checkNotNull();
        Raw.setCount(address, value);
    }

    /**
     * @param index Array index
     * @return WebIDL type: {@link b2Vec2} [Value]
     */
    public b2Vec2 getPoints(int index) {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoints(address, index));
    }

    /**
     * @param index Array index
     * @param value WebIDL type: {@link b2Vec2} [Value]
     */
    public void setPoints(int index, b2Vec2 value) {
        checkNotNull();
        Raw.setPoints(address, index, value.getAddress());
    }

    /**
     * The external radius of the point cloud. May be zero.
     */
    public float getRadius() {
        checkNotNull();
        return Raw.getRadius(address);
    }

    /**
     * The external radius of the point cloud. May be zero.
     */
    public void setRadius(float value) {
        checkNotNull();
        Raw.setRadius(address, value);
    }

    public static class Raw {
        public static native void b2ShapeProxy_placed(long address);
        public static native long b2ShapeProxy();
        public static native void destroy(long address);
        public static native int getCount(long address);
        public static native void setCount(long address, int value);
        public static native long getPoints(long address, int index);
        public static native void setPoints(long address, int index, long value);
        public static native float getRadius(long address);
        public static native void setRadius(long address, float value);
    }
}
