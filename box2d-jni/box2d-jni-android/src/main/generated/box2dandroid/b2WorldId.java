package box2dandroid;


/**
 * World id references a world instance. This should be treated as an opaque handle.
 */
public class b2WorldId extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2WorldId wrapPointer(long address) {
        return address != 0L ? new b2WorldId(address) : null;
    }
    
    public static b2WorldId arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2WorldId(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2WorldId
     */
    public static b2WorldId createAt(long address) {
        Raw.b2WorldId_placed(address);
        b2WorldId createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2WorldId
     */
    public static <T> b2WorldId createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2WorldId_placed(address);
        b2WorldId createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2WorldId() {
        address = Raw.b2WorldId();
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
    public short getGeneration() {
        checkNotNull();
        return Raw.getGeneration(address);
    }

    /**
     */
    public void setGeneration(short value) {
        checkNotNull();
        Raw.setGeneration(address, value);
    }

    /**
     */
    public short getIndex1() {
        checkNotNull();
        return Raw.getIndex1(address);
    }

    /**
     */
    public void setIndex1(short value) {
        checkNotNull();
        Raw.setIndex1(address, value);
    }

    public static class Raw {
        public static native void b2WorldId_placed(long address);
        public static native long b2WorldId();
        public static native void destroy(long address);
        public static native short getGeneration(long address);
        public static native void setGeneration(long address, short value);
        public static native short getIndex1(long address);
        public static native void setIndex1(long address, short value);
    }
}
