#pragma once

#include <box2d/box2d.h>

class B2_Geometry {
    public:
    
    /// The maximum number of vertices on a convex polygon.
    static const uint32_t MAX_POLYGON_VERTICES = B2_MAX_POLYGON_VERTICES;

    /// Validate ray cast input data (NaN, etc)
    static inline bool isValidRay(const b2RayCastInput* input) {
        return b2IsValidRay(input); 
    }

    /// Make a convex polygon from a convex hull. This will assert if the hull is not valid.
    /// @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
    static inline void makePolygon(const b2Hull* hull, float radius, b2Polygon& result) {
        result = b2MakePolygon(hull, radius);
    }

    /// Make an offset convex polygon from a convex hull. This will assert if the hull is not valid.
    /// @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
    static inline void makeOffsetPolygon(const b2Hull* hull, b2Vec2 position, b2Rot rotation, b2Polygon& result) {
        result = b2MakeOffsetPolygon(hull, position, rotation);
    }

    /// Make an offset convex polygon from a convex hull. This will assert if the hull is not valid.
    /// @warning Do not manually fill in the hull data, it must come directly from b2ComputeHull
    static inline void makeOffsetRoundedPolygon(const b2Hull* hull, b2Vec2 position, b2Rot rotation, float radius, b2Polygon& result) {
        result = b2MakeOffsetRoundedPolygon(hull, position, rotation, radius);
    }

    /// Make a square polygon, bypassing the need for a convex hull.
    /// @param halfWidth the half-width
    static inline void makeSquare(float halfWidth, b2Polygon& result) {
        result = b2MakeSquare(halfWidth);
    }

    /// Make a box (rectangle) polygon, bypassing the need for a convex hull.
    /// @param halfWidth the half-width (x-axis)
    /// @param halfHeight the half-height (y-axis)
    static inline void makeBox(float halfWidth, float halfHeight, b2Polygon& result) {
        result = b2MakeBox(halfWidth, halfHeight);
    }

    /// Make a rounded box, bypassing the need for a convex hull.
    /// @param halfWidth the half-width (x-axis)
    /// @param halfHeight the half-height (y-axis)
    /// @param radius the radius of the rounded extension
    static inline void makeRoundedBox(float halfWidth, float halfHeight, float radius, b2Polygon& result) {
        result = b2MakeRoundedBox(halfWidth, halfHeight, radius);
    }

    /// Make an offset box, bypassing the need for a convex hull.
    /// @param halfWidth the half-width (x-axis)
    /// @param halfHeight the half-height (y-axis)
    /// @param center the local center of the box
    /// @param rotation the local rotation of the box
    static inline void makeOffsetBox(float halfWidth, float halfHeight, b2Vec2 center, b2Rot rotation, b2Polygon& result) {
        result = b2MakeOffsetBox(halfWidth, halfHeight, center, rotation);
    }

    /// Make an offset rounded box, bypassing the need for a convex hull.
    /// @param halfWidth the half-width (x-axis)
    /// @param halfHeight the half-height (y-axis)
    /// @param center the local center of the box
    /// @param rotation the local rotation of the box
    /// @param radius the radius of the rounded extension
    static inline void makeOffsetRoundedBox(float halfWidth, float halfHeight, b2Vec2 center, b2Rot rotation, float radius, b2Polygon& result) {
        result = b2MakeOffsetRoundedBox(halfWidth, halfHeight, center, rotation, radius);
    }

    /// Transform a polygon. This is useful for transferring a shape from one body to another.
    static inline void transformPolygon(b2Transform transform, const b2Polygon* polygon, b2Polygon& result) {
        result = b2TransformPolygon(transform, polygon);
    }

    /// Compute mass properties of a circle
    static inline b2MassData computeCircleMass(const b2Circle* shape, float density) {
        return b2ComputeCircleMass(shape, density); 
    }

    /// Compute mass properties of a capsule
    static inline b2MassData computeCapsuleMass(const b2Capsule* shape, float density) {
        return b2ComputeCapsuleMass(shape, density); 
    }

