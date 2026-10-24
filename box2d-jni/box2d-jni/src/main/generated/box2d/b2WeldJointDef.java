package box2d;


/**
 * Weld joint definition Connects two bodies together rigidly. This constraint provides springs to
 * mimic soft-body simulation.
 * @note The approximate solver in Box2D cannot hold many bodies together rigidly
 * @ingroup weld_joint
 */
public class b2WeldJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2WeldJointDef wrapPointer(long address) {
        return address != 0L ? new b2WeldJointDef(address) : null;
    }
    
    public static b2WeldJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2WeldJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2WeldJointDef
     */
    public static b2WeldJointDef createAt(long address) {
        Raw.b2WeldJointDef_placed(address);
        b2WeldJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2WeldJointDef
     */
    public static <T> b2WeldJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2WeldJointDef_placed(address);
        b2WeldJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2WeldJointDef() {
        address = Raw.b2WeldJointDef();
    }

    // Destructor

    public void destroy() {
        if (address == 0L) {
            throw new IllegalStateException(this + " is already deleted");
        }
        if (isExternallyAllocated) {
            throw new IllegalStateException(this + " is externally allocated and cannot be manually destroyed");
        }
        Raw.destroy(address);
        address = 0L;
    }

    // Attributes

    /**
     * Base joint definition
     */
    public b2JointDef getBase() {
        checkNotNull();
        return b2JointDef.wrapPointer(Raw.getBase(address));
    }

    /**
     * Base joint definition
     */
    public void setBase(b2JointDef value) {
        checkNotNull();
        Raw.setBase(address, value.getAddress());
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float getLinearHertz() {
        checkNotNull();
        return Raw.getLinearHertz(address);
    }

    /**
     * Linear stiffness expressed as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void setLinearHertz(float value) {
        checkNotNull();
        Raw.setLinearHertz(address, value);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public float getAngularHertz() {
        checkNotNull();
        return Raw.getAngularHertz(address);
    }

    /**
     * Angular stiffness as Hertz (cycles per second). Use zero for maximum stiffness.
     */
    public void setAngularHertz(float value) {
        checkNotNull();
        Raw.setAngularHertz(address, value);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float getLinearDampingRatio() {
        checkNotNull();
        return Raw.getLinearDampingRatio(address);
    }

    /**
     * Linear damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void setLinearDampingRatio(float value) {
        checkNotNull();
        Raw.setLinearDampingRatio(address, value);
    }

    /**
     * Angular damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public float getAngularDampingRatio() {
        checkNotNull();
        return Raw.getAngularDampingRatio(address);
    }

    /**
     * Angular damping ratio, non-dimensional. Use 1 for critical damping.
     */
    public void setAngularDampingRatio(float value) {
        checkNotNull();
        Raw.setAngularDampingRatio(address, value);
    }

    public static class Raw {
        public static native void b2WeldJointDef_placed(long address);
        public static native long b2WeldJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native float getLinearHertz(long address);
        public static native void setLinearHertz(long address, float value);
        public static native float getAngularHertz(long address);
        public static native void setAngularHertz(long address, float value);
        public static native float getLinearDampingRatio(long address);
        public static native void setLinearDampingRatio(long address, float value);
        public static native float getAngularDampingRatio(long address);
        public static native void setAngularDampingRatio(long address, float value);
    }
}
