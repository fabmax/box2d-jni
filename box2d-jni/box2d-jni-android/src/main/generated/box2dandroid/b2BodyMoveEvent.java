package box2dandroid;


/**
 * Body move events triggered when a body moves.
 * Triggered when a body moves due to simulation. Not reported for bodies moved by the user.
 * This also has a flag to indicate that the body went to sleep so the application can also
 * sleep that actor/entity/object associated with the body.
 * On the other hand if the flag does not indicate the body went to sleep then the application
 * can treat the actor/entity/object associated with the body as awake.
 * This is an efficient way for an application to update game object transforms rather than
 * calling functions such as b2Body_GetTransform() because this data is delivered as a contiguous array
 * and it is only populated with bodies that have moved.
 * @note If sleeping is disabled all dynamic and kinematic bodies will trigger move events.
 */
public class b2BodyMoveEvent extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2BodyMoveEvent wrapPointer(long address) {
        return address != 0L ? new b2BodyMoveEvent(address) : null;
    }
    
    public static b2BodyMoveEvent arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2BodyMoveEvent(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2BodyMoveEvent
     */
    public static b2BodyMoveEvent createAt(long address) {
        Raw.b2BodyMoveEvent_placed(address);
        b2BodyMoveEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2BodyMoveEvent
     */
    public static <T> b2BodyMoveEvent createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2BodyMoveEvent_placed(address);
        b2BodyMoveEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2BodyMoveEvent() {
        address = Raw.b2BodyMoveEvent();
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

    public b2BodyId getBodyId() {
        checkNotNull();
        return b2BodyId.wrapPointer(Raw.getBodyId(address));
    }

    public void setBodyId(b2BodyId value) {
        checkNotNull();
        Raw.setBodyId(address, value.getAddress());
    }

    public boolean getFellAsleep() {
        checkNotNull();
        return Raw.getFellAsleep(address);
    }

    public void setFellAsleep(boolean value) {
        checkNotNull();
        Raw.setFellAsleep(address, value);
    }

    public b2Transform getTransform() {
        checkNotNull();
        return b2Transform.wrapPointer(Raw.getTransform(address));
    }

    public void setTransform(b2Transform value) {
        checkNotNull();
        Raw.setTransform(address, value.getAddress());
    }

    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2BodyMoveEvent_placed(long address);
        public static native long b2BodyMoveEvent();
        public static native void destroy(long address);
        public static native long getBodyId(long address);
        public static native void setBodyId(long address, long value);
        public static native boolean getFellAsleep(long address);
        public static native void setFellAsleep(long address, boolean value);
        public static native long getTransform(long address);
        public static native void setTransform(long address, long value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
