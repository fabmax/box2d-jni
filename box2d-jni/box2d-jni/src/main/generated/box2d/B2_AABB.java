package box2d;


public class B2_AABB extends NativeObject {

    protected B2_AABB() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_AABB wrapPointer(long address) {
        return address != 0L ? new B2_AABB(address) : null;
    }
    
    public static B2_AABB arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_AABB(long address) {
        super(address);
    }

    // Functions

    /**
     * Does a fully contain b
     */
    public static boolean contains(b2AABB a, b2AABB b) {
        return Raw.contains(a.getAddress(), b.getAddress());
    }

    /**
     * Get the center of the AABB.
     */
    public static void center(b2AABB a, b2Vec2 result) {
        Raw.center(a.getAddress(), result.getAddress());
    }

    /**
     * Get the extents of the AABB (half-widths).
     */
    public static void extents(b2AABB a, b2Vec2 result) {
        Raw.extents(a.getAddress(), result.getAddress());
    }

    /**
     * Union of two AABBs
     */
    public static void unionAABB(b2AABB a, b2AABB b, b2AABB result) {
        Raw.unionAABB(a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Do a and b overlap
     */
    public static boolean overlaps(b2AABB a, b2AABB b) {
        return Raw.overlaps(a.getAddress(), b.getAddress());
    }

    /**
     * Is this a valid bounding box? Not Nan or infinity. Upper bound greater than or equal to lower bound.
     */
    public static boolean isValid(b2AABB aabb) {
        return Raw.isValid(aabb.getAddress());
    }

    public static class Raw {
        public static native boolean contains(long a, long b);
        public static native void center(long a, long result);
        public static native void extents(long a, long result);
        public static native void unionAABB(long a, long b, long result);
        public static native boolean overlaps(long a, long b);
        public static native boolean isValid(long aabb);
    }
}
