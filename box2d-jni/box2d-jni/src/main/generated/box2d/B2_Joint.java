package box2d;


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
     * Destroy a joint
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
     * Get the local anchor on bodyA
     */
    public static b2Vec2 getLocalAnchorA(long jointId) {
        return b2Vec2.wrapPointer(Raw.getLocalAnchorA(jointId));
    }

    /**
     * Get the local anchor on bodyB
     */
    public static b2Vec2 getLocalAnchorB(long jointId) {
        return b2Vec2.wrapPointer(Raw.getLocalAnchorB(jointId));
    }

    /**
     * Set the local anchor on bodyA
     */
    public static void setLocalAnchorA(long jointId, b2Vec2 localAnchor) {
        Raw.setLocalAnchorA(jointId, localAnchor.getAddress());
    }

    /**
     * Set the local anchor on bodyB
     */
    public static void setLocalAnchorB(long jointId, b2Vec2 localAnchor) {
        Raw.setLocalAnchorB(jointId, localAnchor.getAddress());
    }

    /**
     * Get the reference angle for this joint (in radians)
     */
    public static float getReferenceAngle(long jointId) {
        return Raw.getReferenceAngle(jointId);
    }

    /**
     * Set the reference angle for this joint (in radians)
     */
    public static void setReferenceAngle(long jointId, float angleInRadians) {
        Raw.setReferenceAngle(jointId, angleInRadians);
    }

    /**
     * Set the local axis on bodyA
     */
    public static void setLocalAxisA(long jointId, b2Vec2 localAxis) {
        Raw.setLocalAxisA(jointId, localAxis.getAddress());
    }

    /**
     * Get the local axis on bodyA
     */
    public static b2Vec2 getLocalAxisA(long jointId) {
        return b2Vec2.wrapPointer(Raw.getLocalAxisA(jointId));
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
     * Wake the bodies connect to this joint
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
     * Get the linear separation between anchor points for this joint
     */
    public static float getLinearSeparation(long jointId) {
        return Raw.getLinearSeparation(jointId);
    }

    /**
     * Get the angular separation for this joint
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

    public static class Raw {
        public static native void destroyJoint(long jointId);
        public static native boolean isValid(long jointId);
        public static native int getType(long jointId);
        public static native long getBodyA(long jointId);
        public static native long getBodyB(long jointId);
        public static native int getWorld(long jointId);
        public static native long getLocalAnchorA(long jointId);
        public static native long getLocalAnchorB(long jointId);
        public static native void setLocalAnchorA(long jointId, long localAnchor);
        public static native void setLocalAnchorB(long jointId, long localAnchor);
        public static native float getReferenceAngle(long jointId);
        public static native void setReferenceAngle(long jointId, float angleInRadians);
        public static native void setLocalAxisA(long jointId, long localAxis);
        public static native long getLocalAxisA(long jointId);
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
    }
}
