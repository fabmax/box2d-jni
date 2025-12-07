package box2d;


public class B2_Distance extends NativeObject {

    protected B2_Distance() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_Distance wrapPointer(long address) {
        return address != 0L ? new B2_Distance(address) : null;
    }
    
    public static B2_Distance arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_Distance(long address) {
        super(address);
    }

    // Functions

    /**
     * Compute the distance between two line segments, clamping at the end points if needed.
     */
    public static b2SegmentDistanceResult segmentDistance(b2Vec2 p1, b2Vec2 q1, b2Vec2 p2, b2Vec2 q2) {
        return b2SegmentDistanceResult.wrapPointer(Raw.segmentDistance(p1.getAddress(), q1.getAddress(), p2.getAddress(), q2.getAddress()));
    }

    /**
     * Compute the closest points between two shapes represented as point clouds.
     * b2SimplexCache cache is input/output. On the first call set b2SimplexCache.count to zero.
     * The underlying GJK algorithm may be debugged by passing in debug simplexes and capacity. You may pass in NULL and 0 for these.
     */
    public static b2DistanceOutput shapeDistance(b2DistanceInput input, b2SimplexCache cache, b2Simplex simplexes, int simplexCapacity) {
        return b2DistanceOutput.wrapPointer(Raw.shapeDistance(input.getAddress(), cache.getAddress(), simplexes.getAddress(), simplexCapacity));
    }

    /**
     * Perform a linear shape cast of shape B moving and shape A fixed. Determines the hit point, normal, and translation fraction.
     * Initially touching shapes are treated as a miss.
     */
    public static b2CastOutput shapeCast(b2ShapeCastPairInput input) {
        return b2CastOutput.wrapPointer(Raw.shapeCast(input.getAddress()));
    }

    /**
     * Make a proxy for use in overlap, shape cast, and related functions. This is a deep copy of the points.
     */
    public static b2ShapeProxy makeProxy(b2Vec2Array points, float radius) {
        return b2ShapeProxy.wrapPointer(Raw.makeProxy(points.getAddress(), radius));
    }

    /**
     * Make a proxy with a transform. This is a deep copy of the points.
     */
    public static b2ShapeProxy makeOffsetProxy(b2Vec2Array points, float radius, b2Vec2 position, b2Rot rotation) {
        return b2ShapeProxy.wrapPointer(Raw.makeOffsetProxy(points.getAddress(), radius, position.getAddress(), rotation.getAddress()));
    }

    /**
     * Evaluate the transform sweep at a specific time.
     */
    public static void getSweepTransform(b2Sweep sweep, float time, b2Transform result) {
        Raw.getSweepTransform(sweep.getAddress(), time, result.getAddress());
    }

    /**
     * Compute the upper bound on time before two shapes penetrate. Time is represented as
     * a fraction between [0,tMax]. This uses a swept separating axis and may miss some intermediate,
     * non-tunneling collisions. If you change the time interval, you should call this function
     * again.
     */
    public static b2TOIOutput timeOfImpact(b2TOIInput input) {
        return b2TOIOutput.wrapPointer(Raw.timeOfImpact(input.getAddress()));
    }

    public static class Raw {
        public static native long segmentDistance(long p1, long q1, long p2, long q2);
        public static native long shapeDistance(long input, long cache, long simplexes, int simplexCapacity);
        public static native long shapeCast(long input);
        public static native long makeProxy(long points, float radius);
        public static native long makeOffsetProxy(long points, float radius, long position, long rotation);
        public static native void getSweepTransform(long sweep, float time, long result);
        public static native long timeOfImpact(long input);
    }
}
