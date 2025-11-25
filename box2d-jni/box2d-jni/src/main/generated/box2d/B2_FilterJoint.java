package box2d;


public class B2_FilterJoint extends NativeObject {

    protected B2_FilterJoint() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_FilterJoint wrapPointer(long address) {
        return address != 0L ? new B2_FilterJoint(address) : null;
    }
    
    public static B2_FilterJoint arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_FilterJoint(long address) {
        super(address);
    }

    // Functions

    /**
     * Create a filter joint
     * @see b2FilterJointDef
     */
    public static long createFilterJoint(long worldId, b2FilterJointDef def) {
        return Raw.createFilterJoint(worldId, def.getAddress());
    }

    /**
     * Use this to initialize your joint definition
     */
    public static void defaultFilterJointDef(b2FilterJointDef result) {
        Raw.defaultFilterJointDef(result.getAddress());
    }

    public static class Raw {
        public static native long createFilterJoint(long worldId, long def);
        public static native void defaultFilterJointDef(long result);
    }
}
