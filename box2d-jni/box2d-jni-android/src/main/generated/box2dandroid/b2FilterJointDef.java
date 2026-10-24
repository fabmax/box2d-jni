package box2dandroid;


/**
 * A filter joint is used to disable collision between two specific bodies.
 * @ingroup filter_joint
 */
public class b2FilterJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2FilterJointDef wrapPointer(long address) {
        return address != 0L ? new b2FilterJointDef(address) : null;
    }
    
    public static b2FilterJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2FilterJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2FilterJointDef
     */
    public static b2FilterJointDef createAt(long address) {
        Raw.b2FilterJointDef_placed(address);
        b2FilterJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2FilterJointDef
     */
    public static <T> b2FilterJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2FilterJointDef_placed(address);
        b2FilterJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2FilterJointDef() {
        address = Raw.b2FilterJointDef();
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
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int getInternalValue() {
        checkNotNull();
        return Raw.getInternalValue(address);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void setInternalValue(int value) {
        checkNotNull();
        Raw.setInternalValue(address, value);
    }

    public static class Raw {
        public static native void b2FilterJointDef_placed(long address);
        public static native long b2FilterJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
    }
}
