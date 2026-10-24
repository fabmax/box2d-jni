package box2d;


/**
 * Counters that give details of the simulation size.
 * @ingroup world
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

    public long getByteCount() {
        checkNotNull();
        return Raw.getByteCount(address);
    }

    public void setByteCount(long value) {
        checkNotNull();
        Raw.setByteCount(address, value);
    }

    /**
     * &lt;
     */
    public int getBodyCount() {
        checkNotNull();
        return Raw.getBodyCount(address);
    }

    /**
     * &lt;
     */
    public void setBodyCount(int value) {
        checkNotNull();
        Raw.setBodyCount(address, value);
    }

    /**
     * &lt;
     */
    public int getShapeCount() {
        checkNotNull();
        return Raw.getShapeCount(address);
    }

    /**
     * &lt;
     */
    public void setShapeCount(int value) {
        checkNotNull();
        Raw.setShapeCount(address, value);
    }

    /**
     * &lt;
     */
    public int getContactCount() {
        checkNotNull();
        return Raw.getContactCount(address);
    }

    /**
     * &lt;
     */
    public void setContactCount(int value) {
        checkNotNull();
        Raw.setContactCount(address, value);
    }

    /**
     * &lt;
     */
    public int getJointCount() {
        checkNotNull();
        return Raw.getJointCount(address);
    }

    /**
     * &lt;
     */
    public void setJointCount(int value) {
        checkNotNull();
        Raw.setJointCount(address, value);
    }

    /**
     * &lt;
     */
    public int getIslandCount() {
        checkNotNull();
        return Raw.getIslandCount(address);
    }

    /**
     * &lt;
     */
    public void setIslandCount(int value) {
        checkNotNull();
        Raw.setIslandCount(address, value);
    }

    /**
     * &lt;
     */
    public int getStackUsed() {
        checkNotNull();
        return Raw.getStackUsed(address);
    }

    /**
     * &lt;
     */
    public void setStackUsed(int value) {
        checkNotNull();
        Raw.setStackUsed(address, value);
    }

    /**
     * &lt;
     */
    public int getStaticTreeHeight() {
        checkNotNull();
        return Raw.getStaticTreeHeight(address);
    }

    /**
     * &lt;
     */
    public void setStaticTreeHeight(int value) {
        checkNotNull();
        Raw.setStaticTreeHeight(address, value);
    }

    /**
     * &lt;
     */
    public int getTreeHeight() {
        checkNotNull();
        return Raw.getTreeHeight(address);
    }

    /**
     * &lt;
     */
    public void setTreeHeight(int value) {
        checkNotNull();
        Raw.setTreeHeight(address, value);
    }

    /**
     * &lt;
     */
    public int getTaskCount() {
        checkNotNull();
        return Raw.getTaskCount(address);
    }

    /**
     * &lt;
     */
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

    /**
     * &lt;
     * Number of contacts touched by the collide pass (graph contacts + awake-set non-touching).
     */
    public int getAwakeContactCount() {
        checkNotNull();
        return Raw.getAwakeContactCount(address);
    }

    /**
     * &lt;
     * Number of contacts touched by the collide pass (graph contacts + awake-set non-touching).
     */
    public void setAwakeContactCount(int value) {
        checkNotNull();
        Raw.setAwakeContactCount(address, value);
    }

    /**
     * Number of contacts recycled in the most recent step.
     */
    public int getRecycledContactCount() {
        checkNotNull();
        return Raw.getRecycledContactCount(address);
    }

    /**
     * Number of contacts recycled in the most recent step.
     */
    public void setRecycledContactCount(int value) {
        checkNotNull();
        Raw.setRecycledContactCount(address, value);
    }

    public static class Raw {
        public static native long b2Counters();
        public static native void destroy(long address);
        public static native long getByteCount(long address);
        public static native void setByteCount(long address, long value);
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
        public static native int getTaskCount(long address);
        public static native void setTaskCount(long address, int value);
        public static native int getColorCounts(long address, int index);
        public static native void setColorCounts(long address, int index, int value);
        public static native int getAwakeContactCount(long address);
        public static native void setAwakeContactCount(long address, int value);
        public static native int getRecycledContactCount(long address);
        public static native void setRecycledContactCount(long address, int value);
    }
}
