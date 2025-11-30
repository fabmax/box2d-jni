package box2dandroid;


public class B2_PrismaticJoint extends NativeObject {

    protected B2_PrismaticJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_PrismaticJoint wrapPointer(long address) {
        return address != 0L ? new B2_PrismaticJoint(address) : null;
    }
    
    public static B2_PrismaticJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_PrismaticJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a prismatic joint
     * @see b2PrismaticJointDef
     */
    public static long createPrismaticJoint(long worldId, b2PrismaticJointDef def) {
        return Raw.createPrismaticJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultPrismaticJointDef(b2PrismaticJointDef result) {
        Raw.defaultPrismaticJointDef(result.getAddress());
    }

    /**
     * Enable/disable the prismatic joint spring
     */
    public static void enableSpring(long jointId, boolean enableSpring) {
        Raw.enableSpring(jointId, enableSpring);
    }

    /**
     * Is the prismatic joint spring enabled?
     */
    public static boolean isSpringEnabled(long jointId) {
        return Raw.isSpringEnabled(jointId);
    }

    /**
     * Set the prismatic joint spring hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Get the prismatic joint spring hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Set the prismatic joint spring damping ratio
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the prismatic joint spring damping ratio
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Set the prismatic joint target translation
     */
    public static void setTargetTranslation(long jointId, float translation) {
        Raw.setTargetTranslation(jointId, translation);
    }

    /**
     * Get the prismatic joint target translation
     */
    public static float getTargetTranslation(long jointId) {
        return Raw.getTargetTranslation(jointId);
    }

    /**
     * Enable/disable the prismatic joint limit
     */
    public static void enableLimit(long jointId, boolean enableLimit) {
        Raw.enableLimit(jointId, enableLimit);
    }

    /**
     * Is the prismatic joint limit enabled?
     */
    public static boolean isLimitEnabled(long jointId) {
        return Raw.isLimitEnabled(jointId);
    }

    /**
     * Get the prismatic joint lower limit
     */
    public static float getLowerLimit(long jointId) {
        return Raw.getLowerLimit(jointId);
    }

    /**
     * Get the prismatic joint upper limit
     */
    public static float getUpperLimit(long jointId) {
        return Raw.getUpperLimit(jointId);
    }

    /**
     * Set the prismatic joint limits
     */
    public static void setLimits(long jointId, float lower, float upper) {
        Raw.setLimits(jointId, lower, upper);
    }

    /**
     * Enable/disable the prismatic joint motor
     */
    public static void enableMotor(long jointId, boolean enableMotor) {
        Raw.enableMotor(jointId, enableMotor);
    }

    /**
     * Is the prismatic joint motor enabled?
     */
    public static boolean isMotorEnabled(long jointId) {
        return Raw.isMotorEnabled(jointId);
    }

    /**
     * Set the prismatic joint motor speed
     */
    public static void setMotorSpeed(long jointId, float motorSpeed) {
        Raw.setMotorSpeed(jointId, motorSpeed);
    }

    /**
     * Get the prismatic joint motor speed
     */
    public static float getMotorSpeed(long jointId) {
        return Raw.getMotorSpeed(jointId);
    }

    /**
     * Set the maximum prismatic joint motor force
     */
    public static void setMaxMotorForce(long jointId, float force) {
        Raw.setMaxMotorForce(jointId, force);
    }

    /**
     * Get the maximum prismatic joint motor force
     */
    public static float getMaxMotorForce(long jointId) {
        return Raw.getMaxMotorForce(jointId);
    }

    /**
     * Get the current prismatic joint motor force
     */
    public static float getMotorForce(long jointId) {
        return Raw.getMotorForce(jointId);
    }

    /**
     * Get the prismatic joint translation
     */
    public static float getTranslation(long jointId) {
        return Raw.getTranslation(jointId);
    }

    /**
     * Get the prismatic joint speed
     */
    public static float getSpeed(long jointId) {
        return Raw.getSpeed(jointId);
    }

    public static class Raw {
        public static native long createPrismaticJoint(long worldId, long def);
        public static native void defaultPrismaticJointDef(long result);
        public static native void enableSpring(long jointId, boolean enableSpring);
        public static native boolean isSpringEnabled(long jointId);
        public static native void setSpringHertz(long jointId, float hertz);
        public static native float getSpringHertz(long jointId);
        public static native void setSpringDampingRatio(long jointId, float dampingRatio);
        public static native float getSpringDampingRatio(long jointId);
        public static native void setTargetTranslation(long jointId, float translation);
        public static native float getTargetTranslation(long jointId);
        public static native void enableLimit(long jointId, boolean enableLimit);
        public static native boolean isLimitEnabled(long jointId);
        public static native float getLowerLimit(long jointId);
        public static native float getUpperLimit(long jointId);
        public static native void setLimits(long jointId, float lower, float upper);
        public static native void enableMotor(long jointId, boolean enableMotor);
        public static native boolean isMotorEnabled(long jointId);
        public static native void setMotorSpeed(long jointId, float motorSpeed);
        public static native float getMotorSpeed(long jointId);
        public static native void setMaxMotorForce(long jointId, float force);
        public static native float getMaxMotorForce(long jointId);
        public static native float getMotorForce(long jointId);
        public static native float getTranslation(long jointId);
        public static native float getSpeed(long jointId);
    }
}
