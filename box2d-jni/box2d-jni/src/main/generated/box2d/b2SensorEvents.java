package box2d;


/**
 * Sensor events are buffered in the Box2D world and are available
 * as begin/end overlap event arrays after the time step is complete.
 * Note: these may become invalid if bodies and/or shapes are destroyed
 */
public class b2SensorEvents extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2SensorEvents wrapPointer(long address) {
        return address != 0L ? new b2SensorEvents(address) : null;
    }
    
    public static b2SensorEvents arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2SensorEvents(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2SensorEvents
     */
    public static b2SensorEvents createAt(long address) {
        Raw.b2SensorEvents_placed(address);
        b2SensorEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2SensorEvents
     */
    public static <T> b2SensorEvents createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2SensorEvents_placed(address);
        b2SensorEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2SensorEvents() {
        address = Raw.b2SensorEvents();
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
     * The number of begin touch events
     */
    public int getBeginCount() {
        checkNotNull();
        return Raw.getBeginCount(address);
    }

    /**
     * The number of begin touch events
     */
    public void setBeginCount(int value) {
        checkNotNull();
        Raw.setBeginCount(address, value);
    }

    /**
     * Array of sensor begin touch events
     */
    public b2SensorBeginTouchEvent getBeginEvents() {
        checkNotNull();
        return b2SensorBeginTouchEvent.wrapPointer(Raw.getBeginEvents(address));
    }

    /**
     * Array of sensor begin touch events
     */
    public void setBeginEvents(b2SensorBeginTouchEvent value) {
        checkNotNull();
        Raw.setBeginEvents(address, value.getAddress());
    }

    /**
     * The number of end touch events
     */
    public int getEndCount() {
        checkNotNull();
        return Raw.getEndCount(address);
    }

    /**
     * The number of end touch events
     */
    public void setEndCount(int value) {
        checkNotNull();
        Raw.setEndCount(address, value);
    }

    /**
     * Array of sensor end touch events
     */
    public b2SensorEndTouchEvent getEndEvents() {
        checkNotNull();
        return b2SensorEndTouchEvent.wrapPointer(Raw.getEndEvents(address));
    }

    /**
     * Array of sensor end touch events
     */
    public void setEndEvents(b2SensorEndTouchEvent value) {
        checkNotNull();
        Raw.setEndEvents(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2SensorEvents_placed(long address);
        public static native long b2SensorEvents();
        public static native void destroy(long address);
        public static native int getBeginCount(long address);
        public static native void setBeginCount(long address, int value);
        public static native long getBeginEvents(long address);
        public static native void setBeginEvents(long address, long value);
        public static native int getEndCount(long address);
        public static native void setEndCount(long address, int value);
        public static native long getEndEvents(long address);
        public static native void setEndEvents(long address, long value);
    }
}
