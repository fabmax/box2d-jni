package box2d;


public class NativeObject {

    static {
        de.fabmax.box2djni.Loader.load();
    }

    protected NativeObject() { }

    private static native int __sizeOfPointer();
    public static final int SIZEOF_POINTER = __sizeOfPointer();
    public static final int SIZEOF_BYTE = 1;
    public static final int SIZEOF_SHORT = 2;
    public static final int SIZEOF_INT = 4;
    public static final int SIZEOF_LONG = 8;
    public static final int SIZEOF_FLOAT = 4;
    public static final int SIZEOF_DOUBLE = 8;
    
    protected long address = 0L;
    protected boolean isExternallyAllocated = false;
    
    protected NativeObject(long address) {
        this.address = address;
    }
    
    public static NativeObject wrapPointer(long address) {
        return new NativeObject(address);
    }
    
    protected void checkNotNull() {
        if (address == 0L) {
            throw new NullPointerException("Native address of " + this + " is 0");
        }
    }
    
    public long getAddress() {
        return address;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NativeObject)) return false;
        NativeObject that = (NativeObject) o;
        return address == that.address;
    }
    
    @Override
    public int hashCode() {
        return (int) (address ^ (address >>> 32));
    }
    
    @FunctionalInterface
    public interface Allocator<T> {
        long on(T allocator, int alignment, int size);
    }
}
