package box2d;


/**
 * Joint events are buffered in the world and are available as event arrays after the time step is
 * complete. Note: this data becomes invalid if joints are destroyed
 */
public class b2JointEvents extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2JointEvents wrapPointer(long address) {
        return address != 0L ? new b2JointEvents(address) : null;
    }
    
    public static b2JointEvents arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2JointEvents(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2JointEvents
     */
    public static b2JointEvents createAt(long address) {
        Raw.b2JointEvents_placed(address);
        b2JointEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2JointEvents
     */
    public static <T> b2JointEvents createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2JointEvents_placed(address);
        b2JointEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2JointEvents() {
        address = Raw.b2JointEvents();
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
     * Number of events
     */
    public int getCount() {
        checkNotNull();
        return Raw.getCount(address);
    }

    /**
     * Number of events
     */
    public void setCount(int value) {
        checkNotNull();
        Raw.setCount(address, value);
    }

    /**
     * Array of events
     */
    public b2JointEvent getJointEvents() {
        checkNotNull();
        return b2JointEvent.wrapPointer(Raw.getJointEvents(address));
    }

    /**
     * Array of events
     */
    public void setJointEvents(b2JointEvent value) {
        checkNotNull();
        Raw.setJointEvents(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2JointEvents_placed(long address);
        public static native long b2JointEvents();
        public static native void destroy(long address);
        public static native int getCount(long address);
        public static native void setCount(long address, int value);
        public static native long getJointEvents(long address);
        public static native void setJointEvents(long address, long value);
    }
}
