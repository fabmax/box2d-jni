package box2dandroid;


public class B2_MouseJoint extends NativeObject {

    protected B2_MouseJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_MouseJoint wrapPointer(long address) {
        return address != 0L ? new B2_MouseJoint(address) : null;
    }
    
    public static B2_MouseJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_MouseJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a mouse joint
     * @see b2MouseJointDef
     */
    public static long createMouseJoint(long worldId, b2MouseJointDef def) {
        return Raw.createMouseJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultMouseJointDef(b2MouseJointDef result) {
        Raw.defaultMouseJointDef(result.getAddress());
    }

    /**
     * Set the mouse joint target
     */
    public static void setTarget(long jointId, b2Vec2 target) {
        Raw.setTarget(jointId, target.getAddress());
    }

    /**
     * Get the mouse joint target
     */
    public static b2Vec2 getTarget(long jointId) {
        return b2Vec2.wrapPointer(Raw.getTarget(jointId));
    }

    /**
     * Set the mouse joint spring hertz
     */
    public static void setSpringHertz(long jointId, float hertz) {
        Raw.setSpringHertz(jointId, hertz);
    }

    /**
     * Get the mouse joint spring hertz
     */
    public static float getSpringHertz(long jointId) {
        return Raw.getSpringHertz(jointId);
    }

    /**
     * Set the mouse joint spring damping ratio
     */
    public static void setSpringDampingRatio(long jointId, float dampingRatio) {
        Raw.setSpringDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the mouse joint spring damping ratio
     */
    public static float getSpringDampingRatio(long jointId) {
        return Raw.getSpringDampingRatio(jointId);
    }

    /**
     * Set the maximum mouse joint force
     */
    public static void setMaxForce(long jointId, float maxForce) {
        Raw.setMaxForce(jointId, maxForce);
    }

    /**
     * Get the maximum mouse joint force
     */
    public static float getMaxForce(long jointId) {
        return Raw.getMaxForce(jointId);
    }

    public static class Raw {
        public static native long createMouseJoint(long worldId, long def);
        public static native void defaultMouseJointDef(long result);
        public static native void setTarget(long jointId, long target);
        public static native long getTarget(long jointId);
        public static native void setSpringHertz(long jointId, float hertz);
        public static native float getSpringHertz(long jointId);
        public static native void setSpringDampingRatio(long jointId, float dampingRatio);
        public static native float getSpringDampingRatio(long jointId);
        public static native void setMaxForce(long jointId, float maxForce);
        public static native float getMaxForce(long jointId);
    }
}
