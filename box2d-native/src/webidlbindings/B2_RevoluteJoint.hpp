#pragma once

#include <box2d/box2d.h>

class B2_RevoluteJoint {
    public:

    /// Create a revolute joint
    /// @see b2RevoluteJointDef for details
    static inline uint64_t createRevoluteJoint(uint64_t worldId, const b2RevoluteJointDef *def) {
        return b2StoreJointId(b2CreateRevoluteJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition.
    static inline void defaultRevoluteJointDef(b2RevoluteJointDef& result) {
        result = b2DefaultRevoluteJointDef();
    }

    /// Enable/disable the revolute joint spring
    static inline void enableSpring(uint64_t jointId, bool enableSpring) {
        b2RevoluteJoint_EnableSpring(b2LoadJointId(jointId), enableSpring);
    }

    /// Is the revolute angular spring enabled?
    static inline bool isSpringEnabled(uint64_t jointId) {
        return b2RevoluteJoint_IsSpringEnabled(b2LoadJointId(jointId));
    }

    /// Set the revolute joint spring stiffness in Hertz
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2RevoluteJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the revolute joint spring stiffness in Hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2RevoluteJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Set the revolute joint spring damping ratio, non-dimensional
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2RevoluteJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the revolute joint spring damping ratio, non-dimensional
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2RevoluteJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Set the revolute joint spring target angle, radians
    static inline void setTargetAngle(uint64_t jointId, float angle) {
        b2RevoluteJoint_SetTargetAngle(b2LoadJointId(jointId), angle);
    }

    /// Get the revolute joint spring target angle, radians
    static inline float getTargetAngle(uint64_t jointId) {
        return b2RevoluteJoint_GetTargetAngle(b2LoadJointId(jointId));
    }

    /// Enable/disable the revolute joint limit
    static inline void enableLimit(uint64_t jointId, bool enableLimit) {
        b2RevoluteJoint_EnableLimit(b2LoadJointId(jointId), enableLimit);
    }

    /// Is the revolute joint limit enabled?
    static inline bool isLimitEnabled(uint64_t jointId) {
        return b2RevoluteJoint_IsLimitEnabled(b2LoadJointId(jointId));
    }

    /// Get the revolute joint lower limit in radians
    static inline float getLowerLimit(uint64_t jointId) {
        return b2RevoluteJoint_GetLowerLimit(b2LoadJointId(jointId));
    }

    /// Get the revolute joint upper limit in radians
    static inline float getUpperLimit(uint64_t jointId) {
        return b2RevoluteJoint_GetUpperLimit(b2LoadJointId(jointId));
    }

    /// Set the revolute joint limits in radians. It is expected that lower <= upper and that -0.99 *
    /// B2_PI <= lower && upper <= 0.99 * B2_PI.
    static inline void setLimits(uint64_t jointId, float lower, float upper) {
        b2RevoluteJoint_SetLimits(b2LoadJointId(jointId), lower, upper);
    }

    /// Enable/disable a revolute joint motor
    static inline void enableMotor(uint64_t jointId, bool enableMotor) {
        b2RevoluteJoint_EnableMotor(b2LoadJointId(jointId), enableMotor);
    }

    /// Is the revolute joint motor enabled?
    static inline bool isMotorEnabled(uint64_t jointId) {
        return b2RevoluteJoint_IsMotorEnabled(b2LoadJointId(jointId));
    }

    /// Set the revolute joint motor speed in radians per second
    static inline void setTargetMotorSpeed(uint64_t jointId, float motorSpeed) {
        b2RevoluteJoint_SetTargetMotorSpeed(b2LoadJointId(jointId), motorSpeed);
    }

    /// Get the revolute joint motor speed in radians per second
    static inline float getTargetMotorSpeed(uint64_t jointId) {
        return b2RevoluteJoint_GetTargetMotorSpeed(b2LoadJointId(jointId));
    }

    /// Set the revolute joint maximum motor torque, usually in newton-meters
    static inline void setMaxMotorTorque(uint64_t jointId, float torque) {
        b2RevoluteJoint_SetMaxMotorTorque(b2LoadJointId(jointId), torque);
    }

    /// Get the revolute joint maximum motor torque, usually in newton-meters
    static inline float getMaxMotorTorque(uint64_t jointId) {
        return b2RevoluteJoint_GetMaxMotorTorque(b2LoadJointId(jointId));
    }

    /// Get the revolute joint current angle in radians. This is the relative rotation of the joint
    /// frames.
    static inline float getCurrentAngle(uint64_t jointId) {
        return b2RevoluteJoint_GetCurrentAngle(b2LoadJointId(jointId));
    }

    /// Get the current revolute joint motor speed in radians per second
    static inline float getCurrentSpeed(uint64_t jointId) {
        return b2RevoluteJoint_GetCurrentSpeed(b2LoadJointId(jointId));
    }

    /// Get the revolute joint current motor torque, usually in newton-meters
    static inline float getCurrentMotorTorque(uint64_t jointId) {
        return b2RevoluteJoint_GetCurrentMotorTorque(b2LoadJointId(jointId));
    }
};
