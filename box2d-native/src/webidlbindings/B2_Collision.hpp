#pragma once

#include <box2d/box2d.h>

/// Each function takes the shapes in their own local frames and the transform of shape B in shape
/// A's frame (b2InvMulWorldTransforms( worldA, worldB )). The manifold is returned in frame A.
class B2_Collision {
    public:

    /// Compute the contact manifold between two circles
    static inline b2LocalManifold collideCircles(const b2Circle* circleA, const b2Circle* circleB, b2Transform xf) {
        return b2CollideCircles(circleA, circleB, xf);
    }

    /// Compute the contact manifold between a capsule and circle
    static inline b2LocalManifold collideCapsuleAndCircle(const b2Capsule* capsuleA, const b2Circle* circleB, b2Transform xf) {
        return b2CollideCapsuleAndCircle(capsuleA, circleB, xf);
    }

    /// Compute the contact manifold between a segment and a circle
    static inline b2LocalManifold collideSegmentAndCircle(const b2Segment* segmentA, const b2Circle* circleB, b2Transform xf) {
        return b2CollideSegmentAndCircle(segmentA, circleB, xf);
    }

    /// Compute the contact manifold between a polygon and a circle
    static inline b2LocalManifold collidePolygonAndCircle(const b2Polygon* polygonA, const b2Circle* circleB, b2Transform xf) {
        return b2CollidePolygonAndCircle(polygonA, circleB, xf);
    }

    /// Compute the contact manifold between two capsules
    static inline b2LocalManifold collideCapsules(const b2Capsule* capsuleA, const b2Capsule* capsuleB, b2Transform xf) {
        return b2CollideCapsules(capsuleA, capsuleB, xf);
    }

    /// Compute the contact manifold between a segment and a capsule
    static inline b2LocalManifold collideSegmentAndCapsule(const b2Segment* segmentA, const b2Capsule* capsuleB, b2Transform xf) {
        return b2CollideSegmentAndCapsule(segmentA, capsuleB, xf);
    }

    /// Compute the contact manifold between a polygon and capsule
    static inline b2LocalManifold collidePolygonAndCapsule(const b2Polygon* polygonA, const b2Capsule* capsuleB, b2Transform xf) {
        return b2CollidePolygonAndCapsule(polygonA, capsuleB, xf);
    }

    /// Compute the contact manifold between two polygons
    static inline b2LocalManifold collidePolygons(const b2Polygon* polygonA, const b2Polygon* polygonB, b2Transform xf) {
        return b2CollidePolygons(polygonA, polygonB, xf);
    }

    /// Compute the contact manifold between a segment and a polygon
    static inline b2LocalManifold collideSegmentAndPolygon(const b2Segment* segmentA, const b2Polygon* polygonB, b2Transform xf) {
        return b2CollideSegmentAndPolygon(segmentA, polygonB, xf);
    }

    /// Compute the contact manifold between a chain segment and a circle
    static inline b2LocalManifold collideChainSegmentAndCircle(const b2ChainSegment* segmentA, const b2Circle* circleB, b2Transform xf) {
        return b2CollideChainSegmentAndCircle(segmentA, circleB, xf);
    }

    /// Compute the contact manifold between a chain segment and a capsule
    static inline b2LocalManifold collideChainSegmentAndCapsule(const b2ChainSegment* segmentA, const b2Capsule* capsuleB, b2Transform xf, b2SimplexCache* cache) {
        return b2CollideChainSegmentAndCapsule(segmentA, capsuleB, xf, cache);
    }

    /// Compute the contact manifold between a chain segment and a rounded polygon
    static inline b2LocalManifold collideChainSegmentAndPolygon(const b2ChainSegment* segmentA, const b2Polygon* polygonB, b2Transform xf, b2SimplexCache* cache) {
        return b2CollideChainSegmentAndPolygon(segmentA, polygonB, xf, cache);
    }
};
