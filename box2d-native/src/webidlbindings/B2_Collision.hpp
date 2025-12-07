#pragma once

#include <box2d/box2d.h>

class B2_Collision {
    public:

    /// Compute the contact manifold between two circles
    static inline b2Manifold collideCircles(const b2Circle* circleA, b2Transform xfA, const b2Circle* circleB, b2Transform xfB) {
        return b2CollideCircles(circleA, xfA, circleB, xfB);
    }

    /// Compute the contact manifold between a capsule and circle
    static inline b2Manifold collideCapsuleAndCircle(const b2Capsule* capsuleA, b2Transform xfA, const b2Circle* circleB, b2Transform xfB) {
        return b2CollideCapsuleAndCircle(capsuleA, xfA, circleB, xfB);
    }

    /// Compute the contact manifold between an segment and a circle
    static inline b2Manifold collideSegmentAndCircle(const b2Segment* segmentA, b2Transform xfA, const b2Circle* circleB, b2Transform xfB) {
        return b2CollideSegmentAndCircle(segmentA, xfA, circleB, xfB);
    }

    /// Compute the contact manifold between a polygon and a circle
    static inline b2Manifold collidePolygonAndCircle(const b2Polygon* polygonA, b2Transform xfA, const b2Circle* circleB, b2Transform xfB) {
        return b2CollidePolygonAndCircle(polygonA, xfA, circleB, xfB);
    }

    /// Compute the contact manifold between a capsule and circle
    static inline b2Manifold collideCapsules(const b2Capsule* capsuleA, b2Transform xfA, const b2Capsule* capsuleB, b2Transform xfB) {
        return b2CollideCapsules(capsuleA, xfA, capsuleB, xfB);
    }

    /// Compute the contact manifold between an segment and a capsule
    static inline b2Manifold collideSegmentAndCapsule(const b2Segment* segmentA, b2Transform xfA, const b2Capsule* capsuleB, b2Transform xfB) {
        return b2CollideSegmentAndCapsule(segmentA, xfA, capsuleB, xfB);
    }

    /// Compute the contact manifold between a polygon and capsule
    static inline b2Manifold collidePolygonAndCapsule(const b2Polygon* polygonA, b2Transform xfA, const b2Capsule* capsuleB, b2Transform xfB) {
        return b2CollidePolygonAndCapsule(polygonA, xfA, capsuleB, xfB);
    }

    /// Compute the contact manifold between two polygons
    static inline b2Manifold collidePolygons(const b2Polygon* polygonA, b2Transform xfA, const b2Polygon* polygonB, b2Transform xfB) {
        return b2CollidePolygons(polygonA, xfA, polygonB, xfB);
    }

    /// Compute the contact manifold between an segment and a polygon
    static inline b2Manifold collideSegmentAndPolygon(const b2Segment* segmentA, b2Transform xfA, const b2Polygon* polygonB, b2Transform xfB) {
        return b2CollideSegmentAndPolygon(segmentA, xfA, polygonB, xfB);
    }

    /// Compute the contact manifold between a chain segment and a circle
    static inline b2Manifold collideChainSegmentAndCircle(const b2ChainSegment* segmentA, b2Transform xfA, const b2Circle* circleB, b2Transform xfB) {
        return b2CollideChainSegmentAndCircle(segmentA, xfA, circleB, xfB);
    }

    /// Compute the contact manifold between a chain segment and a capsule
    static inline b2Manifold collideChainSegmentAndCapsule(const b2ChainSegment* segmentA, b2Transform xfA, const b2Capsule* capsuleB, b2Transform xfB, b2SimplexCache* cache) {
        return b2CollideChainSegmentAndCapsule(segmentA, xfA, capsuleB, xfB, cache);
    }

    /// Compute the contact manifold between a chain segment and a rounded polygon
    static inline b2Manifold collideChainSegmentAndPolygon(const b2ChainSegment* segmentA, b2Transform xfA, const b2Polygon* polygonB, b2Transform xfB, b2SimplexCache* cache) {
        return b2CollideChainSegmentAndPolygon(segmentA, xfA, polygonB, xfB, cache);
    }
};
