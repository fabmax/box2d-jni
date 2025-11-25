package box2d;


/**
 * 2D vector
 * This can be used to represent a point or free vector
 */
public class b2Vec2 extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Vec2 wrapPointer(long address) {
        return address != 0L ? new b2Vec2(address) : null;
    }
    
    public static b2Vec2 arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Vec2(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Vec2
     */
    public static b2Vec2 createAt(long address) {
        Raw.b2Vec2_placed(address);
        b2Vec2 createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Vec2
     */
    public static <T> b2Vec2 createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Vec2_placed(address);
        b2Vec2 createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Vec2() {
        address = Raw.b2Vec2();
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
     * @return WebIDL type: float
     */
    public float getX() {
        checkNotNull();
        return Raw.getX(address);
    }

    /**
     * @param value WebIDL type: float
     */
    public void setX(float value) {
        checkNotNull();
        Raw.setX(address, value);
    }

    /**
     * coordinates
     */
    public float getY() {
        checkNotNull();
        return Raw.getY(address);
    }

    /**
     * coordinates
     */
    public void setY(float value) {
        checkNotNull();
        Raw.setY(address, value);
    }

    public static class Raw {
        public static native void b2Vec2_placed(long address);
        public static native long b2Vec2();
        public static native void destroy(long address);
        public static native float getX(long address);
        public static native void setX(long address, float value);
        public static native float getY(long address);
        public static native void setY(long address, float value);
    }
}
