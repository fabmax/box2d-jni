package box2d;


public class JavaNativeRef<T> extends NativeObject {
    static {
        de.fabmax.box2djni.Loader.load();
    }
    
    private static native long _new_instance(Object javaRef);
    private static native void _delete_instance(long address);
    private static native Object _get_java_ref(long address);

    public static <T> JavaNativeRef<T> fromNativeObject(NativeObject nativeObj) {
        return new JavaNativeRef<T>(nativeObj != null ? nativeObj.address : 0L);
    }

    protected JavaNativeRef(long address) {
        super(address);
    }

    public JavaNativeRef(Object javaRef) {
        address = _new_instance(javaRef);
    }
    
    @SuppressWarnings("unchecked")
    public T get() {
        checkNotNull();
        return (T) _get_java_ref(address);
    }
    
    public void destroy() {
        checkNotNull();
        _delete_instance(address);
    }
}