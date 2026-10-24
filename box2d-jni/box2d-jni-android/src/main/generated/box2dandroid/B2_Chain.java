package box2dandroid;


public class B2_Chain extends NativeObject {

    protected B2_Chain() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Chain wrapPointer(long address) {
        return address != 0L ? new B2_Chain(address) : null;
    }
    
    public static B2_Chain arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Chain(long address) {
        super(address);
    }

    // Functions

    /**
     * Use this to initialize your chain definition
     */
    public static void defaultChainDef(b2ChainDef result) {
        Raw.defaultChainDef(result.getAddress());
    }

    /**
     * Create a chain shape
     * @see b2ChainDef
     */
    public static long createChain(long bodyId, b2ChainDef def) {
        return Raw.createChain(bodyId, def.getAddress());
    }

    /**
     * Destroy a chain shape
     */
    public static void destroyChain(long chainId) {
        Raw.destroyChain(chainId);
    }

    /**
     * Chain identifier validation. Provides validation for up to 64K allocations.
     */
    public static boolean isValid(long id) {
        return Raw.isValid(id);
    }

    /**
     * Get the world that owns this chain shape
     */
    public static b2WorldId getWorld(long chainId) {
        return b2WorldId.wrapPointer(Raw.getWorld(chainId));
    }

    /**
     * Get the number of segments on this chain
     */
    public static int getSegmentCount(long chainId) {
        return Raw.getSegmentCount(chainId);
    }

    /**
     * Fill a user array with chain segment shape ids up to the specified capacity. Returns
     * the actual number of segments returned.
     */
    public static int getSegments(long chainId, b2ShapeIdArray segmentArray) {
        return Raw.getSegments(chainId, segmentArray.getAddress());
    }

    /**
     * Set the chain material on all segments.
     */
    public static void setAllSurfaceMaterials(long chainId, b2SurfaceMaterial material) {
        Raw.setAllSurfaceMaterials(chainId, material.getAddress());
    }

    /**
     * Set a chain material by segment index.
     */
    public static void setSurfaceMaterial(long chainId, b2SurfaceMaterial material, int segmentIndex) {
        Raw.setSurfaceMaterial(chainId, material.getAddress(), segmentIndex);
    }

    /**
     * Get a chain material by segment index.
     */
    public static b2SurfaceMaterial getSurfaceMaterial(long chainId, int segmentIndex) {
        return b2SurfaceMaterial.wrapPointer(Raw.getSurfaceMaterial(chainId, segmentIndex));
    }

    public static class Raw {
        public static native void defaultChainDef(long result);
        public static native long createChain(long bodyId, long def);
        public static native void destroyChain(long chainId);
        public static native boolean isValid(long id);
        public static native long getWorld(long chainId);
        public static native int getSegmentCount(long chainId);
        public static native int getSegments(long chainId, long segmentArray);
        public static native void setAllSurfaceMaterials(long chainId, long material);
        public static native void setSurfaceMaterial(long chainId, long material, int segmentIndex);
        public static native long getSurfaceMaterial(long chainId, int segmentIndex);
    }
}
