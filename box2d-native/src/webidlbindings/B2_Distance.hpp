#pragma once

#include <box2d/box2d.h>

class B2_Distance {
    public:

    /// Compute the distance between two line segments, clamping at the end points if needed.
    static inline b2SegmentDistanceResult segmentDistance(b2Vec2 p1, b2Vec2 q1, b2Vec2 p2, b2Vec2 q2) {
        return b2SegmentDistance(p1, q1, p2, q2);
    }

    /// Compute the closest points between two shapes represented as point clouds.
    /// b2SimplexCache cache is input/output. On the first call set b2SimplexCache.count to zero.
    /// The underlying GJK algorithm may be debugged by passing in debug simplexes and capacity. You may pass in NULL and 0 for these.
    static inline b2DistanceOutput shapeDistance(const b2DistanceInput* input, b2SimplexCache* cache, b2Simplex* simplexes, int simplexCapacity) {
        return b2ShapeDistance(input, cache, simplexes, simplexCapacity);
    }

    /// Perform a linear shape cast of shape B moving and shape A fixed. Determines the hit point, normal, and translation fraction.
    /// Initially touching shapes are treated as a miss.
    static inline b2CastOutput shapeCast(const b2ShapeCastPairInput* input) {
        return b2ShapeCast(input);
    }

    /// Make a proxy for use in overlap, shape cast, and related functions. This is a deep copy of the points.
    static inline b2ShapeProxy makeProxy(const b2Vec2Array* points, float radius) {
        return b2MakeProxy(points->array, points->length, radius);
    }

    /// Make a proxy with a transform. This is a deep copy of the points.
    static inline b2ShapeProxy makeOffsetProxy(const b2Vec2Array* points, float radius, b2Vec2 position, b2Rot rotation) {
        return b2MakeOffsetProxy(points->array, points->length, radius, position, rotation);
    }

    /// Evaluate the transform sweep at a specific time.
    static inline void getSweepTransform(const b2Sweep* sweep, float time, b2Transform& result) {
        result = b2GetSweepTransform(sweep, time);
    }

    /// Compute the upper bound on time before two shapes penetrate. Time is represented as
    /// a fraction between [0,tMax]. This uses a swept separating axis and may miss some intermediate,
    /// non-tunneling collisions. If you change the time interval, you should call this function
    /// again.
    static inline b2TOIOutput timeOfImpact(const b2TOIInput* input) {
        return b2TimeOfImpact(input);
    }
};
