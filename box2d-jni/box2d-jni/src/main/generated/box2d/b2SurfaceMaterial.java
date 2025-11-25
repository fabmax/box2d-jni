package box2d;


/**
 * Surface materials allow chain shapes to have per segment surface properties.
 * @ingroup shape
 */
public class b2SurfaceMaterial extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2SurfaceMaterial wrapPointer(long address) {
        return address != 0L ? new b2SurfaceMaterial(address) : null;
    }
    
    public static b2SurfaceMaterial arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2SurfaceMaterial(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2SurfaceMaterial
     */
    public static b2SurfaceMaterial createAt(long address) {
        Raw.b2SurfaceMaterial_placed(address);
        b2SurfaceMaterial createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2SurfaceMaterial
     */
    public static <T> b2SurfaceMaterial createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2SurfaceMaterial_placed(address);
        b2SurfaceMaterial createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2SurfaceMaterial() {
        address = Raw.b2SurfaceMaterial();
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
     * Custom debug draw color.
     */
    public int getCustomColor() {
        checkNotNull();
        return Raw.getCustomColor(address);
    }

    /**
     * Custom debug draw color.
     */
    public void setCustomColor(int value) {
        checkNotNull();
        Raw.setCustomColor(address, value);
    }

    /**
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public float getFriction() {
        checkNotNull();
        return Raw.getFriction(address);
    }

    /**
     * The Coulomb (dry) friction coefficient, usually in the range [0,1].
     */
    public void setFriction(float value) {
        checkNotNull();
        Raw.setFriction(address, value);
    }

    /**
     * The coefficient of restitution (bounce) usually in the range [0,1].
     * https://en.wikipedia.org/wiki/Coefficient_of_restitution
     */
    public float getRestitution() {
        checkNotNull();
        return Raw.getRestitution(address);
    }

    /**
     * The coefficient of restitution (bounce) usually in the range [0,1].
     * https://en.wikipedia.org/wiki/Coefficient_of_restitution
     */
    public void setRestitution(float value) {
        checkNotNull();
        Raw.setRestitution(address, value);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public float getRollingResistance() {
        checkNotNull();
        return Raw.getRollingResistance(address);
    }

    /**
     * The rolling resistance usually in the range [0,1].
     */
    public void setRollingResistance(float value) {
        checkNotNull();
        Raw.setRollingResistance(address, value);
    }

    /**
     * The tangent speed for conveyor belts
     */
    public float getTangentSpeed() {
        checkNotNull();
        return Raw.getTangentSpeed(address);
    }

    /**
     * The tangent speed for conveyor belts
     */
    public void setTangentSpeed(float value) {
        checkNotNull();
        Raw.setTangentSpeed(address, value);
    }

    /**
     * User material identifier. This is passed with query results and to friction and restitution
     * combining functions. It is not used internally.
     */
    public int getUserMaterialId() {
        checkNotNull();
        return Raw.getUserMaterialId(address);
    }

    /**
     * User material identifier. This is passed with query results and to friction and restitution
     * combining functions. It is not used internally.
     */
    public void setUserMaterialId(int value) {
        checkNotNull();
        Raw.setUserMaterialId(address, value);
    }

    public static class Raw {
        public static native void b2SurfaceMaterial_placed(long address);
        public static native long b2SurfaceMaterial();
        public static native void destroy(long address);
        public static native int getCustomColor(long address);
        public static native void setCustomColor(long address, int value);
        public static native float getFriction(long address);
        public static native void setFriction(long address, float value);
        public static native float getRestitution(long address);
        public static native void setRestitution(long address, float value);
        public static native float getRollingResistance(long address);
        public static native void setRollingResistance(long address, float value);
        public static native float getTangentSpeed(long address);
        public static native void setTangentSpeed(long address, float value);
        public static native int getUserMaterialId(long address);
        public static native void setUserMaterialId(long address, int value);
    }
}
