package box2d;


/**
 * Output parameters for b2TimeOfImpact.
 */
public class b2TOIOutput extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2TOIOutput wrapPointer(long address) {
        return address != 0L ? new b2TOIOutput(address) : null;
    }
    
    public static b2TOIOutput arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2TOIOutput(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2TOIOutput
     */
    public static b2TOIOutput createAt(long address) {
        Raw.b2TOIOutput_placed(address);
        b2TOIOutput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2TOIOutput
     */
    public static <T> b2TOIOutput createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2TOIOutput_placed(address);
        b2TOIOutput createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2TOIOutput() {
        address = Raw.b2TOIOutput();
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

    public b2TOIState getState() {
        checkNotNull();
        return b2TOIState.forValue(Raw.getState(address));
    }

    public void setState(b2TOIState value) {
        checkNotNull();
        Raw.setState(address, value.value);
    }

    /**
     * &lt; The type of result
     */
    public float getFraction() {
        checkNotNull();
        return Raw.getFraction(address);
    }

    /**
     * &lt; The type of result
     */
    public void setFraction(float value) {
        checkNotNull();
        Raw.setFraction(address, value);
    }

    public static class Raw {
        public static native void b2TOIOutput_placed(long address);
        public static native long b2TOIOutput();
        public static native void destroy(long address);
        public static native int getState(long address);
        public static native void setState(long address, int value);
        public static native float getFraction(long address);
        public static native void setFraction(long address, float value);
    }
}
