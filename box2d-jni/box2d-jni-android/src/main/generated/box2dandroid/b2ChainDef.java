package box2dandroid;


/**
 * Used to create a chain of line segments. This is designed to eliminate ghost collisions with some limitations.
 * - chains are one-sided
 * - chains have no mass and should be used on static bodies
 * - chains have a counter-clockwise winding order (normal points right of segment direction)
 * - chains are either a loop or open
 * - a chain must have at least 4 points
 * - the distance between any two points must be greater than B2_LINEAR_SLOP
 * - a chain shape should not self intersect (this is not validated)
 * - an open chain shape has NO COLLISION on the first and final edge
 * - you may overlap two open chains on their first three and/or last three points to get smooth collision
 * - a chain shape creates multiple line segment shapes on the body
 * https://en.wikipedia.org/wiki/Polygonal_chain
 * Must be initialized using b2DefaultChainDef().
 * @warning Do not use chain shapes unless you understand the limitations. This is an advanced feature.
 * @ingroup shape
 */
public class b2ChainDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ChainDef wrapPointer(long address) {
        return address != 0L ? new b2ChainDef(address) : null;
    }
    
    public static b2ChainDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ChainDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ChainDef
     */
    public static b2ChainDef createAt(long address) {
        Raw.b2ChainDef_placed(address);
        b2ChainDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ChainDef
     */
    public static <T> b2ChainDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ChainDef_placed(address);
        b2ChainDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ChainDef() {
        address = Raw.b2ChainDef();
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
     * Use this to store application specific shape data.
     */
    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    /**
     * Use this to store application specific shape data.
     */
    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    /**
     * An array of at least 4 points. These are cloned and may be temporary.
     */
    public b2Vec2 getPoints() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoints(address));
    }

    /**
     * An array of at least 4 points. These are cloned and may be temporary.
     */
    public void setPoints(b2Vec2 value) {
        checkNotNull();
        Raw.setPoints(address, value.getAddress());
    }

    /**
     * The point count, must be 4 or more.
     */
    public int getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * The point count, must be 4 or more.
     */
    public void setCount(int value) {
        checkNotNull();
        Raw.setCount(address, value);
    }

    /**
     * Surface materials for each segment. These are cloned.
     */
    public b2SurfaceMaterial getMaterials() {
        checkNotNull();
        return b2SurfaceMaterial.wrapPointer(Raw.getMaterials(address));
    }

    /**
     * Surface materials for each segment. These are cloned.
     */
    public void setMaterials(b2SurfaceMaterial value) {
        checkNotNull();
        Raw.setMaterials(address, value.getAddress());
    }

    /**
     * The material count. Must be 1 or count. This allows you to provide one
     * material for all segments or a unique material per segment.
     */
    public int getMaterialCount() {
        checkNotNull();
        return Raw.getMaterialCount(address);
    }

    /**
     * The material count. Must be 1 or count. This allows you to provide one
     * material for all segments or a unique material per segment.
     */
    public void setMaterialCount(int value) {
        checkNotNull();
        Raw.setMaterialCount(address, value);
    }

    /**
     * Contact filtering data.
     */
    public b2Filter getFilter() {
        checkNotNull();
        return b2Filter.wrapPointer(Raw.getFilter(address));
    }

    /**
     * Contact filtering data.
     */
    public void setFilter(b2Filter value) {
        checkNotNull();
        Raw.setFilter(address, value.getAddress());
    }

    /**
     * Indicates a closed chain formed by connecting the first and last points
     */
    public boolean getIsLoop() {
        checkNotNull();
        return Raw.getIsLoop(address);
    }

    /**
     * Indicates a closed chain formed by connecting the first and last points
     */
    public void setIsLoop(boolean value) {
        checkNotNull();
        Raw.setIsLoop(address, value);
    }

    /**
     * Enable sensors to detect this chain. False by default.
     */
    public boolean getEnableSensorEvents() {
        checkNotNull();
        return Raw.getEnableSensorEvents(address);
    }

    /**
     * Enable sensors to detect this chain. False by default.
     */
    public void setEnableSensorEvents(boolean value) {
        checkNotNull();
        Raw.setEnableSensorEvents(address, value);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int getInternalValue() {
        checkNotNull();
        return Raw.getInternalValue(address);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void setInternalValue(int value) {
        checkNotNull();
        Raw.setInternalValue(address, value);
    }

    public static class Raw {
        public static native void b2ChainDef_placed(long address);
        public static native long b2ChainDef();
        public static native void destroy(long address);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
        public static native long getPoints(long address);
        public static native void setPoints(long address, long value);
        public static native int getCount(long address);
        public static native void setCount(long address, int value);
        public static native long getMaterials(long address);
        public static native void setMaterials(long address, long value);
        public static native int getMaterialCount(long address);
        public static native void setMaterialCount(long address, int value);
        public static native long getFilter(long address);
        public static native void setFilter(long address, long value);
        public static native boolean getIsLoop(long address);
        public static native void setIsLoop(long address, boolean value);
        public static native boolean getEnableSensorEvents(long address);
        public static native void setEnableSensorEvents(long address, boolean value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
    }
}
