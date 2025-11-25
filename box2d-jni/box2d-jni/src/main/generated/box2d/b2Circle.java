package box2d;


/**
 * A solid circle
 */
public class b2Circle extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Circle wrapPointer(long address) {
        return address != 0L ? new b2Circle(address) : null;
    }
    
    public static b2Circle arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Circle(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Circle
     */
    public static b2Circle createAt(long address) {
        Raw.b2Circle_placed(address);
        b2Circle createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Circle
     */
    public static <T> b2Circle createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Circle_placed(address);
        b2Circle createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Circle() {
        address = Raw.b2Circle();
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
     * The local center
     */
    public b2Vec2 getCenter() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCenter(address));
    }

    /**
     * The local center
     */
    public void setCenter(b2Vec2 value) {
        checkNotNull();
        Raw.setCenter(address, value.getAddress());
    }

    /**
     * The radius
     */
    public float getRadius() {
        checkNotNull();
        return Raw.getRadius(address);
    }

    /**
     * The radius
     */
    public void setRadius(float value) {
        checkNotNull();
        Raw.setRadius(address, value);
    }

    public static class Raw {
        public static native void b2Circle_placed(long address);
        public static native long b2Circle();
        public static native void destroy(long address);
        public static native long getCenter(long address);
        public static native void setCenter(long address, long value);
        public static native float getRadius(long address);
        public static native void setRadius(long address, float value);
    }
}
