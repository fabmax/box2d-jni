#pragma once

#include <box2d/box2d.h>

class B2_CharacterMover {
    public:

    /// Solves the position of a mover that satisfies the given collision planes.
    /// @param targetDelta the desired movement from the position used to generate the collision planes
    /// @param planes the collision planes
    static inline b2PlaneSolverResult solvePlanes(b2Vec2 targetDelta, b2CollisionPlaneArray* planes) {
        return b2SolvePlanes(targetDelta, planes->array, planes->length);
    }

    /// Clips the velocity against the given collision planes. Planes with zero push or clipVelocity
    /// set to false are skipped.
    static inline b2Vec2 clipVector(b2Vec2 vector, const b2CollisionPlaneArray* planes) {
        return b2ClipVector(vector, planes->array, planes->length);
    }
};
