package box2d;


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
    public static b2Manifold collideCircles(b2Circle circleA, b2Transform xfA, b2Circle circleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideCircles(circleA.getAddress(), xfA.getAddress(), circleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between a capsule and circle
     */
    public static b2Manifold collideCapsuleAndCircle(b2Capsule capsuleA, b2Transform xfA, b2Circle circleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideCapsuleAndCircle(capsuleA.getAddress(), xfA.getAddress(), circleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between an segment and a circle
     */
    public static b2Manifold collideSegmentAndCircle(b2Segment segmentA, b2Transform xfA, b2Circle circleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideSegmentAndCircle(segmentA.getAddress(), xfA.getAddress(), circleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between a polygon and a circle
     */
    public static b2Manifold collidePolygonAndCircle(b2Polygon polygonA, b2Transform xfA, b2Circle circleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collidePolygonAndCircle(polygonA.getAddress(), xfA.getAddress(), circleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between a capsule and circle
     */
    public static b2Manifold collideCapsules(b2Capsule capsuleA, b2Transform xfA, b2Capsule capsuleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideCapsules(capsuleA.getAddress(), xfA.getAddress(), capsuleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between an segment and a capsule
     */
    public static b2Manifold collideSegmentAndCapsule(b2Segment segmentA, b2Transform xfA, b2Capsule capsuleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideSegmentAndCapsule(segmentA.getAddress(), xfA.getAddress(), capsuleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between a polygon and capsule
     */
    public static b2Manifold collidePolygonAndCapsule(b2Polygon polygonA, b2Transform xfA, b2Capsule capsuleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collidePolygonAndCapsule(polygonA.getAddress(), xfA.getAddress(), capsuleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between two polygons
     */
    public static b2Manifold collidePolygons(b2Polygon polygonA, b2Transform xfA, b2Polygon polygonB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collidePolygons(polygonA.getAddress(), xfA.getAddress(), polygonB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between an segment and a polygon
     */
    public static b2Manifold collideSegmentAndPolygon(b2Segment segmentA, b2Transform xfA, b2Polygon polygonB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideSegmentAndPolygon(segmentA.getAddress(), xfA.getAddress(), polygonB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between a chain segment and a circle
     */
    public static b2Manifold collideChainSegmentAndCircle(b2ChainSegment segmentA, b2Transform xfA, b2Circle circleB, b2Transform xfB) {
        return b2Manifold.wrapPointer(Raw.collideChainSegmentAndCircle(segmentA.getAddress(), xfA.getAddress(), circleB.getAddress(), xfB.getAddress()));
    }

    /**
     * Compute the contact manifold between a chain segment and a capsule
     */
    public static b2Manifold collideChainSegmentAndCapsule(b2ChainSegment segmentA, b2Transform xfA, b2Capsule capsuleB, b2Transform xfB, b2SimplexCache cache) {
        return b2Manifold.wrapPointer(Raw.collideChainSegmentAndCapsule(segmentA.getAddress(), xfA.getAddress(), capsuleB.getAddress(), xfB.getAddress(), cache.getAddress()));
    }

    /**
     * Compute the contact manifold between a chain segment and a rounded polygon
     */
    public static b2Manifold collideChainSegmentAndPolygon(b2ChainSegment segmentA, b2Transform xfA, b2Polygon polygonB, b2Transform xfB, b2SimplexCache cache) {
        return b2Manifold.wrapPointer(Raw.collideChainSegmentAndPolygon(segmentA.getAddress(), xfA.getAddress(), polygonB.getAddress(), xfB.getAddress(), cache.getAddress()));
    }

    public static class Raw {
        public static native long collideCircles(long circleA, long xfA, long circleB, long xfB);
        public static native long collideCapsuleAndCircle(long capsuleA, long xfA, long circleB, long xfB);
        public static native long collideSegmentAndCircle(long segmentA, long xfA, long circleB, long xfB);
        public static native long collidePolygonAndCircle(long polygonA, long xfA, long circleB, long xfB);
        public static native long collideCapsules(long capsuleA, long xfA, long capsuleB, long xfB);
        public static native long collideSegmentAndCapsule(long segmentA, long xfA, long capsuleB, long xfB);
        public static native long collidePolygonAndCapsule(long polygonA, long xfA, long capsuleB, long xfB);
        public static native long collidePolygons(long polygonA, long xfA, long polygonB, long xfB);
        public static native long collideSegmentAndPolygon(long segmentA, long xfA, long polygonB, long xfB);
        public static native long collideChainSegmentAndCircle(long segmentA, long xfA, long circleB, long xfB);
        public static native long collideChainSegmentAndCapsule(long segmentA, long xfA, long capsuleB, long xfB, long cache);
        public static native long collideChainSegmentAndPolygon(long segmentA, long xfA, long polygonB, long xfB, long cache);
    }
}