    /// Compute mass properties of a polygon
    static inline b2MassData computePolygonMass(const b2Polygon* shape, float density) {
        return b2ComputePolygonMass(shape, density); 
    }

    /// Compute the bounding box of a transformed circle
    static inline b2AABB computeCircleBounds(const b2Circle* shape, b2Transform transform) {
        return b2ComputeCircleBounds(shape, transform);
    }

    /// Compute the bounding box of a transformed capsule
    static inline b2AABB computeCapsuleBounds(const b2Capsule* shape, b2Transform transform) {
        return b2ComputeCapsuleBounds(shape, transform);
    }

    /// Compute the bounding box of a transformed polygon
    static inline b2AABB computePolygonBounds(const b2Polygon* shape, b2Transform transform) {
        return b2ComputePolygonBounds(shape, transform);
    }

    /// Compute the bounding box of a transformed line segment
    static inline b2AABB computeSegmentBounds(const b2Segment* shape, b2Transform transform) {
        return b2ComputeSegmentBounds(shape, transform);
    }

    /// Test a point for overlap with a circle in local space
    static inline bool pointInCircle(const b2Circle* shape, b2Vec2 point) {
        return b2PointInCircle(shape, point);
    }

    /// Test a point for overlap with a capsule in local space
    static inline bool pointInCapsule(const b2Capsule* shape, b2Vec2 point) {
        return b2PointInCapsule(shape, point);
    }

    /// Test a point for overlap with a convex polygon in local space
    static inline bool pointInPolygon(const b2Polygon* shape, b2Vec2 point) {
        return b2PointInPolygon(shape, point);
    }

    /// Ray cast versus circle shape in local space.
    static inline b2CastOutput castRayCircle(const b2Circle* shape, const b2RayCastInput* input) {
        return b2CastRayCircle(shape, input);
    }

    /// Ray cast versus capsule shape in local space.
    static inline b2CastOutput castRayCapsule(const b2Capsule* shape, const b2RayCastInput* input) {
        return b2CastRayCapsule(shape, input);
    }

    /// Ray cast versus segment shape in local space. Optionally treat the segment as one-sided with
    /// hits from the left side being treated as a miss.
    static inline b2CastOutput castRaySegment(const b2Segment* shape, const b2RayCastInput* input, bool oneSided) {
        return b2CastRaySegment(shape, input, oneSided);
    }

    /// Ray cast versus polygon shape in local space.
    static inline b2CastOutput castRayPolygon(const b2Polygon* shape, const b2RayCastInput* input) {
        return b2CastRayPolygon(shape, input);
    }

    /// Shape cast versus a circle.
    static inline b2CastOutput castShapeCircle(const b2Circle* shape, const b2ShapeCastInput* input) {
        return b2CastShapeCircle(shape, input);
    }

    /// Shape cast versus a capsule.
    static inline b2CastOutput castShapeCapsule(const b2Capsule* shape, const b2ShapeCastInput* input) {
        return b2CastShapeCapsule(shape, input);
    }

    /// Shape cast versus a line segment.
    static inline b2CastOutput castShapeSegment(const b2Segment* shape, const b2ShapeCastInput* input) {
        return b2CastShapeSegment(shape, input);
    }

    /// Shape cast versus a convex polygon.
    static inline b2CastOutput castShapePolygon(const b2Polygon* shape, const b2ShapeCastInput* input) {
        return b2CastShapePolygon(shape, input);
    }

    /// Compute the convex hull of a set of points. Returns an empty hull if it fails.
    /// Some failure cases:
    /// - all points very close together
    /// - all points on a line
    /// - less than 3 points
    /// - more than B2_MAX_POLYGON_VERTICES points
    /// This welds close points and removes collinear points.
    /// @warning Do not modify a hull once it has been computed
    static inline void computeHull(const b2Vec2Array* points, b2Hull& result) {
        result = b2ComputeHull(points->array, points->length);
    }

    /// This determines if a hull is valid. Checks for:
    /// - convexity
    /// - collinear points
    /// This is expensive and should not be called at runtime.
    static inline bool validateHull(const b2Hull* hull) {
        return b2ValidateHull(hull); 
    }
};