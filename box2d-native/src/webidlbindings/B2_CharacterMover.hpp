#pragma once

#include <box2d/box2d.h>

class B2_CharacterMover {
    public:

    /// Solves the position of a mover that satisfies the given collision planes.
    /// @param targetDelta the desired movement from the position used to generate the collision planes
    /// @param planes the collision planes
    /// @param count the number of collision planes
    static inline void solvePlanes(b2Vec2 targetDelta, b2CollisionPlane* planes, int count, b2PlaneSolverResult& result) {
        result = b2SolvePlanes(targetDelta, planes, count);
    }

    /// Clips the velocity against the given collision planes. Planes with zero push or clipVelocity
    /// set to false are skipped.
    static inline void clipVector(b2Vec2 vector, const b2CollisionPlane* planes, int count, b2Vec2& result) {
        result = b2ClipVector(vector, planes, count);
    }
};
