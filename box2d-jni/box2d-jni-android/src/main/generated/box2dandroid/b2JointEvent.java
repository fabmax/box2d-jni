package box2dandroid;


/**
 * Joint events report joints that are awake and have a force and/or torque exceeding the
 * threshold. The observed forces and torques are not returned for efficiency reasons.
 */
public class b2JointEvent extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2JointEvent wrapPointer(long address) {
        return address != 0L ? new b2JointEvent(address) : null;
    }
    
    public static b2JointEvent arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2JointEvent(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2JointEvent
     */
    public static b2JointEvent createAt(long address) {
        Raw.b2JointEvent_placed(address);
        b2JointEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2JointEvent
     */
    public static <T> b2JointEvent createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2JointEvent_placed(address);
        b2JointEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2JointEvent() {
        address = Raw.b2JointEvent();
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
     * The joint id
     */
    public b2JointId getJointId() {
        checkNotNull();
        return b2JointId.wrapPointer(Raw.getJointId(address));
    }

    /**
     * The joint id
     */
    public void setJointId(b2JointId value) {
        checkNotNull();
        Raw.setJointId(address, value.getAddress());
    }

    /**
     * The user data from the joint for convenience
     */
    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    /**
     * The user data from the joint for convenience
     */
    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2JointEvent_placed(long address);
        public static native long b2JointEvent();
        public static native void destroy(long address);
        public static native long getJointId(long address);
        public static native void setJointId(long address, long value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
