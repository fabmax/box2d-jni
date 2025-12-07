package box2d;


/**
 * The contact data for two shapes. By convention the manifold normal points
 * from shape A to shape B.
 */
public class b2ContactData extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ContactData wrapPointer(long address) {
        return address != 0L ? new b2ContactData(address) : null;
    }
    
    public static b2ContactData arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ContactData(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ContactData
     */
    public static b2ContactData createAt(long address) {
        Raw.b2ContactData_placed(address);
        b2ContactData createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ContactData
     */
    public static <T> b2ContactData createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ContactData_placed(address);
        b2ContactData createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ContactData() {
        address = Raw.b2ContactData();
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

    public b2Manifold getManifold() {
        checkNotNull();
        return b2Manifold.wrapPointer(Raw.getManifold(address));
    }

    public void setManifold(b2Manifold value) {
        checkNotNull();
        Raw.setManifold(address, value.getAddress());
    }

    public b2ShapeId getShapeIdA() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdA(address));
    }

    public void setShapeIdA(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdA(address, value.getAddress());
    }

    public b2ShapeId getShapeIdB() {
        checkNotNull();
        return b2ShapeId.wrapPointer(Raw.getShapeIdB(address));
    }

    public void setShapeIdB(b2ShapeId value) {
        checkNotNull();
        Raw.setShapeIdB(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2ContactData_placed(long address);
        public static native long b2ContactData();
        public static native void destroy(long address);
        public static native long getManifold(long address);
        public static native void setManifold(long address, long value);
        public static native long getShapeIdA(long address);
        public static native void setShapeIdA(long address, long value);
        public static native long getShapeIdB(long address);
        public static native void setShapeIdB(long address, long value);
    }
}
