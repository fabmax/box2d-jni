package box2dandroid;


/**
 * Pogo joint definition
 * @ingroup pogo_joint
 */
public class b2PogoJointDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2PogoJointDef wrapPointer(long address) {
        return address != 0L ? new b2PogoJointDef(address) : null;
    }
    
    public static b2PogoJointDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2PogoJointDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2PogoJointDef
     */
    public static b2PogoJointDef createAt(long address) {
        Raw.b2PogoJointDef_placed(address);
        b2PogoJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2PogoJointDef
     */
    public static <T> b2PogoJointDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2PogoJointDef_placed(address);
        b2PogoJointDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2PogoJointDef() {
        address = Raw.b2PogoJointDef();
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
     * Normal vector at the contact
     */
    public b2Vec2 getNormal() {
        checkNotNull();
        return b2Vec2.wrapPointer(Raw.getNormal(address));
    }

    /**
     * Normal vector at the contact
     */
    public void setNormal(b2Vec2 value) {
        checkNotNull();
        Raw.setNormal(address, value.getAddress());
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public float getHertz() {
        checkNotNull();
        return Raw.getHertz(address);
    }

    /**
     * The spring stiffness Hertz, cycles per second
     */
    public void setHertz(float value) {
        checkNotNull();
        Raw.setHertz(address, value);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public float getDampingRatio() {
        checkNotNull();
        return Raw.getDampingRatio(address);
    }

    /**
     * The spring damping ratio, non-dimensional
     */
    public void setDampingRatio(float value) {
        checkNotNull();
        Raw.setDampingRatio(address, value);
    }

    /**
     * Spring length.
     */
    public float getRestLength() {
        checkNotNull();
        return Raw.getRestLength(address);
    }

    /**
     * Spring length.
     */
    public void setRestLength(float value) {
        checkNotNull();
        Raw.setRestLength(address, value);
    }

    /**
     * Maximum tension force. Controls how sticky the mover is to ground.
     */
    public float getMaxTensionForce() {
        checkNotNull();
        return Raw.getMaxTensionForce(address);
    }

    /**
     * Maximum tension force. Controls how sticky the mover is to ground.
     */
    public void setMaxTensionForce(float value) {
        checkNotNull();
        Raw.setMaxTensionForce(address, value);
    }

    /**
     * Maximum compression force. How hard the pogo pushes the mover up from the ground.
     */
    public float getMaxCompressionForce() {
        checkNotNull();
        return Raw.getMaxCompressionForce(address);
    }

    /**
     * Maximum compression force. How hard the pogo pushes the mover up from the ground.
     */
    public void setMaxCompressionForce(float value) {
        checkNotNull();
        Raw.setMaxCompressionForce(address, value);
    }

    /**
     * The initial pogo internal impulse. The pogo is typically recreated every frame. This gives a
     * way to move the internal state forward for smoother spring behavior.
     */
    public float getImpulse() {
        checkNotNull();
        return Raw.getImpulse(address);
    }

    /**
     * The initial pogo internal impulse. The pogo is typically recreated every frame. This gives a
     * way to move the internal state forward for smoother spring behavior.
     */
    public void setImpulse(float value) {
        checkNotNull();
        Raw.setImpulse(address, value);
    }

    /**
     * The initial pogo internal velocity. The pogo is typically recreated every frame. This gives
     * a way to move the internal state forward for smoother spring behavior.
     */
    public float getVelocity() {
        checkNotNull();
        return Raw.getVelocity(address);
    }

    /**
     * The initial pogo internal velocity. The pogo is typically recreated every frame. This gives
     * a way to move the internal state forward for smoother spring behavior.
     */
    public void setVelocity(float value) {
        checkNotNull();
        Raw.setVelocity(address, value);
    }

    public static class Raw {
        public static native void b2PogoJointDef_placed(long address);
        public static native long b2PogoJointDef();
        public static native void destroy(long address);
        public static native long getBase(long address);
        public static native void setBase(long address, long value);
        public static native long getNormal(long address);
        public static native void setNormal(long address, long value);
        public static native float getHertz(long address);
        public static native void setHertz(long address, float value);
        public static native float getDampingRatio(long address);
        public static native void setDampingRatio(long address, float value);
        public static native float getRestLength(long address);
        public static native void setRestLength(long address, float value);
        public static native float getMaxTensionForce(long address);
        public static native void setMaxTensionForce(long address, float value);
        public static native float getMaxCompressionForce(long address);
        public static native void setMaxCompressionForce(long address, float value);
        public static native float getImpulse(long address);
        public static native void setImpulse(long address, float value);
        public static native float getVelocity(long address);
        public static native void setVelocity(long address, float value);
    }
}
