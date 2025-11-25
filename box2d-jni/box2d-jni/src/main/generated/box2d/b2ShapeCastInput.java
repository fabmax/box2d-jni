package box2d;


/**
 * Low level shape cast input in generic form. This allows casting an arbitrary point
 * cloud wrap with a radius. For example, a circle is a single point with a non-zero radius.
 * A capsule is two points with a non-zero radius. A box is four points with a zero radius.
 */
public class b2ShapeCastInput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ShapeCastInput wrapPointer(long address) {
        return address != 0L ? new b2ShapeCastInput(address) : null;
    }
    
    public static b2ShapeCastInput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ShapeCastInput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ShapeCastInput
     */
    public static b2ShapeCastInput createAt(long address) {
        Raw.b2ShapeCastInput_placed(address);
        b2ShapeCastInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ShapeCastInput
     */
    public static <T> b2ShapeCastInput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ShapeCastInput_placed(address);
        b2ShapeCastInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ShapeCastInput() {
        address = Raw.b2ShapeCastInput();
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
     * Allow shape cast to encroach when initially touching. This only works if the radius is greater than zero.
     */
    public boolean getCanEncroach() {
        checkNotNull();
        return Raw.getCanEncroach(address);
    }

    /**
     * Allow shape cast to encroach when initially touching. This only works if the radius is greater than zero.
     */
    public void setCanEncroach(boolean value) {
        checkNotNull();
        Raw.setCanEncroach(address, value);
    }

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
     * A generic shape
     */
    public b2ShapeProxy getProxy() {
        checkNotNull();
        return b2ShapeProxy.wrapPointer(Raw.getProxy(address));
    }

    /**
     * A generic shape
     */
    public void setProxy(b2ShapeProxy value) {
        checkNotNull();
        Raw.setProxy(address, value.getAddress());
    }

    /**
     * The translation of the shape cast
     */
    public b2Vec2 getTranslation() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getTranslation(address));
    }

    /**
     * The translation of the shape cast
     */
    public void setTranslation(b2Vec2 value) {
        checkNotNull();
        Raw.setTranslation(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ShapeCastInput_placed(long address);
        public static native long b2ShapeCastInput();
        public static native void destroy(long address);
        public static native boolean getCanEncroach(long address);
        public static native void setCanEncroach(long address, boolean value);
        public static native float getMaxFraction(long address);
        public static native void setMaxFraction(long address, float value);
        public static native long getProxy(long address);
        public static native void setProxy(long address, long value);
        public static native long getTranslation(long address);
        public static native void setTranslation(long address, long value);
    }
}
