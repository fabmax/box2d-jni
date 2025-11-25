package box2d;


public class B2_Geometry extends NativeObject {

    protected B2_Geometry() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Geometry wrapPointer(long address) {
        return address != 0L ? new B2_Geometry(address) : null;
    }
    
    public static B2_Geometry arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Geometry(long address) {
        super(address);
    }

    // Attributes

    /**
     * @return WebIDL type: unsigned long
     */
    public static int getMAX_POLYGON_VERTICES() {
        return Raw.getMAX_POLYGON_VERTICES();
    }

    // Functions

    /**
     * Validate ray cast input data (NaN, etc)
     */
    public static boolean isValidRay(b2RayCastInput input) {
        return Raw.isValidRay(input.getAddress());
    }

    /**
     * Make a convex polygon from a convex hull. This will assert if the hull is not valid.
     * @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
     */
    public static void makePolygon(b2Hull hull, float radius, b2Polygon result) {
        Raw.makePolygon(hull.getAddress(), radius, result.getAddress());
    }

    /**
     * Make an offset convex polygon from a convex hull. This will assert if the hull is not valid.
     * @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
     */
    public static void makeOffsetPolygon(b2Hull hull, b2Vec2 position, b2Rot rotation, b2Polygon result) {
        Raw.makeOffsetPolygon(hull.getAddress(), position.getAddress(), rotation.getAddress(), result.getAddress());
    }

    /**
     * Make an offset convex polygon from a convex hull. This will assert if the hull is not valid.
     * @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
     */
    public static void makeOffsetRoundedPolygon(b2Hull hull, b2Vec2 position, b2Rot rotation, float radius, b2Polygon result) {
        Raw.makeOffsetRoundedPolygon(hull.getAddress(), position.getAddress(), rotation.getAddress(), radius, result.getAddress());
    }

    /**
     * Make a square polygon, bypassing the need for a convex hull.
     * @param halfWidth the half-width
     */
    public static void makeSquare(float halfWidth, b2Polygon result) {
        Raw.makeSquare(halfWidth, result.getAddress());
    }

    /**
     * Make a box (rectangle) polygon, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     */
    public static void makeBox(float halfWidth, float halfHeight, b2Polygon result) {
        Raw.makeBox(halfWidth, halfHeight, result.getAddress());
    }

    /**
     * Make a rounded box, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     * @param radius the radius of the rounded extension
     */
    public static void makeRoundedBox(float halfWidth, float halfHeight, float radius, b2Polygon result) {
        Raw.makeRoundedBox(halfWidth, halfHeight, radius, result.getAddress());
    }

    /**
     * Make an offset box, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     * @param center the local center of the box
     * @param rotation the local rotation of the box
     */
    public static void makeOffsetBox(float halfWidth, float halfHeight, b2Vec2 center, b2Rot rotation, b2Polygon result) {
        Raw.makeOffsetBox(halfWidth, halfHeight, center.getAddress(), rotation.getAddress(), result.getAddress());
    }

    /**
     * Make an offset rounded box, bypassing the need for a convex hull.
     * @param halfWidth the half-width (x-axis)
     * @param halfHeight the half-height (y-axis)
     * @param center the local center of the box
     * @param rotation the local rotation of the box
     * @param radius the radius of the rounded extension
     */
    public static void makeOffsetRoundedBox(float halfWidth, float halfHeight, b2Vec2 center, b2Rot rotation, float radius, b2Polygon result) {
        Raw.makeOffsetRoundedBox(halfWidth, halfHeight, center.getAddress(), rotation.getAddress(), radius, result.getAddress());
    }

    /**
     * Transform a polygon. This is useful for transferring a shape from one body to another.
     */
    public static void transformPolygon(b2Transform transform, b2Polygon polygon, b2Polygon result) {
        Raw.transformPolygon(transform.getAddress(), polygon.getAddress(), result.getAddress());
    }

    /**
     * Compute mass properties of a circle
     */
    public static b2MassData computeCircleMass(b2Circle shape, float density) {
        return b2MassData.wrapPointer(Raw.computeCircleMass(shape.getAddress(), density));
    }

    /**
     * Compute mass properties of a capsule
     */
    public static b2MassData computeCapsuleMass(b2Capsule shape, float density) {
        return b2MassData.wrapPointer(Raw.computeCapsuleMass(shape.getAddress(), density));
    }

    /**
     * Compute mass properties of a polygon
     */
    public static b2MassData computePolygonMass(b2Polygon shape, float density) {
        return b2MassData.wrapPointer(Raw.computePolygonMass(shape.getAddress(), density));
    }

