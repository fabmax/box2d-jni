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

    /// Set the desired relative linear velocity in meters per second
    static inline void setLinearVelocity(uint64_t jointId, b2Vec2 velocity) {
        b2MotorJoint_SetLinearVelocity(b2LoadJointId(jointId), velocity);
    }

    /// Get the desired relative linear velocity in meters per second
    static inline b2Vec2 getLinearVelocity(uint64_t jointId) {
        return b2MotorJoint_GetLinearVelocity(b2LoadJointId(jointId));
    }

    /// Set the desired relative angular velocity in radians per second
    static inline void setAngularVelocity(uint64_t jointId, float velocity) {
        b2MotorJoint_SetAngularVelocity(b2LoadJointId(jointId), velocity);
    }

    /// Get the desired relative angular velocity in radians per second
    static inline float getAngularVelocity(uint64_t jointId) {
        return b2MotorJoint_GetAngularVelocity(b2LoadJointId(jointId));
    }

    /// Set the motor joint maximum force, usually in newtons
    static inline void setMaxVelocityForce(uint64_t jointId, float maxForce) {
        b2MotorJoint_SetMaxVelocityForce(b2LoadJointId(jointId), maxForce);
    }

    /// Get the motor joint maximum force, usually in newtons
    static inline float getMaxVelocityForce(uint64_t jointId) {
        return b2MotorJoint_GetMaxVelocityForce(b2LoadJointId(jointId));
    }

    /// Set the motor joint maximum torque, usually in newton-meters
    static inline void setMaxVelocityTorque(uint64_t jointId, float maxTorque) {
        b2MotorJoint_SetMaxVelocityTorque(b2LoadJointId(jointId), maxTorque);
    }

    /// Get the motor joint maximum torque, usually in newton-meters
    static inline float getMaxVelocityTorque(uint64_t jointId) {
        return b2MotorJoint_GetMaxVelocityTorque(b2LoadJointId(jointId));
    }

    /// Set the spring linear hertz stiffness
    static inline void setLinearHertz(uint64_t jointId, float hertz) {
        b2MotorJoint_SetLinearHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the spring linear hertz stiffness
    static inline float getLinearHertz(uint64_t jointId) {
        return b2MotorJoint_GetLinearHertz(b2LoadJointId(jointId));
    }

    /// Set the spring linear damping ratio. Use 1.0 for critical damping.
    static inline void setLinearDampingRatio(uint64_t jointId, float damping) {
        b2MotorJoint_SetLinearDampingRatio(b2LoadJointId(jointId), damping);
    }

    /// Get the spring linear damping ratio.
    static inline float getLinearDampingRatio(uint64_t jointId) {
        return b2MotorJoint_GetLinearDampingRatio(b2LoadJointId(jointId));
    }

    /// Set the spring angular hertz stiffness
    static inline void setAngularHertz(uint64_t jointId, float hertz) {
        b2MotorJoint_SetAngularHertz(b2LoadJointId(jointId), hertz);
    }

    /// Get the spring angular hertz stiffness
    static inline float getAngularHertz(uint64_t jointId) {
        return b2MotorJoint_GetAngularHertz(b2LoadJointId(jointId));
    }

    /// Set the spring angular damping ratio. Use 1.0 for critical damping.
    static inline void setAngularDampingRatio(uint64_t jointId, float damping) {
        b2MotorJoint_SetAngularDampingRatio(b2LoadJointId(jointId), damping);
    }

    /// Get the spring angular damping ratio.
    static inline float getAngularDampingRatio(uint64_t jointId) {
        return b2MotorJoint_GetAngularDampingRatio(b2LoadJointId(jointId));
    }

    /// Set the maximum spring force in newtons.
    static inline void setMaxSpringForce(uint64_t jointId, float maxForce) {
        b2MotorJoint_SetMaxSpringForce(b2LoadJointId(jointId), maxForce);
    }

    /// Get the maximum spring force in newtons.
    static inline float getMaxSpringForce(uint64_t jointId) {
        return b2MotorJoint_GetMaxSpringForce(b2LoadJointId(jointId));
    }

    /// Set the maximum spring torque in newtons * meters
    static inline void setMaxSpringTorque(uint64_t jointId, float maxTorque) {
        b2MotorJoint_SetMaxSpringTorque(b2LoadJointId(jointId), maxTorque);
    }

    /// Get the maximum spring torque in newtons * meters
    static inline float getMaxSpringTorque(uint64_t jointId) {
        return b2MotorJoint_GetMaxSpringTorque(b2LoadJointId(jointId));
    }
};
