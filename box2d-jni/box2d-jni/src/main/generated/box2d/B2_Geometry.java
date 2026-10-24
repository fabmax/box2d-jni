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
    public static b2AABB computeCircleBounds(b2Circle shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computeCircleBounds(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Compute the bounding box of a transformed capsule
     */
    public static b2AABB computeCapsuleBounds(b2Capsule shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computeCapsuleBounds(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Compute the bounding box of a transformed polygon
     */
    public static b2AABB computePolygonBounds(b2Polygon shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computePolygonBounds(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Compute the bounding box of a transformed line segment
     */
    public static b2AABB computeSegmentBounds(b2Segment shape, b2Transform transform) {
        return b2AABB.wrapPointer(Raw.computeSegmentBounds(shape.getAddress(), transform.getAddress()));
    }

    /**
     * Test a point for overlap with a circle in local space
     */
    public static boolean pointInCircle(b2Circle shape, b2Vec2 point) {
        return Raw.pointInCircle(shape.getAddress(), point.getAddress());
    }

    /**
     * Test a point for overlap with a capsule in local space
     */
    public static boolean pointInCapsule(b2Capsule shape, b2Vec2 point) {
        return Raw.pointInCapsule(shape.getAddress(), point.getAddress());
    }

    /**
     * Test a point for overlap with a convex polygon in local space
     */
    public static boolean pointInPolygon(b2Polygon shape, b2Vec2 point) {
        return Raw.pointInPolygon(shape.getAddress(), point.getAddress());
    }

    /**
     * Ray cast versus circle shape in local space.
     */
    public static b2CastOutput castRayCircle(b2Circle shape, b2RayCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castRayCircle(shape.getAddress(), input.getAddress()));
    }

    /**
     * Ray cast versus capsule shape in local space.
     */
    public static b2CastOutput castRayCapsule(b2Capsule shape, b2RayCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castRayCapsule(shape.getAddress(), input.getAddress()));
    }

    /**
     * Ray cast versus segment shape in local space. Optionally treat the segment as one-sided with
     * hits from the left side being treated as a miss.
     */
    public static b2CastOutput castRaySegment(b2Segment shape, b2RayCastInput input, boolean oneSided) {
        return b2CastOutput.wrapPointer(Raw.castRaySegment(shape.getAddress(), input.getAddress(), oneSided));
    }

    /**
     * Ray cast versus polygon shape in local space.
     */
    public static b2CastOutput castRayPolygon(b2Polygon shape, b2RayCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castRayPolygon(shape.getAddress(), input.getAddress()));
    }

    /**
     * Shape cast versus a circle.
     */
    public static b2CastOutput castShapeCircle(b2Circle shape, b2ShapeCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castShapeCircle(shape.getAddress(), input.getAddress()));
    }

    /**
     * Shape cast versus a capsule.
     */
    public static b2CastOutput castShapeCapsule(b2Capsule shape, b2ShapeCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castShapeCapsule(shape.getAddress(), input.getAddress()));
    }

    /**
     * Shape cast versus a line segment.
     */
    public static b2CastOutput castShapeSegment(b2Segment shape, b2ShapeCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castShapeSegment(shape.getAddress(), input.getAddress()));
    }

    /**
     * Shape cast versus a convex polygon.
     */
    public static b2CastOutput castShapePolygon(b2Polygon shape, b2ShapeCastInput input) {
        return b2CastOutput.wrapPointer(Raw.castShapePolygon(shape.getAddress(), input.getAddress()));
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
        public static native long computeCircleBounds(long shape, long transform);
        public static native long computeCapsuleBounds(long shape, long transform);
        public static native long computePolygonBounds(long shape, long transform);
        public static native long computeSegmentBounds(long shape, long transform);
        public static native boolean pointInCircle(long shape, long point);
        public static native boolean pointInCapsule(long shape, long point);
        public static native boolean pointInPolygon(long shape, long point);
        public static native long castRayCircle(long shape, long input);
        public static native long castRayCapsule(long shape, long input);
        public static native long castRaySegment(long shape, long input, boolean oneSided);
        public static native long castRayPolygon(long shape, long input);
        public static native long castShapeCircle(long shape, long input);
        public static native long castShapeCapsule(long shape, long input);
        public static native long castShapeSegment(long shape, long input);
        public static native long castShapePolygon(long shape, long input);
        public static native void computeHull(long points, long result);
        public static native boolean validateHull(long hull);
    }
}
