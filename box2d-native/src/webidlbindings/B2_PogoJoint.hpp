#pragma once

#include <box2d/box2d.h>

class B2_PogoJoint {
    public:

    /// Create a pogo joint
    /// @see b2PogoJointDef for details
    static inline uint64_t createPogoJoint(uint64_t worldId, const b2PogoJointDef *def) {
        return b2StoreJointId(b2CreatePogoJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultPogoJointDef(b2PogoJointDef& result) {
        result = b2DefaultPogoJointDef();
    }

    /// Set the rest length of a pogo joint
    /// @param jointId The id for a pogo joint
    /// @param length The new pogo joint length
    static inline void setRestLength(uint64_t jointId, float length) {
        b2PogoJoint_SetRestLength(b2LoadJointId(jointId), length);
    }

    /// Get the rest length of a pogo joint
    static inline float getRestLength(uint64_t jointId) {
        return b2PogoJoint_GetRestLength(b2LoadJointId(jointId));
    }

    /// Set the spring stiffness in Hertz
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2PogoJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the spring Hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2PogoJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Set the spring damping ratio, non-dimensional
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2PogoJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the spring damping ratio
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2PogoJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Get the current length of the pogo.
    static inline float getCurrentLength(uint64_t jointId) {
        return b2PogoJoint_GetCurrentLength(b2LoadJointId(jointId));
    }

    /// Get the internal pogo velocity.
    static inline float getCurrentSpeed(uint64_t jointId) {
        return b2PogoJoint_GetCurrentSpeed(b2LoadJointId(jointId));
    }

    /// Get the internal pogo impulse.
    static inline float getImpulse(uint64_t jointId) {
        return b2PogoJoint_GetImpulse(b2LoadJointId(jointId));
    }
};
