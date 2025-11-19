#pragma once

#include <box2d/box2d.h>

class B2_DistanceJoint {
    public:

    /// Create a distance joint
    /// @see b2DistanceJointDef for details
    static inline uint64_t createDistanceJoint(uint64_t worldId, const b2DistanceJointDef *def) {
        return b2StoreJointId(b2CreateDistanceJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultDistanceJointDef(b2DistanceJointDef& result) {
        result = b2DefaultDistanceJointDef();
    }

    /// Set the distance joint length
    static inline void setLength(uint64_t jointId, float length) {
        b2DistanceJoint_SetLength(b2LoadJointId(jointId), length);
    }

    /// Get the distance joint length
    static inline float getLength(uint64_t jointId) {
        return b2DistanceJoint_GetLength(b2LoadJointId(jointId));
    }

    /// Enable/disable the distance joint spring
    static inline void enableSpring(uint64_t jointId, bool enableSpring) {
        b2DistanceJoint_EnableSpring(b2LoadJointId(jointId), enableSpring);
    }

    /// Is the distance joint spring enabled?
    static inline bool isSpringEnabled(uint64_t jointId) {
        return b2DistanceJoint_IsSpringEnabled(b2LoadJointId(jointId));
    }

    /// Set the distance joint spring hertz
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2DistanceJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Set the distance joint spring damping ratio
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2DistanceJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the distance joint spring hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2DistanceJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Get the distance joint spring damping ratio
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2DistanceJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Enable/disable the distance joint limit
    /// The limit only works if the joint spring is enabled. Otherwise the joint is rigid and the limit has no effect.
    static inline void enableLimit(uint64_t jointId, bool enableLimit) {
        b2DistanceJoint_EnableLimit(b2LoadJointId(jointId), enableLimit);
    }

    /// Is the distance joint limit enabled?
    static inline bool isLimitEnabled(uint64_t jointId) {
        return b2DistanceJoint_IsLimitEnabled(b2LoadJointId(jointId));
    }

    /// Set the distance joint length range
    static inline void setLengthRange(uint64_t jointId, float minLength, float maxLength) {
        b2DistanceJoint_SetLengthRange(b2LoadJointId(jointId), minLength, maxLength);
    }

    /// Get the distance joint minimum length
    static inline float getMinLength(uint64_t jointId) {
        return b2DistanceJoint_GetMinLength(b2LoadJointId(jointId));
    }

    /// Get the distance joint maximum length
    static inline float getMaxLength(uint64_t jointId) {
        return b2DistanceJoint_GetMaxLength(b2LoadJointId(jointId));
    }

    /// Get the current distance joint length
    static inline float getCurrentLength(uint64_t jointId) {
        return b2DistanceJoint_GetCurrentLength(b2LoadJointId(jointId));
    }

    /// Enable/disable the distance joint motor
    static inline void enableMotor(uint64_t jointId, bool enableMotor) {
        b2DistanceJoint_EnableMotor(b2LoadJointId(jointId), enableMotor);
    }

    /// Is the distance joint motor enabled?
    static inline bool isMotorEnabled(uint64_t jointId) {
        return b2DistanceJoint_IsMotorEnabled(b2LoadJointId(jointId));
    }

    /// Set the distance joint motor speed
    static inline void setMotorSpeed(uint64_t jointId, float motorSpeed) {
        b2DistanceJoint_SetMotorSpeed(b2LoadJointId(jointId), motorSpeed);
    }

    /// Get the distance joint motor speed
    static inline float getMotorSpeed(uint64_t jointId) {
        return b2DistanceJoint_GetMotorSpeed(b2LoadJointId(jointId));
    }

    /// Set the maximum distance joint motor force
    static inline void setMaxMotorForce(uint64_t jointId, float force) {
        b2DistanceJoint_SetMaxMotorForce(b2LoadJointId(jointId), force);
    }

    /// Get the maximum distance joint motor force
    static inline float getMaxMotorForce(uint64_t jointId) {
        return b2DistanceJoint_GetMaxMotorForce(b2LoadJointId(jointId));
    }

    /// Get the current distance joint motor force
    static inline float getMotorForce(uint64_t jointId) {
        return b2DistanceJoint_GetMotorForce(b2LoadJointId(jointId));
    }
};