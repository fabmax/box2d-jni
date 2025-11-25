package box2d;


public class B2_Plane extends NativeObject {

    protected B2_Plane() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Plane wrapPointer(long address) {
        return address != 0L ? new B2_Plane(address) : null;
    }
    
    public static B2_Plane arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Plane(long address) {
        super(address);
    }

    // Functions

    /**
     * Signed separation of a point from a plane
     * separation = dot(normal, point) - offset
     */
    public static float planeSeparation(b2Plane plane, b2Vec2 point) {
        return Raw.planeSeparation(plane.getAddress(), point.getAddress());
    }

    /**
     * Is this a valid plane? Normal is a unit vector. Not Nan or infinity.
     */
    public static boolean isValid(b2Plane plane) {
        return Raw.isValid(plane.getAddress());
    }

    public static class Raw {
        public static native float planeSeparation(long plane, long point);
        public static native boolean isValid(long plane);
    }
}
