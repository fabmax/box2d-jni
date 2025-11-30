package box2dandroid;


/**
 * A solid capsule can be viewed as two semicircles connected
 * by a rectangle.
 */
public class b2Capsule extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Capsule wrapPointer(long address) {
        return address != 0L ? new b2Capsule(address) : null;
    }
    
    public static b2Capsule arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Capsule(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Capsule
     */
    public static b2Capsule createAt(long address) {
        Raw.b2Capsule_placed(address);
        b2Capsule createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Capsule
     */
    public static <T> b2Capsule createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Capsule_placed(address);
        b2Capsule createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Capsule() {
        address = Raw.b2Capsule();
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
     * Local center of the first semicircle
     */
    public b2Vec2 getCenter1() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCenter1(address));
    }

    /**
     * Local center of the first semicircle
     */
    public void setCenter1(b2Vec2 value) {
        checkNotNull();
        Raw.setCenter1(address, value.getAddress());
    }

    /**
     * Local center of the second semicircle
     */
    public b2Vec2 getCenter2() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCenter2(address));
    }

    /**
     * Local center of the second semicircle
     */
    public void setCenter2(b2Vec2 value) {
        checkNotNull();
        Raw.setCenter2(address, value.getAddress());
    }

    /**
     * The radius of the semicircles
     */
    public float getRadius() {
        checkNotNull();
        return Raw.getRadius(address);
    }

    /**
     * The radius of the semicircles
     */
    public void setRadius(float value) {
        checkNotNull();
        Raw.setRadius(address, value);
    }

    public static class Raw {
        public static native void b2Capsule_placed(long address);
        public static native long b2Capsule();
        public static native void destroy(long address);
        public static native long getCenter1(long address);
        public static native void setCenter1(long address, long value);
        public static native long getCenter2(long address);
        public static native void setCenter2(long address, long value);
        public static native float getRadius(long address);
        public static native void setRadius(long address, float value);
    }
}
