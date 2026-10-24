package box2dandroid;


public class B2_RevoluteJoint extends NativeObject {

    protected B2_RevoluteJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_RevoluteJoint wrapPointer(long address) {
        return address != 0L ? new B2_RevoluteJoint(address) : null;
    }
    
    public static B2_RevoluteJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_RevoluteJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a revolute joint
     * @see b2RevoluteJointDef
     */
    public static long createRevoluteJoint(long worldId, b2RevoluteJointDef def) {
        return Raw.createRevoluteJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition.
     */
    public static void defaultRevoluteJointDef(b2RevoluteJointDef result) {
        Raw.defaultRevoluteJointDef(result.getAddress());
    }

    /**
     * Enable/disable the revolute joint spring
     */
    public static void enableSpring(long jointId, boolean enableSpring) {
        Raw.enableSpring(jointId, enableSpring);
    }

    /**
     * Is the revolute angular spring enabled?
     */
    public static boolean isSpringEnabled(long jointId) {
        return Raw.isSpringEnabled(jointId);
    }

    /**
     * Set the revolute joint spring stiffness in Hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Get the revolute joint spring stiffness in Hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Set the revolute joint spring damping ratio, non-dimensional
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the revolute joint spring damping ratio, non-dimensional
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Set the revolute joint spring target angle, radians
     */
    public static void setTargetAngle(long jointId, float angle) {
        Raw.setTargetAngle(jointId, angle);
    }

    /**
     * Get the revolute joint spring target angle, radians
     */
    public static float getTargetAngle(long jointId) {
        return Raw.getTargetAngle(jointId);
    }

    /**
     * Enable/disable the revolute joint limit
     */
    public static void enableLimit(long jointId, boolean enableLimit) {
        Raw.enableLimit(jointId, enableLimit);
    }

    /**
     * Is the revolute joint limit enabled?
     */
    public static boolean isLimitEnabled(long jointId) {
        return Raw.isLimitEnabled(jointId);
    }

    /**
     * Get the revolute joint lower limit in radians
     */
    public static float getLowerLimit(long jointId) {
        return Raw.getLowerLimit(jointId);
    }

    /**
     * Get the revolute joint upper limit in radians
     */
    public static float getUpperLimit(long jointId) {
        return Raw.getUpperLimit(jointId);
    }

    /**
     * Set the revolute joint limits in radians. It is expected that lower &lt;= upper and that -0.99 *
     * B2_PI &lt;= lower &amp;&amp; upper &lt;= 0.99 * B2_PI.
     */
    public static void setLimits(long jointId, float lower, float upper) {
        Raw.setLimits(jointId, lower, upper);
    }

    /**
     * Enable/disable a revolute joint motor
     */
    public static void enableMotor(long jointId, boolean enableMotor) {
        Raw.enableMotor(jointId, enableMotor);
    }

    /**
     * Is the revolute joint motor enabled?
     */
    public static boolean isMotorEnabled(long jointId) {
        return Raw.isMotorEnabled(jointId);
    }

    /**
     * Set the revolute joint motor speed in radians per second
     */
    public static void setTargetMotorSpeed(long jointId, float motorSpeed) {
        Raw.setTargetMotorSpeed(jointId, motorSpeed);
    }

    /**
     * Get the revolute joint motor speed in radians per second
     */
    public static float getTargetMotorSpeed(long jointId) {
        return Raw.getTargetMotorSpeed(jointId);
    }

    /**
     * Set the revolute joint maximum motor torque, usually in newton-meters
     */
    public static void setMaxMotorTorque(long jointId, float torque) {
        Raw.setMaxMotorTorque(jointId, torque);
    }

    /**
     * Get the revolute joint maximum motor torque, usually in newton-meters
     */
    public static float getMaxMotorTorque(long jointId) {
        return Raw.getMaxMotorTorque(jointId);
    }

    /**
     * Get the revolute joint current angle in radians. This is the relative rotation of the joint
     * frames.
     */
    public static float getCurrentAngle(long jointId) {
        return Raw.getCurrentAngle(jointId);
    }

    /**
     * Get the current revolute joint motor speed in radians per second
     */
    public static float getCurrentSpeed(long jointId) {
        return Raw.getCurrentSpeed(jointId);
    }

    /**
     * Get the revolute joint current motor torque, usually in newton-meters
     */
    public static float getCurrentMotorTorque(long jointId) {
        return Raw.getCurrentMotorTorque(jointId);
    }

    public static class Raw {
        public static native long createRevoluteJoint(long worldId, long def);
        public static native void defaultRevoluteJointDef(long result);
        public static native void enableSpring(long jointId, boolean enableSpring);
        public static native boolean isSpringEnabled(long jointId);
        public static native void setSpringHertz(long jointId, float hertz);
        public static native float getSpringHertz(long jointId);
        public static native void setSpringDampingRatio(long jointId, float dampingRatio);
        public static native float getSpringDampingRatio(long jointId);
        public static native void setTargetAngle(long jointId, float angle);
        public static native float getTargetAngle(long jointId);
        public static native void enableLimit(long jointId, boolean enableLimit);
        public static native boolean isLimitEnabled(long jointId);
        public static native float getLowerLimit(long jointId);
        public static native float getUpperLimit(long jointId);
        public static native void setLimits(long jointId, float lower, float upper);
        public static native void enableMotor(long jointId, boolean enableMotor);
        public static native boolean isMotorEnabled(long jointId);
        public static native void setTargetMotorSpeed(long jointId, float motorSpeed);
        public static native float getTargetMotorSpeed(long jointId);
        public static native void setMaxMotorTorque(long jointId, float torque);
        public static native float getMaxMotorTorque(long jointId);
        public static native float getCurrentAngle(long jointId);
        public static native float getCurrentSpeed(long jointId);
        public static native float getCurrentMotorTorque(long jointId);
    }
}
