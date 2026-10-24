#pragma once

#include <box2d/box2d.h>

class B2_WheelJoint {
    public:

    /// Create a wheel joint
    /// @see b2WheelJointDef for details
    static inline uint64_t createWheelJoint(uint64_t worldId, const b2WheelJointDef *def) {
        return b2StoreJointId(b2CreateWheelJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultWheelJointDef(b2WheelJointDef& result) {
        result = b2DefaultWheelJointDef();
    }

    /// Enable/disable the wheel joint spring
    static inline void enableSpring(uint64_t jointId, bool enableSpring) {
        b2WheelJoint_EnableSpring(b2LoadJointId(jointId), enableSpring);
    }

    /// Is the wheel joint spring enabled?
    static inline bool isSpringEnabled(uint64_t jointId) {
        return b2WheelJoint_IsSpringEnabled(b2LoadJointId(jointId));
    }

    /// Set the wheel joint stiffness in Hertz
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2WheelJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the wheel joint stiffness in Hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2WheelJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Set the wheel joint damping ratio, non-dimensional
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2WheelJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the wheel joint damping ratio, non-dimensional
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2WheelJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Enable/disable the wheel joint limit
    static inline void enableLimit(uint64_t jointId, bool enableLimit) {
        b2WheelJoint_EnableLimit(b2LoadJointId(jointId), enableLimit);
    }

    /// Is the wheel joint limit enabled?
    static inline bool isLimitEnabled(uint64_t jointId) {
        return b2WheelJoint_IsLimitEnabled(b2LoadJointId(jointId));
    }

    /// Get the wheel joint lower limit
    static inline float getLowerLimit(uint64_t jointId) {
        return b2WheelJoint_GetLowerLimit(b2LoadJointId(jointId));
    }

    /// Get the wheel joint upper limit
    static inline float getUpperLimit(uint64_t jointId) {
        return b2WheelJoint_GetUpperLimit(b2LoadJointId(jointId));
    }

    /// Set the wheel joint limits
    static inline void setLimits(uint64_t jointId, float lower, float upper) {
        b2WheelJoint_SetLimits(b2LoadJointId(jointId), lower, upper);
    }

    /// Enable/disable the wheel joint motor
    static inline void enableMotor(uint64_t jointId, bool enableMotor) {
        b2WheelJoint_EnableMotor(b2LoadJointId(jointId), enableMotor);
    }

    /// Is the wheel joint motor enabled?
    static inline bool isMotorEnabled(uint64_t jointId) {
        return b2WheelJoint_IsMotorEnabled(b2LoadJointId(jointId));
    }

    /// Set the wheel joint motor speed in radians per second
    static inline void setTargetMotorSpeed(uint64_t jointId, float motorSpeed) {
        b2WheelJoint_SetTargetMotorSpeed(b2LoadJointId(jointId), motorSpeed);
    }

    /// Get the wheel joint motor speed in radians per second
    static inline float getTargetMotorSpeed(uint64_t jointId) {
        return b2WheelJoint_GetTargetMotorSpeed(b2LoadJointId(jointId));
    }

    /// Set the wheel joint maximum motor torque, usually in newton-meters
    static inline void setMaxMotorTorque(uint64_t jointId, float torque) {
        b2WheelJoint_SetMaxMotorTorque(b2LoadJointId(jointId), torque);
    }

    /// Get the wheel joint maximum motor torque, usually in newton-meters
    static inline float getMaxMotorTorque(uint64_t jointId) {
        return b2WheelJoint_GetMaxMotorTorque(b2LoadJointId(jointId));
    }

    /// Get the wheel joint current motor torque, usually in newton-meters
    static inline float getCurrentMotorTorque(uint64_t jointId) {
        return b2WheelJoint_GetCurrentMotorTorque(b2LoadJointId(jointId));
    }
};
