package box2d;


/**
 * Input parameters for b2ShapeCast
 */
public class b2ShapeCastPairInput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ShapeCastPairInput wrapPointer(long address) {
        return address != 0L ? new b2ShapeCastPairInput(address) : null;
    }
    
    public static b2ShapeCastPairInput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ShapeCastPairInput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ShapeCastPairInput
     */
    public static b2ShapeCastPairInput createAt(long address) {
        Raw.b2ShapeCastPairInput_placed(address);
        b2ShapeCastPairInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ShapeCastPairInput
     */
    public static <T> b2ShapeCastPairInput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ShapeCastPairInput_placed(address);
        b2ShapeCastPairInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ShapeCastPairInput() {
        address = Raw.b2ShapeCastPairInput();
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
    public b2ShapeProxy getProxyA() {
        checkNotNull();
        return b2ShapeProxy.wrapPointer(Raw.getProxyA(address));
    }

    /**
     */
    public void setProxyA(b2ShapeProxy value) {
        checkNotNull();
        Raw.setProxyA(address, value.getAddress());
    }

    /**
     * &lt; The proxy for shape A
     */
    public b2ShapeProxy getProxyB() {
        checkNotNull();
        return b2ShapeProxy.wrapPointer(Raw.getProxyB(address));
    }

    /**
     * &lt; The proxy for shape A
     */
    public void setProxyB(b2ShapeProxy value) {
        checkNotNull();
        Raw.setProxyB(address, value.getAddress());
    }

    /**
     * &lt; The proxy for shape B
     */
    public b2Transform getTransformA() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getTransformA(address));
    }

    /**
     * &lt; The proxy for shape B
     */
    public void setTransformA(b2Transform value) {
        checkNotNull();
        Raw.setTransformA(address, value.getAddress());
    }

    /**
     * &lt; The world transform for shape A
     */
    public b2Transform getTransformB() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getTransformB(address));
    }

    /**
     * &lt; The world transform for shape A
     */
    public void setTransformB(b2Transform value) {
        checkNotNull();
        Raw.setTransformB(address, value.getAddress());
    }

    /**
     * &lt; The world transform for shape B
     */
    public b2Vec2 getTranslationB() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getTranslationB(address));
    }

    /**
     * &lt; The world transform for shape B
     */
    public void setTranslationB(b2Vec2 value) {
        checkNotNull();
        Raw.setTranslationB(address, value.getAddress());
    }

    /**
     * &lt; The translation of shape B
     */
    public float getMaxFraction() {
        checkNotNull();
        return Raw.getMaxFraction(address);
    }

    /**
     * &lt; The translation of shape B
     */
    public void setMaxFraction(float value) {
        checkNotNull();
        Raw.setMaxFraction(address, value);
    }

    /**
     * &lt; The fraction of the translation to consider, typically 1
     */
    public boolean getCanEncroach() {
        checkNotNull();
        return Raw.getCanEncroach(address);
    }

    /**
     * &lt; The fraction of the translation to consider, typically 1
     */
    public void setCanEncroach(boolean value) {
        checkNotNull();
        Raw.setCanEncroach(address, value);
    }

    public static class Raw {
        public static native void b2ShapeCastPairInput_placed(long address);
        public static native long b2ShapeCastPairInput();
        public static native void destroy(long address);
        public static native long getProxyA(long address);
        public static native void setProxyA(long address, long value);
        public static native long getProxyB(long address);
        public static native void setProxyB(long address, long value);
        public static native long getTransformA(long address);
        public static native void setTransformA(long address, long value);
        public static native long getTransformB(long address);
        public static native void setTransformB(long address, long value);
        public static native long getTranslationB(long address);
        public static native void setTranslationB(long address, long value);
        public static native float getMaxFraction(long address);
        public static native void setMaxFraction(long address, float value);
        public static native boolean getCanEncroach(long address);
        public static native void setCanEncroach(long address, boolean value);
    }
}
