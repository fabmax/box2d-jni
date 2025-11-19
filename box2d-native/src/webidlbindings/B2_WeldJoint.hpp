#pragma once

#include <box2d/box2d.h>

class B2_WeldJoint {
    public:

    /// Create a weld joint
    /// @see b2WeldJointDef for details
    static inline uint64_t createWeldJoint(uint64_t worldId, const b2WeldJointDef *def) {
        return b2StoreJointId(b2CreateWeldJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultWeldJointDef(b2WeldJointDef& result) {
        result = b2DefaultWeldJointDef();
    }

    /// Set the weld joint linear hertz
    static inline void setLinearHertz(uint64_t jointId, float hertz) {
        b2WeldJoint_SetLinearHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the weld joint linear hertz
    static inline float getLinearHertz(uint64_t jointId) {
        return b2WeldJoint_GetLinearHertz(b2LoadJointId(jointId));
    }

    /// Set the weld joint linear damping ratio
    static inline void setLinearDampingRatio(uint64_t jointId, float dampingRatio) {
        b2WeldJoint_SetLinearDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the weld joint linear damping ratio
    static inline float getLinearDampingRatio(uint64_t jointId) {
        return b2WeldJoint_GetLinearDampingRatio(b2LoadJointId(jointId));
    }

    /// Set the weld joint angular hertz
    static inline void setAngularHertz(uint64_t jointId, float hertz) {
        b2WeldJoint_SetAngularHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the weld joint angular hertz
    static inline float getAngularHertz(uint64_t jointId) {
        return b2WeldJoint_GetAngularHertz(b2LoadJointId(jointId));
    }

    /// Set the weld joint angular damping ratio
    static inline void setAngularDampingRatio(uint64_t jointId, float dampingRatio) {
        b2WeldJoint_SetAngularDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the weld joint angular damping ratio
    static inline float getAngularDampingRatio(uint64_t jointId) {
        return b2WeldJoint_GetAngularDampingRatio(b2LoadJointId(jointId));
    }
};