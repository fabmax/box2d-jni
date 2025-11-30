package box2dandroid;


/**
 * 2D rotation
 * This is similar to using a complex number for rotation
 */
public class b2Rot extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Rot wrapPointer(long address) {
        return address != 0L ? new b2Rot(address) : null;
    }
    
    public static b2Rot arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Rot(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Rot
     */
    public static b2Rot createAt(long address) {
        Raw.b2Rot_placed(address);
        b2Rot createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Rot
     */
    public static <T> b2Rot createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Rot_placed(address);
        b2Rot createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Rot() {
        address = Raw.b2Rot();
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
    public float getC() {
        checkNotNull();
        return Raw.getC(address);
    }

    /**
     * @param value WebIDL type: float
     */
    public void setC(float value) {
        checkNotNull();
        Raw.setC(address, value);
    }

    /**
     * cosine and sine
     */
    public float getS() {
        checkNotNull();
        return Raw.getS(address);
    }

    /**
     * cosine and sine
     */
    public void setS(float value) {
        checkNotNull();
        Raw.setS(address, value);
    }

    public static class Raw {
        public static native void b2Rot_placed(long address);
        public static native long b2Rot();
        public static native void destroy(long address);
        public static native float getC(long address);
        public static native void setC(long address, float value);
        public static native float getS(long address);
        public static native void setS(long address, float value);
    }
}
