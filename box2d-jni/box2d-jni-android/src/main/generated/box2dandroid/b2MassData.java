package box2dandroid;


/**
 * This holds the mass data computed for a shape.
 */
public class b2MassData extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2MassData wrapPointer(long address) {
        return address != 0L ? new b2MassData(address) : null;
    }
    
    public static b2MassData arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2MassData(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2MassData
     */
    public static b2MassData createAt(long address) {
        Raw.b2MassData_placed(address);
        b2MassData createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2MassData
     */
    public static <T> b2MassData createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2MassData_placed(address);
        b2MassData createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2MassData() {
        address = Raw.b2MassData();
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
     * The position of the shape's centroid relative to the shape's origin.
     */
    public b2Vec2 getCenter() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getCenter(address));
    }

    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public void setCenter(b2Vec2 value) {
        checkNotNull();
        Raw.setCenter(address, value.getAddress());
    }

    /**
     * The mass of the shape, usually in kilograms.
     */
    public float getMass() {
        checkNotNull();
        return Raw.getMass(address);
    }

    /**
     * The mass of the shape, usually in kilograms.
     */
    public void setMass(float value) {
        checkNotNull();
        Raw.setMass(address, value);
    }

    /**
     * The rotational inertia of the shape about the local origin.
     */
    public float getRotationalInertia() {
        checkNotNull();
        return Raw.getRotationalInertia(address);
    }

    /**
     * The rotational inertia of the shape about the local origin.
     */
    public void setRotationalInertia(float value) {
        checkNotNull();
        Raw.setRotationalInertia(address, value);
    }

    public static class Raw {
        public static native void b2MassData_placed(long address);
        public static native long b2MassData();
        public static native void destroy(long address);
        public static native long getCenter(long address);
        public static native void setCenter(long address, long value);
        public static native float getMass(long address);
        public static native void setMass(long address, float value);
        public static native float getRotationalInertia(long address);
        public static native void setRotationalInertia(long address, float value);
    }
}
