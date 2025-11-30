package box2dandroid;


public class B2_Transform extends NativeObject {

    protected B2_Transform() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Transform wrapPointer(long address) {
        return address != 0L ? new B2_Transform(address) : null;
    }
    
    public static B2_Transform arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Transform(long address) {
        super(address);
    }

    // Functions

    /**
     * Transform a point (e.g. local space to world space)
     */
    public static void transformPoint(b2Transform t, b2Vec2 p, b2Vec2 result) {
        Raw.transformPoint(t.getAddress(), p.getAddress(), result.getAddress());
    }

    /**
     * Inverse transform a point (e.g. world space to local space)
     */
    public static void invTransformPoint(b2Transform t, b2Vec2 p, b2Vec2 result) {
        Raw.invTransformPoint(t.getAddress(), p.getAddress(), result.getAddress());
    }

    /**
     * Multiply two transforms. If the result is applied to a point p local to frame B,
     * the transform would first convert p to a point local to frame A, then into a point
     * in the world frame.
     * v2 = A.q.Rot(B.q.Rot(v1) + B.p) + A.p
     * = (A.q * B.q).Rot(v1) + A.q.Rot(B.p) + A.p
     */
    public static void mulTransforms(b2Transform A, b2Transform B, b2Transform result) {
        Raw.mulTransforms(A.getAddress(), B.getAddress(), result.getAddress());
    }

    /**
     * Creates a transform that converts a local point in frame B to a local point in frame A.
     * v2 = A.q' * (B.q * v1 + B.p - A.p)
     * = A.q' * B.q * v1 + A.q' * (B.p - A.p)
     */
    public static void invMulTransforms(b2Transform A, b2Transform B, b2Transform result) {
        Raw.invMulTransforms(A.getAddress(), B.getAddress(), result.getAddress());
    }

    public static class Raw {
        public static native void transformPoint(long t, long p, long result);
        public static native void invTransformPoint(long t, long p, long result);
        public static native void mulTransforms(long A, long B, long result);
        public static native void invMulTransforms(long A, long B, long result);
    }
}
