package box2d;


/**
 * The maximum number of vertices on a convex polygon. Changing this affects performance even if you
 * don't use more vertices.
 * Low level ray cast input data
 */
public class b2RayCastInput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2RayCastInput wrapPointer(long address) {
        return address != 0L ? new b2RayCastInput(address) : null;
    }
    
    public static b2RayCastInput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2RayCastInput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2RayCastInput
     */
    public static b2RayCastInput createAt(long address) {
        Raw.b2RayCastInput_placed(address);
        b2RayCastInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2RayCastInput
     */
    public static <T> b2RayCastInput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2RayCastInput_placed(address);
        b2RayCastInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2RayCastInput() {
        address = Raw.b2RayCastInput();
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
     * The maximum fraction of the translation to consider, typically 1
     */
    public float getMaxFraction() {
        checkNotNull();
        return Raw.getMaxFraction(address);
    }

    /**
     * The maximum fraction of the translation to consider, typically 1
     */
    public void setMaxFraction(float value) {
        checkNotNull();
        Raw.setMaxFraction(address, value);
    }

    /**
     * Start point of the ray cast
     */
    public b2Vec2 getOrigin() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getOrigin(address));
    }

    /**
     * Start point of the ray cast
     */
    public void setOrigin(b2Vec2 value) {
        checkNotNull();
        Raw.setOrigin(address, value.getAddress());
    }

    /**
     * Translation of the ray cast
     */
    public b2Vec2 getTranslation() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getTranslation(address));
    }

    /**
     * Translation of the ray cast
     */
    public void setTranslation(b2Vec2 value) {
        checkNotNull();
        Raw.setTranslation(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2RayCastInput_placed(long address);
        public static native long b2RayCastInput();
        public static native void destroy(long address);
        public static native float getMaxFraction(long address);
        public static native void setMaxFraction(long address, float value);
        public static native long getOrigin(long address);
        public static native void setOrigin(long address, long value);
        public static native long getTranslation(long address);
        public static native void setTranslation(long address, long value);
    }
}
