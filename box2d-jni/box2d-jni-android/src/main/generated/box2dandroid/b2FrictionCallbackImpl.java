package box2dandroid;


public class b2FrictionCallbackImpl extends b2FrictionCallbackI {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2FrictionCallbackImpl wrapPointer(long address) {
        return address != 0L ? new b2FrictionCallbackImpl(address) : null;
    }
    
    public static b2FrictionCallbackImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2FrictionCallbackImpl(long address) {
        super(address);
    }

    protected b2FrictionCallbackImpl() {
        address = _b2FrictionCallbackImpl();
    }
    private native long _b2FrictionCallbackImpl();
    
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
    private float _frictionCallback(float frictionA, int userMaterialIdA, float frictionB, int userMaterialIdB) {
        return frictionCallback(frictionA, userMaterialIdA, frictionB, userMaterialIdB);
    }

    /**
     * @param frictionA       WebIDL type: float
     * @param userMaterialIdA WebIDL type: long
     * @param frictionB       WebIDL type: float
     * @param userMaterialIdB WebIDL type: long
     * @return WebIDL type: float
     */
    public float frictionCallback(float frictionA, int userMaterialIdA, float frictionB, int userMaterialIdB) {
        return 0.0f;
    }

}
