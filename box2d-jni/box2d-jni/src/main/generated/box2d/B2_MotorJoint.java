package box2d;


public class B2_MotorJoint extends NativeObject {

    protected B2_MotorJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_MotorJoint wrapPointer(long address) {
        return address != 0L ? new B2_MotorJoint(address) : null;
    }
    
    public static B2_MotorJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_MotorJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a motor joint
     * @see b2MotorJointDef
     */
    public static long createMotorJoint(long worldId, b2MotorJointDef def) {
        return Raw.createMotorJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultMotorJointDef(b2MotorJointDef result) {
        Raw.defaultMotorJointDef(result.getAddress());
    }

    /**
     * Set the desired relative linear velocity in meters per second
     */
    public static void setLinearVelocity(long jointId, b2Vec2 velocity) {
        Raw.setLinearVelocity(jointId, velocity.getAddress());
    }

    /**
     * Get the desired relative linear velocity in meters per second
     */
    public static b2Vec2 getLinearVelocity(long jointId) {
        return b2Vec2.wrapPointer(Raw.getLinearVelocity(jointId));
    }

    /**
     * Set the desired relative angular velocity in radians per second
     */
    public static void setAngularVelocity(long jointId, float velocity) {
        Raw.setAngularVelocity(jointId, velocity);
    }

    /**
     * Get the desired relative angular velocity in radians per second
     */
    public static float getAngularVelocity(long jointId) {
        return Raw.getAngularVelocity(jointId);
    }

    /**
     * Set the motor joint maximum force, usually in newtons
     */
    public static void setMaxVelocityForce(long jointId, float maxForce) {
        Raw.setMaxVelocityForce(jointId, maxForce);
    }

    /**
     * Get the motor joint maximum force, usually in newtons
     */
    public static float getMaxVelocityForce(long jointId) {
        return Raw.getMaxVelocityForce(jointId);
    }

    /**
     * Set the motor joint maximum torque, usually in newton-meters
     */
    public static void setMaxVelocityTorque(long jointId, float maxTorque) {
        Raw.setMaxVelocityTorque(jointId, maxTorque);
    }

    /**
     * Get the motor joint maximum torque, usually in newton-meters
     */
    public static float getMaxVelocityTorque(long jointId) {
        return Raw.getMaxVelocityTorque(jointId);
    }

    /**
     * Set the spring linear hertz stiffness
     */
    public static void setLinearHertz(long jointId, float hertz) {
        Raw.setLinearHertz(jointId, hertz);
    }

    /**
     * Get the spring linear hertz stiffness
     */
    public static float getLinearHertz(long jointId) {
        return Raw.getLinearHertz(jointId);
    }

    /**
     * Set the spring linear damping ratio. Use 1.0 for critical damping.
     */
    public static void setLinearDampingRatio(long jointId, float damping) {
        Raw.setLinearDampingRatio(jointId, damping);
    }

    /**
     * Get the spring linear damping ratio.
     */
    public static float getLinearDampingRatio(long jointId) {
        return Raw.getLinearDampingRatio(jointId);
    }

    /**
     * Set the spring angular hertz stiffness
     */
    public static void setAngularHertz(long jointId, float hertz) {
        Raw.setAngularHertz(jointId, hertz);
    }

    /**
     * Get the spring angular hertz stiffness
     */
    public static float getAngularHertz(long jointId) {
        return Raw.getAngularHertz(jointId);
    }

    /**
     * Set the spring angular damping ratio. Use 1.0 for critical damping.
     */
    public static void setAngularDampingRatio(long jointId, float damping) {
        Raw.setAngularDampingRatio(jointId, damping);
    }

    /**
     * Get the spring angular damping ratio.
     */
    public static float getAngularDampingRatio(long jointId) {
        return Raw.getAngularDampingRatio(jointId);
    }

    /**
     * Set the maximum spring force in newtons.
     */
    public static void setMaxSpringForce(long jointId, float maxForce) {
        Raw.setMaxSpringForce(jointId, maxForce);
    }

    /**
     * Get the maximum spring force in newtons.
     */
    public static float getMaxSpringForce(long jointId) {
        return Raw.getMaxSpringForce(jointId);
    }

    /**
     * Set the maximum spring torque in newtons * meters
     */
    public static void setMaxSpringTorque(long jointId, float maxTorque) {
        Raw.setMaxSpringTorque(jointId, maxTorque);
    }

    /**
     * Get the maximum spring torque in newtons * meters
     */
    public static float getMaxSpringTorque(long jointId) {
        return Raw.getMaxSpringTorque(jointId);
    }

    public static class Raw {
        public static native long createMotorJoint(long worldId, long def);
        public static native void defaultMotorJointDef(long result);
        public static native void setLinearVelocity(long jointId, long velocity);
        public static native long getLinearVelocity(long jointId);
        public static native void setAngularVelocity(long jointId, float velocity);
        public static native float getAngularVelocity(long jointId);
        public static native void setMaxVelocityForce(long jointId, float maxForce);
        public static native float getMaxVelocityForce(long jointId);
        public static native void setMaxVelocityTorque(long jointId, float maxTorque);
        public static native float getMaxVelocityTorque(long jointId);
        public static native void setLinearHertz(long jointId, float hertz);
        public static native float getLinearHertz(long jointId);
        public static native void setLinearDampingRatio(long jointId, float damping);
        public static native float getLinearDampingRatio(long jointId);
        public static native void setAngularHertz(long jointId, float hertz);
        public static native float getAngularHertz(long jointId);
        public static native void setAngularDampingRatio(long jointId, float damping);
        public static native float getAngularDampingRatio(long jointId);
        public static native void setMaxSpringForce(long jointId, float maxForce);
        public static native float getMaxSpringForce(long jointId);
        public static native void setMaxSpringTorque(long jointId, float maxTorque);
        public static native float getMaxSpringTorque(long jointId);
    }
}
