package box2dandroid;


/**
 * This struct holds callbacks you can implement to draw a Box2D world.
 * This structure should be zero initialized.
 * @ingroup world
 */
public class b2DebugDraw extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2DebugDraw wrapPointer(long address) {
        return address != 0L ? new b2DebugDraw(address) : null;
    }
    
    public static b2DebugDraw arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2DebugDraw(long address) {
        super(address);
    }

    // Placed Constructors

    /**
     * @param address Pre-allocated memory, where the object is created.
     * @return Stack allocated object of b2DebugDraw
     */
    public static b2DebugDraw createAt(long address) {
        Raw.b2DebugDraw_placed(address);
        b2DebugDraw createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    /**
     * @param <T>       Allocator class, e.g. LWJGL's MemoryStack.
     * @param allocator Object to use for allocation, e.g. an instance of LWJGL's MemoryStack.
     * @param allocate  Method to call on allocator to obtain the target address, e.g. MemoryStack::nmalloc.
     * @return Stack allocated object of b2DebugDraw
     */
    public static <T> b2DebugDraw createAt(T allocator, Allocator<T> allocate) {
        long address = allocate.on(allocator, ALIGNOF, SIZEOF);
        Raw.b2DebugDraw_placed(address);
        b2DebugDraw createdObj = wrapPointer(address);
        createdObj.isExternallyAllocated = true;
        return createdObj;
    }

    // Constructors

    public b2DebugDraw() {
        address = Raw.b2DebugDraw();
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
     * Bounds to use if restricting drawing to a rectangular region
     */
    public b2AABB getDrawingBounds() {
        checkNotNull();
        return b2AABB.wrapPointer(Raw.getDrawingBounds(address));
    }

    /**
     * Bounds to use if restricting drawing to a rectangular region
     */
    public void setDrawingBounds(b2AABB value) {
        checkNotNull();
        Raw.setDrawingBounds(address, value.getAddress());
    }

    /**
     * Option to restrict drawing to a rectangular region. May suffer from unstable depth sorting.
     */
    public boolean getUseDrawingBounds() {
        checkNotNull();
        return Raw.getUseDrawingBounds(address);
    }

    /**
     * Option to restrict drawing to a rectangular region. May suffer from unstable depth sorting.
     */
    public void setUseDrawingBounds(boolean value) {
        checkNotNull();
        Raw.setUseDrawingBounds(address, value);
    }

    /**
     * Option to draw shapes
     */
    public boolean getDrawShapes() {
        checkNotNull();
        return Raw.getDrawShapes(address);
    }

    /**
     * Option to draw shapes
     */
    public void setDrawShapes(boolean value) {
        checkNotNull();
        Raw.setDrawShapes(address, value);
    }

    /**
     * Option to draw joints
     */
    public boolean getDrawJoints() {
        checkNotNull();
        return Raw.getDrawJoints(address);
    }

    /**
     * Option to draw joints
     */
    public void setDrawJoints(boolean value) {
        checkNotNull();
        Raw.setDrawJoints(address, value);
    }

    /**
     * Option to draw additional information for joints
     */
    public boolean getDrawJointExtras() {
        checkNotNull();
        return Raw.getDrawJointExtras(address);
    }

    /**
     * Option to draw additional information for joints
     */
    public void setDrawJointExtras(boolean value) {
        checkNotNull();
        Raw.setDrawJointExtras(address, value);
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public boolean getDrawBounds() {
        checkNotNull();
        return Raw.getDrawBounds(address);
    }

    /**
     * Option to draw the bounding boxes for shapes
     */
    public void setDrawBounds(boolean value) {
        checkNotNull();
        Raw.setDrawBounds(address, value);
    }

    /**
     * Option to draw the mass and center of mass of dynamic bodies
     */
    public boolean getDrawMass() {
        checkNotNull();
        return Raw.getDrawMass(address);
    }

    /**
     * Option to draw the mass and center of mass of dynamic bodies
     */
    public void setDrawMass(boolean value) {
        checkNotNull();
        Raw.setDrawMass(address, value);
    }

    /**
     * Option to draw body names
     */
    public boolean getDrawBodyNames() {
        checkNotNull();
        return Raw.getDrawBodyNames(address);
    }

    /**
     * Option to draw body names
     */
    public void setDrawBodyNames(boolean value) {
        checkNotNull();
        Raw.setDrawBodyNames(address, value);
    }

    /**
     * Option to draw contact points
     */
    public boolean getDrawContacts() {
        checkNotNull();
        return Raw.getDrawContacts(address);
    }

    /**
     * Option to draw contact points
     */
    public void setDrawContacts(boolean value) {
        checkNotNull();
        Raw.setDrawContacts(address, value);
    }

    /**
     * Option to visualize the graph coloring used for contacts and joints
     */
    public boolean getDrawGraphColors() {
        checkNotNull();
        return Raw.getDrawGraphColors(address);
    }

    /**
     * Option to visualize the graph coloring used for contacts and joints
     */
    public void setDrawGraphColors(boolean value) {
        checkNotNull();
        Raw.setDrawGraphColors(address, value);
    }

    /**
     * Option to draw contact normals
     */
    public boolean getDrawContactNormals() {
        checkNotNull();
        return Raw.getDrawContactNormals(address);
    }

    /**
     * Option to draw contact normals
     */
    public void setDrawContactNormals(boolean value) {
        checkNotNull();
        Raw.setDrawContactNormals(address, value);
    }

    /**
     * Option to draw contact normal impulses
     */
    public boolean getDrawContactImpulses() {
        checkNotNull();
        return Raw.getDrawContactImpulses(address);
    }

    /**
     * Option to draw contact normal impulses
     */
    public void setDrawContactImpulses(boolean value) {
        checkNotNull();
        Raw.setDrawContactImpulses(address, value);
    }

    /**
     * Option to draw contact feature ids
     */
    public boolean getDrawContactFeatures() {
        checkNotNull();
        return Raw.getDrawContactFeatures(address);
    }

    /**
     * Option to draw contact feature ids
     */
    public void setDrawContactFeatures(boolean value) {
        checkNotNull();
        Raw.setDrawContactFeatures(address, value);
    }

    /**
     * Option to draw contact friction impulses
     */
    public boolean getDrawFrictionImpulses() {
        checkNotNull();
        return Raw.getDrawFrictionImpulses(address);
    }

    /**
     * Option to draw contact friction impulses
     */
    public void setDrawFrictionImpulses(boolean value) {
        checkNotNull();
        Raw.setDrawFrictionImpulses(address, value);
    }

    /**
     * Option to draw islands as bounding boxes
     */
    public boolean getDrawIslands() {
        checkNotNull();
        return Raw.getDrawIslands(address);
    }

    /**
     * Option to draw islands as bounding boxes
     */
    public void setDrawIslands(boolean value) {
        checkNotNull();
        Raw.setDrawIslands(address, value);
    }

    public static class Raw {
        public static native void b2DebugDraw_placed(long address);
        public static native long b2DebugDraw();
        public static native void destroy(long address);
        public static native long getDrawingBounds(long address);
        public static native void setDrawingBounds(long address, long value);
        public static native boolean getUseDrawingBounds(long address);
        public static native void setUseDrawingBounds(long address, boolean value);
        public static native boolean getDrawShapes(long address);
        public static native void setDrawShapes(long address, boolean value);
        public static native boolean getDrawJoints(long address);
        public static native void setDrawJoints(long address, boolean value);
        public static native boolean getDrawJointExtras(long address);
        public static native void setDrawJointExtras(long address, boolean value);
        public static native boolean getDrawBounds(long address);
        public static native void setDrawBounds(long address, boolean value);
        public static native boolean getDrawMass(long address);
        public static native void setDrawMass(long address, boolean value);
        public static native boolean getDrawBodyNames(long address);
        public static native void setDrawBodyNames(long address, boolean value);
        public static native boolean getDrawContacts(long address);
        public static native void setDrawContacts(long address, boolean value);
        public static native boolean getDrawGraphColors(long address);
        public static native void setDrawGraphColors(long address, boolean value);
        public static native boolean getDrawContactNormals(long address);
        public static native void setDrawContactNormals(long address, boolean value);
        public static native boolean getDrawContactImpulses(long address);
        public static native void setDrawContactImpulses(long address, boolean value);
        public static native boolean getDrawContactFeatures(long address);
        public static native void setDrawContactFeatures(long address, boolean value);
        public static native boolean getDrawFrictionImpulses(long address);
        public static native void setDrawFrictionImpulses(long address, boolean value);
        public static native boolean getDrawIslands(long address);
        public static native void setDrawIslands(long address, boolean value);
    }
}
