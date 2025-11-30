package box2dandroid;


/**
 * These are collision planes that can be fed to b2SolvePlanes. Normally
 * this is assembled by the user from plane results in b2PlaneResult
 */
public class b2CollisionPlane extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2CollisionPlane wrapPointer(long address) {
        return address != 0L ? new b2CollisionPlane(address) : null;
    }
    
    public static b2CollisionPlane arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2CollisionPlane(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2CollisionPlane
     */
    public static b2CollisionPlane createAt(long address) {
        Raw.b2CollisionPlane_placed(address);
        b2CollisionPlane createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2CollisionPlane
     */
    public static <T> b2CollisionPlane createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2CollisionPlane_placed(address);
        b2CollisionPlane createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2CollisionPlane() {
        address = Raw.b2CollisionPlane();
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
     * Indicates if b2ClipVector should clip against this plane. Should be false for soft collision.
     */
    public boolean getClipVelocity() {
        checkNotNull();
        return Raw.getClipVelocity(address);
    }

    /**
     * Indicates if b2ClipVector should clip against this plane. Should be false for soft collision.
     */
    public void setClipVelocity(boolean value) {
        checkNotNull();
        Raw.setClipVelocity(address, value);
    }

    /**
     * The collision plane between the mover and some shape
     */
    public b2Plane getPlane() {
        checkNotNull();
        return b2Plane.wrapPointer(Raw.getPlane(address));
    }

    /**
     * The collision plane between the mover and some shape
     */
    public void setPlane(b2Plane value) {
        checkNotNull();
        Raw.setPlane(address, value.getAddress());
    }

    /**
     * The push on the mover determined by b2SolvePlanes. Usually in meters.
     */
    public float getPush() {
        checkNotNull();
        return Raw.getPush(address);
    }

    /**
     * The push on the mover determined by b2SolvePlanes. Usually in meters.
     */
    public void setPush(float value) {
        checkNotNull();
        Raw.setPush(address, value);
    }

    /**
     * Setting this to FLT_MAX makes the plane as rigid as possible. Lower values can
     * make the plane collision soft. Usually in meters.
     */
    public float getPushLimit() {
        checkNotNull();
        return Raw.getPushLimit(address);
    }

    /**
     * Setting this to FLT_MAX makes the plane as rigid as possible. Lower values can
     * make the plane collision soft. Usually in meters.
     */
    public void setPushLimit(float value) {
        checkNotNull();
        Raw.setPushLimit(address, value);
    }

    public static class Raw {
        public static native void b2CollisionPlane_placed(long address);
        public static native long b2CollisionPlane();
        public static native void destroy(long address);
        public static native boolean getClipVelocity(long address);
        public static native void setClipVelocity(long address, boolean value);
        public static native long getPlane(long address);
        public static native void setPlane(long address, long value);
        public static native float getPush(long address);
        public static native void setPush(long address, float value);
        public static native float getPushLimit(long address);
        public static native void setPushLimit(long address, float value);
    }
}
