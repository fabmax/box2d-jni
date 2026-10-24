package box2dandroid;


/**
 * Contact manifold point in local coordinates (frame A).
 */
public class b2LocalManifoldPoint extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2LocalManifoldPoint wrapPointer(long address) {
        return address != 0L ? new b2LocalManifoldPoint(address) : null;
    }
    
    public static b2LocalManifoldPoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2LocalManifoldPoint(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2LocalManifoldPoint
     */
    public static b2LocalManifoldPoint createAt(long address) {
        Raw.b2LocalManifoldPoint_placed(address);
        b2LocalManifoldPoint createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2LocalManifoldPoint
     */
    public static <T> b2LocalManifoldPoint createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2LocalManifoldPoint_placed(address);
        b2LocalManifoldPoint createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2LocalManifoldPoint() {
        address = Raw.b2LocalManifoldPoint();
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
     * Contact point in frame A
     */
    public b2Vec2 getPoint() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint(address));
    }

    /**
     * Contact point in frame A
     */
    public void setPoint(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint(address, value.getAddress());
    }

    /**
     * The separation of the contact point, negative if penetrating. May be positive or negative.
     */
    public float getSeparation() {
        checkNotNull();
        return Raw.getSeparation(address);
    }

    /**
     * The separation of the contact point, negative if penetrating. May be positive or negative.
     */
    public void setSeparation(float value) {
        checkNotNull();
        Raw.setSeparation(address, value);
    }

    /**
     * Uniquely identifies a contact point between two shapes
     */
    public short getId() {
        checkNotNull();
        return Raw.getId(address);
    }

    /**
     * Uniquely identifies a contact point between two shapes
     */
    public void setId(short value) {
        checkNotNull();
        Raw.setId(address, value);
    }

    public static class Raw {
        public static native void b2LocalManifoldPoint_placed(long address);
        public static native long b2LocalManifoldPoint();
        public static native void destroy(long address);
        public static native long getPoint(long address);
        public static native void setPoint(long address, long value);
        public static native float getSeparation(long address);
        public static native void setSeparation(long address, float value);
        public static native short getId(long address);
        public static native void setId(long address, short value);
    }
}
