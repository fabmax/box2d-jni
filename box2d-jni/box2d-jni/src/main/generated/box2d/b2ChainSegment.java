package box2d;


/**
 * A line segment with one-sided collision. Only collides on the right side.
 * Several of these are generated for a chain shape.
 * ghost1 -&gt; point1 -&gt; point2 -&gt; ghost2
 */
public class b2ChainSegment extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ChainSegment wrapPointer(long address) {
        return address != 0L ? new b2ChainSegment(address) : null;
    }
    
    public static b2ChainSegment arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ChainSegment(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ChainSegment
     */
    public static b2ChainSegment createAt(long address) {
        Raw.b2ChainSegment_placed(address);
        b2ChainSegment createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ChainSegment
     */
    public static <T> b2ChainSegment createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ChainSegment_placed(address);
        b2ChainSegment createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ChainSegment() {
        address = Raw.b2ChainSegment();
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
     * The owning chain shape index (internal usage only)
     */
    public int getChainId() {
        checkNotNull();
        return Raw.getChainId(address);
    }

    /**
     * The owning chain shape index (internal usage only)
     */
    public void setChainId(int value) {
        checkNotNull();
        Raw.setChainId(address, value);
    }

    /**
     * The tail ghost vertex
     */
    public b2Vec2 getGhost1() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getGhost1(address));
    }

    /**
     * The tail ghost vertex
     */
    public void setGhost1(b2Vec2 value) {
        checkNotNull();
        Raw.setGhost1(address, value.getAddress());
    }

    /**
     * The head ghost vertex
     */
    public b2Vec2 getGhost2() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getGhost2(address));
    }

    /**
     * The head ghost vertex
     */
    public void setGhost2(b2Vec2 value) {
        checkNotNull();
        Raw.setGhost2(address, value.getAddress());
    }

    /**
     * The line segment
     */
    public b2Segment getSegment() {
        checkNotNull();
        return b2Segment.wrapPointer(Raw.getSegment(address));
    }

    /**
     * The line segment
     */
    public void setSegment(b2Segment value) {
        checkNotNull();
        Raw.setSegment(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ChainSegment_placed(long address);
        public static native long b2ChainSegment();
        public static native void destroy(long address);
        public static native int getChainId(long address);
        public static native void setChainId(long address, int value);
        public static native long getGhost1(long address);
        public static native void setGhost1(long address, long value);
        public static native long getGhost2(long address);
        public static native void setGhost2(long address, long value);
        public static native long getSegment(long address);
        public static native void setSegment(long address, long value);
    }
}
