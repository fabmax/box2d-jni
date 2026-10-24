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

    /// Set the rest length of a distance joint
    /// @param jointId The id for a distance joint
    /// @param length The new distance joint length
    static inline void setRestLength(uint64_t jointId, float length) {
        b2DistanceJoint_SetRestLength(b2LoadJointId(jointId), length);
    }

    /// Get the rest length of a distance joint
    static inline float getRestLength(uint64_t jointId) {
        return b2DistanceJoint_GetRestLength(b2LoadJointId(jointId));
    }

    /// Enable/disable the distance joint spring. When disabled the distance joint is rigid.
    static inline void enableSpring(uint64_t jointId, bool enableSpring) {
        b2DistanceJoint_EnableSpring(b2LoadJointId(jointId), enableSpring);
    }

    /// Is the distance joint spring enabled?
    static inline bool isSpringEnabled(uint64_t jointId) {
        return b2DistanceJoint_IsSpringEnabled(b2LoadJointId(jointId));
    }

    /// Set the force range for the spring.
    static inline void setSpringForceRange(uint64_t jointId, float lowerForce, float upperForce) {
        b2DistanceJoint_SetSpringForceRange(b2LoadJointId(jointId), lowerForce, upperForce);
    }

    /// Set the spring stiffness in Hertz
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2DistanceJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Set the spring damping ratio, non-dimensional
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2DistanceJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the spring Hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2DistanceJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Get the spring damping ratio
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2DistanceJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Get the current spring force.
    static inline float getSpringForce(uint64_t jointId) {
        return b2DistanceJoint_GetSpringForce(b2LoadJointId(jointId));
    }

    /// Enable joint limit. The limit only works if the joint spring is enabled. Otherwise the joint is
    /// rigid and the limit has no effect.
    static inline void enableLimit(uint64_t jointId, bool enableLimit) {
        b2DistanceJoint_EnableLimit(b2LoadJointId(jointId), enableLimit);
    }

    /// Is the distance joint limit enabled?
    static inline bool isLimitEnabled(uint64_t jointId) {
        return b2DistanceJoint_IsLimitEnabled(b2LoadJointId(jointId));
    }

    /// Set the minimum and maximum length parameters of a distance joint
    static inline void setLimits(uint64_t jointId, float minLength, float maxLength) {
        b2DistanceJoint_SetLimits(b2LoadJointId(jointId), minLength, maxLength);
    }

    /// Get the distance joint minimum length
    static inline float getLowerLimit(uint64_t jointId) {
        return b2DistanceJoint_GetLowerLimit(b2LoadJointId(jointId));
    }

    /// Get the distance joint maximum length
    static inline float getUpperLimit(uint64_t jointId) {
        return b2DistanceJoint_GetUpperLimit(b2LoadJointId(jointId));
    }

    /// Get the current length of a distance joint
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

    /// Set the distance joint motor speed, usually in meters per second
    static inline void setTargetMotorSpeed(uint64_t jointId, float motorSpeed) {
        b2DistanceJoint_SetTargetMotorSpeed(b2LoadJointId(jointId), motorSpeed);
    }

    /// Get the distance joint motor speed, usually in meters per second
    static inline float getTargetMotorSpeed(uint64_t jointId) {
        return b2DistanceJoint_GetTargetMotorSpeed(b2LoadJointId(jointId));
    }

    /// Set the distance joint maximum motor force, usually in newtons
    static inline void setMaxMotorForce(uint64_t jointId, float force) {
        b2DistanceJoint_SetMaxMotorForce(b2LoadJointId(jointId), force);
    }

    /// Get the distance joint maximum motor force, usually in newtons
    static inline float getMaxMotorForce(uint64_t jointId) {
        return b2DistanceJoint_GetMaxMotorForce(b2LoadJointId(jointId));
    }

    /// Get the distance joint current motor force, usually in newtons
    static inline float getCurrentMotorForce(uint64_t jointId) {
        return b2DistanceJoint_GetCurrentMotorForce(b2LoadJointId(jointId));
    }

    /// Get the lower force of the spring force range.
    static inline float getSpringForceRangeLower(uint64_t jointId) {
        float lowerForce, upperForce;
        b2DistanceJoint_GetSpringForceRange(b2LoadJointId(jointId), &lowerForce, &upperForce);
        return lowerForce;
    }

    /// Get the upper force of the spring force range.
    static inline float getSpringForceRangeUpper(uint64_t jointId) {
        float lowerForce, upperForce;
        b2DistanceJoint_GetSpringForceRange(b2LoadJointId(jointId), &lowerForce, &upperForce);
        return upperForce;
    }
};
