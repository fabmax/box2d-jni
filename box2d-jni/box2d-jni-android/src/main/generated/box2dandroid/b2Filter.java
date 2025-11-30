package box2dandroid;


/**
 * This is used to filter collision on shapes. It affects shape-vs-shape collision
 * and shape-versus-query collision (such as b2World_CastRay).
 * @ingroup shape
 */
public class b2Filter extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Filter wrapPointer(long address) {
        return address != 0L ? new b2Filter(address) : null;
    }
    
    public static b2Filter arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Filter(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2Filter
     */
    public static b2Filter createAt(long address) {
        Raw.b2Filter_placed(address);
        b2Filter createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2Filter
     */
    public static <T> b2Filter createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2Filter_placed(address);
        b2Filter createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2Filter() {
        address = Raw.b2Filter();
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
     * The collision category bits. Normally you would just set one bit. The category bits should
     * represent your application object types. For example:
     * @code{.cpp}
     * enum MyCategories
     * {
     * Static  = 0x00000001,
     * Dynamic = 0x00000002,
     * Debris  = 0x00000004,
     * Player  = 0x00000008,
     * // etc
     * };
     * @endcode
     */
    public long getCategoryBits() {
        checkNotNull();
        return Raw.getCategoryBits(address);
    }

    /**
     * The collision category bits. Normally you would just set one bit. The category bits should
     * represent your application object types. For example:
     * @code{.cpp}
     * enum MyCategories
     * {
     * Static  = 0x00000001,
     * Dynamic = 0x00000002,
     * Debris  = 0x00000004,
     * Player  = 0x00000008,
     * // etc
     * };
     * @endcode
     */
    public void setCategoryBits(long value) {
        checkNotNull();
        Raw.setCategoryBits(address, value);
    }

    /**
     * Collision groups allow a certain group of objects to never collide (negative)
     * or always collide (positive). A group index of zero has no effect. Non-zero group filtering
     * always wins against the mask bits.
     * For example, you may want ragdolls to collide with other ragdolls but you don't want
     * ragdoll self-collision. In this case you would give each ragdoll a unique negative group index
     * and apply that group index to all shapes on the ragdoll.
     */
    public int getGroupIndex() {
        checkNotNull();
        return Raw.getGroupIndex(address);
    }

    /**
     * Collision groups allow a certain group of objects to never collide (negative)
     * or always collide (positive). A group index of zero has no effect. Non-zero group filtering
     * always wins against the mask bits.
     * For example, you may want ragdolls to collide with other ragdolls but you don't want
     * ragdoll self-collision. In this case you would give each ragdoll a unique negative group index
     * and apply that group index to all shapes on the ragdoll.
     */
    public void setGroupIndex(int value) {
        checkNotNull();
        Raw.setGroupIndex(address, value);
    }

    /**
     * The collision mask bits. This states the categories that this
     * shape would accept for collision.
     * For example, you may want your player to only collide with static objects
     * and other players.
     * @code{.c}
     * maskBits = Static | Player;
     * @endcode
     */
    public long getMaskBits() {
        checkNotNull();
        return Raw.getMaskBits(address);
    }

    /**
     * The collision mask bits. This states the categories that this
     * shape would accept for collision.
     * For example, you may want your player to only collide with static objects
     * and other players.
     * @code{.c}
     * maskBits = Static | Player;
     * @endcode
     */
    public void setMaskBits(long value) {
        checkNotNull();
        Raw.setMaskBits(address, value);
    }

    public static class Raw {
        public static native void b2Filter_placed(long address);
        public static native long b2Filter();
        public static native void destroy(long address);
        public static native long getCategoryBits(long address);
        public static native void setCategoryBits(long address, long value);
        public static native int getGroupIndex(long address);
        public static native void setGroupIndex(long address, int value);
        public static native long getMaskBits(long address);
        public static native void setMaskBits(long address, long value);
    }
}
