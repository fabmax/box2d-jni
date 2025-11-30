package box2dandroid;


/**
 * Body id references a body instance. This should be treated as an opaque handle.
 */
public class b2BodyId extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2BodyId wrapPointer(long address) {
        return address != 0L ? new b2BodyId(address) : null;
    }
    
    public static b2BodyId arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2BodyId(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2BodyId
     */
    public static b2BodyId createAt(long address) {
        Raw.b2BodyId_placed(address);
        b2BodyId createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2BodyId
     */
    public static <T> b2BodyId createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2BodyId_placed(address);
        b2BodyId createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2BodyId() {
        address = Raw.b2BodyId();
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
    public int getIndex1() {
        checkNotNull();
        return Raw.getIndex1(address);
    }

    /**
     */
    public void setIndex1(int value) {
        checkNotNull();
        Raw.setIndex1(address, value);
    }

    /**
     */
    public short getWorld0() {
        checkNotNull();
        return Raw.getWorld0(address);
    }

    /**
     */
    public void setWorld0(short value) {
        checkNotNull();
        Raw.setWorld0(address, value);
    }

    public static class Raw {
        public static native void b2BodyId_placed(long address);
        public static native long b2BodyId();
        public static native void destroy(long address);
        public static native short getGeneration(long address);
        public static native void setGeneration(long address, short value);
        public static native int getIndex1(long address);
        public static native void setIndex1(long address, int value);
        public static native short getWorld0(long address);
        public static native void setWorld0(long address, short value);
    }
}
