package box2d;


public class B2_PogoJoint extends NativeObject {

    protected B2_PogoJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_PogoJoint wrapPointer(long address) {
        return address != 0L ? new B2_PogoJoint(address) : null;
    }
    
    public static B2_PogoJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_PogoJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a pogo joint
     * @see b2PogoJointDef
     */
    public static long createPogoJoint(long worldId, b2PogoJointDef def) {
        return Raw.createPogoJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultPogoJointDef(b2PogoJointDef result) {
        Raw.defaultPogoJointDef(result.getAddress());
    }

    /**
     * Set the rest length of a pogo joint
     * @param jointId The id for a pogo joint
     * @param length The new pogo joint length
     */
    public static void setRestLength(long jointId, float length) {
        Raw.setRestLength(jointId, length);
    }

    /**
     * Get the rest length of a pogo joint
     */
    public static float getRestLength(long jointId) {
        return Raw.getRestLength(jointId);
    }

    /**
     * Set the spring stiffness in Hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Get the spring Hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Set the spring damping ratio, non-dimensional
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the spring damping ratio
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Get the current length of the pogo.
     */
    public static float getCurrentLength(long jointId) {
        return Raw.getCurrentLength(jointId);
    }

    /**
     * Get the internal pogo velocity.
     */
    public static float getCurrentSpeed(long jointId) {
        return Raw.getCurrentSpeed(jointId);
    }

    /**
     * Get the internal pogo impulse.
     */
    public static float getImpulse(long jointId) {
        return Raw.getImpulse(jointId);
    }

    public static class Raw {
        public static native long createPogoJoint(long worldId, long def);
        public static native void defaultPogoJointDef(long result);
        public static native void setRestLength(long jointId, float length);
        public static native float getRestLength(long jointId);
        public static native void setSpringHertz(long jointId, float hertz);
        public static native float getSpringHertz(long jointId);
        public static native void setSpringDampingRatio(long jointId, float dampingRatio);
        public static native float getSpringDampingRatio(long jointId);
        public static native float getCurrentLength(long jointId);
        public static native float getCurrentSpeed(long jointId);
        public static native float getImpulse(long jointId);
    }
}
