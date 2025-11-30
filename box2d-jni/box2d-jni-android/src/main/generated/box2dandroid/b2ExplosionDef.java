package box2dandroid;


/**
 * The explosion definition is used to configure options for explosions. Explosions
 * consider shape geometry when computing the impulse.
 * @ingroup world
 */
public class b2ExplosionDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ExplosionDef wrapPointer(long address) {
        return address != 0L ? new b2ExplosionDef(address) : null;
    }
    
    public static b2ExplosionDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ExplosionDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ExplosionDef
     */
    public static b2ExplosionDef createAt(long address) {
        Raw.b2ExplosionDef_placed(address);
        b2ExplosionDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ExplosionDef
     */
    public static <T> b2ExplosionDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ExplosionDef_placed(address);
        b2ExplosionDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ExplosionDef() {
        address = Raw.b2ExplosionDef();
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
     * The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
     */
    public float getFalloff() {
        checkNotNull();
        return Raw.getFalloff(address);
    }

    /**
     * The falloff distance beyond the radius. Impulse is reduced to zero at this distance.
     */
    public void setFalloff(float value) {
        checkNotNull();
        Raw.setFalloff(address, value);
    }

    /**
     * Impulse per unit length. This applies an impulse according to the shape perimeter that
     * is facing the explosion. Explosions only apply to circles, capsules, and polygons. This
     * may be negative for implosions.
     */
    public float getImpulsePerLength() {
        checkNotNull();
        return Raw.getImpulsePerLength(address);
    }

    /**
     * Impulse per unit length. This applies an impulse according to the shape perimeter that
     * is facing the explosion. Explosions only apply to circles, capsules, and polygons. This
     * may be negative for implosions.
     */
    public void setImpulsePerLength(float value) {
        checkNotNull();
        Raw.setImpulsePerLength(address, value);
    }

    /**
     * Mask bits to filter shapes
     */
    public long getMaskBits() {
        checkNotNull();
        return Raw.getMaskBits(address);
    }

    /**
     * Mask bits to filter shapes
     */
    public void setMaskBits(long value) {
        checkNotNull();
        Raw.setMaskBits(address, value);
    }

    /**
     * The center of the explosion in world space
     */
    public b2Vec2 getPosition() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPosition(address));
    }

    /**
     * The center of the explosion in world space
     */
    public void setPosition(b2Vec2 value) {
        checkNotNull();
        Raw.setPosition(address, value.getAddress());
    }

    /**
     * The radius of the explosion
     */
    public float getRadius() {
        checkNotNull();
        return Raw.getRadius(address);
    }

    /**
     * The radius of the explosion
     */
    public void setRadius(float value) {
        checkNotNull();
        Raw.setRadius(address, value);
    }

    public static class Raw {
        public static native void b2ExplosionDef_placed(long address);
        public static native long b2ExplosionDef();
        public static native void destroy(long address);
        public static native float getFalloff(long address);
        public static native void setFalloff(long address, float value);
        public static native float getImpulsePerLength(long address);
        public static native void setImpulsePerLength(long address, float value);
        public static native long getMaskBits(long address);
        public static native void setMaskBits(long address, long value);
        public static native long getPosition(long address);
        public static native void setPosition(long address, long value);
        public static native float getRadius(long address);
        public static native void setRadius(long address, float value);
    }
}
