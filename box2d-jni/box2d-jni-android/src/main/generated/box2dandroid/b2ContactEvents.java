package box2dandroid;


/**
 * Contact events are buffered in the Box2D world and are available
 * as event arrays after the time step is complete.
 * Note: these may become invalid if bodies and/or shapes are destroyed
 */
public class b2ContactEvents extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ContactEvents wrapPointer(long address) {
        return address != 0L ? new b2ContactEvents(address) : null;
    }
    
    public static b2ContactEvents arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ContactEvents(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ContactEvents
     */
    public static b2ContactEvents createAt(long address) {
        Raw.b2ContactEvents_placed(address);
        b2ContactEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ContactEvents
     */
    public static <T> b2ContactEvents createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ContactEvents_placed(address);
        b2ContactEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ContactEvents() {
        address = Raw.b2ContactEvents();
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
     * Number of begin touch events
     */
    public int getBeginCount() {
        checkNotNull();
        return Raw.getBeginCount(address);
    }

    /**
     * Number of begin touch events
     */
    public void setBeginCount(int value) {
        checkNotNull();
        Raw.setBeginCount(address, value);
    }

    /**
     * Array of begin touch events
     */
    public b2ContactBeginTouchEvent getBeginEvents() {
        checkNotNull();
        return b2ContactBeginTouchEvent.wrapPointer(Raw.getBeginEvents(address));
    }

    /**
     * Array of begin touch events
     */
    public void setBeginEvents(b2ContactBeginTouchEvent value) {
        checkNotNull();
        Raw.setBeginEvents(address, value.getAddress());
    }

    /**
     * Number of end touch events
     */
    public int getEndCount() {
        checkNotNull();
        return Raw.getEndCount(address);
    }

    /**
     * Number of end touch events
     */
    public void setEndCount(int value) {
        checkNotNull();
        Raw.setEndCount(address, value);
    }

    /**
     * Array of end touch events
     */
    public b2ContactEndTouchEvent getEndEvents() {
        checkNotNull();
        return b2ContactEndTouchEvent.wrapPointer(Raw.getEndEvents(address));
    }

    /**
     * Array of end touch events
     */
    public void setEndEvents(b2ContactEndTouchEvent value) {
        checkNotNull();
        Raw.setEndEvents(address, value.getAddress());
    }

    /**
     * Number of hit events
     */
    public int getHitCount() {
        checkNotNull();
        return Raw.getHitCount(address);
    }

    /**
     * Number of hit events
     */
    public void setHitCount(int value) {
        checkNotNull();
        Raw.setHitCount(address, value);
    }

    /**
     * Array of hit events
     */
    public b2ContactHitEvent getHitEvents() {
        checkNotNull();
        return b2ContactHitEvent.wrapPointer(Raw.getHitEvents(address));
    }

    /**
     * Array of hit events
     */
    public void setHitEvents(b2ContactHitEvent value) {
        checkNotNull();
        Raw.setHitEvents(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ContactEvents_placed(long address);
        public static native long b2ContactEvents();
        public static native void destroy(long address);
        public static native int getBeginCount(long address);
        public static native void setBeginCount(long address, int value);
        public static native long getBeginEvents(long address);
        public static native void setBeginEvents(long address, long value);
        public static native int getEndCount(long address);
        public static native void setEndCount(long address, int value);
        public static native long getEndEvents(long address);
        public static native void setEndEvents(long address, long value);
        public static native int getHitCount(long address);
        public static native void setHitCount(long address, int value);
        public static native long getHitEvents(long address);
        public static native void setHitEvents(long address, long value);
    }
}
