package box2d;


/**
 * Version numbering scheme.
 * See https://semver.org/
 */
public class b2Version extends NativeObject {

    protected b2Version() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Version wrapPointer(long address) {
        return address != 0L ? new b2Version(address) : null;
    }
    
    public static b2Version arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Version(long address) {
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

    // Attributes

    /**
     * Significant changes
     */
    public int getMajor() {
        checkNotNull();
        return Raw.getMajor(address);
    }

    /**
     * Significant changes
     */
    public void setMajor(int value) {
        checkNotNull();
        Raw.setMajor(address, value);
    }

    /**
     * Incremental changes
     */
    public int getMinor() {
        checkNotNull();
        return Raw.getMinor(address);
    }

    /**
     * Incremental changes
     */
    public void setMinor(int value) {
        checkNotNull();
        Raw.setMinor(address, value);
    }

    /**
     * Bug fixes
     */
    public int getRevision() {
        checkNotNull();
        return Raw.getRevision(address);
    }

    /**
     * Bug fixes
     */
    public void setRevision(int value) {
        checkNotNull();
        Raw.setRevision(address, value);
    }

    public static class Raw {
        public static native void destroy(long address);
        public static native int getMajor(long address);
        public static native void setMajor(long address, int value);
        public static native int getMinor(long address);
        public static native void setMinor(long address, int value);
        public static native int getRevision(long address);
        public static native void setRevision(long address, int value);
    }
}
