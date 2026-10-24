package box2dandroid;


/**
 * Result from b2World_CastRayClosest If there is initial overlap the fraction and normal will be
 * zero while the point is an arbitrary point in the overlap region.
 * @ingroup world
 */
public class b2RayResult extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2RayResult wrapPointer(long address) {
        return address != 0L ? new b2RayResult(address) : null;
    }
    
    public static b2RayResult arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2RayResult(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2RayResult
     */
    public static b2RayResult createAt(long address) {
        Raw.b2RayResult_placed(address);
        b2RayResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2RayResult
     */
    public static <T> b2RayResult createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2RayResult_placed(address);
        b2RayResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2RayResult() {
        address = Raw.b2RayResult();
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
     * The fraction of the input ray.
     */
    public float getFraction() {
        checkNotNull();
        return Raw.getFraction(address);
    }

    /**
     * The fraction of the input ray.
     */
    public void setFraction(float value) {
        checkNotNull();
        Raw.setFraction(address, value);
    }

    /**
     * Did the ray hit? If false, all other data is invalid.
     */
    public boolean getHit() {
        checkNotNull();
        return Raw.getHit(address);
    }

    /**
     * Did the ray hit? If false, all other data is invalid.
     */
    public void setHit(boolean value) {
        checkNotNull();
        Raw.setHit(address, value);
    }

    /**
     * The number of BVH leaves visited. Diagnostic.
     */
    public int getLeafVisits() {
        checkNotNull();
        return Raw.getLeafVisits(address);
    }

    /**
     * The number of BVH leaves visited. Diagnostic.
     */
    public void setLeafVisits(int value) {
        checkNotNull();
        Raw.setLeafVisits(address, value);
    }

    /**
     * The number of BVH nodes visited. Diagnostic.
     */
    public int getNodeVisits() {
        checkNotNull();
        return Raw.getNodeVisits(address);
    }

    /**
     * The number of BVH nodes visited. Diagnostic.
     */
    public void setNodeVisits(int value) {
        checkNotNull();
        Raw.setNodeVisits(address, value);
    }

    /**
     * The unit normal vector at the point of contact.
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * The unit normal vector at the point of contact.
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * The point of contact, on the surface of the hit shape.
     */
    public b2Vec2 getPoint() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint(address));
    }

    /**
     * The point of contact, on the surface of the hit shape.
     */
    public void setPoint(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint(address, value.getAddress());
    }

    /**
     * The shape hit.
     */
    public b2ShapeId getShapeId() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeId(address));
    }

    /**
     * The shape hit.
     */
    public void setShapeId(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeId(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2RayResult_placed(long address);
        public static native long b2RayResult();
        public static native void destroy(long address);
        public static native float getFraction(long address);
        public static native void setFraction(long address, float value);
        public static native boolean getHit(long address);
        public static native void setHit(long address, boolean value);
        public static native int getLeafVisits(long address);
        public static native void setLeafVisits(long address, int value);
        public static native int getNodeVisits(long address);
        public static native void setNodeVisits(long address, int value);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native long getPoint(long address);
        public static native void setPoint(long address, long value);
        public static native long getShapeId(long address);
        public static native void setShapeId(long address, long value);
    }
}
