package box2d;


/**
 * Result returned by b2SolvePlanes
 */
public class b2PlaneSolverResult extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PlaneSolverResult wrapPointer(long address) {
        return address != 0L ? new b2PlaneSolverResult(address) : null;
    }
    
    public static b2PlaneSolverResult arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PlaneSolverResult(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2PlaneSolverResult
     */
    public static b2PlaneSolverResult createAt(long address) {
        Raw.b2PlaneSolverResult_placed(address);
        b2PlaneSolverResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2PlaneSolverResult
     */
    public static <T> b2PlaneSolverResult createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2PlaneSolverResult_placed(address);
        b2PlaneSolverResult createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2PlaneSolverResult() {
        address = Raw.b2PlaneSolverResult();
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
     * The number of iterations used by the plane solver. For diagnostics.
     */
    public int getIterationCount() {
        checkNotNull();
        return Raw.getIterationCount(address);
    }

    /**
     * The number of iterations used by the plane solver. For diagnostics.
     */
    public void setIterationCount(int value) {
        checkNotNull();
        Raw.setIterationCount(address, value);
    }

    /**
     * The translation of the mover
     */
    public b2Vec2 getTranslation() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getTranslation(address));
    }

    /**
     * The translation of the mover
     */
    public void setTranslation(b2Vec2 value) {
        checkNotNull();
        Raw.setTranslation(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2PlaneSolverResult_placed(long address);
        public static native long b2PlaneSolverResult();
        public static native void destroy(long address);
        public static native int getIterationCount(long address);
        public static native void setIterationCount(long address, int value);
        public static native long getTranslation(long address);
        public static native void setTranslation(long address, long value);
    }
}
