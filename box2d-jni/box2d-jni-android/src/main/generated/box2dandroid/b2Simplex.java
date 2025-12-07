package box2dandroid;


/**
 * Simplex from the GJK algorithm
 */
public class b2Simplex extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Simplex wrapPointer(long address) {
        return address != 0L ? new b2Simplex(address) : null;
    }
    
    public static b2Simplex arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Simplex(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Simplex
     */
    public static b2Simplex createAt(long address) {
        Raw.b2Simplex_placed(address);
        b2Simplex createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Simplex
     */
    public static <T> b2Simplex createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Simplex_placed(address);
        b2Simplex createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Simplex() {
        address = Raw.b2Simplex();
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
     * @return WebIDL type: {@link b2SimplexVertex} [Value]
     */
    public b2SimplexVertex getV1() {
        checkNotNull();
        return b2SimplexVertex.wrapPointer(Raw.getV1(address));
    }

    /**
     * @param value WebIDL type: {@link b2SimplexVertex} [Value]
     */
    public void setV1(b2SimplexVertex value) {
        checkNotNull();
        Raw.setV1(address, value.getAddress());
    }

    /**
     * @return WebIDL type: {@link b2SimplexVertex} [Value]
     */
    public b2SimplexVertex getV2() {
        checkNotNull();
        return b2SimplexVertex.wrapPointer(Raw.getV2(address));
    }

    /**
     * @param value WebIDL type: {@link b2SimplexVertex} [Value]
     */
    public void setV2(b2SimplexVertex value) {
        checkNotNull();
        Raw.setV2(address, value.getAddress());
    }

    public b2SimplexVertex getV3() {
        checkNotNull();
        return b2SimplexVertex.wrapPointer(Raw.getV3(address));
    }

    public void setV3(b2SimplexVertex value) {
        checkNotNull();
        Raw.setV3(address, value.getAddress());
    }

    /**
     * &lt; vertices
     */
    public int getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * &lt; vertices
     */
    public void setCount(int value) {
        checkNotNull();
        Raw.setCount(address, value);
    }

    public static class Raw {
        public static native void b2Simplex_placed(long address);
        public static native long b2Simplex();
        public static native void destroy(long address);
        public static native long getV1(long address);
        public static native void setV1(long address, long value);
        public static native long getV2(long address);
        public static native void setV2(long address, long value);
        public static native long getV3(long address);
        public static native void setV3(long address, long value);
        public static native int getCount(long address);
        public static native void setCount(long address, int value);
    }
}
