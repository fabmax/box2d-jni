package box2dandroid;


/**
 * Input for b2ShapeDistance
 */
public class b2DistanceInput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2DistanceInput wrapPointer(long address) {
        return address != 0L ? new b2DistanceInput(address) : null;
    }
    
    public static b2DistanceInput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2DistanceInput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2DistanceInput
     */
    public static b2DistanceInput createAt(long address) {
        Raw.b2DistanceInput_placed(address);
        b2DistanceInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2DistanceInput
     */
    public static <T> b2DistanceInput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2DistanceInput_placed(address);
        b2DistanceInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2DistanceInput() {
        address = Raw.b2DistanceInput();
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
     * The proxy for shape A
     */
    public b2ShapeProxy getProxyA() {
        checkNotNull();
        return b2ShapeProxy.wrapPointer(Raw.getProxyA(address));
    }

    /**
     * The proxy for shape A
     */
    public void setProxyA(b2ShapeProxy value) {
        checkNotNull();
        Raw.setProxyA(address, value.getAddress());
    }

    /**
     * The proxy for shape B
     */
    public b2ShapeProxy getProxyB() {
        checkNotNull();
        return b2ShapeProxy.wrapPointer(Raw.getProxyB(address));
    }

    /**
     * The proxy for shape B
     */
    public void setProxyB(b2ShapeProxy value) {
        checkNotNull();
        Raw.setProxyB(address, value.getAddress());
    }

    /**
     * The world transform for shape A
     */
    public b2Transform getTransformA() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getTransformA(address));
    }

    /**
     * The world transform for shape A
     */
    public void setTransformA(b2Transform value) {
        checkNotNull();
        Raw.setTransformA(address, value.getAddress());
    }

    /**
     * The world transform for shape B
     */
    public b2Transform getTransformB() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getTransformB(address));
    }

    /**
     * The world transform for shape B
     */
    public void setTransformB(b2Transform value) {
        checkNotNull();
        Raw.setTransformB(address, value.getAddress());
    }

    /**
     * Should the proxy radius be considered?
     */
    public boolean getUseRadii() {
        checkNotNull();
        return Raw.getUseRadii(address);
    }

    /**
     * Should the proxy radius be considered?
     */
    public void setUseRadii(boolean value) {
        checkNotNull();
        Raw.setUseRadii(address, value);
    }

    public static class Raw {
        public static native void b2DistanceInput_placed(long address);
        public static native long b2DistanceInput();
        public static native void destroy(long address);
        public static native long getProxyA(long address);
        public static native void setProxyA(long address, long value);
        public static native long getProxyB(long address);
        public static native void setProxyB(long address, long value);
        public static native long getTransformA(long address);
        public static native void setTransformA(long address, long value);
        public static native long getTransformB(long address);
        public static native void setTransformB(long address, long value);
        public static native boolean getUseRadii(long address);
        public static native void setUseRadii(long address, boolean value);
    }
}
