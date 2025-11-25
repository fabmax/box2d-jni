package box2d;


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
     * Set the chain friction
     */
    public static void setFriction(long chainId, float friction) {
        Raw.setFriction(chainId, friction);
    }

    /**
     * Get the chain friction
     */
    public static float getFriction(long chainId) {
        return Raw.getFriction(chainId);
    }

    /**
     * Set the chain restitution (bounciness)
     */
    public static void setRestitution(long chainId, float restitution) {
        Raw.setRestitution(chainId, restitution);
    }

    /**
     * Get the chain restitution
     */
    public static float getRestitution(long chainId) {
        return Raw.getRestitution(chainId);
    }

    /**
     * Set the chain material
     */
    public static void setMaterial(long chainId, int material) {
        Raw.setMaterial(chainId, material);
    }

    /**
     * Get the chain material
     */
    public static int getMaterial(long chainId) {
        return Raw.getMaterial(chainId);
    }

    public static class Raw {
        public static native void defaultChainDef(long result);
        public static native long createChain(long bodyId, long def);
        public static native void destroyChain(long chainId);
        public static native boolean isValid(long id);
        public static native long getWorld(long chainId);
        public static native int getSegmentCount(long chainId);
        public static native int getSegments(long chainId, long segmentArray);
        public static native void setFriction(long chainId, float friction);
        public static native float getFriction(long chainId);
        public static native void setRestitution(long chainId, float restitution);
        public static native float getRestitution(long chainId);
        public static native void setMaterial(long chainId, int material);
        public static native int getMaterial(long chainId);
    }
}
