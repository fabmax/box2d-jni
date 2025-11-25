package box2d;


/**
 * A hit touch event is generated when two shapes collide with a speed faster than the hit speed threshold.
 * This may be reported for speculative contacts that have a confirmed impulse.
 */
public class b2ContactHitEvent extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ContactHitEvent wrapPointer(long address) {
        return address != 0L ? new b2ContactHitEvent(address) : null;
    }
    
    public static b2ContactHitEvent arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ContactHitEvent(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ContactHitEvent
     */
    public static b2ContactHitEvent createAt(long address) {
        Raw.b2ContactHitEvent_placed(address);
        b2ContactHitEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ContactHitEvent
     */
    public static <T> b2ContactHitEvent createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ContactHitEvent_placed(address);
        b2ContactHitEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ContactHitEvent() {
        address = Raw.b2ContactHitEvent();
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
     * The speed the shapes are approaching. Always positive. Typically in meters per second.
     */
    public float getApproachSpeed() {
        checkNotNull();
        return Raw.getApproachSpeed(address);
    }

    /**
     * The speed the shapes are approaching. Always positive. Typically in meters per second.
     */
    public void setApproachSpeed(float value) {
        checkNotNull();
        Raw.setApproachSpeed(address, value);
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * Normal vector pointing from shape A to shape B
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * Point where the shapes hit at the beginning of the time step.
     * This is a mid-point between the two surfaces. It could be at speculative
     * point where the two shapes were not touching at the beginning of the time step.
     */
    public b2Vec2 getPoint() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint(address));
    }

    /**
     * Point where the shapes hit at the beginning of the time step.
     * This is a mid-point between the two surfaces. It could be at speculative
     * point where the two shapes were not touching at the beginning of the time step.
     */
    public void setPoint(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint(address, value.getAddress());
    }

    /**
     * Id of the first shape
     */
    public b2ShapeId getShapeIdA() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdA(address));
    }

    /**
     * Id of the first shape
     */
    public void setShapeIdA(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdA(address, value.getAddress());
    }

    /**
     * Id of the second shape
     */
    public b2ShapeId getShapeIdB() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdB(address));
    }

    /**
     * Id of the second shape
     */
    public void setShapeIdB(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdB(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ContactHitEvent_placed(long address);
        public static native long b2ContactHitEvent();
        public static native void destroy(long address);
        public static native float getApproachSpeed(long address);
        public static native void setApproachSpeed(long address, float value);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native long getPoint(long address);
        public static native void setPoint(long address, long value);
        public static native long getShapeIdA(long address);
        public static native void setShapeIdA(long address, long value);
        public static native long getShapeIdB(long address);
        public static native void setShapeIdB(long address, long value);
    }
}
