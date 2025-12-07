package box2dandroid;


/**
 * Counters that give details of the simulation size.
 */
public class b2Counters extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Counters wrapPointer(long address) {
        return address != 0L ? new b2Counters(address) : null;
    }
    
    public static b2Counters arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Counters(long address) {
        super(address);
    }

    // Constructors

    public b2Counters() {
        address = Raw.b2Counters();
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

    public int getBodyCount() {
        checkNotNull();
        return Raw.getBodyCount(address);
    }

    public void setBodyCount(int value) {
        checkNotNull();
        Raw.setBodyCount(address, value);
    }

    public int getShapeCount() {
        checkNotNull();
        return Raw.getShapeCount(address);
    }

    public void setShapeCount(int value) {
        checkNotNull();
        Raw.setShapeCount(address, value);
    }

    public int getContactCount() {
        checkNotNull();
        return Raw.getContactCount(address);
    }

    public void setContactCount(int value) {
        checkNotNull();
        Raw.setContactCount(address, value);
    }

    public int getJointCount() {
        checkNotNull();
        return Raw.getJointCount(address);
    }

    public void setJointCount(int value) {
        checkNotNull();
        Raw.setJointCount(address, value);
    }

    public int getIslandCount() {
        checkNotNull();
        return Raw.getIslandCount(address);
    }

    public void setIslandCount(int value) {
        checkNotNull();
        Raw.setIslandCount(address, value);
    }

    public int getStackUsed() {
        checkNotNull();
        return Raw.getStackUsed(address);
    }

    public void setStackUsed(int value) {
        checkNotNull();
        Raw.setStackUsed(address, value);
    }

    public int getStaticTreeHeight() {
        checkNotNull();
        return Raw.getStaticTreeHeight(address);
    }

    public void setStaticTreeHeight(int value) {
        checkNotNull();
        Raw.setStaticTreeHeight(address, value);
    }

    public int getTreeHeight() {
        checkNotNull();
        return Raw.getTreeHeight(address);
    }

    public void setTreeHeight(int value) {
        checkNotNull();
        Raw.setTreeHeight(address, value);
    }

    public int getByteCount() {
        checkNotNull();
        return Raw.getByteCount(address);
    }

    public void setByteCount(int value) {
        checkNotNull();
        Raw.setByteCount(address, value);
    }

    public int getTaskCount() {
        checkNotNull();
        return Raw.getTaskCount(address);
    }

    public void setTaskCount(int value) {
        checkNotNull();
        Raw.setTaskCount(address, value);
    }

    /**
     * @param index Array index
     * @return WebIDL type: long
     */
    public int getColorCounts(int index) {
        checkNotNull();
        return Raw.getColorCounts(address, index);
    }

    /**
     * @param index Array index
     * @param value WebIDL type: long
     */
    public void setColorCounts(int index, int value) {
        checkNotNull();
        Raw.setColorCounts(address, index, value);
    }

    public static class Raw {
        public static native long b2Counters();
        public static native void destroy(long address);
        public static native int getBodyCount(long address);
        public static native void setBodyCount(long address, int value);
        public static native int getShapeCount(long address);
        public static native void setShapeCount(long address, int value);
        public static native int getContactCount(long address);
        public static native void setContactCount(long address, int value);
        public static native int getJointCount(long address);
        public static native void setJointCount(long address, int value);
        public static native int getIslandCount(long address);
        public static native void setIslandCount(long address, int value);
        public static native int getStackUsed(long address);
        public static native void setStackUsed(long address, int value);
        public static native int getStaticTreeHeight(long address);
        public static native void setStaticTreeHeight(long address, int value);
        public static native int getTreeHeight(long address);
        public static native void setTreeHeight(long address, int value);
        public static native int getByteCount(long address);
        public static native void setByteCount(long address, int value);
        public static native int getTaskCount(long address);
        public static native void setTaskCount(long address, int value);
        public static native int getColorCounts(long address, int index);
        public static native void setColorCounts(long address, int index, int value);
    }
}
