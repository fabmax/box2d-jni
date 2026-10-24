package box2d;


public class B2_Contact extends NativeObject {

    protected B2_Contact() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Contact wrapPointer(long address) {
        return address != 0L ? new B2_Contact(address) : null;
    }
    
    public static B2_Contact arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Contact(long address) {
        super(address);
    }

    // Functions

    /**
     * Contact identifier validation. Provides validation for up to 2^32 allocations.
     */
    public static boolean isValid(b2ContactId id) {
        return Raw.isValid(id.getAddress());
    }

    /**
     * Get the data for a contact. The manifold may have no points if the contact is not touching.
     */
    public static b2ContactData getData(b2ContactId contactId) {
        return b2ContactData.wrapPointer(Raw.getData(contactId.getAddress()));
    }

    public static class Raw {
        public static native boolean isValid(long id);
        public static native long getData(long contactId);
    }
}
