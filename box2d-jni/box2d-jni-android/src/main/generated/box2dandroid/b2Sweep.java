package box2dandroid;


/**
 * This describes the motion of a body/shape for TOI computation. Shapes are defined with respect to the body origin,
 * which may not coincide with the center of mass. However, to support dynamics we must interpolate the center of mass
 * position.
 */
public class b2Sweep extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Sweep wrapPointer(long address) {
        return address != 0L ? new b2Sweep(address) : null;
    }
    
    public static b2Sweep arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Sweep(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Sweep
     */
    public static b2Sweep createAt(long address) {
        Raw.b2Sweep_placed(address);
        b2Sweep createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Sweep
     */
    public static <T> b2Sweep createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Sweep_placed(address);
        b2Sweep createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Sweep() {
        address = Raw.b2Sweep();
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
    public b2Vec2 getLocalCenter() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLocalCenter(address));
    }

    /**
     */
    public void setLocalCenter(b2Vec2 value) {
        checkNotNull();
        Raw.setLocalCenter(address, value.getAddress());
    }

    /**
     * &lt; Local center of mass position
     */
    public b2Vec2 getC1() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getC1(address));
    }

    /**
     * &lt; Local center of mass position
     */
    public void setC1(b2Vec2 value) {
        checkNotNull();
        Raw.setC1(address, value.getAddress());
    }

    /**
     * &lt; Starting center of mass world position
     */
    public b2Vec2 getC2() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getC2(address));
    }

    /**
     * &lt; Starting center of mass world position
     */
    public void setC2(b2Vec2 value) {
        checkNotNull();
        Raw.setC2(address, value.getAddress());
    }

    /**
     * &lt; Ending center of mass world position
     */
    public b2Rot getQ1() {
        checkNotNull();
        return b2Rot.wrapPointer(Raw.getQ1(address));
    }

    /**
     * &lt; Ending center of mass world position
     */
    public void setQ1(b2Rot value) {
        checkNotNull();
        Raw.setQ1(address, value.getAddress());
    }

    /**
     * &lt; Starting world rotation
     */
    public b2Rot getQ2() {
        checkNotNull();
        return b2Rot.wrapPointer(Raw.getQ2(address));
    }

    /**
     * &lt; Starting world rotation
     */
    public void setQ2(b2Rot value) {
        checkNotNull();
        Raw.setQ2(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2Sweep_placed(long address);
        public static native long b2Sweep();
        public static native void destroy(long address);
        public static native long getLocalCenter(long address);
        public static native void setLocalCenter(long address, long value);
        public static native long getC1(long address);
        public static native void setC1(long address, long value);
        public static native long getC2(long address);
        public static native void setC2(long address, long value);
        public static native long getQ1(long address);
        public static native void setQ1(long address, long value);
        public static native long getQ2(long address);
        public static native void setQ2(long address, long value);
    }
}
