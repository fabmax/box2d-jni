package box2dandroid;


/**
 * A contact manifold describes the contact points between colliding shapes.
 * @note Box2D uses speculative collision so some contact points may be separated.
 */
public class b2Manifold extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Manifold wrapPointer(long address) {
        return address != 0L ? new b2Manifold(address) : null;
    }
    
    public static b2Manifold arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Manifold(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Manifold
     */
    public static b2Manifold createAt(long address) {
        Raw.b2Manifold_placed(address);
        b2Manifold createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Manifold
     */
    public static <T> b2Manifold createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Manifold_placed(address);
        b2Manifold createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Manifold() {
        address = Raw.b2Manifold();
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
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * The unit normal vector in world space, points from shape A to bodyB
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * The number of contacts points, will be 0, 1, or 2
     */
    public int getPointCount() {
        checkNotNull();
        return Raw.getPointCount(address);
    }

    /**
     * The number of contacts points, will be 0, 1, or 2
     */
    public void setPointCount(int value) {
        checkNotNull();
        Raw.setPointCount(address, value);
    }

    /**
     * @param index Array index
     * @return WebIDL type: {@link b2ManifoldPoint} [Value]
     */
    public b2ManifoldPoint getPoints(int index) {
        checkNotNull();
        return b2ManifoldPoint.wrapPointer(Raw.getPoints(address, index));
    }

    /**
     * @param index Array index
     * @param value WebIDL type: {@link b2ManifoldPoint} [Value]
     */
    public void setPoints(int index, b2ManifoldPoint value) {
        checkNotNull();
        Raw.setPoints(address, index, value.getAddress());
    }

    /**
     * Angular impulse applied for rolling resistance. N * m * s = kg * m^2 / s
     */
    public float getRollingImpulse() {
        checkNotNull();
        return Raw.getRollingImpulse(address);
    }

    /**
     * Angular impulse applied for rolling resistance. N * m * s = kg * m^2 / s
     */
    public void setRollingImpulse(float value) {
        checkNotNull();
        Raw.setRollingImpulse(address, value);
    }

    public static class Raw {
        public static native void b2Manifold_placed(long address);
        public static native long b2Manifold();
        public static native void destroy(long address);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native int getPointCount(long address);
        public static native void setPointCount(long address, int value);
        public static native long getPoints(long address, int index);
        public static native void setPoints(long address, int index, long value);
        public static native float getRollingImpulse(long address);
        public static native void setRollingImpulse(long address, float value);
    }
}
