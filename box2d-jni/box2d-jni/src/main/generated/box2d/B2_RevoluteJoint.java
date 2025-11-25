package box2d;


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
     * Use this to initialize your joint definition
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
     * Is the revolute joint spring enabled?
     */
    public static boolean isSpringEnabled(long jointId) {
        return Raw.isSpringEnabled(jointId);
    }

    /**
     * Set the revolute joint spring hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Get the revolute joint spring hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Set the revolute joint spring damping ratio
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the revolute joint spring damping ratio
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Set the revolute joint target angle
     */
    public static void setTargetAngle(long jointId, float angle) {
        Raw.setTargetAngle(jointId, angle);
    }

    /**
     * Get the revolute joint target angle
     */
    public static float getTargetAngle(long jointId) {
        return Raw.getTargetAngle(jointId);
    }

    /**
     * Get the revolute joint angle
     */
    public static float getAngle(long jointId) {
        return Raw.getAngle(jointId);
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
     * Get the revolute joint lower limit
     */
    public static float getLowerLimit(long jointId) {
        return Raw.getLowerLimit(jointId);
    }

    /**
     * Get the revolute joint upper limit
     */
    public static float getUpperLimit(long jointId) {
        return Raw.getUpperLimit(jointId);
    }

    /**
     * Set the revolute joint limits
     */
    public static void setLimits(long jointId, float lower, float upper) {
        Raw.setLimits(jointId, lower, upper);
    }

    /**
     * Enable/disable the revolute joint motor
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
     * Set the revolute joint motor speed
     */
    public static void setMotorSpeed(long jointId, float motorSpeed) {
        Raw.setMotorSpeed(jointId, motorSpeed);
    }

    /**
     * Get the revolute joint motor speed
     */
    public static float getMotorSpeed(long jointId) {
        return Raw.getMotorSpeed(jointId);
    }

    /**
     * Get the revolute joint motor torque
     */
    public static float getMotorTorque(long jointId) {
        return Raw.getMotorTorque(jointId);
    }

    /**
     * Set the maximum revolute joint motor torque
     */
    public static void setMaxMotorTorque(long jointId, float torque) {
        Raw.setMaxMotorTorque(jointId, torque);
    }

    /**
     * Get the maximum revolute joint motor torque
     */
    public static float getMaxMotorTorque(long jointId) {
        return Raw.getMaxMotorTorque(jointId);
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
        public static native float getAngle(long jointId);
        public static native void enableLimit(long jointId, boolean enableLimit);
        public static native boolean isLimitEnabled(long jointId);
        public static native float getLowerLimit(long jointId);
        public static native float getUpperLimit(long jointId);
        public static native void setLimits(long jointId, float lower, float upper);
        public static native void enableMotor(long jointId, boolean enableMotor);
        public static native boolean isMotorEnabled(long jointId);
        public static native void setMotorSpeed(long jointId, float motorSpeed);
        public static native float getMotorSpeed(long jointId);
        public static native float getMotorTorque(long jointId);
        public static native void setMaxMotorTorque(long jointId, float torque);
        public static native float getMaxMotorTorque(long jointId);
    }
}
