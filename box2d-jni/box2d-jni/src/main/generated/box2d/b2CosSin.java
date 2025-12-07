package box2d;


/**
 * Cosine and sine pair
 * This uses a custom implementation designed for cross-platform determinism
 */
public class b2CosSin extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2CosSin wrapPointer(long address) {
        return address != 0L ? new b2CosSin(address) : null;
    }
    
    public static b2CosSin arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2CosSin(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2CosSin
     */
    public static b2CosSin createAt(long address) {
        Raw.b2CosSin_placed(address);
        b2CosSin createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2CosSin
     */
    public static <T> b2CosSin createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2CosSin_placed(address);
        b2CosSin createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2CosSin() {
        address = Raw.b2CosSin();
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
     * cosine and sine
     */
    public float getCosine() {
        checkNotNull();
        return Raw.getCosine(address);
    }

    /**
     * cosine and sine
     */
    public void setCosine(float value) {
        checkNotNull();
        Raw.setCosine(address, value);
    }

    public float getSine() {
        checkNotNull();
        return Raw.getSine(address);
    }

    public void setSine(float value) {
        checkNotNull();
        Raw.setSine(address, value);
    }

    public static class Raw {
        public static native void b2CosSin_placed(long address);
        public static native long b2CosSin();
        public static native void destroy(long address);
        public static native float getCosine(long address);
        public static native void setCosine(long address, float value);
        public static native float getSine(long address);
        public static native void setSine(long address, float value);
    }
}
