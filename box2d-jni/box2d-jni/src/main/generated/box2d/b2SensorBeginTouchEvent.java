package box2d;


/**
 * A begin touch event is generated when a shape starts to overlap a sensor shape.
 */
public class b2SensorBeginTouchEvent extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2SensorBeginTouchEvent wrapPointer(long address) {
        return address != 0L ? new b2SensorBeginTouchEvent(address) : null;
    }
    
    public static b2SensorBeginTouchEvent arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2SensorBeginTouchEvent(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2SensorBeginTouchEvent
     */
    public static b2SensorBeginTouchEvent createAt(long address) {
        Raw.b2SensorBeginTouchEvent_placed(address);
        b2SensorBeginTouchEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2SensorBeginTouchEvent
     */
    public static <T> b2SensorBeginTouchEvent createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2SensorBeginTouchEvent_placed(address);
        b2SensorBeginTouchEvent createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2SensorBeginTouchEvent() {
        address = Raw.b2SensorBeginTouchEvent();
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
     * The id of the sensor shape
     */
    public b2ShapeId getSensorShapeId() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getSensorShapeId(address));
    }

    /**
     * The id of the sensor shape
     */
    public void setSensorShapeId(b2ShapeId value) {
        checkNotNull();
        Raw.setSensorShapeId(address, value.getAddress());
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public b2ShapeId getVisitorShapeId() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getVisitorShapeId(address));
    }

    /**
     * The id of the dynamic shape that began touching the sensor shape
     */
    public void setVisitorShapeId(b2ShapeId value) {
        checkNotNull();
        Raw.setVisitorShapeId(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2SensorBeginTouchEvent_placed(long address);
        public static native long b2SensorBeginTouchEvent();
        public static native void destroy(long address);
        public static native long getSensorShapeId(long address);
        public static native void setSensorShapeId(long address, long value);
        public static native long getVisitorShapeId(long address);
        public static native void setVisitorShapeId(long address, long value);
    }
}