    /**
     * Compute the bounding box of a transformed circle
     */
    public static b2AABB computeCircleAABB(b2Circle shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computeCircleAABB(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Compute the bounding box of a transformed capsule
     */
    public static b2AABB computeCapsuleAABB(b2Capsule shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computeCapsuleAABB(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Compute the bounding box of a transformed polygon
     */
    public static b2AABB computePolygonAABB(b2Polygon shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computePolygonAABB(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Compute the bounding box of a transformed line segment
     */
    public static b2AABB computeSegmentAABB(b2Segment shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computeSegmentAABB(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Test a point for overlap with a circle in local space
     */
    public static boolean pointInCircle(b2Vec2 point, b2Circle shape) {
        return Raw.pointInCircle(point.getAddress(), shape.getAddress());
    }

    /**
     * Test a point for overlap with a capsule in local space
     */
    public static boolean pointInCapsule(b2Vec2 point, b2Capsule shape) {
        return Raw.pointInCapsule(point.getAddress(), shape.getAddress());
    }

    /**
     * Test a point for overlap with a convex polygon in local space
     */
    public static boolean pointInPolygon(b2Vec2 point, b2Polygon shape) {
        return Raw.pointInPolygon(point.getAddress(), shape.getAddress());
    }

    /**
     * Ray cast versus circle shape in local space. Initial overlap is treated as a miss.
     */
    public static b2CastOutput rayCastCircle(b2RayCastInput input, b2Circle shape) {
        return b2CastOutput.wrapPointer(Raw.rayCastCircle(input.getAddress(), shape.getAddress()));
    }

    /**
     * Ray cast versus capsule shape in local space. Initial overlap is treated as a miss.
     */
    public static b2CastOutput rayCastCapsule(b2RayCastInput input, b2Capsule shape) {
        return b2CastOutput.wrapPointer(Raw.rayCastCapsule(input.getAddress(), shape.getAddress()));
    }

    /**
     * Ray cast versus segment shape in local space. Optionally treat the segment as one-sided with hits from
     * the left side being treated as a miss.
     */
    public static b2CastOutput rayCastSegment(b2RayCastInput input, b2Segment shape, boolean oneSided) {
        return b2CastOutput.wrapPointer(Raw.rayCastSegment(input.getAddress(), shape.getAddress(), oneSided));
    }

    /**
     * Ray cast versus polygon shape in local space. Initial overlap is treated as a miss.
     */
    public static b2CastOutput rayCastPolygon(b2RayCastInput input, b2Polygon shape) {
        return b2CastOutput.wrapPointer(Raw.rayCastPolygon(input.getAddress(), shape.getAddress()));
    }

    /**
     * Shape cast versus a circle. Initial overlap is treated as a miss.
     */
    public static b2CastOutput shapeCastCircle(b2ShapeCastInput input, b2Circle shape) {
        return b2CastOutput.wrapPointer(Raw.shapeCastCircle(input.getAddress(), shape.getAddress()));
    }

    /**
     * Shape cast versus a capsule. Initial overlap is treated as a miss.
     */
    public static b2CastOutput shapeCastCapsule(b2ShapeCastInput input, b2Capsule shape) {
        return b2CastOutput.wrapPointer(Raw.shapeCastCapsule(input.getAddress(), shape.getAddress()));
    }

    /**
     * Shape cast versus a line segment. Initial overlap is treated as a miss.
     */
    public static b2CastOutput shapeCastSegment(b2ShapeCastInput input, b2Segment shape) {
        return b2CastOutput.wrapPointer(Raw.shapeCastSegment(input.getAddress(), shape.getAddress()));
    }

    /**
     * Shape cast versus a convex polygon. Initial overlap is treated as a miss.
     */
    public static b2CastOutput shapeCastPolygon(b2ShapeCastInput input, b2Polygon shape) {
        return b2CastOutput.wrapPointer(Raw.shapeCastPolygon(input.getAddress(), shape.getAddress()));
    }

    /**
     * Compute the convex hull of a set of points. Returns an empty hull if it fails.
     * Some failure cases:
     * - all points very close together
     * - all points on a line
     * - less than 3 points
     * - more than B2_MAX_POLYGON_VERTICES points
     * This welds close points and removes collinear points.
     * @warning Do not modify a hull once it has been computed
     */
    public static void computeHull(b2Vec2Array points, b2Hull result) {
        Raw.computeHull(points.getAddress(), result.getAddress());
    }

    /**
     * This determines if a hull is valid. Checks for:
     * - convexity
     * - collinear points
     * This is expensive and should not be called at runtime.
     */
    public static boolean validateHull(b2Hull hull) {
        return Raw.validateHull(hull.getAddress());
    }

    public static class Raw {
        public static native int getMAX_POLYGON_VERTICES();
        public static native boolean isValidRay(long input);
        public static native void makePolygon(long hull, float radius, long result);
        public static native void makeOffsetPolygon(long hull, long position, long rotation, long result);
        public static native void makeOffsetRoundedPolygon(long hull, long position, long rotation, float radius, long result);
        public static native void makeSquare(float halfWidth, long result);
        public static native void makeBox(float halfWidth, float halfHeight, long result);
        public static native void makeRoundedBox(float halfWidth, float halfHeight, float radius, long result);
        public static native void makeOffsetBox(float halfWidth, float halfHeight, long center, long rotation, long result);
        public static native void makeOffsetRoundedBox(float halfWidth, float halfHeight, long center, long rotation, float radius, long result);
        public static native void transformPolygon(long transform, long polygon, long result);
        public static native long computeCircleMass(long shape, float density);
        public static native long computeCapsuleMass(long shape, float density);
        public static native long computePolygonMass(long shape, float density);
        public static native long computeCircleAABB(long shape, long transform);
        public static native long computeCapsuleAABB(long shape, long transform);
        public static native long computePolygonAABB(long shape, long transform);
        public static native long computeSegmentAABB(long shape, long transform);
        public static native boolean pointInCircle(long point, long shape);
        public static native boolean pointInCapsule(long point, long shape);
        public static native boolean pointInPolygon(long point, long shape);
        public static native long rayCastCircle(long input, long shape);
        public static native long rayCastCapsule(long input, long shape);
        public static native long rayCastSegment(long input, long shape, boolean oneSided);
        public static native long rayCastPolygon(long input, long shape);
        public static native long shapeCastCircle(long input, long shape);
        public static native long shapeCastCapsule(long input, long shape);
        public static native long shapeCastSegment(long input, long shape);
        public static native long shapeCastPolygon(long input, long shape);
        public static native void computeHull(long points, long result);
        public static native boolean validateHull(long hull);
    }
}
