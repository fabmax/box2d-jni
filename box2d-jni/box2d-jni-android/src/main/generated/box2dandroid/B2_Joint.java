package box2dandroid;


/**
 * Joints allow you to connect rigid bodies together while allowing various forms of relative motions.
 */
public class B2_Joint extends NativeObject {

    protected B2_Joint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Joint wrapPointer(long address) {
        return address != 0L ? new B2_Joint(address) : null;
    }
    
    public static B2_Joint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Joint(long address) {
        super(address);
    }

    // Functions

    /**
     * Destroy a joint.
     */
    public static void destroyJoint(long jointId) {
        Raw.destroyJoint(jointId);
    }

    /**
     * Joint identifier validation. Provides validation for up to 64K allocations.
     */
    public static boolean isValid(long jointId) {
        return Raw.isValid(jointId);
    }

    /**
     * Get the joint type
     */
    public static b2JointType getType(long jointId) {
        return b2JointType.forValue(Raw.getType(jointId));
    }

    /**
     * Get body A id on a joint
     */
    public static long getBodyA(long jointId) {
        return Raw.getBodyA(jointId);
    }

    /**
     * Get body B id on a joint
     */
    public static long getBodyB(long jointId) {
        return Raw.getBodyB(jointId);
    }

    /**
     * Get the world that owns this joint
     */
    public static int getWorld(long jointId) {
        return Raw.getWorld(jointId);
    }

    /**
     * Set the local frame on bodyA
     */
    public static void setLocalFrameA(long jointId, b2Transform localFrame) {
        Raw.setLocalFrameA(jointId, localFrame.getAddress());
    }

    /**
     * Get the local frame on bodyA
     */
    public static b2Transform getLocalFrameA(long jointId) {
        return b2Transform.wrapPointer(Raw.getLocalFrameA(jointId));
    }

    /**
     * Set the local frame on bodyB
     */
    public static void setLocalFrameB(long jointId, b2Transform localFrame) {
        Raw.setLocalFrameB(jointId, localFrame.getAddress());
    }

    /**
     * Get the local frame on bodyB
     */
    public static b2Transform getLocalFrameB(long jointId) {
        return b2Transform.wrapPointer(Raw.getLocalFrameB(jointId));
    }

    /**
     * Toggle collision between connected bodies
     */
    public static void setCollideConnected(long jointId, boolean shouldCollide) {
        Raw.setCollideConnected(jointId, shouldCollide);
    }

    /**
     * Is collision allowed between connected bodies?
     */
    public static boolean getCollideConnected(long jointId) {
        return Raw.getCollideConnected(jointId);
    }

    /**
     * Set the user data on a joint
     */
    public static void setUserData(long jointId, NativeObject userData) {
        Raw.setUserData(jointId, userData.getAddress());
    }

    /**
     * Get the user data on a joint
     */
    public static NativeObject getUserData(long jointId) {
        return NativeObject.wrapPointer(Raw.getUserData(jointId));
    }

    /**
     * Wake the bodies connected to this joint
     */
    public static void wakeBodies(long jointId) {
        Raw.wakeBodies(jointId);
    }

    /**
     * Get the current constraint force for this joint. Usually in Newtons.
     */
    public static b2Vec2 getConstraintForce(long jointId) {
        return b2Vec2.wrapPointer(Raw.getConstraintForce(jointId));
    }

    /**
     * Get the current constraint torque for this joint. Usually in Newton * meters.
     */
    public static float getConstraintTorque(long jointId) {
        return Raw.getConstraintTorque(jointId);
    }

    /**
     * Get the current linear separation error for this joint. Does not consider admissible movement.
     * Usually in meters.
     */
    public static float getLinearSeparation(long jointId) {
        return Raw.getLinearSeparation(jointId);
    }

    /**
     * Get the current angular separation error for this joint. Does not consider admissible movement.
     * Radians.
     */
    public static float getAngularSeparation(long jointId) {
        return Raw.getAngularSeparation(jointId);
    }

    /**
     * Get the constraint tuning hertz parameter for this joint
     */
    public static float getConstraintTuningHertz(long jointId) {
        return Raw.getConstraintTuningHertz(jointId);
    }

    /**
     * Get the constraint tuning damping ratio parameter for this joint
     */
    public static float getConstraintTuningDampingRatio(long jointId) {
        return Raw.getConstraintTuningDampingRatio(jointId);
    }

    /**
     * Set the joint constraint tuning. Advanced feature.
     * @param jointId the joint
     * @param hertz the stiffness in Hertz (cycles per second)
     * @param dampingRatio the non-dimensional damping ratio (one for critical damping)
     */
    public static void setConstraintTuning(long jointId, float hertz, float dampingRatio) {
        Raw.setConstraintTuning(jointId, hertz, dampingRatio);
    }

    /**
     * Set the force threshold for joint events (Newtons)
     */
    public static void setForceThreshold(long jointId, float threshold) {
        Raw.setForceThreshold(jointId, threshold);
    }

    /**
     * Get the force threshold for joint events (Newtons)
     */
    public static float getForceThreshold(long jointId) {
        return Raw.getForceThreshold(jointId);
    }

    /**
     * Set the torque threshold for joint events (N-m)
     */
    public static void setTorqueThreshold(long jointId, float threshold) {
        Raw.setTorqueThreshold(jointId, threshold);
    }

    /**
     * Get the torque threshold for joint events (N-m)
     */
    public static float getTorqueThreshold(long jointId) {
        return Raw.getTorqueThreshold(jointId);
    }

    public static class Raw {
        public static native void destroyJoint(long jointId);
        public static native boolean isValid(long jointId);
        public static native int getType(long jointId);
        public static native long getBodyA(long jointId);
        public static native long getBodyB(long jointId);
        public static native int getWorld(long jointId);
        public static native void setLocalFrameA(long jointId, long localFrame);
        public static native long getLocalFrameA(long jointId);
        public static native void setLocalFrameB(long jointId, long localFrame);
        public static native long getLocalFrameB(long jointId);
        public static native void setCollideConnected(long jointId, boolean shouldCollide);
        public static native boolean getCollideConnected(long jointId);
        public static native void setUserData(long jointId, long userData);
        public static native long getUserData(long jointId);
        public static native void wakeBodies(long jointId);
        public static native long getConstraintForce(long jointId);
        public static native float getConstraintTorque(long jointId);
        public static native float getLinearSeparation(long jointId);
        public static native float getAngularSeparation(long jointId);
        public static native float getConstraintTuningHertz(long jointId);
        public static native float getConstraintTuningDampingRatio(long jointId);
        public static native void setConstraintTuning(long jointId, float hertz, float dampingRatio);
        public static native void setForceThreshold(long jointId, float threshold);
        public static native float getForceThreshold(long jointId);
        public static native void setTorqueThreshold(long jointId, float threshold);
        public static native float getTorqueThreshold(long jointId);
    }
}
