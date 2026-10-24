package box2d;


/**
 * Contact manifold in local coordinates (frame A).
 */
public class b2LocalManifold extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2LocalManifold wrapPointer(long address) {
        return address != 0L ? new b2LocalManifold(address) : null;
    }
    
    public static b2LocalManifold arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2LocalManifold(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2LocalManifold
     */
    public static b2LocalManifold createAt(long address) {
        Raw.b2LocalManifold_placed(address);
        b2LocalManifold createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2LocalManifold
     */
    public static <T> b2LocalManifold createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2LocalManifold_placed(address);
        b2LocalManifold createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2LocalManifold() {
        address = Raw.b2LocalManifold();
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
     * The unit normal vector in frame A, points from shape A to shape B
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * The unit normal vector in frame A, points from shape A to shape B
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * @param index Array index
     * @return WebIDL type: {@link b2LocalManifoldPoint} [Value]
     */
    public b2LocalManifoldPoint getPoints(int index) {
        checkNotNull();
        return b2LocalManifoldPoint.wrapPointer(Raw.getPoints(address, index));
    }

    /**
     * @param index Array index
     * @param value WebIDL type: {@link b2LocalManifoldPoint} [Value]
     */
    public void setPoints(int index, b2LocalManifoldPoint value) {
        checkNotNull();
        Raw.setPoints(address, index, value.getAddress());
    }

    /**
     * The number of contact points, will be 0, 1, or 2
     */
    public int getPointCount() {
        checkNotNull();
        return Raw.getPointCount(address);
    }

    /**
     * The number of contact points, will be 0, 1, or 2
     */
    public void setPointCount(int value) {
        checkNotNull();
        Raw.setPointCount(address, value);
    }

    public static class Raw {
        public static native void b2LocalManifold_placed(long address);
        public static native long b2LocalManifold();
        public static native void destroy(long address);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native long getPoints(long address, int index);
        public static native void setPoints(long address, int index, long value);
        public static native int getPointCount(long address);
        public static native void setPointCount(long address, int value);
    }
}
