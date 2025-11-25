package box2d;


public class b2PreSolveFcnImpl extends b2PreSolveFcnI {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PreSolveFcnImpl wrapPointer(long address) {
        return address != 0L ? new b2PreSolveFcnImpl(address) : null;
    }
    
    public static b2PreSolveFcnImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PreSolveFcnImpl(long address) {
        super(address);
    }

    protected b2PreSolveFcnImpl() {
        address = _b2PreSolveFcnImpl();
    }
    private native long _b2PreSolveFcnImpl();
    
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
    private boolean _preSolveFcn(long shapeIdA, long shapeIdB, long manifold) {
        return preSolveFcn(shapeIdA, shapeIdB, b2Manifold.wrapPointer(manifold));
    }

    /**
     * @param shapeIdA WebIDL type: unsigned long long
     * @param shapeIdB WebIDL type: unsigned long long
     * @param manifold WebIDL type: {@link b2Manifold}
     * @return WebIDL type: boolean
     */
    public boolean preSolveFcn(long shapeIdA, long shapeIdB, b2Manifold manifold) {
        return false;
    }

}
