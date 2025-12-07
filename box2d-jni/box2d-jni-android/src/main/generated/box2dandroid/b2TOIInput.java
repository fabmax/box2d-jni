package box2dandroid;


/**
 * Input parameters for b2TimeOfImpact
 */
public class b2TOIInput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2TOIInput wrapPointer(long address) {
        return address != 0L ? new b2TOIInput(address) : null;
    }
    
    public static b2TOIInput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2TOIInput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2TOIInput
     */
    public static b2TOIInput createAt(long address) {
        Raw.b2TOIInput_placed(address);
        b2TOIInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2TOIInput
     */
    public static <T> b2TOIInput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2TOIInput_placed(address);
        b2TOIInput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2TOIInput() {
        address = Raw.b2TOIInput();
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
    public b2Sweep getSweepA() {
        checkNotNull();
        return b2Sweep.wrapPointer(Raw.getSweepA(address));
    }

    /**
     * &lt; The proxy for shape B
     */
    public void setSweepA(b2Sweep value) {
        checkNotNull();
        Raw.setSweepA(address, value.getAddress());
    }

    /**
     * &lt; The movement of shape A
     */
    public b2Sweep getSweepB() {
        checkNotNull();
        return b2Sweep.wrapPointer(Raw.getSweepB(address));
    }

    /**
     * &lt; The movement of shape A
     */
    public void setSweepB(b2Sweep value) {
        checkNotNull();
        Raw.setSweepB(address, value.getAddress());
    }

    /**
     * &lt; The movement of shape B
     */
    public float getMaxFraction() {
        checkNotNull();
        return Raw.getMaxFraction(address);
    }

    /**
     * &lt; The movement of shape B
     */
    public void setMaxFraction(float value) {
        checkNotNull();
        Raw.setMaxFraction(address, value);
    }

    public static class Raw {
        public static native void b2TOIInput_placed(long address);
        public static native long b2TOIInput();
        public static native void destroy(long address);
        public static native long getProxyA(long address);
        public static native void setProxyA(long address, long value);
        public static native long getProxyB(long address);
        public static native void setProxyB(long address, long value);
        public static native long getSweepA(long address);
        public static native void setSweepA(long address, long value);
        public static native long getSweepB(long address);
        public static native void setSweepB(long address, long value);
        public static native float getMaxFraction(long address);
        public static native void setMaxFraction(long address, float value);
    }
}
