package box2d;


/**
 * A mover joint is used to move a dynamic character mover through velocity commands. The x and y
 * directions are handled separately. Does not affect rotation.
 * @ingroup mover_joint
 */
public class b2MoverJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2MoverJointDef wrapPointer(long address) {
        return address != 0L ? new b2MoverJointDef(address) : null;
    }
    
    public static b2MoverJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2MoverJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2MoverJointDef
     */
    public static b2MoverJointDef createAt(long address) {
        Raw.b2MoverJointDef_placed(address);
        b2MoverJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2MoverJointDef
     */
    public static <T> b2MoverJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2MoverJointDef_placed(address);
        b2MoverJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2MoverJointDef() {
        address = Raw.b2MoverJointDef();
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
     * Base joint definition
     */
    public b2JointDef getBase() {
        checkNotNull();
        return b2JointDef.wrapPointer(Raw.getBase(address));
    }

    /**
     * Base joint definition
     */
    public void setBase(b2JointDef value) {
        checkNotNull();
        Raw.setBase(address, value.getAddress());
    }

    /**
     * The desired linear velocity
     */
    public b2Vec2 getLinearVelocity() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getLinearVelocity(address));
    }

    /**
     * The desired linear velocity
     */
    public void setLinearVelocity(b2Vec2 value) {
        checkNotNull();
        Raw.setLinearVelocity(address, value.getAddress());
    }

    /**
     * The maximum motor force in newtons.
     */
    public b2Vec2 getMaxVelocityForce() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getMaxVelocityForce(address));
    }

    /**
     * The maximum motor force in newtons.
     */
    public void setMaxVelocityForce(b2Vec2 value) {
        checkNotNull();
        Raw.setMaxVelocityForce(address, value.getAddress());
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public int getInternalValue() {
        checkNotNull();
        return Raw.getInternalValue(address);
    }

    /**
     * Used internally to detect a valid definition. DO NOT SET.
     */
    public void setInternalValue(int value) {
        checkNotNull();
        Raw.setInternalValue(address, value);
    }

    public static class Raw {
        public static native void b2MoverJointDef_placed(long address);
        public static native long b2MoverJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native long getLinearVelocity(long address);
        public static native void setLinearVelocity(long address, long value);
        public static native long getMaxVelocityForce(long address);
        public static native void setMaxVelocityForce(long address, long value);
        public static native int getInternalValue(long address);
        public static native void setInternalValue(long address, int value);
    }
}
