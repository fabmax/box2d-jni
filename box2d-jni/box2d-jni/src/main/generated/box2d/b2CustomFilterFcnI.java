package box2d;


public class b2CustomFilterFcnI extends NativeObject {

    protected b2CustomFilterFcnI() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2CustomFilterFcnI wrapPointer(long address) {
        return address != 0L ? new b2CustomFilterFcnI(address) : null;
    }
    
    public static b2CustomFilterFcnI arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2CustomFilterFcnI(long address) {
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
