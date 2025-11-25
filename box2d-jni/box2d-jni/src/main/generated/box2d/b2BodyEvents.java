package box2d;


/**
 * Body events are buffered in the Box2D world and are available
 * as event arrays after the time step is complete.
 * Note: this data becomes invalid if bodies are destroyed
 */
public class b2BodyEvents extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2BodyEvents wrapPointer(long address) {
        return address != 0L ? new b2BodyEvents(address) : null;
    }
    
    public static b2BodyEvents arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2BodyEvents(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2BodyEvents
     */
    public static b2BodyEvents createAt(long address) {
        Raw.b2BodyEvents_placed(address);
        b2BodyEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2BodyEvents
     */
    public static <T> b2BodyEvents createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2BodyEvents_placed(address);
        b2BodyEvents createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2BodyEvents() {
        address = Raw.b2BodyEvents();
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
     * Number of move events
     */
    public int getMoveCount() {
        checkNotNull();
        return Raw.getMoveCount(address);
    }

    /**
     * Number of move events
     */
    public void setMoveCount(int value) {
        checkNotNull();
        Raw.setMoveCount(address, value);
    }

    /**
     * Array of move events
     */
    public b2BodyMoveEvent getMoveEvents() {
        checkNotNull();
        return b2BodyMoveEvent.wrapPointer(Raw.getMoveEvents(address));
    }

    /**
     * Array of move events
     */
    public void setMoveEvents(b2BodyMoveEvent value) {
        checkNotNull();
        Raw.setMoveEvents(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2BodyEvents_placed(long address);
        public static native long b2BodyEvents();
        public static native void destroy(long address);
        public static native int getMoveCount(long address);
        public static native void setMoveCount(long address, int value);
        public static native long getMoveEvents(long address);
        public static native void setMoveEvents(long address, long value);
    }
}
