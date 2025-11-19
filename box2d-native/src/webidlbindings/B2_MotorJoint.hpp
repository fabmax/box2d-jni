#pragma once

#include <box2d/box2d.h>

class B2_MotorJoint {
    public:

    /// Create a motor joint
    /// @see b2MotorJointDef for details
    static inline uint64_t createMotorJoint(uint64_t worldId, const b2MotorJointDef *def) {
        return b2StoreJointId(b2CreateMotorJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultMotorJointDef(b2MotorJointDef& result) {
        result = b2DefaultMotorJointDef();
    }

    /// Set the motor joint linear offset
    static inline void setLinearOffset(uint64_t jointId, b2Vec2 linearOffset) {
        b2MotorJoint_SetLinearOffset(b2LoadJointId(jointId), linearOffset);
    }

    /// Get the motor joint linear offset
    static inline b2Vec2 getLinearOffset(uint64_t jointId) {
        return b2MotorJoint_GetLinearOffset(b2LoadJointId(jointId));
    }

    /// Set the motor joint angular offset
    static inline void setAngularOffset(uint64_t jointId, float angularOffset) {
        b2MotorJoint_SetAngularOffset(b2LoadJointId(jointId), angularOffset);
    }

    /// Get the motor joint angular offset
    static inline float getAngularOffset(uint64_t jointId) {
        return b2MotorJoint_GetAngularOffset(b2LoadJointId(jointId));
    }

    /// Set the maximum motor joint force
    static inline void setMaxForce(uint64_t jointId, float maxForce) {
        b2MotorJoint_SetMaxForce(b2LoadJointId(jointId), maxForce);
    }

    /// Get the maximum motor joint force
    static inline float getMaxForce(uint64_t jointId) {
        return b2MotorJoint_GetMaxForce(b2LoadJointId(jointId));
    }

    /// Set the maximum motor joint torque
    static inline void setMaxTorque(uint64_t jointId, float maxTorque) {
        b2MotorJoint_SetMaxTorque(b2LoadJointId(jointId), maxTorque);
    }

    /// Get the maximum motor joint torque
    static inline float getMaxTorque(uint64_t jointId) {
        return b2MotorJoint_GetMaxTorque(b2LoadJointId(jointId));
    }

    /// Set the motor joint correction factor
    static inline void setCorrectionFactor(uint64_t jointId, float correctionFactor) {
        b2MotorJoint_SetCorrectionFactor(b2LoadJointId(jointId), correctionFactor);
    }

    /// Get the motor joint correction factor
    static inline float getCorrectionFactor(uint64_t jointId) {
        return b2MotorJoint_GetCorrectionFactor(b2LoadJointId(jointId));
    }
};