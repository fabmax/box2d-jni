package box2dandroid;


/**
 * A convex hull. Used to create convex polygons.
 * @warning Do not modify these values directly, instead use b2ComputeHull()
 */
public class b2Hull extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Hull wrapPointer(long address) {
        return address != 0L ? new b2Hull(address) : null;
    }
    
    public static b2Hull arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Hull(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Hull
     */
    public static b2Hull createAt(long address) {
        Raw.b2Hull_placed(address);
        b2Hull createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Hull
     */
    public static <T> b2Hull createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Hull_placed(address);
        b2Hull createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Hull() {
        address = Raw.b2Hull();
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
     * The number of points
     */
    public int getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * The number of points
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

    public static class Raw {
        public static native void b2Hull_placed(long address);
        public static native long b2Hull();
        public static native void destroy(long address);
        public static native int getCount(long address);
        public static native void setCount(long address, int value);
        public static native long getPoints(long address, int index);
        public static native void setPoints(long address, int index, long value);
    }
}
