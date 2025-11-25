package box2d;


public class TaskManagerImpl extends TaskManager {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static TaskManagerImpl wrapPointer(long address) {
        return address != 0L ? new TaskManagerImpl(address) : null;
    }
    
    public static TaskManagerImpl arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected TaskManagerImpl(long address) {
        super(address);
    }

    protected TaskManagerImpl() {
        address = _TaskManagerImpl();
    }
    private native long _TaskManagerImpl();
    
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
    private long _enqueueTask(long box2dTask, int itemCount, int minRange, long box2dContext) {
        return enqueueTask(box2dTask, itemCount, minRange, box2dContext);
    }

    /**
     * @param box2dTask    WebIDL type: unsigned long long
     * @param itemCount    WebIDL type: long
     * @param minRange     WebIDL type: long
     * @param box2dContext WebIDL type: unsigned long long
     * @return WebIDL type: unsigned long long
     */
    public long enqueueTask(long box2dTask, int itemCount, int minRange, long box2dContext) {
        return 0;
    }

    /*
     * Called from native code
     */
    private void _finishTask(long userTask) {
        finishTask(userTask);
    }

    /**
     * @param userTask WebIDL type: unsigned long long
     */
    public void finishTask(long userTask) { }

}
