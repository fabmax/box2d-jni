package box2d;


public class b2RestitutionCallbackImpl extends b2RestitutionCallbackI {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2RestitutionCallbackImpl wrapPointer(long address) {
        return address != 0L ? new b2RestitutionCallbackImpl(address) : null;
    }
    
    public static b2RestitutionCallbackImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2RestitutionCallbackImpl(long address) {
        super(address);
    }

    protected b2RestitutionCallbackImpl() {
        address = _b2RestitutionCallbackImpl();
    }
    private native long _b2RestitutionCallbackImpl();
    
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
    private float _restitutionCallback(float restitutionA, int userMaterialIdA, float restitutionB, int userMaterialIdB) {
        return restitutionCallback(restitutionA, userMaterialIdA, restitutionB, userMaterialIdB);
    }

    /**
     * @param restitutionA    WebIDL type: float
     * @param userMaterialIdA WebIDL type: long
     * @param restitutionB    WebIDL type: float
     * @param userMaterialIdB WebIDL type: long
     * @return WebIDL type: float
     */
    public float restitutionCallback(float restitutionA, int userMaterialIdA, float restitutionB, int userMaterialIdB) {
        return 0.0f;
    }

}
