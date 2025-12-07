package box2d;


/**
 * Simplex vertex for debugging the GJK algorithm
 */
public class b2SimplexVertex extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2SimplexVertex wrapPointer(long address) {
        return address != 0L ? new b2SimplexVertex(address) : null;
    }
    
    public static b2SimplexVertex arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2SimplexVertex(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2SimplexVertex
     */
    public static b2SimplexVertex createAt(long address) {
        Raw.b2SimplexVertex_placed(address);
        b2SimplexVertex createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2SimplexVertex
     */
    public static <T> b2SimplexVertex createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2SimplexVertex_placed(address);
        b2SimplexVertex createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2SimplexVertex() {
        address = Raw.b2SimplexVertex();
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

    public b2Vec2 getWA() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getWA(address));
    }

    public void setWA(b2Vec2 value) {
        checkNotNull();
        Raw.setWA(address, value.getAddress());
    }

    /**
     * &lt; support point in proxyA
     */
    public b2Vec2 getWB() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getWB(address));
    }

    /**
     * &lt; support point in proxyA
     */
    public void setWB(b2Vec2 value) {
        checkNotNull();
        Raw.setWB(address, value.getAddress());
    }

    /**
     * &lt; support point in proxyB
     */
    public b2Vec2 getW() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getW(address));
    }

    /**
     * &lt; support point in proxyB
     */
    public void setW(b2Vec2 value) {
        checkNotNull();
        Raw.setW(address, value.getAddress());
    }

    /**
     * &lt; wB - wA
     */
    public float getA() {
        checkNotNull();
        return Raw.getA(address);
    }

    /**
     * &lt; wB - wA
     */
    public void setA(float value) {
        checkNotNull();
        Raw.setA(address, value);
    }

    /**
     * &lt; barycentric coordinate for closest point
     */
    public int getIndexA() {
        checkNotNull();
        return Raw.getIndexA(address);
    }

    /**
     * &lt; barycentric coordinate for closest point
     */
    public void setIndexA(int value) {
        checkNotNull();
        Raw.setIndexA(address, value);
    }

    /**
     * &lt; wA index
     */
    public int getIndexB() {
        checkNotNull();
        return Raw.getIndexB(address);
    }

    /**
     * &lt; wA index
     */
    public void setIndexB(int value) {
        checkNotNull();
        Raw.setIndexB(address, value);
    }

    public static class Raw {
        public static native void b2SimplexVertex_placed(long address);
        public static native long b2SimplexVertex();
        public static native void destroy(long address);
        public static native long getWA(long address);
        public static native void setWA(long address, long value);
        public static native long getWB(long address);
        public static native void setWB(long address, long value);
        public static native long getW(long address);
        public static native void setW(long address, long value);
        public static native float getA(long address);
        public static native void setA(long address, float value);
        public static native int getIndexA(long address);
        public static native void setIndexA(long address, int value);
        public static native int getIndexB(long address);
        public static native void setIndexB(long address, int value);
    }
}
