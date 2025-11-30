package box2dandroid;


/**
 * A 2D rigid transform
 */
public class b2Transform extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Transform wrapPointer(long address) {
        return address != 0L ? new b2Transform(address) : null;
    }
    
    public static b2Transform arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Transform(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Transform
     */
    public static b2Transform createAt(long address) {
        Raw.b2Transform_placed(address);
        b2Transform createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Transform
     */
    public static <T> b2Transform createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Transform_placed(address);
        b2Transform createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Transform() {
        address = Raw.b2Transform();
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
    public b2Vec2 getP() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getP(address));
    }

    /**
     */
    public void setP(b2Vec2 value) {
        checkNotNull();
        Raw.setP(address, value.getAddress());
    }

    /**
     */
    public b2Rot getQ() {
        checkNotNull();
        return b2Rot.wrapPointer(Raw.getQ(address));
    }

    /**
     */
    public void setQ(b2Rot value) {
        checkNotNull();
        Raw.setQ(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2Transform_placed(long address);
        public static native long b2Transform();
        public static native void destroy(long address);
        public static native long getP(long address);
        public static native void setP(long address, long value);
        public static native long getQ(long address);
        public static native void setQ(long address, long value);
    }
}
