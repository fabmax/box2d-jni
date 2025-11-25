package box2d;


/**
 * World definition used to create a simulation world.
 * Must be initialized using b2DefaultWorldDef().
 * @ingroup world
 */
public class b2WorldDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2WorldDef wrapPointer(long address) {
        return address != 0L ? new b2WorldDef(address) : null;
    }
    
    public static b2WorldDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2WorldDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2WorldDef
     */
    public static b2WorldDef createAt(long address) {
        Raw.b2WorldDef_placed(address);
        b2WorldDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2WorldDef
     */
    public static <T> b2WorldDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2WorldDef_placed(address);
        b2WorldDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2WorldDef() {
        address = Raw.b2WorldDef();
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
     * Gravity vector. Box2D has no up-vector defined.
     */
    public b2Vec2 getGravity() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getGravity(address));
    }

    /**
     * Gravity vector. Box2D has no up-vector defined.
     */
    public void setGravity(b2Vec2 value) {
        checkNotNull();
        Raw.setGravity(address, value.getAddress());
    }

    /**
     * Restitution speed threshold, usually in m/s. Collisions above this
     * speed have restitution applied (will bounce).
     */
    public float getRestitutionThreshold() {
        checkNotNull();
        return Raw.getRestitutionThreshold(address);
    }

    /**
     * Restitution speed threshold, usually in m/s. Collisions above this
     * speed have restitution applied (will bounce).
     */
    public void setRestitutionThreshold(float value) {
        checkNotNull();
        Raw.setRestitutionThreshold(address, value);
    }

    /**
     * Threshold speed for hit events. Usually meters per second.
     */
    public float getHitEventThreshold() {
        checkNotNull();
        return Raw.getHitEventThreshold(address);
    }

    /**
     * Threshold speed for hit events. Usually meters per second.
     */
    public void setHitEventThreshold(float value) {
        checkNotNull();
        Raw.setHitEventThreshold(address, value);
    }

    /**
     * Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
     */
    public float getContactHertz() {
        checkNotNull();
        return Raw.getContactHertz(address);
    }

    /**
     * Contact stiffness. Cycles per second. Increasing this increases the speed of overlap recovery, but can introduce jitter.
     */
    public void setContactHertz(float value) {
        checkNotNull();
        Raw.setContactHertz(address, value);
    }

    /**
     * Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
     * the trade-off that overlap resolution becomes more energetic.
     */
    public float getContactDampingRatio() {
        checkNotNull();
        return Raw.getContactDampingRatio(address);
    }

    /**
     * Contact bounciness. Non-dimensional. You can speed up overlap recovery by decreasing this with
     * the trade-off that overlap resolution becomes more energetic.
     */
    public void setContactDampingRatio(float value) {
        checkNotNull();
        Raw.setContactDampingRatio(address, value);
    }

    /**
     * This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * decreasing the damping ratio.
     */
    public float getMaxContactPushSpeed() {
        checkNotNull();
        return Raw.getMaxContactPushSpeed(address);
    }

    /**
     * This parameter controls how fast overlap is resolved and usually has units of meters per second. This only
     * puts a cap on the resolution speed. The resolution speed is increased by increasing the hertz and/or
     * decreasing the damping ratio.
     */
    public void setMaxContactPushSpeed(float value) {
        checkNotNull();
        Raw.setMaxContactPushSpeed(address, value);
    }

    /**
     * Maximum linear speed. Usually meters per second.
     */
    public float getMaximumLinearSpeed() {
        checkNotNull();
        return Raw.getMaximumLinearSpeed(address);
    }

    /**
     * Maximum linear speed. Usually meters per second.
     */
    public void setMaximumLinearSpeed(float value) {
        checkNotNull();
        Raw.setMaximumLinearSpeed(address, value);
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public boolean getEnableSleep() {
        checkNotNull();
        return Raw.getEnableSleep(address);
    }

    /**
     * Can bodies go to sleep to improve performance
     */
    public void setEnableSleep(boolean value) {
        checkNotNull();
        Raw.setEnableSleep(address, value);
    }

    /**
     * Enable continuous collision
     */
    public boolean getEnableContinuous() {
        checkNotNull();
        return Raw.getEnableContinuous(address);
    }

    /**
     * Enable continuous collision
     */
    public void setEnableContinuous(boolean value) {
        checkNotNull();
        Raw.setEnableContinuous(address, value);
    }

    /**
     * User data
     */
    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    /**
     * User data
     */
    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    public static class Raw {
        public static native void b2WorldDef_placed(long address);
        public static native long b2WorldDef();
        public static native void destroy(long address);
        public static native long getGravity(long address);
        public static native void setGravity(long address, long value);
        public static native float getRestitutionThreshold(long address);
        public static native void setRestitutionThreshold(long address, float value);
        public static native float getHitEventThreshold(long address);
        public static native void setHitEventThreshold(long address, float value);
        public static native float getContactHertz(long address);
        public static native void setContactHertz(long address, float value);
        public static native float getContactDampingRatio(long address);
        public static native void setContactDampingRatio(long address, float value);
        public static native float getMaxContactPushSpeed(long address);
        public static native void setMaxContactPushSpeed(long address, float value);
        public static native float getMaximumLinearSpeed(long address);
        public static native void setMaximumLinearSpeed(long address, float value);
        public static native boolean getEnableSleep(long address);
        public static native void setEnableSleep(long address, boolean value);
        public static native boolean getEnableContinuous(long address);
        public static native void setEnableContinuous(long address, boolean value);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
    }
}
