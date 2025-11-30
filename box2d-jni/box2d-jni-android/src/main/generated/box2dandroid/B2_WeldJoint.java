package box2dandroid;


public class B2_WeldJoint extends NativeObject {

    protected B2_WeldJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_WeldJoint wrapPointer(long address) {
        return address != 0L ? new B2_WeldJoint(address) : null;
    }
    
    public static B2_WeldJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_WeldJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a weld joint
     * @see b2WeldJointDef
     */
    public static long createWeldJoint(long worldId, b2WeldJointDef def) {
        return Raw.createWeldJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultWeldJointDef(b2WeldJointDef result) {
        Raw.defaultWeldJointDef(result.getAddress());
    }

    /**
     * Set the weld joint linear hertz
     */
    public static void setLinearHertz(long jointId, float hertz) {
        Raw.setLinearHertz(jointId, hertz);
    }

    /**
     * Get the weld joint linear hertz
     */
    public static float getLinearHertz(long jointId) {
        return Raw.getLinearHertz(jointId);
    }

    /**
     * Set the weld joint linear damping ratio
     */
    public static void setLinearDampingRatio(long jointId, float dampingRatio) {
        Raw.setLinearDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the weld joint linear damping ratio
     */
    public static float getLinearDampingRatio(long jointId) {
        return Raw.getLinearDampingRatio(jointId);
    }

    /**
     * Set the weld joint angular hertz
     */
    public static void setAngularHertz(long jointId, float hertz) {
        Raw.setAngularHertz(jointId, hertz);
    }

    /**
     * Get the weld joint angular hertz
     */
    public static float getAngularHertz(long jointId) {
        return Raw.getAngularHertz(jointId);
    }

    /**
     * Set the weld joint angular damping ratio
     */
    public static void setAngularDampingRatio(long jointId, float dampingRatio) {
        Raw.setAngularDampingRatio(jointId, dampingRatio);
    }

    /**
     * Get the weld joint angular damping ratio
     */
    public static float getAngularDampingRatio(long jointId) {
        return Raw.getAngularDampingRatio(jointId);
    }

    public static class Raw {
        public static native long createWeldJoint(long worldId, long def);
        public static native void defaultWeldJointDef(long result);
        public static native void setLinearHertz(long jointId, float hertz);
        public static native float getLinearHertz(long jointId);
        public static native void setLinearDampingRatio(long jointId, float dampingRatio);
        public static native float getLinearDampingRatio(long jointId);
        public static native void setAngularHertz(long jointId, float hertz);
        public static native float getAngularHertz(long jointId);
        public static native void setAngularDampingRatio(long jointId, float dampingRatio);
        public static native float getAngularDampingRatio(long jointId);
    }
}
