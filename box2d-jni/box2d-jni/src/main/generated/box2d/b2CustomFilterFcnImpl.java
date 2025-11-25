package box2d;


public class b2CustomFilterFcnImpl extends b2CustomFilterFcnI {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2CustomFilterFcnImpl wrapPointer(long address) {
        return address != 0L ? new b2CustomFilterFcnImpl(address) : null;
    }
    
    public static b2CustomFilterFcnImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2CustomFilterFcnImpl(long address) {
        super(address);
    }

    protected b2CustomFilterFcnImpl() {
        address = _b2CustomFilterFcnImpl();
    }
    private native long _b2CustomFilterFcnImpl();
    
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
    private boolean _customFilterFcn(long shapeIdA, long shapeIdB) {
        return customFilterFcn(shapeIdA, shapeIdB);
    }

    /**
     * @param shapeIdA WebIDL type: unsigned long long
     * @param shapeIdB WebIDL type: unsigned long long
     * @return WebIDL type: boolean
     */
    public boolean customFilterFcn(long shapeIdA, long shapeIdB) {
        return false;
    }

}
