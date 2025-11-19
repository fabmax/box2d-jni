#pragma once

#include <box2d/box2d.h>

class B2_MouseJoint {
    public:

    /// Create a mouse joint
    /// @see b2MouseJointDef for details
    static inline uint64_t createMouseJoint(uint64_t worldId, const b2MouseJointDef *def) {
        return b2StoreJointId(b2CreateMouseJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultMouseJointDef(b2MouseJointDef& result) {
        result = b2DefaultMouseJointDef();
    }

    /// Set the mouse joint target
    static inline void setTarget(uint64_t jointId, b2Vec2 target) {
        b2MouseJoint_SetTarget(b2LoadJointId(jointId), target);
    }

    /// Get the mouse joint target
    static inline b2Vec2 getTarget(uint64_t jointId) {
        return b2MouseJoint_GetTarget(b2LoadJointId(jointId));
    }

    /// Set the mouse joint spring hertz
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2MouseJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the mouse joint spring hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2MouseJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Set the mouse joint spring damping ratio
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2MouseJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the mouse joint spring damping ratio
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2MouseJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Set the maximum mouse joint force
    static inline void setMaxForce(uint64_t jointId, float maxForce) {
        b2MouseJoint_SetMaxForce(b2LoadJointId(jointId), maxForce);
    }

    /// Get the maximum mouse joint force
    static inline float getMaxForce(uint64_t jointId) {
        return b2MouseJoint_GetMaxForce(b2LoadJointId(jointId));
    }
};