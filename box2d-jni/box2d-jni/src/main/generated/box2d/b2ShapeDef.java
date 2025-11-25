package box2d;


/**
 * Used to create a shape.
 * This is a temporary object used to bundle shape creation parameters. You may use
 * the same shape definition to create multiple shapes.
 * Must be initialized using b2DefaultShapeDef().
 * @ingroup shape
 */
public class b2ShapeDef extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2ShapeDef wrapPointer(long address) {
        return address != 0L ? new b2ShapeDef(address) : null;
    }
    
    public static b2ShapeDef arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2ShapeDef(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2ShapeDef
     */
    public static b2ShapeDef createAt(long address) {
        Raw.b2ShapeDef_placed(address);
        b2ShapeDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2ShapeDef
     */
    public static <T> b2ShapeDef createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2ShapeDef_placed(address);
        b2ShapeDef createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2ShapeDef() {
        address = Raw.b2ShapeDef();
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
     * Use this to store application specific shape data.
     */
    public NativeObject getUserData() {
        checkNotNull();
        return NativeObject.wrapPointer(Raw.getUserData(address));
    }

    /**
     * Use this to store application specific shape data.
     */
    public void setUserData(NativeObject value) {
        checkNotNull();
        Raw.setUserData(address, value.getAddress());
    }

    /**
     * The surface material for this shape.
     */
    public b2SurfaceMaterial getMaterial() {
        checkNotNull();
        return b2SurfaceMaterial.wrapPointer(Raw.getMaterial(address));
    }

    /**
     * The surface material for this shape.
     */
    public void setMaterial(b2SurfaceMaterial value) {
        checkNotNull();
        Raw.setMaterial(address, value.getAddress());
    }

    /**
     * The density, usually in kg/m^2.
     * This is not part of the surface material because this is for the interior, which may have
     * other considerations, such as being hollow. For example a wood barrel may be hollow or full of water.
     */
    public float getDensity() {
        checkNotNull();
        return Raw.getDensity(address);
    }

    /**
     * The density, usually in kg/m^2.
     * This is not part of the surface material because this is for the interior, which may have
     * other considerations, such as being hollow. For example a wood barrel may be hollow or full of water.
     */
    public void setDensity(float value) {
        checkNotNull();
        Raw.setDensity(address, value);
    }

    /**
     * Collision filtering data.
     */
    public b2Filter getFilter() {
        checkNotNull();
        return b2Filter.wrapPointer(Raw.getFilter(address));
    }

    /**
     * Collision filtering data.
     */
    public void setFilter(b2Filter value) {
        checkNotNull();
        Raw.setFilter(address, value.getAddress());
    }

    /**
     * A sensor shape generates overlap events but never generates a collision response.
     * Sensors do not have continuous collision. Instead, use a ray or shape cast for those scenarios.
     * Sensors still contribute to the body mass if they have non-zero density.
     * @note Sensor events are disabled by default.
     */
    public boolean getIsSensor() {
        checkNotNull();
        return Raw.getIsSensor(address);
    }

    /**
     * A sensor shape generates overlap events but never generates a collision response.
     * Sensors do not have continuous collision. Instead, use a ray or shape cast for those scenarios.
     * Sensors still contribute to the body mass if they have non-zero density.
     * @note Sensor events are disabled by default.
     */
    public void setIsSensor(boolean value) {
        checkNotNull();
        Raw.setIsSensor(address, value);
    }

    /**
     * Enable sensor events for this shape. This applies to sensors and non-sensors. False by default, even for sensors.
     */
    public boolean getEnableSensorEvents() {
        checkNotNull();
        return Raw.getEnableSensorEvents(address);
    }

    /**
     * Enable sensor events for this shape. This applies to sensors and non-sensors. False by default, even for sensors.
     */
    public void setEnableSensorEvents(boolean value) {
        checkNotNull();
        Raw.setEnableSensorEvents(address, value);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public boolean getEnableContactEvents() {
        checkNotNull();
        return Raw.getEnableContactEvents(address);
    }

    /**
     * Enable contact events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public void setEnableContactEvents(boolean value) {
        checkNotNull();
        Raw.setEnableContactEvents(address, value);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public boolean getEnableHitEvents() {
        checkNotNull();
        return Raw.getEnableHitEvents(address);
    }

    /**
     * Enable hit events for this shape. Only applies to kinematic and dynamic bodies. Ignored for sensors. False by default.
     */
    public void setEnableHitEvents(boolean value) {
        checkNotNull();
        Raw.setEnableHitEvents(address, value);
    }

    /**
     * Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * and must be carefully handled due to threading. Ignored for sensors.
     */
    public boolean getEnablePreSolveEvents() {
        checkNotNull();
        return Raw.getEnablePreSolveEvents(address);
    }

    /**
     * Enable pre-solve contact events for this shape. Only applies to dynamic bodies. These are expensive
     * and must be carefully handled due to threading. Ignored for sensors.
     */
    public void setEnablePreSolveEvents(boolean value) {
        checkNotNull();
        Raw.setEnablePreSolveEvents(address, value);
    }

    /**
     * When shapes are created they will scan the environment for collision the next time step. This can significantly slow down
     * static body creation when there are many static shapes.
     * This is flag is ignored for dynamic and kinematic shapes which always invoke contact creation.
     */
    public boolean getInvokeContactCreation() {
        checkNotNull();
        return Raw.getInvokeContactCreation(address);
    }

    /**
     * When shapes are created they will scan the environment for collision the next time step. This can significantly slow down
     * static body creation when there are many static shapes.
     * This is flag is ignored for dynamic and kinematic shapes which always invoke contact creation.
     */
    public void setInvokeContactCreation(boolean value) {
        checkNotNull();
        Raw.setInvokeContactCreation(address, value);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public boolean getUpdateBodyMass() {
        checkNotNull();
        return Raw.getUpdateBodyMass(address);
    }

    /**
     * Should the body update the mass properties when this shape is created. Default is true.
     */
    public void setUpdateBodyMass(boolean value) {
        checkNotNull();
        Raw.setUpdateBodyMass(address, value);
    }

    public static class Raw {
        public static native void b2ShapeDef_placed(long address);
        public static native long b2ShapeDef();
        public static native void destroy(long address);
        public static native long getUserData(long address);
        public static native void setUserData(long address, long value);
        public static native long getMaterial(long address);
        public static native void setMaterial(long address, long value);
        public static native float getDensity(long address);
        public static native void setDensity(long address, float value);
        public static native long getFilter(long address);
        public static native void setFilter(long address, long value);
        public static native boolean getIsSensor(long address);
        public static native void setIsSensor(long address, boolean value);
        public static native boolean getEnableSensorEvents(long address);
        public static native void setEnableSensorEvents(long address, boolean value);
        public static native boolean getEnableContactEvents(long address);
        public static native void setEnableContactEvents(long address, boolean value);
        public static native boolean getEnableHitEvents(long address);
        public static native void setEnableHitEvents(long address, boolean value);
        public static native boolean getEnablePreSolveEvents(long address);
        public static native void setEnablePreSolveEvents(long address, boolean value);
        public static native boolean getInvokeContactCreation(long address);
        public static native void setInvokeContactCreation(long address, boolean value);
        public static native boolean getUpdateBodyMass(long address);
        public static native void setUpdateBodyMass(long address, boolean value);
    }
}
