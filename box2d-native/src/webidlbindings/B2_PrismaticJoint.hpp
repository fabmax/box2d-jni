#pragma once

#include <box2d/box2d.h>

class B2_PrismaticJoint {
    public:

    /// Create a prismatic (slider) joint.
    /// @see b2PrismaticJointDef for details
    static inline uint64_t createPrismaticJoint(uint64_t worldId, const b2PrismaticJointDef *def) {
        return b2StoreJointId(b2CreatePrismaticJoint(b2LoadWorldId(worldId), def));
    }

    /// Use this to initialize your joint definition
    static inline void defaultPrismaticJointDef(b2PrismaticJointDef& result) {
        result = b2DefaultPrismaticJointDef();
    }

    /// Enable/disable the joint spring.
    static inline void enableSpring(uint64_t jointId, bool enableSpring) {
        b2PrismaticJoint_EnableSpring(b2LoadJointId(jointId), enableSpring);
    }

    /// Is the prismatic joint spring enabled or not?
    static inline bool isSpringEnabled(uint64_t jointId) {
        return b2PrismaticJoint_IsSpringEnabled(b2LoadJointId(jointId));
    }

    /// Set the prismatic joint stiffness in Hertz. This should usually be less than a quarter of the
    /// simulation rate. For example, if the simulation runs at 60Hz then the joint stiffness should be
    /// 15Hz or less.
    static inline void setSpringHertz(uint64_t jointId, float hertz) {
        b2PrismaticJoint_SetSpringHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the prismatic joint stiffness in Hertz
    static inline float getSpringHertz(uint64_t jointId) {
        return b2PrismaticJoint_GetSpringHertz(b2LoadJointId(jointId));
    }

    /// Set the prismatic joint damping ratio (non-dimensional)
    static inline void setSpringDampingRatio(uint64_t jointId, float dampingRatio) {
        b2PrismaticJoint_SetSpringDampingRatio(b2LoadJointId(jointId), dampingRatio);
    }

    /// Get the prismatic spring damping ratio (non-dimensional)
    static inline float getSpringDampingRatio(uint64_t jointId) {
        return b2PrismaticJoint_GetSpringDampingRatio(b2LoadJointId(jointId));
    }

    /// Set the prismatic joint spring target translation, usually in meters
    static inline void setTargetTranslation(uint64_t jointId, float translation) {
        b2PrismaticJoint_SetTargetTranslation(b2LoadJointId(jointId), translation);
    }

    /// Get the prismatic joint spring target translation, usually in meters
    static inline float getTargetTranslation(uint64_t jointId) {
        return b2PrismaticJoint_GetTargetTranslation(b2LoadJointId(jointId));
    }

    /// Enable/disable a prismatic joint limit
    static inline void enableLimit(uint64_t jointId, bool enableLimit) {
        b2PrismaticJoint_EnableLimit(b2LoadJointId(jointId), enableLimit);
    }

    /// Is the prismatic joint limit enabled?
    static inline bool isLimitEnabled(uint64_t jointId) {
        return b2PrismaticJoint_IsLimitEnabled(b2LoadJointId(jointId));
    }

    /// Get the prismatic joint lower limit
    static inline float getLowerLimit(uint64_t jointId) {
        return b2PrismaticJoint_GetLowerLimit(b2LoadJointId(jointId));
    }

    /// Get the prismatic joint upper limit
    static inline float getUpperLimit(uint64_t jointId) {
        return b2PrismaticJoint_GetUpperLimit(b2LoadJointId(jointId));
    }

    /// Set the prismatic joint limits
    static inline void setLimits(uint64_t jointId, float lower, float upper) {
        b2PrismaticJoint_SetLimits(b2LoadJointId(jointId), lower, upper);
    }

    /// Enable/disable a prismatic joint motor
    static inline void enableMotor(uint64_t jointId, bool enableMotor) {
        b2PrismaticJoint_EnableMotor(b2LoadJointId(jointId), enableMotor);
    }

    /// Is the prismatic joint motor enabled?
    static inline bool isMotorEnabled(uint64_t jointId) {
        return b2PrismaticJoint_IsMotorEnabled(b2LoadJointId(jointId));
    }

    /// Set the prismatic joint motor speed, usually in meters per second
    static inline void setTargetMotorSpeed(uint64_t jointId, float motorSpeed) {
        b2PrismaticJoint_SetTargetMotorSpeed(b2LoadJointId(jointId), motorSpeed);
    }

    /// Get the prismatic joint motor speed, usually in meters per second
    static inline float getTargetMotorSpeed(uint64_t jointId) {
        return b2PrismaticJoint_GetTargetMotorSpeed(b2LoadJointId(jointId));
    }

    /// Set the prismatic joint maximum motor force, usually in newtons
    static inline void setMaxMotorForce(uint64_t jointId, float force) {
        b2PrismaticJoint_SetMaxMotorForce(b2LoadJointId(jointId), force);
    }

    /// Get the prismatic joint maximum motor force, usually in newtons
    static inline float getMaxMotorForce(uint64_t jointId) {
        return b2PrismaticJoint_GetMaxMotorForce(b2LoadJointId(jointId));
    }

    /// Get the current joint translation, usually in meters.
    static inline float getCurrentTranslation(uint64_t jointId) {
        return b2PrismaticJoint_GetCurrentTranslation(b2LoadJointId(jointId));
    }

    /// Get the current joint translation velocity, usually in meters per second.
    static inline float getCurrentSpeed(uint64_t jointId) {
        return b2PrismaticJoint_GetCurrentSpeed(b2LoadJointId(jointId));
    }

    /// Get the prismatic joint current motor force, usually in newtons
    static inline float getCurrentMotorForce(uint64_t jointId) {
        return b2PrismaticJoint_GetCurrentMotorForce(b2LoadJointId(jointId));
    }
};
