package box2d;


public class b2PlaneResultFcnI extends NativeObject {

    protected b2PlaneResultFcnI() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PlaneResultFcnI wrapPointer(long address) {
        return address != 0L ? new b2PlaneResultFcnI(address) : null;
    }
    
    public static b2PlaneResultFcnI arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PlaneResultFcnI(long address) {
        super(address);
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

    public static class Raw {
        public static native void destroy(long address);
    }
}
