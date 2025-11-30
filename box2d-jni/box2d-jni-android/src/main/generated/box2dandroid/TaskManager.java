package box2dandroid;


public class TaskManager extends NativeObject {

    protected TaskManager() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static TaskManager wrapPointer(long address) {
        return address != 0L ? new TaskManager(address) : null;
    }
    
    public static TaskManager arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected TaskManager(long address) {
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

    // Functions

    /**
     * @param worldDef    WebIDL type: {@link b2WorldDef} [Ref]
     * @param threadCount WebIDL type: long
     */
    public void install(b2WorldDef worldDef, int threadCount) {
        checkNotNull();
        Raw.install(address, worldDef.getAddress(), threadCount);
    }

    /**
     * @param start        WebIDL type: unsigned long
     * @param end          WebIDL type: unsigned long
     * @param threadIndex  WebIDL type: unsigned long
     * @param box2dTask    WebIDL type: unsigned long long
     * @param box2dContext WebIDL type: unsigned long long
     */
    public void executeTask(int start, int end, int threadIndex, long box2dTask, long box2dContext) {
        checkNotNull();
        Raw.executeTask(address, start, end, threadIndex, box2dTask, box2dContext);
    }

    public static class Raw {
        public static native void destroy(long address);
        public static native void install(long address, long worldDef, int threadCount);
        public static native void executeTask(long address, int start, int end, int threadIndex, long box2dTask, long box2dContext);
    }
}
