package box2d;


public class B2_Rot extends NativeObject {

    protected B2_Rot() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Rot wrapPointer(long address) {
        return address != 0L ? new B2_Rot(address) : null;
    }
    
    public static B2_Rot arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Rot(long address) {
        super(address);
    }

    // Functions

    /**
     * Get the angle in radians in the range [-pi, pi]
     */
    public static float getAngle(b2Rot q) {
        return Raw.getAngle(q.getAddress());
    }

    /**
     * Get the x-axis
     */
    public static void getXAxis(b2Rot q, b2Vec2 result) {
        Raw.getXAxis(q.getAddress(), result.getAddress());
    }

    /**
     * Get the y-axis
     */
    public static void getYAxis(b2Rot q, b2Vec2 result) {
        Raw.getYAxis(q.getAddress(), result.getAddress());
    }

    /**
     * Make a rotation using an angle in radians
     */
    public static void makeRot(float radians, b2Rot result) {
        Raw.makeRot(radians, result.getAddress());
    }

    /**
     * Normalize rotation
     */
    public static void normalize(b2Rot q, b2Rot result) {
        Raw.normalize(q.getAddress(), result.getAddress());
    }

    /**
     * Is this rotation normalized?
     */
    public static boolean isNormalized(b2Rot q) {
        return Raw.isNormalized(q.getAddress());
    }

    /**
     * Integrate rotation from angular velocity
     * @param q1 initial rotation
     * @param deltaAngle the angular displacement in radians
     */
    public static void integrateRotation(b2Rot q1, float deltaAngle, b2Rot result) {
        Raw.integrateRotation(q1.getAddress(), deltaAngle, result.getAddress());
    }

    /**
     * Normalized linear interpolation
     * https://fgiesen.wordpress.com/2012/08/15/linear-interpolation-past-present-and-future/
     * https://web.archive.org/web/20170825184056/http://number-none.com/product/Understanding%20Slerp,%20Then%20Not%20Using%20It/
     */
    public static void nLerp(b2Rot q1, b2Rot q2, float t, b2Rot result) {
        Raw.nLerp(q1.getAddress(), q2.getAddress(), t, result.getAddress());
    }

    /**
     * Multiply two rotations: q * r
     */
    public static void mulRot(b2Rot q, b2Rot r, b2Rot result) {
        Raw.mulRot(q.getAddress(), r.getAddress(), result.getAddress());
    }

    /**
     * Transpose multiply two rotations: qT * r
     */
    public static void invMulRot(b2Rot q, b2Rot r, b2Rot result) {
        Raw.invMulRot(q.getAddress(), r.getAddress(), result.getAddress());
    }

    /**
     * relative angle between b and a (rot_b * inv(rot_a))
     */
    public static float relativeAngle(b2Rot b, b2Rot a) {
        return Raw.relativeAngle(b.getAddress(), a.getAddress());
    }

    /**
     * Convert any angle into the range [-pi, pi]
     */
    public static float unwindAngle(float radians) {
        return Raw.unwindAngle(radians);
    }

    /**
     * Rotate a vector
     */
    public static void rotateVector(b2Rot q, b2Vec2 v, b2Vec2 result) {
        Raw.rotateVector(q.getAddress(), v.getAddress(), result.getAddress());
    }

    /**
     * Inverse rotate a vector
     */
    public static void invRotateVector(b2Rot q, b2Vec2 v, b2Vec2 result) {
        Raw.invRotateVector(q.getAddress(), v.getAddress(), result.getAddress());
    }

    /**
     * Compute the angular velocity necessary to rotate between two rotations over a give time
     * @param q1 initial rotation
     * @param q2 final rotation
     * @param inv_h inverse time step
     */
    public static float computeAngularVelocity(b2Rot q1, b2Rot q2, float inv_h) {
        return Raw.computeAngularVelocity(q1.getAddress(), q2.getAddress(), inv_h);
    }

    /**
     * Compute the rotation between two unit vectors
     */
    public static void computeRotationBetweenUnitVectors(b2Vec2 v1, b2Vec2 v2, b2Rot result) {
        Raw.computeRotationBetweenUnitVectors(v1.getAddress(), v2.getAddress(), result.getAddress());
    }

    /**
     * Is this a valid rotation? Not NaN or infinity. Is normalized.
     */
    public static boolean isValid(b2Rot q) {
        return Raw.isValid(q.getAddress());
    }

    public static class Raw {
        public static native float getAngle(long q);
        public static native void getXAxis(long q, long result);
        public static native void getYAxis(long q, long result);
        public static native void makeRot(float radians, long result);
        public static native void normalize(long q, long result);
        public static native boolean isNormalized(long q);
        public static native void integrateRotation(long q1, float deltaAngle, long result);
        public static native void nLerp(long q1, long q2, float t, long result);
        public static native void mulRot(long q, long r, long result);
        public static native void invMulRot(long q, long r, long result);
        public static native float relativeAngle(long b, long a);
        public static native float unwindAngle(float radians);
        public static native void rotateVector(long q, long v, long result);
        public static native void invRotateVector(long q, long v, long result);
        public static native float computeAngularVelocity(long q1, long q2, float inv_h);
        public static native void computeRotationBetweenUnitVectors(long v1, long v2, long result);
        public static native boolean isValid(long q);
    }
}
