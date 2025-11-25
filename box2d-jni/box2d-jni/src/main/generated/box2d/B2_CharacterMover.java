package box2d;


public class B2_CharacterMover extends NativeObject {

    protected B2_CharacterMover() { }

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static B2_CharacterMover wrapPointer(long address) {
        return address != 0L ? new B2_CharacterMover(address) : null;
    }
    
    public static B2_CharacterMover arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected B2_CharacterMover(long address) {
        super(address);
    }

    // Functions

    /**
     * Solves the position of a mover that satisfies the given collision planes.
     * @param targetDelta the desired movement from the position used to generate the collision planes
     * @param planes the collision planes
     */
    public static b2PlaneSolverResult solvePlanes(b2Vec2 targetDelta, b2CollisionPlaneArray planes) {
        return b2PlaneSolverResult.wrapPointer(Raw.solvePlanes(targetDelta.getAddress(), planes.getAddress()));
    }

    /**
     * Clips the velocity against the given collision planes. Planes with zero push or clipVelocity
     * set to false are skipped.
     */
    public static b2Vec2 clipVector(b2Vec2 vector, b2CollisionPlaneArray planes) {
        return b2Vec2.wrapPointer(Raw.clipVector(vector.getAddress(), planes.getAddress()));
    }

    public static class Raw {
        public static native long solvePlanes(long targetDelta, long planes);
        public static native long clipVector(long vector, long planes);
    }
}
