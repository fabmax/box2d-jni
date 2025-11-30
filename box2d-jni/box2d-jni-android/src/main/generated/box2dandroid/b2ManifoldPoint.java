package box2dandroid;


/**
 * A manifold point is a contact point belonging to a contact manifold.
 * It holds details related to the geometry and dynamics of the contact points.
 * Box2D uses speculative collision so some contact points may be separated.
 * You may use the totalNormalImpulse to determine if there was an interaction during
 * the time step.
 */
public class b2ManifoldPoint extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ManifoldPoint wrapPointer(long address) {
        return address != 0L ? new b2ManifoldPoint(address) : null;
    }
    
    public static b2ManifoldPoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ManifoldPoint(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ManifoldPoint
     */
    public static b2ManifoldPoint createAt(long address) {
        Raw.b2ManifoldPoint_placed(address);
        b2ManifoldPoint createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ManifoldPoint
     */
    public static <T> b2ManifoldPoint createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ManifoldPoint_placed(address);
        b2ManifoldPoint createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ManifoldPoint() {
        address = Raw.b2ManifoldPoint();
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
     * Location of the contact point relative to shapeA's origin in world space
     * @note When used internally to the Box2D solver, this is relative to the body center of mass.
     */
    public b2Vec2 getAnchorA() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getAnchorA(address));
    }

    /**
     * Location of the contact point relative to shapeA's origin in world space
     * @note When used internally to the Box2D solver, this is relative to the body center of mass.
     */
    public void setAnchorA(b2Vec2 value) {
        checkNotNull();
        Raw.setAnchorA(address, value.getAddress());
    }

    /**
     * Location of the contact point relative to shapeB's origin in world space
     * @note When used internally to the Box2D solver, this is relative to the body center of mass.
     */
    public b2Vec2 getAnchorB() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getAnchorB(address));
    }

    /**
     * Location of the contact point relative to shapeB's origin in world space
     * @note When used internally to the Box2D solver, this is relative to the body center of mass.
     */
    public void setAnchorB(b2Vec2 value) {
        checkNotNull();
        Raw.setAnchorB(address, value.getAddress());
    }

    /**
     * Uniquely identifies a contact point between two shapes
     */
    public short getId() {
        checkNotNull();
        return Raw.getId(address);
    }

    /**
     * Uniquely identifies a contact point between two shapes
     */
    public void setId(short value) {
        checkNotNull();
        Raw.setId(address, value);
    }

    /**
     * The impulse along the manifold normal vector.
     */
    public float getNormalImpulse() {
        checkNotNull();
        return Raw.getNormalImpulse(address);
    }

    /**
     * The impulse along the manifold normal vector.
     */
    public void setNormalImpulse(float value) {
        checkNotNull();
        Raw.setNormalImpulse(address, value);
    }

    /**
     * Relative normal velocity pre-solve. Used for hit events. If the normal impulse is
     * zero then there was no hit. Negative means shapes are approaching.
     */
    public float getNormalVelocity() {
        checkNotNull();
        return Raw.getNormalVelocity(address);
    }

    /**
     * Relative normal velocity pre-solve. Used for hit events. If the normal impulse is
     * zero then there was no hit. Negative means shapes are approaching.
     */
    public void setNormalVelocity(float value) {
        checkNotNull();
        Raw.setNormalVelocity(address, value);
    }

    /**
     * Did this contact point exist the previous step?
     */
    public boolean getPersisted() {
        checkNotNull();
        return Raw.getPersisted(address);
    }

    /**
     * Did this contact point exist the previous step?
     */
    public void setPersisted(boolean value) {
        checkNotNull();
        Raw.setPersisted(address, value);
    }

    /**
     * Location of the contact point in world space. Subject to precision loss at large coordinates.
     * @note Should only be used for debugging.
     */
    public b2Vec2 getPoint() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoint(address));
    }

    /**
     * Location of the contact point in world space. Subject to precision loss at large coordinates.
     * @note Should only be used for debugging.
     */
    public void setPoint(b2Vec2 value) {
        checkNotNull();
        Raw.setPoint(address, value.getAddress());
    }

    /**
     * The separation of the contact point, negative if penetrating
     */
    public float getSeparation() {
        checkNotNull();
        return Raw.getSeparation(address);
    }

    /**
     * The separation of the contact point, negative if penetrating
     */
    public void setSeparation(float value) {
        checkNotNull();
        Raw.setSeparation(address, value);
    }

    /**
     * The friction impulse
     */
    public float getTangentImpulse() {
        checkNotNull();
        return Raw.getTangentImpulse(address);
    }

    /**
     * The friction impulse
     */
    public void setTangentImpulse(float value) {
        checkNotNull();
        Raw.setTangentImpulse(address, value);
    }

    /**
     * The total normal impulse applied across sub-stepping and restitution. This is important
     * to identify speculative contact points that had an interaction in the time step.
     */
    public float getTotalNormalImpulse() {
        checkNotNull();
        return Raw.getTotalNormalImpulse(address);
    }

    /**
     * The total normal impulse applied across sub-stepping and restitution. This is important
     * to identify speculative contact points that had an interaction in the time step.
     */
    public void setTotalNormalImpulse(float value) {
        checkNotNull();
        Raw.setTotalNormalImpulse(address, value);
    }

    public static class Raw {
        public static native void b2ManifoldPoint_placed(long address);
        public static native long b2ManifoldPoint();
        public static native void destroy(long address);
        public static native long getAnchorA(long address);
        public static native void setAnchorA(long address, long value);
        public static native long getAnchorB(long address);
        public static native void setAnchorB(long address, long value);
        public static native short getId(long address);
        public static native void setId(long address, short value);
        public static native float getNormalImpulse(long address);
        public static native void setNormalImpulse(long address, float value);
        public static native float getNormalVelocity(long address);
        public static native void setNormalVelocity(long address, float value);
        public static native boolean getPersisted(long address);
        public static native void setPersisted(long address, boolean value);
        public static native long getPoint(long address);
        public static native void setPoint(long address, long value);
        public static native float getSeparation(long address);
        public static native void setSeparation(long address, float value);
        public static native float getTangentImpulse(long address);
        public static native void setTangentImpulse(long address, float value);
        public static native float getTotalNormalImpulse(long address);
        public static native void setTotalNormalImpulse(long address, float value);
    }
}
