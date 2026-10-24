#pragma once

#include <box2d/box2d.h>

class B2_MoverJoint {
    public:

    /// Create a mover joint
    /// @see b2MoverJointDef for details
    static inline uint64_t createMoverJoint(uint64_t worldId, const b2MoverJointDef *def) {
        return b2StoreJointId(b2CreateMoverJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultMoverJointDef(b2MoverJointDef& result) {
        result = b2DefaultMoverJointDef();
    }

    /// Set the desired relative linear velocity in meters per second
    static inline void setLinearVelocity(uint64_t jointId, b2Vec2 velocity) {
        b2MoverJoint_SetLinearVelocity(b2LoadJointId(jointId), velocity);
    }

    /// Get the desired relative linear velocity in meters per second
    static inline b2Vec2 getLinearVelocity(uint64_t jointId) {
        return b2MoverJoint_GetLinearVelocity(b2LoadJointId(jointId));
    }

    /// Set the joint maximum force, usually in newtons
    static inline void setMaxVelocityForce(uint64_t jointId, b2Vec2 maxForce) {
        b2MoverJoint_SetMaxVelocityForce(b2LoadJointId(jointId), maxForce);
    }

    /// Get the joint maximum force, usually in newtons
    static inline b2Vec2 getMaxVelocityForce(uint64_t jointId) {
        return b2MoverJoint_GetMaxVelocityForce(b2LoadJointId(jointId));
    }
};
