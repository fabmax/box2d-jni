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
     * Set the motor joint linear offset
     */
    public static void setLinearOffset(long jointId, b2Vec2 linearOffset) {
        Raw.setLinearOffset(jointId, linearOffset.getAddress());
    }

    /**
     * Get the motor joint linear offset
     */
    public static b2Vec2 getLinearOffset(long jointId) {
        return b2Vec2.wrapPointer(Raw.getLinearOffset(jointId));
    }

    /**
     * Set the motor joint angular offset
     */
    public static void setAngularOffset(long jointId, float angularOffset) {
        Raw.setAngularOffset(jointId, angularOffset);
    }

    /**
     * Get the motor joint angular offset
     */
    public static float getAngularOffset(long jointId) {
        return Raw.getAngularOffset(jointId);
    }

    /**
     * Set the maximum motor joint force
     */
    public static void setMaxForce(long jointId, float maxForce) {
        Raw.setMaxForce(jointId, maxForce);
    }

    /**
     * Get the maximum motor joint force
     */
    public static float getMaxForce(long jointId) {
        return Raw.getMaxForce(jointId);
    }

    /**
     * Set the maximum motor joint torque
     */
    public static void setMaxTorque(long jointId, float maxTorque) {
        Raw.setMaxTorque(jointId, maxTorque);
    }

    /**
     * Get the maximum motor joint torque
     */
    public static float getMaxTorque(long jointId) {
        return Raw.getMaxTorque(jointId);
    }

    /**
     * Set the motor joint correction factor
     */
    public static void setCorrectionFactor(long jointId, float correctionFactor) {
        Raw.setCorrectionFactor(jointId, correctionFactor);
    }

    /**
     * Get the motor joint correction factor
     */
    public static float getCorrectionFactor(long jointId) {
        return Raw.getCorrectionFactor(jointId);
    }

    public static class Raw {
        public static native long createMotorJoint(long worldId, long def);
        public static native void defaultMotorJointDef(long result);
        public static native void setLinearOffset(long jointId, long linearOffset);
        public static native long getLinearOffset(long jointId);
        public static native void setAngularOffset(long jointId, float angularOffset);
        public static native float getAngularOffset(long jointId);
        public static native void setMaxForce(long jointId, float maxForce);
        public static native float getMaxForce(long jointId);
        public static native void setMaxTorque(long jointId, float maxTorque);
        public static native float getMaxTorque(long jointId);
        public static native void setCorrectionFactor(long jointId, float correctionFactor);
        public static native float getCorrectionFactor(long jointId);
    }
}
