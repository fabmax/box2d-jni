package box2dandroid;


public class B2_Mat22 extends NativeObject {

    protected B2_Mat22() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Mat22 wrapPointer(long address) {
        return address != 0L ? new B2_Mat22(address) : null;
    }
    
    public static B2_Mat22 arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Mat22(long address) {
        super(address);
    }

    // Functions

    /**
     * Multiply a 2-by-2 matrix times a 2D vector
     */
    public static void mulMV(b2Mat22 A, b2Vec2 v, b2Vec2 result) {
        Raw.mulMV(A.getAddress(), v.getAddress(), result.getAddress());
    }

    /**
     * Get the inverse of a 2-by-2 matrix
     */
    public static void getInverse22(b2Mat22 A, b2Mat22 result) {
        Raw.getInverse22(A.getAddress(), result.getAddress());
    }

    /**
     * Solve A * x = b, where b is a column vector. This is more efficient
     * than computing the inverse in one-shot cases.
     */
    public static void solve22(b2Mat22 A, b2Vec2 b, b2Vec2 result) {
        Raw.solve22(A.getAddress(), b.getAddress(), result.getAddress());
    }

    public static class Raw {
        public static native void mulMV(long A, long v, long result);
        public static native void getInverse22(long A, long result);
        public static native void solve22(long A, long b, long result);
    }
}
