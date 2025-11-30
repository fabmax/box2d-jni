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

    public static class Raw {
        public static native void computeCosSin(float radians, long result);
        public static native float springDamper(float hertz, float dampingRatio, float position, float velocity, float timeStep);
        public static native void setLengthUnitsPerMeter(float lengthUnits);
        public static native float getLengthUnitsPerMeter();
    }
}
