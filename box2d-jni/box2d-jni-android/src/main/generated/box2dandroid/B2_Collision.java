package box2dandroid;


/**
 * Each function takes the shapes in their own local frames and the transform of shape B in shape
 * A's frame (b2InvMulWorldTransforms( worldA, worldB )). The manifold is returned in frame A.
 */
public class B2_Collision extends NativeObject {

    protected B2_Collision() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Collision wrapPointer(long address) {
        return address != 0L ? new B2_Collision(address) : null;
    }
    
    public static B2_Collision arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Collision(long address) {
        super(address);
    }

    // Functions

    /**
     * Compute the contact manifold between two circles
     */
    public static b2LocalManifold collideCircles(b2Circle circleA, b2Circle circleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideCircles(circleA.getAddress(), circleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a capsule and circle
     */
    public static b2LocalManifold collideCapsuleAndCircle(b2Capsule capsuleA, b2Circle circleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideCapsuleAndCircle(capsuleA.getAddress(), circleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a segment and a circle
     */
    public static b2LocalManifold collideSegmentAndCircle(b2Segment segmentA, b2Circle circleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideSegmentAndCircle(segmentA.getAddress(), circleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a polygon and a circle
     */
    public static b2LocalManifold collidePolygonAndCircle(b2Polygon polygonA, b2Circle circleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collidePolygonAndCircle(polygonA.getAddress(), circleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between two capsules
     */
    public static b2LocalManifold collideCapsules(b2Capsule capsuleA, b2Capsule capsuleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideCapsules(capsuleA.getAddress(), capsuleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a segment and a capsule
     */
    public static b2LocalManifold collideSegmentAndCapsule(b2Segment segmentA, b2Capsule capsuleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideSegmentAndCapsule(segmentA.getAddress(), capsuleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a polygon and capsule
     */
    public static b2LocalManifold collidePolygonAndCapsule(b2Polygon polygonA, b2Capsule capsuleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collidePolygonAndCapsule(polygonA.getAddress(), capsuleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between two polygons
     */
    public static b2LocalManifold collidePolygons(b2Polygon polygonA, b2Polygon polygonB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collidePolygons(polygonA.getAddress(), polygonB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a segment and a polygon
     */
    public static b2LocalManifold collideSegmentAndPolygon(b2Segment segmentA, b2Polygon polygonB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideSegmentAndPolygon(segmentA.getAddress(), polygonB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a chain segment and a circle
     */
    public static b2LocalManifold collideChainSegmentAndCircle(b2ChainSegment segmentA, b2Circle circleB, b2Transform xf) {
        return b2LocalManifold.wrapPointer(Raw.collideChainSegmentAndCircle(segmentA.getAddress(), circleB.getAddress(), xf.getAddress()));
    }

    /**
     * Compute the contact manifold between a chain segment and a capsule
     */
    public static b2LocalManifold collideChainSegmentAndCapsule(b2ChainSegment segmentA, b2Capsule capsuleB, b2Transform xf, b2SimplexCache cache) {
        return b2LocalManifold.wrapPointer(Raw.collideChainSegmentAndCapsule(segmentA.getAddress(), capsuleB.getAddress(), xf.getAddress(), cache.getAddress()));
    }

    /**
     * Compute the contact manifold between a chain segment and a rounded polygon
     */
    public static b2LocalManifold collideChainSegmentAndPolygon(b2ChainSegment segmentA, b2Polygon polygonB, b2Transform xf, b2SimplexCache cache) {
        return b2LocalManifold.wrapPointer(Raw.collideChainSegmentAndPolygon(segmentA.getAddress(), polygonB.getAddress(), xf.getAddress(), cache.getAddress()));
    }

    public static class Raw {
        public static native long collideCircles(long circleA, long circleB, long xf);
        public static native long collideCapsuleAndCircle(long capsuleA, long circleB, long xf);
        public static native long collideSegmentAndCircle(long segmentA, long circleB, long xf);
        public static native long collidePolygonAndCircle(long polygonA, long circleB, long xf);
        public static native long collideCapsules(long capsuleA, long capsuleB, long xf);
        public static native long collideSegmentAndCapsule(long segmentA, long capsuleB, long xf);
        public static native long collidePolygonAndCapsule(long polygonA, long capsuleB, long xf);
        public static native long collidePolygons(long polygonA, long polygonB, long xf);
        public static native long collideSegmentAndPolygon(long segmentA, long polygonB, long xf);
        public static native long collideChainSegmentAndCircle(long segmentA, long circleB, long xf);
        public static native long collideChainSegmentAndCapsule(long segmentA, long capsuleB, long xf, long cache);
        public static native long collideChainSegmentAndPolygon(long segmentA, long polygonB, long xf, long cache);
    }
}
