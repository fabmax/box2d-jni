package box2dandroid;


/**
 * separation = dot(normal, point) - offset
 */
public class b2Plane extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Plane wrapPointer(long address) {
        return address != 0L ? new b2Plane(address) : null;
    }
    
    public static b2Plane arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Plane(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Plane
     */
    public static b2Plane createAt(long address) {
        Raw.b2Plane_placed(address);
        b2Plane createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Plane
     */
    public static <T> b2Plane createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Plane_placed(address);
        b2Plane createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Plane() {
        address = Raw.b2Plane();
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

    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    public float getOffset() {
        checkNotNull();
        return Raw.getOffset(address);
    }

    public void setOffset(float value) {
        checkNotNull();
        Raw.setOffset(address, value);
    }

    public static class Raw {
        public static native void b2Plane_placed(long address);
        public static native long b2Plane();
        public static native void destroy(long address);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native float getOffset(long address);
        public static native void setOffset(long address, float value);
    }
}
