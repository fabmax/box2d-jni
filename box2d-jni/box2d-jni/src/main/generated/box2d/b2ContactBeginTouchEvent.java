package box2d;


/**
 * A begin touch event is generated when two shapes begin touching.
 */
public class b2ContactBeginTouchEvent extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ContactBeginTouchEvent wrapPointer(long address) {
        return address != 0L ? new b2ContactBeginTouchEvent(address) : null;
    }
    
    public static b2ContactBeginTouchEvent arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ContactBeginTouchEvent(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ContactBeginTouchEvent
     */
    public static b2ContactBeginTouchEvent createAt(long address) {
        Raw.b2ContactBeginTouchEvent_placed(address);
        b2ContactBeginTouchEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ContactBeginTouchEvent
     */
    public static <T> b2ContactBeginTouchEvent createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ContactBeginTouchEvent_placed(address);
        b2ContactBeginTouchEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ContactBeginTouchEvent() {
        address = Raw.b2ContactBeginTouchEvent();
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
     * Id of the first shape
     */
    public b2ShapeId getShapeIdA() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdA(address));
    }

    /**
     * Id of the first shape
     */
    public void setShapeIdA(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdA(address, value.getAddress());
    }

    /**
     * Id of the second shape
     */
    public b2ShapeId getShapeIdB() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdB(address));
    }

    /**
     * Id of the second shape
     */
    public void setShapeIdB(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdB(address, value.getAddress());
    }

    /**
     * The transient contact id. This contact may be destroyed automatically when the world is
     * modified or simulated. Use b2Contact_IsValid before using this id.
     */
    public b2ContactId getContactId() {
        checkNotNull();
        return b2ContactId.wrapPointer(Raw.getContactId(address));
    }

    /**
     * The transient contact id. This contact may be destroyed automatically when the world is
     * modified or simulated. Use b2Contact_IsValid before using this id.
     */
    public void setContactId(b2ContactId value) {
        checkNotNull();
        Raw.setContactId(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ContactBeginTouchEvent_placed(long address);
        public static native long b2ContactBeginTouchEvent();
        public static native void destroy(long address);
        public static native long getShapeIdA(long address);
        public static native void setShapeIdA(long address, long value);
        public static native long getShapeIdB(long address);
        public static native void setShapeIdB(long address, long value);
        public static native long getContactId(long address);
        public static native void setContactId(long address, long value);
    }
}
