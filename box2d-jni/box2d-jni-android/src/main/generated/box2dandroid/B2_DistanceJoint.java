package box2dandroid;


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
     * Set the distance joint length
     */
    public static void setLength(long jointId, float length) {
        Raw.setLength(jointId, length);
    }

    /**
     * Get the distance joint length
     */
    public static float getLength(long jointId) {
        return Raw.getLength(jointId);
    }

    /**
     * Enable/disable the distance joint spring
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
     * Set the distance joint spring hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Set the distance joint spring damping ratio
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the distance joint spring hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Get the distance joint spring damping ratio
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Enable/disable the distance joint limit
     * The limit only works if the joint spring is enabled. Otherwise the joint is rigid and the limit has no effect.
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
     * Set the distance joint length range
     */
    public static void setLengthRange(long jointId, float minLength, float maxLength) {
        Raw.setLengthRange(jointId, minLength, maxLength);
    }

    /**
     * Get the distance joint minimum length
     */
    public static float getMinLength(long jointId) {
        return Raw.getMinLength(jointId);
    }

    /**
     * Get the distance joint maximum length
     */
    public static float getMaxLength(long jointId) {
        return Raw.getMaxLength(jointId);
    }

    /**
     * Get the current distance joint length
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
     * Set the distance joint motor speed
     */
    public static void setMotorSpeed(long jointId, float motorSpeed) {
        Raw.setMotorSpeed(jointId, motorSpeed);
    }

    /**
     * Get the distance joint motor speed
     */
    public static float getMotorSpeed(long jointId) {
        return Raw.getMotorSpeed(jointId);
    }

    /**
     * Set the maximum distance joint motor force
     */
    public static void setMaxMotorForce(long jointId, float force) {
        Raw.setMaxMotorForce(jointId, force);
    }

    /**
     * Get the maximum distance joint motor force
     */
    public static float getMaxMotorForce(long jointId) {
        return Raw.getMaxMotorForce(jointId);
    }

    /**
     * Get the current distance joint motor force
     */
    public static float getMotorForce(long jointId) {
        return Raw.getMotorForce(jointId);
    }

    public static class Raw {
        public static native long createDistanceJoint(long worldId, long def);
        public static native void defaultDistanceJointDef(long result);
        public static native void setLength(long jointId, float length);
        public static native float getLength(long jointId);
        public static native void enableSpring(long jointId, boolean enableSpring);
        public static native boolean isSpringEnabled(long jointId);
        public static native void setSpringHertz(long jointId, float hertz);
        public static native void setSpringDampingRatio(long jointId, float dampingRatio);
        public static native float getSpringHertz(long jointId);
        public static native float getSpringDampingRatio(long jointId);
        public static native void enableLimit(long jointId, boolean enableLimit);
        public static native boolean isLimitEnabled(long jointId);
        public static native void setLengthRange(long jointId, float minLength, float maxLength);
        public static native float getMinLength(long jointId);
        public static native float getMaxLength(long jointId);
        public static native float getCurrentLength(long jointId);
        public static native void enableMotor(long jointId, boolean enableMotor);
        public static native boolean isMotorEnabled(long jointId);
        public static native void setMotorSpeed(long jointId, float motorSpeed);
        public static native float getMotorSpeed(long jointId);
        public static native void setMaxMotorForce(long jointId, float force);
        public static native float getMaxMotorForce(long jointId);
        public static native float getMotorForce(long jointId);
    }
}
