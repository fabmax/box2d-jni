package box2d;


public class B2_MoverJoint extends NativeObject {

    protected B2_MoverJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_MoverJoint wrapPointer(long address) {
        return address != 0L ? new B2_MoverJoint(address) : null;
    }
    
    public static B2_MoverJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_MoverJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a mover joint
     * @see b2MoverJointDef
     */
    public static long createMoverJoint(long worldId, b2MoverJointDef def) {
        return Raw.createMoverJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultMoverJointDef(b2MoverJointDef result) {
        Raw.defaultMoverJointDef(result.getAddress());
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
     * Set the joint maximum force, usually in newtons
     */
    public static void setMaxVelocityForce(long jointId, b2Vec2 maxForce) {
        Raw.setMaxVelocityForce(jointId, maxForce.getAddress());
    }

    /**
     * Get the joint maximum force, usually in newtons
     */
    public static b2Vec2 getMaxVelocityForce(long jointId) {
        return b2Vec2.wrapPointer(Raw.getMaxVelocityForce(jointId));
    }

    public static class Raw {
        public static native long createMoverJoint(long worldId, long def);
        public static native void defaultMoverJointDef(long result);
        public static native void setLinearVelocity(long jointId, long velocity);
        public static native long getLinearVelocity(long jointId);
        public static native void setMaxVelocityForce(long jointId, long maxForce);
        public static native long getMaxVelocityForce(long jointId);
    }
}
