package box2dandroid;


public class b2PlaneResultFcnImpl extends b2PlaneResultFcnI {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PlaneResultFcnImpl wrapPointer(long address) {
        return address != 0L ? new b2PlaneResultFcnImpl(address) : null;
    }
    
    public static b2PlaneResultFcnImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PlaneResultFcnImpl(long address) {
        super(address);
    }

    protected b2PlaneResultFcnImpl() {
        address = _b2PlaneResultFcnImpl();
    }
    private native long _b2PlaneResultFcnImpl();
    
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
    private boolean _planeResultFcn(long shapeId, long plane) {
        return planeResultFcn(shapeId, b2PlaneResult.wrapPointer(plane));
    }

    /**
     * @param shapeId WebIDL type: unsigned long long
     * @param plane   WebIDL type: {@link b2PlaneResult} [Const]
     * @return WebIDL type: boolean
     */
    public boolean planeResultFcn(long shapeId, b2PlaneResult plane) {
        return false;
    }

}
