package box2d;


/**
 * Low level ray cast or shape-cast output data. Returns a zero fraction and normal in the case of initial overlap.
 */
public class b2CastOutput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2CastOutput wrapPointer(long address) {
        return address != 0L ? new b2CastOutput(address) : null;
    }
    
    public static b2CastOutput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2CastOutput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2CastOutput
     */
    public static b2CastOutput createAt(long address) {
        Raw.b2CastOutput_placed(address);
        b2CastOutput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2CastOutput
     */
    public static <T> b2CastOutput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2CastOutput_placed(address);
        b2CastOutput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2CastOutput() {
        address = Raw.b2CastOutput();
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
     * The fraction of the input translation at collision
     */
    public float getFraction() {
        checkNotNull();
        return Raw.getFraction(address);
    }

    /**
     * The fraction of the input translation at collision
     */
    public void setFraction(float value) {
        checkNotNull();
        Raw.setFraction(address, value);
    }

    /**
     * Did the cast hit?
     */
    public boolean getHit() {
        checkNotNull();
        return Raw.getHit(address);
    }

    /**
     * Did the cast hit?
     */
    public void setHit(boolean value) {
        checkNotNull();
        Raw.setHit(address, value);
    }

    /**
     * The number of iterations used
     */
    public int getIterations() {
        checkNotNull();
        return Raw.getIterations(address);
    }

    /**
     * The number of iterations used
     */
    public void setIterations(int value) {
        checkNotNull();
        Raw.setIterations(address, value);
    }

    /**
     * The surface normal at the hit point
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * The surface normal at the hit point
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * The surface hit point
     */
    public b2Vec2 getPoint() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint(address));
    }

    /**
     * The surface hit point
     */
    public void setPoint(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2CastOutput_placed(long address);
        public static native long b2CastOutput();
        public static native void destroy(long address);
        public static native float getFraction(long address);
        public static native void setFraction(long address, float value);
        public static native boolean getHit(long address);
        public static native void setHit(long address, boolean value);
        public static native int getIterations(long address);
        public static native void setIterations(long address, int value);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native long getPoint(long address);
        public static native void setPoint(long address, long value);
    }
}
