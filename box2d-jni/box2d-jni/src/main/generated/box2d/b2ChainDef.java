package box2d;


/**
 * Used to create a chain of line segments. This is designed to eliminate ghost collisions with
 * some limitations.
 * - chains are one-sided
 * - chains have no mass and should be used on static bodies
 * - chains have a counter-clockwise winding order (normal points right of segment direction)
 * - chains are either a loop or open
 * - the distance between any two points must be greater than B2_LINEAR_SLOP
 * - a chain shape should not self intersect (this is not validated)
 * - an open chain shape needs a leading and trailing ghost point.
 * - you may overlap two open chains using the ghost points to get smooth collision.
 * - a chain shape creates multiple line segment shapes on the body
 * https://en.wikipedia.org/wiki/Polygonal_chain
 * Must be initialized using b2DefaultChainDef().
 * @warning Do not use chain shapes unless you understand the limitations. This is an advanced
 * feature.
 * @ingroup chain
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
     * Array of chain points. Each consecutive pair forms a segment. For a loop the last and first
     * point form a segment. Cloned.
     */
    public b2Vec2 getPoints() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getPoints(address));
    }

    /**
     * Array of chain points. Each consecutive pair forms a segment. For a loop the last and first
     * point form a segment. Cloned.
     */
    public void setPoints(b2Vec2 value) {
        checkNotNull();
        Raw.setPoints(address, value.getAddress());
    }

    /**
     * The point count. At least 2 for an open chain and at least 3 for a loop.
     * segmentCount = isLoop ? pointCount : pointCount - 1
     */
    public int getPointCount() {
        checkNotNull();
        return Raw.getPointCount(address);
    }

    /**
     * The point count. At least 2 for an open chain and at least 3 for a loop.
     * segmentCount = isLoop ? pointCount : pointCount - 1
     */
    public void setPointCount(int value) {
        checkNotNull();
        Raw.setPointCount(address, value);
    }

    /**
     * Leading ghost point for an open chain. Distance from first point must be greater than
     * B2_LINEAR_SLOP. Ignored for loops.
     */
    public b2Vec2 getGhost1() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getGhost1(address));
    }

    /**
     * Leading ghost point for an open chain. Distance from first point must be greater than
     * B2_LINEAR_SLOP. Ignored for loops.
     */
    public void setGhost1(b2Vec2 value) {
        checkNotNull();
        Raw.setGhost1(address, value.getAddress());
    }

    /**
     * Ending ghost point for an open chain. Distance from last point must be greater than
     * B2_LINEAR_SLOP. Ignored for loops.
     */
    public b2Vec2 getGhost2() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getGhost2(address));
    }

    /**
     * Ending ghost point for an open chain. Distance from last point must be greater than
     * B2_LINEAR_SLOP. Ignored for loops.
     */
    public void setGhost2(b2Vec2 value) {
        checkNotNull();
        Raw.setGhost2(address, value.getAddress());
    }

    /**
     * One material for the whole chain or one for each segment. Cloned.
     */
    public b2SurfaceMaterial getMaterials() {
        checkNotNull();
        return b2SurfaceMaterial.wrapPointer(Raw.getMaterials(address));
    }

    /**
     * One material for the whole chain or one for each segment. Cloned.
     */
    public void setMaterials(b2SurfaceMaterial value) {
        checkNotNull();
        Raw.setMaterials(address, value.getAddress());
    }

    /**
     * The material count. Must be 1 or the segment count.
     */
    public int getMaterialCount() {
        checkNotNull();
        return Raw.getMaterialCount(address);
    }

    /**
     * The material count. Must be 1 or the segment count.
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
     * Indicates a closed chain formed by connecting the first and last point.
     */
    public boolean getIsLoop() {
        checkNotNull();
        return Raw.getIsLoop(address);
    }

    /**
     * Indicates a closed chain formed by connecting the first and last point.
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
        public static native int getPointCount(long address);
        public static native void setPointCount(long address, int value);
        public static native long getGhost1(long address);
        public static native void setGhost1(long address, long value);
        public static native long getGhost2(long address);
        public static native void setGhost2(long address, long value);
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
