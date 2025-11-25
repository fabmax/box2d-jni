package box2d;


/**
 * These are the collision planes returned from b2World_CollideMover
 */
public class b2PlaneResult extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PlaneResult wrapPointer(long address) {
        return address != 0L ? new b2PlaneResult(address) : null;
    }
    
    public static b2PlaneResult arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PlaneResult(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2PlaneResult
     */
    public static b2PlaneResult createAt(long address) {
        Raw.b2PlaneResult_placed(address);
        b2PlaneResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2PlaneResult
     */
    public static <T> b2PlaneResult createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2PlaneResult_placed(address);
        b2PlaneResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2PlaneResult() {
        address = Raw.b2PlaneResult();
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
     * Did the collision register a hit? If not this plane should be ignored.
     */
    public boolean getHit() {
        checkNotNull();
        return Raw.getHit(address);
    }

    /**
     * Did the collision register a hit? If not this plane should be ignored.
     */
    public void setHit(boolean value) {
        checkNotNull();
        Raw.setHit(address, value);
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public b2Plane getPlane() {
        checkNotNull();
        return b2Plane.wrapPointer(Raw.getPlane(address));
    }

    /**
     * The collision plane between the mover and a convex shape
     */
    public void setPlane(b2Plane value) {
        checkNotNull();
        Raw.setPlane(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2PlaneResult_placed(long address);
        public static native long b2PlaneResult();
        public static native void destroy(long address);
        public static native boolean getHit(long address);
        public static native void setHit(long address, boolean value);
        public static native long getPlane(long address);
        public static native void setPlane(long address, long value);
    }
}
