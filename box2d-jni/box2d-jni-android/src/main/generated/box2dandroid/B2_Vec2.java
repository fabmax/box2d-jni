package box2dandroid;


public class B2_Vec2 extends NativeObject {

    protected B2_Vec2() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Vec2 wrapPointer(long address) {
        return address != 0L ? new B2_Vec2(address) : null;
    }
    
    public static B2_Vec2 arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Vec2(long address) {
        super(address);
    }

    // Functions

    /**
     * Vector dot product
     */
    public static float dot(b2Vec2 a, b2Vec2 b) {
        return Raw.dot(a.getAddress(), b.getAddress());
    }

    /**
     * Vector cross product. In 2D this yields a scalar.
     */
    public static float cross(b2Vec2 a, b2Vec2 b) {
        return Raw.cross(a.getAddress(), b.getAddress());
    }

    /**
     * Perform the cross product on a vector and a scalar. In 2D this produces a vector.
     */
    public static void crossVS(b2Vec2 v, float s, b2Vec2 result) {
        Raw.crossVS(v.getAddress(), s, result.getAddress());
    }

    /**
     * Perform the cross product on a scalar and a vector. In 2D this produces a vector.
     */
    public static void crossSV(float s, b2Vec2 v, b2Vec2 result) {
        Raw.crossSV(s, v.getAddress(), result.getAddress());
    }

    /**
     * Get a left pointing perpendicular vector. Equivalent to b2CrossSV(1.0f, v)
     */
    public static void leftPerp(b2Vec2 v, b2Vec2 result) {
        Raw.leftPerp(v.getAddress(), result.getAddress());
    }

    /**
     * Get a right pointing perpendicular vector. Equivalent to b2CrossVS(v, 1.0f)
     */
    public static void rightPerp(b2Vec2 v, b2Vec2 result) {
        Raw.rightPerp(v.getAddress(), result.getAddress());
    }

    /**
     * Vector addition
     */
    public static void add(b2Vec2 a, b2Vec2 b, b2Vec2 result) {
        Raw.add(a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Vector subtraction
     */
    public static void sub(b2Vec2 a, b2Vec2 b, b2Vec2 result) {
        Raw.sub(a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Vector negation
     */
    public static void neg(b2Vec2 a, b2Vec2 result) {
        Raw.neg(a.getAddress(), result.getAddress());
    }

    /**
     * Vector linear interpolation
     * https://fgiesen.wordpress.com/2012/08/15/linear-interpolation-past-present-and-future/
     */
    public static void lerp(b2Vec2 a, b2Vec2 b, float t, b2Vec2 result) {
        Raw.lerp(a.getAddress(), b.getAddress(), t, result.getAddress());
    }

    /**
     * Component-wise multiplication
     */
    public static void mul(b2Vec2 a, b2Vec2 b, b2Vec2 result) {
        Raw.mul(a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Multiply a scalar and vector
     */
    public static void mulSV(float s, b2Vec2 v, b2Vec2 result) {
        Raw.mulSV(s, v.getAddress(), result.getAddress());
    }

    /**
     * a + s * b
     */
    public static void mulAdd(b2Vec2 a, float s, b2Vec2 b, b2Vec2 result) {
        Raw.mulAdd(a.getAddress(), s, b.getAddress(), result.getAddress());
    }

    /**
     * a - s * b
     */
    public static void mulSub(b2Vec2 a, float s, b2Vec2 b, b2Vec2 result) {
        Raw.mulSub(a.getAddress(), s, b.getAddress(), result.getAddress());
    }

    /**
     * Component-wise absolute vector
     */
    public static void abs(b2Vec2 a, b2Vec2 result) {
        Raw.abs(a.getAddress(), result.getAddress());
    }

    /**
     * Component-wise minimum vector
     */
    public static void min(b2Vec2 a, b2Vec2 b, b2Vec2 result) {
        Raw.min(a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Component-wise maximum vector
     */
    public static void max(b2Vec2 a, b2Vec2 b, b2Vec2 result) {
        Raw.max(a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Component-wise clamp vector v into the range [a, b]
     */
    public static void clamp(b2Vec2 v, b2Vec2 a, b2Vec2 b, b2Vec2 result) {
        Raw.clamp(v.getAddress(), a.getAddress(), b.getAddress(), result.getAddress());
    }

    /**
     * Get the length of this vector (the norm)
     */
    public static float length(b2Vec2 v) {
        return Raw.length(v.getAddress());
    }

    /**
     * Get the distance between two points
     */
    public static float distance(b2Vec2 a, b2Vec2 b) {
        return Raw.distance(a.getAddress(), b.getAddress());
    }

    /**
     * Convert a vector into a unit vector if possible, otherwise returns the zero vector.
     */
    public static void normalize(b2Vec2 v, b2Vec2 result) {
        Raw.normalize(v.getAddress(), result.getAddress());
    }

    /**
     * Determines if the provided vector is normalized (norm(a) == 1).
     */
    public static boolean isNormalized(b2Vec2 a) {
        return Raw.isNormalized(a.getAddress());
    }

    /**
     * Convert a vector into a unit vector if possible, otherwise returns the zero vector. Also
     * outputs the length.
     */
    public static float getLengthAndNormalize(b2Vec2 v, b2Vec2 result) {
        return Raw.getLengthAndNormalize(v.getAddress(), result.getAddress());
    }

    /**
     * Get the length squared of this vector
     */
    public static float lengthSquared(b2Vec2 v) {
        return Raw.lengthSquared(v.getAddress());
    }

    /**
     * Is this a valid vector? Not NaN or infinity.
     */
    public static boolean isValid(b2Vec2 v) {
        return Raw.isValid(v.getAddress());
    }

    public static class Raw {
        public static native float dot(long a, long b);
        public static native float cross(long a, long b);
        public static native void crossVS(long v, float s, long result);
        public static native void crossSV(float s, long v, long result);
        public static native void leftPerp(long v, long result);
        public static native void rightPerp(long v, long result);
        public static native void add(long a, long b, long result);
        public static native void sub(long a, long b, long result);
        public static native void neg(long a, long result);
        public static native void lerp(long a, long b, float t, long result);
        public static native void mul(long a, long b, long result);
        public static native void mulSV(float s, long v, long result);
        public static native void mulAdd(long a, float s, long b, long result);
        public static native void mulSub(long a, float s, long b, long result);
        public static native void abs(long a, long result);
        public static native void min(long a, long b, long result);
        public static native void max(long a, long b, long result);
        public static native void clamp(long v, long a, long b, long result);
        public static native float length(long v);
        public static native float distance(long a, long b);
        public static native void normalize(long v, long result);
        public static native boolean isNormalized(long a);
        public static native float getLengthAndNormalize(long v, long result);
        public static native float lengthSquared(long v);
        public static native boolean isValid(long v);
    }
}
