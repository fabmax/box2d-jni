package box2d;


public class B2_DistanceJoint extends NativeObject {

    protected B2_DistanceJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_DistanceJoint wrapPointer(long address) {
        return address != 0L ? new B2_DistanceJoint(address) : null;
    }
    
    public static B2_DistanceJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_DistanceJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a distance joint
     * @see b2DistanceJointDef
     */
    public static long createDistanceJoint(long worldId, b2DistanceJointDef def) {
        return Raw.createDistanceJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultDistanceJointDef(b2DistanceJointDef result) {
        Raw.defaultDistanceJointDef(result.getAddress());
    }

    /**
     * Set the rest length of a distance joint
     * @param jointId The id for a distance joint
     * @param length The new distance joint length
     */
    public static void setRestLength(long jointId, float length) {
        Raw.setRestLength(jointId, length);
    }

    /**
     * Get the rest length of a distance joint
     */
    public static float getRestLength(long jointId) {
        return Raw.getRestLength(jointId);
    }

    /**
     * Enable/disable the distance joint spring. When disabled the distance joint is rigid.
     */
    public static void enableSpring(long jointId, boolean enableSpring) {
        Raw.enableSpring(jointId, enableSpring);
    }

    /**
     * Is the distance joint spring enabled?
     */
    public static boolean isSpringEnabled(long jointId) {
        return Raw.isSpringEnabled(jointId);
    }

    /**
     * Set the force range for the spring.
     */
    public static void setSpringForceRange(long jointId, float lowerForce, float upperForce) {
        Raw.setSpringForceRange(jointId, lowerForce, upperForce);
    }

    /**
     * Get the lower force of the spring force range.
     */
    public static float getSpringForceRangeLower(long jointId) {
        return Raw.getSpringForceRangeLower(jointId);
    }

    /**
     * Get the upper force of the spring force range.
     */
    public static float getSpringForceRangeUpper(long jointId) {
        return Raw.getSpringForceRangeUpper(jointId);
    }

    /**
     * Set the spring stiffness in Hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Set the spring damping ratio, non-dimensional
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the spring Hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Get the spring damping ratio
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Get the current spring force.
     */
    public static float getSpringForce(long jointId) {
        return Raw.getSpringForce(jointId);
    }

    /**
     * Enable joint limit. The limit only works if the joint spring is enabled. Otherwise the joint is
     * rigid and the limit has no effect.
     */
    public static void enableLimit(long jointId, boolean enableLimit) {
        Raw.enableLimit(jointId, enableLimit);
    }

    /**
     * Is the distance joint limit enabled?
     */
    public static boolean isLimitEnabled(long jointId) {
        return Raw.isLimitEnabled(jointId);
    }

    /**
     * Set the minimum and maximum length parameters of a distance joint
     */
    public static void setLimits(long jointId, float minLength, float maxLength) {
        Raw.setLimits(jointId, minLength, maxLength);
    }

    /**
     * Get the distance joint minimum length
     */
    public static float getLowerLimit(long jointId) {
        return Raw.getLowerLimit(jointId);
    }

    /**
     * Get the distance joint maximum length
     */
    public static float getUpperLimit(long jointId) {
        return Raw.getUpperLimit(jointId);
    }

    /**
     * Get the current length of a distance joint
     */
    public static float getCurrentLength(long jointId) {
        return Raw.getCurrentLength(jointId);
    }

    /**
     * Enable/disable the distance joint motor
     */
    public static void enableMotor(long jointId, boolean enableMotor) {
        Raw.enableMotor(jointId, enableMotor);
    }

    /**
     * Is the distance joint motor enabled?
     */
    public static boolean isMotorEnabled(long jointId) {
        return Raw.isMotorEnabled(jointId);
    }

    /**
     * Set the distance joint motor speed, usually in meters per second
     */
    public static void setTargetMotorSpeed(long jointId, float motorSpeed) {
        Raw.setTargetMotorSpeed(jointId, motorSpeed);
    }

    /**
     * Get the distance joint motor speed, usually in meters per second
     */
    public static float getTargetMotorSpeed(long jointId) {
        return Raw.getTargetMotorSpeed(jointId);
    }

    /**
     * Set the distance joint maximum motor force, usually in newtons
     */
    public static void setMaxMotorForce(long jointId, float force) {
        Raw.setMaxMotorForce(jointId, force);
    }

    /**
     * Get the distance joint maximum motor force, usually in newtons
     */
    public static float getMaxMotorForce(long jointId) {
        return Raw.getMaxMotorForce(jointId);
    }

    /**
     * Get the distance joint current motor force, usually in newtons
     */
    public static float getCurrentMotorForce(long jointId) {
        return Raw.getCurrentMotorForce(jointId);
    }

    public static class Raw {
        public static native long createDistanceJoint(long worldId, long def);
        public static native void defaultDistanceJointDef(long result);
        public static native void setRestLength(long jointId, float length);
        public static native float getRestLength(long jointId);
        public static native void enableSpring(long jointId, boolean enableSpring);
        public static native boolean isSpringEnabled(long jointId);
        public static native void setSpringForceRange(long jointId, float lowerForce, float upperForce);
        public static native float getSpringForceRangeLower(long jointId);
        public static native float getSpringForceRangeUpper(long jointId);
        public static native void setSpringHertz(long jointId, float hertz);
        public static native void setSpringDampingRatio(long jointId, float dampingRatio);
        public static native float getSpringHertz(long jointId);
        public static native float getSpringDampingRatio(long jointId);
        public static native float getSpringForce(long jointId);
        public static native void enableLimit(long jointId, boolean enableLimit);
        public static native boolean isLimitEnabled(long jointId);
        public static native void setLimits(long jointId, float minLength, float maxLength);
        public static native float getLowerLimit(long jointId);
        public static native float getUpperLimit(long jointId);
        public static native float getCurrentLength(long jointId);
        public static native void enableMotor(long jointId, boolean enableMotor);
        public static native boolean isMotorEnabled(long jointId);
        public static native void setTargetMotorSpeed(long jointId, float motorSpeed);
        public static native float getTargetMotorSpeed(long jointId);
        public static native void setMaxMotorForce(long jointId, float force);
        public static native float getMaxMotorForce(long jointId);
        public static native float getCurrentMotorForce(long jointId);
    }
}
