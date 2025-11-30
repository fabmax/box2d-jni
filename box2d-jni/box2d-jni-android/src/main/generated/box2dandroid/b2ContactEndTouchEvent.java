package box2dandroid;


/**
 * An end touch event is generated when two shapes stop touching.
 * You will get an end event if you do anything that destroys contacts previous to the last
 * world step. These include things like setting the transform, destroying a body
 * or shape, or changing a filter or body type.
 */
public class b2ContactEndTouchEvent extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ContactEndTouchEvent wrapPointer(long address) {
        return address != 0L ? new b2ContactEndTouchEvent(address) : null;
    }
    
    public static b2ContactEndTouchEvent arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ContactEndTouchEvent(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ContactEndTouchEvent
     */
    public static b2ContactEndTouchEvent createAt(long address) {
        Raw.b2ContactEndTouchEvent_placed(address);
        b2ContactEndTouchEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ContactEndTouchEvent
     */
    public static <T> b2ContactEndTouchEvent createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ContactEndTouchEvent_placed(address);
        b2ContactEndTouchEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ContactEndTouchEvent() {
        address = Raw.b2ContactEndTouchEvent();
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
     * @warning this shape may have been destroyed
     */
    public b2ShapeId getShapeIdA() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdA(address));
    }

    /**
     * Id of the first shape
     * @warning this shape may have been destroyed
     */
    public void setShapeIdA(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdA(address, value.getAddress());
    }

    /**
     * Id of the second shape
     * @warning this shape may have been destroyed
     */
    public b2ShapeId getShapeIdB() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdB(address));
    }

    /**
     * Id of the second shape
     * @warning this shape may have been destroyed
     */
    public void setShapeIdB(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdB(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ContactEndTouchEvent_placed(long address);
        public static native long b2ContactEndTouchEvent();
        public static native void destroy(long address);
        public static native long getShapeIdA(long address);
        public static native void setShapeIdA(long address, long value);
        public static native long getShapeIdB(long address);
        public static native void setShapeIdB(long address, long value);
    }
}
