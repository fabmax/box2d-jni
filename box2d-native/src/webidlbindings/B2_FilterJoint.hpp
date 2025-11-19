#pragma once

#include <box2d/box2d.h>

class B2_FilterJoint {
    public:

    /// Create a filter joint
    /// @see b2FilterJointDef for details
    static inline uint64_t createFilterJoint(uint64_t worldId, const b2FilterJointDef *def) {
        return b2StoreJointId(b2CreateFilterJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultFilterJointDef(b2FilterJointDef& result) {
        result = b2DefaultFilterJointDef();
    }
};