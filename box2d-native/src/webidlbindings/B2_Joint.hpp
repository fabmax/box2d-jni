#pragma once

#include <box2d/box2d.h>

/// Joints allow you to connect rigid bodies together while allowing various forms of relative motions.
class B2_Joint {
    public:

    /// Destroy a joint
    static inline void destroyJoint(uint64_t jointId) {
        b2DestroyJoint(b2LoadJointId(jointId));
    }

    /// Joint identifier validation. Provides validation for up to 64K allocations.
    static inline bool isValid(uint64_t jointId) {
        return b2Joint_IsValid(b2LoadJointId(jointId));
    }

    /// Get the joint type
    static inline b2JointType getType(uint64_t jointId) {
        return b2Joint_GetType(b2LoadJointId(jointId));
    }

    /// Get body A id on a joint
    static inline uint64_t getBodyA(uint64_t jointId) {
        return b2StoreBodyId(b2Joint_GetBodyA(b2LoadJointId(jointId)));
    }

    /// Get body B id on a joint
    static inline uint64_t getBodyB(uint64_t jointId) {
        return b2StoreBodyId(b2Joint_GetBodyB(b2LoadJointId(jointId)));
    }

    /// Get the world that owns this joint
    static inline uint32_t getWorld(uint64_t jointId) {
        return b2StoreWorldId(b2Joint_GetWorld(b2LoadJointId(jointId)));
    }

    /// Get the local anchor on bodyA
    static inline b2Vec2 getLocalAnchorA(uint64_t jointId) {
        return b2Joint_GetLocalAnchorA(b2LoadJointId(jointId));
    }

    /// Get the local anchor on bodyB
    static inline b2Vec2 getLocalAnchorB(uint64_t jointId) {
        return b2Joint_GetLocalAnchorB(b2LoadJointId(jointId));
    }

    /// Set the local anchor on bodyA
    static inline void setLocalAnchorA(uint64_t jointId, b2Vec2 localAnchor) {
        b2Joint_SetLocalAnchorA(b2LoadJointId(jointId), localAnchor);
    }

    /// Set the local anchor on bodyB
    static inline void setLocalAnchorB(uint64_t jointId, b2Vec2 localAnchor) {
        b2Joint_SetLocalAnchorB(b2LoadJointId(jointId), localAnchor);
    }

    /// Get the reference angle for this joint (in radians)
    static inline float getReferenceAngle(uint64_t jointId) {
        return b2Joint_GetReferenceAngle(b2LoadJointId(jointId));
    }

    /// Set the reference angle for this joint (in radians)
    static inline void setReferenceAngle(uint64_t jointId, float angleInRadians) {
        b2Joint_SetReferenceAngle(b2LoadJointId(jointId), angleInRadians);
    }

    /// Set the local axis on bodyA
    static inline void setLocalAxisA(uint64_t jointId, b2Vec2 localAxis) {
        b2Joint_SetLocalAxisA(b2LoadJointId(jointId), localAxis);
    }

    /// Get the local axis on bodyA
    static inline b2Vec2 getLocalAxisA(uint64_t jointId) {
        return b2Joint_GetLocalAxisA(b2LoadJointId(jointId));
    }

    /// Toggle collision between connected bodies
    static inline void setCollideConnected(uint64_t jointId, bool shouldCollide) {
        b2Joint_SetCollideConnected(b2LoadJointId(jointId), shouldCollide);
    }

    /// Is collision allowed between connected bodies?
    static inline bool getCollideConnected(uint64_t jointId) {
        return b2Joint_GetCollideConnected(b2LoadJointId(jointId));
    }

    /// Set the user data on a joint
    static inline void setUserData(uint64_t jointId, void* userData) {
        b2Joint_SetUserData(b2LoadJointId(jointId), userData);
    }

    /// Get the user data on a joint
    static inline void* getUserData(uint64_t jointId) {
        return b2Joint_GetUserData(b2LoadJointId(jointId));
    }

    /// Wake the bodies connect to this joint
    static inline void wakeBodies(uint64_t jointId) {
        b2Joint_WakeBodies(b2LoadJointId(jointId));
    }

    /// Get the current constraint force for this joint. Usually in Newtons.
    static inline b2Vec2 getConstraintForce(uint64_t jointId) {
        return b2Joint_GetConstraintForce(b2LoadJointId(jointId));
    }

    /// Get the current constraint torque for this joint. Usually in Newton * meters.
    static inline float getConstraintTorque(uint64_t jointId) {
        return b2Joint_GetConstraintTorque(b2LoadJointId(jointId));
    }

    /// Get the linear separation between anchor points for this joint
    static inline float getLinearSeparation(uint64_t jointId) {
        return b2Joint_GetLinearSeparation(b2LoadJointId(jointId));
    }

    /// Get the angular separation for this joint
    static inline float getAngularSeparation(uint64_t jointId) {
        return b2Joint_GetAngularSeparation(b2LoadJointId(jointId));
    }

    /// Get the constraint tuning hertz parameter for this joint
    static inline float getConstraintTuningHertz(uint64_t jointId) {
        float hertz, dampingRatio;
        b2Joint_GetConstraintTuning(b2LoadJointId(jointId), &hertz, &dampingRatio);
        return hertz;
    }

    /// Get the constraint tuning damping ratio parameter for this joint
    static inline float getConstraintTuningDampingRatio(uint64_t jointId) {
        float hertz, dampingRatio;
        b2Joint_GetConstraintTuning(b2LoadJointId(jointId), &hertz, &dampingRatio);
        return dampingRatio;
    }

    /// Set the joint constraint tuning. Advanced feature.
    /// @param jointId the joint
    /// @param hertz the stiffness in Hertz (cycles per second)
    /// @param dampingRatio the non-dimensional damping ratio (one for critical damping)
    static inline void setConstraintTuning(uint64_t jointId, float hertz, float dampingRatio) {
        b2Joint_SetConstraintTuning(b2LoadJointId(jointId), hertz, dampingRatio);
    }
};
