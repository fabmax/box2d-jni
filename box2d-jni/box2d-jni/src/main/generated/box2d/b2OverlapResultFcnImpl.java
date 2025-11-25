package box2d;


public class b2OverlapResultFcnImpl extends b2OverlapResultFcnI {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2OverlapResultFcnImpl wrapPointer(long address) {
        return address != 0L ? new b2OverlapResultFcnImpl(address) : null;
    }
    
    public static b2OverlapResultFcnImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2OverlapResultFcnImpl(long address) {
        super(address);
    }

    protected b2OverlapResultFcnImpl() {
        address = _b2OverlapResultFcnImpl();
    }
    private native long _b2OverlapResultFcnImpl();
    
    // Destructor
    public void destroy() {
        if (address == 0L) {
            throw new IllegalStateException(this + " is already deleted");
        }
        if (isExternallyAllocated) {
            throw new IllegalStateException(this + " is externally allocated and cannot be manually destroyed");
        }
        _destroy(address);
        address = 0L;
    }
    private static native void _destroy(long address);

    // Functions

    /*
     * Called from native code
     */
    private boolean _overlapResultFcn(long shapeId) {
        return overlapResultFcn(shapeId);
    }

    /**
     * @param shapeId WebIDL type: unsigned long long
     * @return WebIDL type: boolean
     */
    public boolean overlapResultFcn(long shapeId) {
        return false;
    }

}
