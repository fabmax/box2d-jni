package box2dandroid;


public class B2_Math extends NativeObject {

    protected B2_Math() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Math wrapPointer(long address) {
        return address != 0L ? new B2_Math(address) : null;
    }
    
    public static B2_Math arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Math(long address) {
        super(address);
    }

    // Functions

    /**
     * Compute the cosine and sine of an angle in radians. Implemented
     * for cross-platform determinism.
     */
    public static void computeCosSin(float radians, b2CosSin result) {
        Raw.computeCosSin(radians, result.getAddress());
    }

    /**
     * One-dimensional mass-spring-damper simulation. Returns the new velocity given the position and time step.
     * You can then compute the new position using:
     * position += timeStep * newVelocity
     * This drives towards a zero position. By using implicit integration we get a stable solution
     * that doesn't require transcendental functions.
     */
    public static float springDamper(float hertz, float dampingRatio, float position, float velocity, float timeStep) {
        return Raw.springDamper(hertz, dampingRatio, position, velocity, timeStep);
    }

    /**
     * Box2D bases all length units on meters, but you may need different units for your game.
     * You can set this value to use different units. This should be done at application startup
     * and only modified once. Default value is 1.
     * @warning This must be modified before any calls to Box2D
     */
    public static void setLengthUnitsPerMeter(float lengthUnits) {
        Raw.setLengthUnitsPerMeter(lengthUnits);
    }

    /**
     * Get the current length units per meter.
     */
    public static float getLengthUnitsPerMeter() {
        return Raw.getLengthUnitsPerMeter();
    }

    /**
     * Is this a valid number? Not NaN or infinity.
     */
    public static boolean isValidFloat(float a) {
        return Raw.isValidFloat(a);
    }

    /**
     * Is this a valid vector? Not NaN or infinity.
     */
    public static boolean isValidVec2(b2Vec2 v) {
        return Raw.isValidVec2(v.getAddress());
    }

    /**
     * Is this a valid rotation? Not NaN or infinity. Is normalized.
     */
    public static boolean isValidRotation(b2Rot q) {
        return Raw.isValidRotation(q.getAddress());
    }

    /**
     * Is this a valid bounding box? Not Nan or infinity. Upper bound greater than or equal to lower bound.
     */
    public static boolean isValidAABB(b2AABB aabb) {
        return Raw.isValidAABB(aabb.getAddress());
    }

    /**
     * Is this a valid plane? Normal is a unit vector. Not Nan or infinity.
     */
    public static boolean isValidPlane(b2Plane a) {
        return Raw.isValidPlane(a.getAddress());
    }

    public static class Raw {
        public static native void computeCosSin(float radians, long result);
        public static native float springDamper(float hertz, float dampingRatio, float position, float velocity, float timeStep);
        public static native void setLengthUnitsPerMeter(float lengthUnits);
        public static native float getLengthUnitsPerMeter();
        public static native boolean isValidFloat(float a);
        public static native boolean isValidVec2(long v);
        public static native boolean isValidRotation(long q);
        public static native boolean isValidAABB(long aabb);
        public static native boolean isValidPlane(long a);
    }
}
