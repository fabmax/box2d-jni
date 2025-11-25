package box2d;


/**
 * A 2-by-2 Matrix
 */
public class b2Mat22 extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Mat22 wrapPointer(long address) {
        return address != 0L ? new b2Mat22(address) : null;
    }
    
    public static b2Mat22 arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Mat22(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Mat22
     */
    public static b2Mat22 createAt(long address) {
        Raw.b2Mat22_placed(address);
        b2Mat22 createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Mat22
     */
    public static <T> b2Mat22 createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Mat22_placed(address);
        b2Mat22 createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Mat22() {
        address = Raw.b2Mat22();
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
     * @return WebIDL type: {@link b2Vec2} [Value]
     */
    public b2Vec2 getCx() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCx(address));
    }

    /**
     * @param value WebIDL type: {@link b2Vec2} [Value]
     */
    public void setCx(b2Vec2 value) {
        checkNotNull();
        Raw.setCx(address, value.getAddress());
    }

    /**
     * columns
     */
    public b2Vec2 getCy() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCy(address));
    }

    /**
     * columns
     */
    public void setCy(b2Vec2 value) {
        checkNotNull();
        Raw.setCy(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2Mat22_placed(long address);
        public static native long b2Mat22();
        public static native void destroy(long address);
        public static native long getCx(long address);
        public static native void setCx(long address, long value);
        public static native long getCy(long address);
        public static native void setCy(long address, long value);
    }
}
