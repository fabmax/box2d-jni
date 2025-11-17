/*
 * JNI glue code. You should not edit this file.
 * Generated from WebIDL model 'Box2d' by webidl-util.
 */
#include <jni.h>

            static JavaVM* javaVm = NULL;
            
            class JniThreadEnv {
                public:
                    JniThreadEnv() : shouldDetach(false), env(NULL) { }
                    JniThreadEnv(JNIEnv *env) : shouldDetach(false), env(env) { }
                    ~JniThreadEnv() {
                        if (shouldDetach) {
                            javaVm->DetachCurrentThread();
                        }
                    }
                    JNIEnv* getEnv() {
                        if (env == NULL && javaVm != NULL) {
#ifndef __ANDROID__
                            javaVm->AttachCurrentThreadAsDaemon((void**) &env, NULL);
#else
                            javaVm->AttachCurrentThreadAsDaemon(&env, NULL);
#endif
                            shouldDetach = true;
                        }
                        return env;
                    }
                    
                private:
                    bool shouldDetach;
                    JNIEnv *env;
            };
            
            static thread_local JniThreadEnv jniThreadEnv;
            
            class JavaNativeRef {
                public:
                    JavaNativeRef(JNIEnv *env, jobject javaRef) {
                        javaGlobalRef = env->NewGlobalRef(javaRef);
                    }
                    
                    ~JavaNativeRef() {
                        jniThreadEnv.getEnv()->DeleteGlobalRef(javaGlobalRef);
                    }
                    
                    jobject javaGlobalRef;
            };

extern "C" {
JNIEXPORT jint JNICALL Java_box2d_NativeObject__1_1sizeOfPointer(JNIEnv*, jclass) {
    return sizeof(void*);
}

// JavaNativeRef
JNIEXPORT jlong JNICALL Java_box2d_JavaNativeRef__1new_1instance(JNIEnv* env, jclass, jobject javaRef) {
    return (jlong) new JavaNativeRef(env, javaRef);
}
JNIEXPORT void JNICALL Java_box2d_JavaNativeRef__1delete_1instance(JNIEnv*, jclass, jlong address) {
    delete (JavaNativeRef*) address;
}
JNIEXPORT jobject JNICALL Java_box2d_JavaNativeRef__1get_1java_1ref(JNIEnv*, jclass, jlong address) {
    return ((JavaNativeRef*) address)->javaGlobalRef;
}

// B2_Shape
JNIEXPORT jint JNICALL Java_box2d_B2_1Shape__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_Shape);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Shape_00024Raw_defaultShapeDef(JNIEnv*, jclass, jlong result) {
    B2_Shape::defaultShapeDef(*((b2ShapeDef*) result));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Shape_00024Raw_createPolygonShape(JNIEnv*, jclass, jlong bodyId, jlong def, jlong polygon, jlong result) {
    B2_Shape::createPolygonShape(*((b2BodyId*) bodyId), (b2ShapeDef*) def, (b2Polygon*) polygon, *((b2ShapeId*) result));
}

// b2ShapeDef
JNIEXPORT jint JNICALL Java_box2d_b2ShapeDef__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ShapeDef);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ShapeDef_00024Raw_b2ShapeDef_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2ShapeDef();
}
JNIEXPORT jlong JNICALL Java_box2d_b2ShapeDef_00024Raw_b2ShapeDef(JNIEnv*, jclass) {
    return (jlong) new b2ShapeDef();
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ShapeDef*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ShapeDef_00024Raw_getUserData(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jlong) _self->userData;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setUserData(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->userData = (void*) value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ShapeDef_00024Raw_getMaterial(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jlong) &_self->material;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setMaterial(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->material = *((b2SurfaceMaterial*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ShapeDef_00024Raw_getDensity(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jfloat) _self->density;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setDensity(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->density = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getIsSensor(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->isSensor;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setIsSensor(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->isSensor = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getEnableSensorEvents(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->enableSensorEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setEnableSensorEvents(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->enableSensorEvents = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getEnableContactEvents(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->enableContactEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setEnableContactEvents(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->enableContactEvents = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getEnableHitEvents(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->enableHitEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setEnableHitEvents(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->enableHitEvents = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getEnablePreSolveEvents(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->enablePreSolveEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setEnablePreSolveEvents(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->enablePreSolveEvents = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getInvokeContactCreation(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->invokeContactCreation;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setInvokeContactCreation(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->invokeContactCreation = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ShapeDef_00024Raw_getUpdateBodyMass(JNIEnv*, jclass, jlong _address) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    return (jboolean) _self->updateBodyMass;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeDef_00024Raw_setUpdateBodyMass(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ShapeDef* _self = (b2ShapeDef*) _address;
    _self->updateBodyMass = value;
}

// b2ShapeId
JNIEXPORT jint JNICALL Java_box2d_b2ShapeId__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ShapeId);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ShapeId_00024Raw_b2ShapeId(JNIEnv*, jclass) {
    return (jlong) new b2ShapeId();
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeId_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ShapeId*) _address;
}
JNIEXPORT jshort JNICALL Java_box2d_b2ShapeId_00024Raw_getGeneration(JNIEnv*, jclass, jlong _address) {
    b2ShapeId* _self = (b2ShapeId*) _address;
    return (jshort) _self->generation;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeId_00024Raw_setGeneration(JNIEnv*, jclass, jlong _address, jshort value) {
    b2ShapeId* _self = (b2ShapeId*) _address;
    _self->generation = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2ShapeId_00024Raw_getIndex1(JNIEnv*, jclass, jlong _address) {
    b2ShapeId* _self = (b2ShapeId*) _address;
    return (jint) _self->index1;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeId_00024Raw_setIndex1(JNIEnv*, jclass, jlong _address, jint value) {
    b2ShapeId* _self = (b2ShapeId*) _address;
    _self->index1 = value;
}
JNIEXPORT jshort JNICALL Java_box2d_b2ShapeId_00024Raw_getWorld0(JNIEnv*, jclass, jlong _address) {
    b2ShapeId* _self = (b2ShapeId*) _address;
    return (jshort) _self->world0;
}
JNIEXPORT void JNICALL Java_box2d_b2ShapeId_00024Raw_setWorld0(JNIEnv*, jclass, jlong _address, jshort value) {
    b2ShapeId* _self = (b2ShapeId*) _address;
    _self->world0 = value;
}

// b2SurfaceMaterial
JNIEXPORT jint JNICALL Java_box2d_b2SurfaceMaterial__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2SurfaceMaterial);
}
JNIEXPORT jlong JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_b2SurfaceMaterial_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2SurfaceMaterial();
}
JNIEXPORT jlong JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_b2SurfaceMaterial(JNIEnv*, jclass) {
    return (jlong) new b2SurfaceMaterial();
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2SurfaceMaterial*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_getCustomColor(JNIEnv*, jclass, jlong _address) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    return (jint) _self->customColor;
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_setCustomColor(JNIEnv*, jclass, jlong _address, jint value) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    _self->customColor = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_getFriction(JNIEnv*, jclass, jlong _address) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    return (jfloat) _self->friction;
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_setFriction(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    _self->friction = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_getRestitution(JNIEnv*, jclass, jlong _address) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    return (jfloat) _self->restitution;
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_setRestitution(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    _self->restitution = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_getRollingResistance(JNIEnv*, jclass, jlong _address) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    return (jfloat) _self->rollingResistance;
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_setRollingResistance(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    _self->rollingResistance = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_getTangentSpeed(JNIEnv*, jclass, jlong _address) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    return (jfloat) _self->tangentSpeed;
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_setTangentSpeed(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    _self->tangentSpeed = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_getUserMaterialId(JNIEnv*, jclass, jlong _address) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    return (jint) _self->userMaterialId;
}
JNIEXPORT void JNICALL Java_box2d_b2SurfaceMaterial_00024Raw_setUserMaterialId(JNIEnv*, jclass, jlong _address, jint value) {
    b2SurfaceMaterial* _self = (b2SurfaceMaterial*) _address;
    _self->userMaterialId = value;
}

// B2_Vec2
JNIEXPORT jint JNICALL Java_box2d_B2_1Vec2__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_Vec2);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Vec2_00024Raw_dot(JNIEnv*, jclass, jlong a, jlong b) {
    return (jfloat) B2_Vec2::dot(*((b2Vec2*) a), *((b2Vec2*) b));
}

// B2_Rot
JNIEXPORT jint JNICALL Java_box2d_B2_1Rot__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_Rot);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Rot_00024Raw_getAngle(JNIEnv*, jclass, jlong q) {
    return (jfloat) B2_Rot::getAngle(*((b2Rot*) q));
}

// b2AABB
JNIEXPORT jint JNICALL Java_box2d_b2AABB__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2AABB);
}
JNIEXPORT jlong JNICALL Java_box2d_b2AABB_00024Raw_b2AABB_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2AABB();
}
JNIEXPORT jlong JNICALL Java_box2d_b2AABB_00024Raw_b2AABB(JNIEnv*, jclass) {
    return (jlong) new b2AABB();
}
JNIEXPORT void JNICALL Java_box2d_b2AABB_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2AABB*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2AABB_00024Raw_getLowerBound(JNIEnv*, jclass, jlong _address) {
    b2AABB* _self = (b2AABB*) _address;
    return (jlong) &_self->lowerBound;
}
JNIEXPORT void JNICALL Java_box2d_b2AABB_00024Raw_setLowerBound(JNIEnv*, jclass, jlong _address, jlong value) {
    b2AABB* _self = (b2AABB*) _address;
    _self->lowerBound = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2AABB_00024Raw_getUpperBound(JNIEnv*, jclass, jlong _address) {
    b2AABB* _self = (b2AABB*) _address;
    return (jlong) &_self->upperBound;
}
JNIEXPORT void JNICALL Java_box2d_b2AABB_00024Raw_setUpperBound(JNIEnv*, jclass, jlong _address, jlong value) {
    b2AABB* _self = (b2AABB*) _address;
    _self->upperBound = *((b2Vec2*) value);
}

// b2Rot
JNIEXPORT jint JNICALL Java_box2d_b2Rot__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Rot);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Rot_00024Raw_b2Rot_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2Rot();
}
JNIEXPORT jlong JNICALL Java_box2d_b2Rot_00024Raw_b2Rot(JNIEnv*, jclass) {
    return (jlong) new b2Rot();
}
JNIEXPORT void JNICALL Java_box2d_b2Rot_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Rot*) _address;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Rot_00024Raw_getC(JNIEnv*, jclass, jlong _address) {
    b2Rot* _self = (b2Rot*) _address;
    return (jfloat) _self->c;
}
JNIEXPORT void JNICALL Java_box2d_b2Rot_00024Raw_setC(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Rot* _self = (b2Rot*) _address;
    _self->c = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Rot_00024Raw_getS(JNIEnv*, jclass, jlong _address) {
    b2Rot* _self = (b2Rot*) _address;
    return (jfloat) _self->s;
}
JNIEXPORT void JNICALL Java_box2d_b2Rot_00024Raw_setS(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Rot* _self = (b2Rot*) _address;
    _self->s = value;
}

// b2Transform
JNIEXPORT jint JNICALL Java_box2d_b2Transform__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Transform);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Transform_00024Raw_b2Transform_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2Transform();
}
JNIEXPORT jlong JNICALL Java_box2d_b2Transform_00024Raw_b2Transform(JNIEnv*, jclass) {
    return (jlong) new b2Transform();
}
JNIEXPORT void JNICALL Java_box2d_b2Transform_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Transform*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2Transform_00024Raw_getP(JNIEnv*, jclass, jlong _address) {
    b2Transform* _self = (b2Transform*) _address;
    return (jlong) &_self->p;
}
JNIEXPORT void JNICALL Java_box2d_b2Transform_00024Raw_setP(JNIEnv*, jclass, jlong _address, jlong value) {
    b2Transform* _self = (b2Transform*) _address;
    _self->p = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Transform_00024Raw_getQ(JNIEnv*, jclass, jlong _address) {
    b2Transform* _self = (b2Transform*) _address;
    return (jlong) &_self->q;
}
JNIEXPORT void JNICALL Java_box2d_b2Transform_00024Raw_setQ(JNIEnv*, jclass, jlong _address, jlong value) {
    b2Transform* _self = (b2Transform*) _address;
    _self->q = *((b2Rot*) value);
}

// b2Vec2
JNIEXPORT jint JNICALL Java_box2d_b2Vec2__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Vec2);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Vec2_00024Raw_b2Vec2_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2Vec2();
}
JNIEXPORT jlong JNICALL Java_box2d_b2Vec2_00024Raw_b2Vec2(JNIEnv*, jclass) {
    return (jlong) new b2Vec2();
}
JNIEXPORT void JNICALL Java_box2d_b2Vec2_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Vec2*) _address;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Vec2_00024Raw_getX(JNIEnv*, jclass, jlong _address) {
    b2Vec2* _self = (b2Vec2*) _address;
    return (jfloat) _self->x;
}
JNIEXPORT void JNICALL Java_box2d_b2Vec2_00024Raw_setX(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Vec2* _self = (b2Vec2*) _address;
    _self->x = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Vec2_00024Raw_getY(JNIEnv*, jclass, jlong _address) {
    b2Vec2* _self = (b2Vec2*) _address;
    return (jfloat) _self->y;
}
JNIEXPORT void JNICALL Java_box2d_b2Vec2_00024Raw_setY(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Vec2* _self = (b2Vec2*) _address;
    _self->y = value;
}

// B2_World
JNIEXPORT jint JNICALL Java_box2d_B2_1World__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_World);
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_defaultWorldDef(JNIEnv*, jclass, jlong result) {
    B2_World::defaultWorldDef(*((b2WorldDef*) result));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_createWorld(JNIEnv*, jclass, jlong def, jlong result) {
    B2_World::createWorld((b2WorldDef*) def, *((b2WorldId*) result));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_destroyWorld(JNIEnv*, jclass, jlong result) {
    B2_World::destroyWorld(*((b2WorldId*) result));
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1World_00024Raw_isValid(JNIEnv*, jclass, jlong id) {
    return (jboolean) B2_World::isValid(*((b2WorldId*) id));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_step(JNIEnv*, jclass, jlong world, jfloat timeStep, jint subStepCount) {
    B2_World::step(*((b2WorldId*) world), timeStep, subStepCount);
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getBodyEvents(JNIEnv*, jclass, jlong worldId) {
    static thread_local b2BodyEvents _cache = B2_World::getBodyEvents(*((b2WorldId*) worldId));
    _cache = B2_World::getBodyEvents(*((b2WorldId*) worldId));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getSensorEvents(JNIEnv*, jclass, jlong worldId) {
    static thread_local b2SensorEvents _cache = B2_World::getSensorEvents(*((b2WorldId*) worldId));
    _cache = B2_World::getSensorEvents(*((b2WorldId*) worldId));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getContactEvents(JNIEnv*, jclass, jlong worldId) {
    static thread_local b2ContactEvents _cache = B2_World::getContactEvents(*((b2WorldId*) worldId));
    _cache = B2_World::getContactEvents(*((b2WorldId*) worldId));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_enableSleeping(JNIEnv*, jclass, jlong worldId, jboolean flag) {
    B2_World::enableSleeping(*((b2WorldId*) worldId), flag);
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1World_00024Raw_isSleepingEnabled(JNIEnv*, jclass, jlong worldId) {
    return (jboolean) B2_World::isSleepingEnabled(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_enableContinuous(JNIEnv*, jclass, jlong worldId, jboolean flag) {
    B2_World::enableContinuous(*((b2WorldId*) worldId), flag);
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1World_00024Raw_isContinuousEnabled(JNIEnv*, jclass, jlong worldId) {
    return (jboolean) B2_World::isContinuousEnabled(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_setRestitutionThreshold(JNIEnv*, jclass, jlong worldId, jfloat value) {
    B2_World::setRestitutionThreshold(*((b2WorldId*) worldId), value);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1World_00024Raw_getRestitutionThreshold(JNIEnv*, jclass, jlong worldId) {
    return (jfloat) B2_World::getRestitutionThreshold(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_setHitEventThreshold(JNIEnv*, jclass, jlong worldId, jfloat value) {
    B2_World::setHitEventThreshold(*((b2WorldId*) worldId), value);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1World_00024Raw_getHitEventThreshold(JNIEnv*, jclass, jlong worldId) {
    return (jfloat) B2_World::getHitEventThreshold(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_setGravity(JNIEnv*, jclass, jlong worldId, jlong gravity) {
    B2_World::setGravity(*((b2WorldId*) worldId), *((b2Vec2*) gravity));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getGravity(JNIEnv*, jclass, jlong worldId) {
    static thread_local b2Vec2 _cache = B2_World::getGravity(*((b2WorldId*) worldId));
    _cache = B2_World::getGravity(*((b2WorldId*) worldId));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_explode(JNIEnv*, jclass, jlong worldId, jlong explosionDef) {
    B2_World::explode(*((b2WorldId*) worldId), (b2ExplosionDef*) explosionDef);
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_setContactTuning(JNIEnv*, jclass, jlong worldId, jfloat hertz, jfloat dampingRatio, jfloat pushSpeed) {
    B2_World::setContactTuning(*((b2WorldId*) worldId), hertz, dampingRatio, pushSpeed);
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_setMaximumLinearSpeed(JNIEnv*, jclass, jlong worldId, jfloat maximumLinearSpeed) {
    B2_World::setMaximumLinearSpeed(*((b2WorldId*) worldId), maximumLinearSpeed);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1World_00024Raw_getMaximumLinearSpeed(JNIEnv*, jclass, jlong worldId) {
    return (jfloat) B2_World::getMaximumLinearSpeed(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_enableWarmStarting(JNIEnv*, jclass, jlong worldId, jboolean flag) {
    B2_World::enableWarmStarting(*((b2WorldId*) worldId), flag);
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1World_00024Raw_isWarmStartingEnabled(JNIEnv*, jclass, jlong worldId) {
    return (jboolean) B2_World::isWarmStartingEnabled(*((b2WorldId*) worldId));
}
JNIEXPORT jint JNICALL Java_box2d_B2_1World_00024Raw_getAwakeBodyCount(JNIEnv*, jclass, jlong worldId) {
    return (jint) B2_World::getAwakeBodyCount(*((b2WorldId*) worldId));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getProfile(JNIEnv*, jclass, jlong worldId) {
    static thread_local b2Profile _cache = B2_World::getProfile(*((b2WorldId*) worldId));
    _cache = B2_World::getProfile(*((b2WorldId*) worldId));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getCounters(JNIEnv*, jclass, jlong worldId) {
    static thread_local b2Counters _cache = B2_World::getCounters(*((b2WorldId*) worldId));
    _cache = B2_World::getCounters(*((b2WorldId*) worldId));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_dumpMemoryStats(JNIEnv*, jclass, jlong worldId) {
    B2_World::dumpMemoryStats(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_setUserData(JNIEnv*, jclass, jlong worldId, jlong userData) {
    B2_World::setUserData(*((b2WorldId*) worldId), (void*) userData);
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1World_00024Raw_getUserData(JNIEnv*, jclass, jlong worldId) {
    return (jlong) B2_World::getUserData(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_rebuildStaticTree(JNIEnv*, jclass, jlong worldId) {
    B2_World::rebuildStaticTree(*((b2WorldId*) worldId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1World_00024Raw_enableSpeculative(JNIEnv*, jclass, jlong worldId, jboolean flag) {
    B2_World::enableSpeculative(*((b2WorldId*) worldId), flag);
}

// b2BodyEvents
JNIEXPORT jint JNICALL Java_box2d_b2BodyEvents__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2BodyEvents);
}
JNIEXPORT void JNICALL Java_box2d_b2BodyEvents_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2BodyEvents*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2BodyEvents_00024Raw_getMoveCount(JNIEnv*, jclass, jlong _address) {
    b2BodyEvents* _self = (b2BodyEvents*) _address;
    return (jint) _self->moveCount;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyEvents_00024Raw_setMoveCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2BodyEvents* _self = (b2BodyEvents*) _address;
    _self->moveCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyEvents_00024Raw_getMoveEvents(JNIEnv*, jclass, jlong _address) {
    b2BodyEvents* _self = (b2BodyEvents*) _address;
    return (jlong) _self->moveEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyEvents_00024Raw_setMoveEvents(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyEvents* _self = (b2BodyEvents*) _address;
    _self->moveEvents = (b2BodyMoveEvent*) value;
}

// b2BodyMoveEvent
JNIEXPORT jint JNICALL Java_box2d_b2BodyMoveEvent__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2BodyMoveEvent);
}
JNIEXPORT void JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2BodyMoveEvent*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_getBodyId(JNIEnv*, jclass, jlong _address) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    return (jlong) &_self->bodyId;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_setBodyId(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    _self->bodyId = *((b2BodyId*) value);
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_getFellAsleep(JNIEnv*, jclass, jlong _address) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    return (jboolean) _self->fellAsleep;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_setFellAsleep(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    _self->fellAsleep = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_getTransform(JNIEnv*, jclass, jlong _address) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    return (jlong) &_self->transform;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_setTransform(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    _self->transform = *((b2Transform*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_getUserData(JNIEnv*, jclass, jlong _address) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    return (jlong) _self->userData;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyMoveEvent_00024Raw_setUserData(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyMoveEvent* _self = (b2BodyMoveEvent*) _address;
    _self->userData = (void*) value;
}

// b2SensorEvents
JNIEXPORT jint JNICALL Java_box2d_b2SensorEvents__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2SensorEvents);
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEvents_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2SensorEvents*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2SensorEvents_00024Raw_getBeginCount(JNIEnv*, jclass, jlong _address) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    return (jint) _self->beginCount;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEvents_00024Raw_setBeginCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    _self->beginCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2SensorEvents_00024Raw_getBeginEvents(JNIEnv*, jclass, jlong _address) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    return (jlong) _self->beginEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEvents_00024Raw_setBeginEvents(JNIEnv*, jclass, jlong _address, jlong value) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    _self->beginEvents = (b2SensorBeginTouchEvent*) value;
}
JNIEXPORT jint JNICALL Java_box2d_b2SensorEvents_00024Raw_getEndCount(JNIEnv*, jclass, jlong _address) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    return (jint) _self->endCount;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEvents_00024Raw_setEndCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    _self->endCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2SensorEvents_00024Raw_getEndEvents(JNIEnv*, jclass, jlong _address) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    return (jlong) _self->endEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEvents_00024Raw_setEndEvents(JNIEnv*, jclass, jlong _address, jlong value) {
    b2SensorEvents* _self = (b2SensorEvents*) _address;
    _self->endEvents = (b2SensorEndTouchEvent*) value;
}

// b2SensorBeginTouchEvent
JNIEXPORT jint JNICALL Java_box2d_b2SensorBeginTouchEvent__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2SensorBeginTouchEvent);
}
JNIEXPORT void JNICALL Java_box2d_b2SensorBeginTouchEvent_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2SensorBeginTouchEvent*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2SensorBeginTouchEvent_00024Raw_getSensorShapeId(JNIEnv*, jclass, jlong _address) {
    b2SensorBeginTouchEvent* _self = (b2SensorBeginTouchEvent*) _address;
    return (jlong) &_self->sensorShapeId;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorBeginTouchEvent_00024Raw_setSensorShapeId(JNIEnv*, jclass, jlong _address, jlong value) {
    b2SensorBeginTouchEvent* _self = (b2SensorBeginTouchEvent*) _address;
    _self->sensorShapeId = *((b2ShapeId*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2SensorBeginTouchEvent_00024Raw_getVisitorShapeId(JNIEnv*, jclass, jlong _address) {
    b2SensorBeginTouchEvent* _self = (b2SensorBeginTouchEvent*) _address;
    return (jlong) &_self->visitorShapeId;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorBeginTouchEvent_00024Raw_setVisitorShapeId(JNIEnv*, jclass, jlong _address, jlong value) {
    b2SensorBeginTouchEvent* _self = (b2SensorBeginTouchEvent*) _address;
    _self->visitorShapeId = *((b2ShapeId*) value);
}

// b2SensorEndTouchEvent
JNIEXPORT jint JNICALL Java_box2d_b2SensorEndTouchEvent__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2SensorEndTouchEvent);
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEndTouchEvent_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2SensorEndTouchEvent*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2SensorEndTouchEvent_00024Raw_getSensorShapeId(JNIEnv*, jclass, jlong _address) {
    b2SensorEndTouchEvent* _self = (b2SensorEndTouchEvent*) _address;
    return (jlong) &_self->sensorShapeId;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEndTouchEvent_00024Raw_setSensorShapeId(JNIEnv*, jclass, jlong _address, jlong value) {
    b2SensorEndTouchEvent* _self = (b2SensorEndTouchEvent*) _address;
    _self->sensorShapeId = *((b2ShapeId*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2SensorEndTouchEvent_00024Raw_getVisitorShapeId(JNIEnv*, jclass, jlong _address) {
    b2SensorEndTouchEvent* _self = (b2SensorEndTouchEvent*) _address;
    return (jlong) &_self->visitorShapeId;
}
JNIEXPORT void JNICALL Java_box2d_b2SensorEndTouchEvent_00024Raw_setVisitorShapeId(JNIEnv*, jclass, jlong _address, jlong value) {
    b2SensorEndTouchEvent* _self = (b2SensorEndTouchEvent*) _address;
    _self->visitorShapeId = *((b2ShapeId*) value);
}

// b2ContactEvents
JNIEXPORT jint JNICALL Java_box2d_b2ContactEvents__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ContactEvents);
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ContactEvents*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2ContactEvents_00024Raw_getBeginCount(JNIEnv*, jclass, jlong _address) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    return (jint) _self->beginCount;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_setBeginCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    _self->beginCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactEvents_00024Raw_getBeginEvents(JNIEnv*, jclass, jlong _address) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    return (jlong) _self->beginEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_setBeginEvents(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    _self->beginEvents = (b2ContactBeginTouchEvent*) value;
}
JNIEXPORT jint JNICALL Java_box2d_b2ContactEvents_00024Raw_getEndCount(JNIEnv*, jclass, jlong _address) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    return (jint) _self->endCount;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_setEndCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    _self->endCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactEvents_00024Raw_getEndEvents(JNIEnv*, jclass, jlong _address) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    return (jlong) _self->endEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_setEndEvents(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    _self->endEvents = (b2ContactEndTouchEvent*) value;
}
JNIEXPORT jint JNICALL Java_box2d_b2ContactEvents_00024Raw_getHitCount(JNIEnv*, jclass, jlong _address) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    return (jint) _self->hitCount;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_setHitCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    _self->hitCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactEvents_00024Raw_getHitEvents(JNIEnv*, jclass, jlong _address) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    return (jlong) _self->hitEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEvents_00024Raw_setHitEvents(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactEvents* _self = (b2ContactEvents*) _address;
    _self->hitEvents = (b2ContactHitEvent*) value;
}

// b2ContactBeginTouchEvent
JNIEXPORT jint JNICALL Java_box2d_b2ContactBeginTouchEvent__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ContactBeginTouchEvent);
}
JNIEXPORT void JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ContactBeginTouchEvent*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_getManifold(JNIEnv*, jclass, jlong _address) {
    b2ContactBeginTouchEvent* _self = (b2ContactBeginTouchEvent*) _address;
    return (jlong) &_self->manifold;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_setManifold(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactBeginTouchEvent* _self = (b2ContactBeginTouchEvent*) _address;
    _self->manifold = *((b2Manifold*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_getShapeIdA(JNIEnv*, jclass, jlong _address) {
    b2ContactBeginTouchEvent* _self = (b2ContactBeginTouchEvent*) _address;
    return (jlong) &_self->shapeIdA;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_setShapeIdA(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactBeginTouchEvent* _self = (b2ContactBeginTouchEvent*) _address;
    _self->shapeIdA = *((b2ShapeId*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_getShapeIdB(JNIEnv*, jclass, jlong _address) {
    b2ContactBeginTouchEvent* _self = (b2ContactBeginTouchEvent*) _address;
    return (jlong) &_self->shapeIdB;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactBeginTouchEvent_00024Raw_setShapeIdB(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactBeginTouchEvent* _self = (b2ContactBeginTouchEvent*) _address;
    _self->shapeIdB = *((b2ShapeId*) value);
}

// b2ContactEndTouchEvent
JNIEXPORT jint JNICALL Java_box2d_b2ContactEndTouchEvent__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ContactEndTouchEvent);
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEndTouchEvent_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ContactEndTouchEvent*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactEndTouchEvent_00024Raw_getShapeIdA(JNIEnv*, jclass, jlong _address) {
    b2ContactEndTouchEvent* _self = (b2ContactEndTouchEvent*) _address;
    return (jlong) &_self->shapeIdA;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEndTouchEvent_00024Raw_setShapeIdA(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactEndTouchEvent* _self = (b2ContactEndTouchEvent*) _address;
    _self->shapeIdA = *((b2ShapeId*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactEndTouchEvent_00024Raw_getShapeIdB(JNIEnv*, jclass, jlong _address) {
    b2ContactEndTouchEvent* _self = (b2ContactEndTouchEvent*) _address;
    return (jlong) &_self->shapeIdB;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactEndTouchEvent_00024Raw_setShapeIdB(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactEndTouchEvent* _self = (b2ContactEndTouchEvent*) _address;
    _self->shapeIdB = *((b2ShapeId*) value);
}

// b2ContactHitEvent
JNIEXPORT jint JNICALL Java_box2d_b2ContactHitEvent__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ContactHitEvent);
}
JNIEXPORT void JNICALL Java_box2d_b2ContactHitEvent_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ContactHitEvent*) _address;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ContactHitEvent_00024Raw_getApproachSpeed(JNIEnv*, jclass, jlong _address) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    return (jfloat) _self->approachSpeed;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactHitEvent_00024Raw_setApproachSpeed(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    _self->approachSpeed = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactHitEvent_00024Raw_getNormal(JNIEnv*, jclass, jlong _address) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    return (jlong) &_self->normal;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactHitEvent_00024Raw_setNormal(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    _self->normal = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactHitEvent_00024Raw_getPoint(JNIEnv*, jclass, jlong _address) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    return (jlong) &_self->point;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactHitEvent_00024Raw_setPoint(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    _self->point = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactHitEvent_00024Raw_getShapeIdA(JNIEnv*, jclass, jlong _address) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    return (jlong) &_self->shapeIdA;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactHitEvent_00024Raw_setShapeIdA(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    _self->shapeIdA = *((b2ShapeId*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ContactHitEvent_00024Raw_getShapeIdB(JNIEnv*, jclass, jlong _address) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    return (jlong) &_self->shapeIdB;
}
JNIEXPORT void JNICALL Java_box2d_b2ContactHitEvent_00024Raw_setShapeIdB(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ContactHitEvent* _self = (b2ContactHitEvent*) _address;
    _self->shapeIdB = *((b2ShapeId*) value);
}

// b2Manifold
JNIEXPORT jint JNICALL Java_box2d_b2Manifold__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Manifold);
}
JNIEXPORT void JNICALL Java_box2d_b2Manifold_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Manifold*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2Manifold_00024Raw_getNormal(JNIEnv*, jclass, jlong _address) {
    b2Manifold* _self = (b2Manifold*) _address;
    return (jlong) &_self->normal;
}
JNIEXPORT void JNICALL Java_box2d_b2Manifold_00024Raw_setNormal(JNIEnv*, jclass, jlong _address, jlong value) {
    b2Manifold* _self = (b2Manifold*) _address;
    _self->normal = *((b2Vec2*) value);
}
JNIEXPORT jint JNICALL Java_box2d_b2Manifold_00024Raw_getPointCount(JNIEnv*, jclass, jlong _address) {
    b2Manifold* _self = (b2Manifold*) _address;
    return (jint) _self->pointCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Manifold_00024Raw_setPointCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Manifold* _self = (b2Manifold*) _address;
    _self->pointCount = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2Manifold_00024Raw_getPoints(JNIEnv*, jclass, jlong _address, jint _index) {
    b2Manifold* _self = (b2Manifold*) _address;
    return (jlong) &_self->points[_index];
}
JNIEXPORT void JNICALL Java_box2d_b2Manifold_00024Raw_setPoints(JNIEnv*, jclass, jlong _address, jint _index, jlong value) {
    b2Manifold* _self = (b2Manifold*) _address;
    _self->points[_index] = *((b2ManifoldPoint*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Manifold_00024Raw_getRollingImpulse(JNIEnv*, jclass, jlong _address) {
    b2Manifold* _self = (b2Manifold*) _address;
    return (jfloat) _self->rollingImpulse;
}
JNIEXPORT void JNICALL Java_box2d_b2Manifold_00024Raw_setRollingImpulse(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Manifold* _self = (b2Manifold*) _address;
    _self->rollingImpulse = value;
}

// b2ManifoldPoint
JNIEXPORT jint JNICALL Java_box2d_b2ManifoldPoint__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ManifoldPoint);
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ManifoldPoint*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getAnchorA(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jlong) &_self->anchorA;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setAnchorA(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->anchorA = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getAnchorB(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jlong) &_self->anchorB;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setAnchorB(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->anchorB = *((b2Vec2*) value);
}
JNIEXPORT jshort JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getId(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jshort) _self->id;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setId(JNIEnv*, jclass, jlong _address, jshort value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->id = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getNormalImpulse(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jfloat) _self->normalImpulse;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setNormalImpulse(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->normalImpulse = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getNormalVelocity(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jfloat) _self->normalVelocity;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setNormalVelocity(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->normalVelocity = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getPersisted(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jboolean) _self->persisted;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setPersisted(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->persisted = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getPoint(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jlong) &_self->point;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setPoint(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->point = *((b2Vec2*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getSeparation(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jfloat) _self->separation;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setSeparation(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->separation = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getTangentImpulse(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jfloat) _self->tangentImpulse;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setTangentImpulse(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->tangentImpulse = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ManifoldPoint_00024Raw_getTotalNormalImpulse(JNIEnv*, jclass, jlong _address) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    return (jfloat) _self->totalNormalImpulse;
}
JNIEXPORT void JNICALL Java_box2d_b2ManifoldPoint_00024Raw_setTotalNormalImpulse(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ManifoldPoint* _self = (b2ManifoldPoint*) _address;
    _self->totalNormalImpulse = value;
}

// b2Counters
JNIEXPORT jint JNICALL Java_box2d_b2Counters__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Counters);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Counters_00024Raw_b2Counters(JNIEnv*, jclass) {
    return (jlong) new b2Counters();
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Counters*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getBodyCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->bodyCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setBodyCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->bodyCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getShapeCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->shapeCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setShapeCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->shapeCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getContactCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->contactCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setContactCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->contactCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getJointCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->jointCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setJointCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->jointCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getIslandCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->islandCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setIslandCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->islandCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getStackUsed(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->stackUsed;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setStackUsed(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->stackUsed = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getStaticTreeHeight(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->staticTreeHeight;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setStaticTreeHeight(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->staticTreeHeight = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getTreeHeight(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->treeHeight;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setTreeHeight(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->treeHeight = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getByteCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->byteCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setByteCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->byteCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getTaskCount(JNIEnv*, jclass, jlong _address) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->taskCount;
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setTaskCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->taskCount = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Counters_00024Raw_getColorCounts(JNIEnv*, jclass, jlong _address, jint _index) {
    b2Counters* _self = (b2Counters*) _address;
    return (jint) _self->colorCounts[_index];
}
JNIEXPORT void JNICALL Java_box2d_b2Counters_00024Raw_setColorCounts(JNIEnv*, jclass, jlong _address, jint _index, jint value) {
    b2Counters* _self = (b2Counters*) _address;
    _self->colorCounts[_index] = value;
}

// b2ExplosionDef
JNIEXPORT jint JNICALL Java_box2d_b2ExplosionDef__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2ExplosionDef);
}
JNIEXPORT jlong JNICALL Java_box2d_b2ExplosionDef_00024Raw_b2ExplosionDef_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2ExplosionDef();
}
JNIEXPORT jlong JNICALL Java_box2d_b2ExplosionDef_00024Raw_b2ExplosionDef(JNIEnv*, jclass) {
    return (jlong) new b2ExplosionDef();
}
JNIEXPORT void JNICALL Java_box2d_b2ExplosionDef_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2ExplosionDef*) _address;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ExplosionDef_00024Raw_getFalloff(JNIEnv*, jclass, jlong _address) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    return (jfloat) _self->falloff;
}
JNIEXPORT void JNICALL Java_box2d_b2ExplosionDef_00024Raw_setFalloff(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    _self->falloff = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ExplosionDef_00024Raw_getImpulsePerLength(JNIEnv*, jclass, jlong _address) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    return (jfloat) _self->impulsePerLength;
}
JNIEXPORT void JNICALL Java_box2d_b2ExplosionDef_00024Raw_setImpulsePerLength(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    _self->impulsePerLength = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ExplosionDef_00024Raw_getMaskBits(JNIEnv*, jclass, jlong _address) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    return (jlong) _self->maskBits;
}
JNIEXPORT void JNICALL Java_box2d_b2ExplosionDef_00024Raw_setMaskBits(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    _self->maskBits = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2ExplosionDef_00024Raw_getPosition(JNIEnv*, jclass, jlong _address) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    return (jlong) &_self->position;
}
JNIEXPORT void JNICALL Java_box2d_b2ExplosionDef_00024Raw_setPosition(JNIEnv*, jclass, jlong _address, jlong value) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    _self->position = *((b2Vec2*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2ExplosionDef_00024Raw_getRadius(JNIEnv*, jclass, jlong _address) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    return (jfloat) _self->radius;
}
JNIEXPORT void JNICALL Java_box2d_b2ExplosionDef_00024Raw_setRadius(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2ExplosionDef* _self = (b2ExplosionDef*) _address;
    _self->radius = value;
}

// b2Profile
JNIEXPORT jint JNICALL Java_box2d_b2Profile__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Profile);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Profile_00024Raw_b2Profile(JNIEnv*, jclass) {
    return (jlong) new b2Profile();
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Profile*) _address;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getStep(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->step;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setStep(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->step = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getPairs(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->pairs;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setPairs(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->pairs = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getCollide(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->collide;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setCollide(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->collide = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getSolve(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->solve;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setSolve(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->solve = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getMergeIslands(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->mergeIslands;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setMergeIslands(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->mergeIslands = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getPrepareStages(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->prepareStages;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setPrepareStages(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->prepareStages = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getSolveConstraints(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->solveConstraints;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setSolveConstraints(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->solveConstraints = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getPrepareConstraints(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->prepareConstraints;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setPrepareConstraints(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->prepareConstraints = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getIntegrateVelocities(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->integrateVelocities;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setIntegrateVelocities(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->integrateVelocities = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getWarmStart(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->warmStart;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setWarmStart(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->warmStart = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getSolveImpulses(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->solveImpulses;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setSolveImpulses(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->solveImpulses = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getIntegratePositions(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->integratePositions;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setIntegratePositions(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->integratePositions = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getRelaxImpulses(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->relaxImpulses;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setRelaxImpulses(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->relaxImpulses = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getApplyRestitution(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->applyRestitution;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setApplyRestitution(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->applyRestitution = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getStoreImpulses(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->storeImpulses;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setStoreImpulses(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->storeImpulses = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getSplitIslands(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->splitIslands;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setSplitIslands(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->splitIslands = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getTransforms(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->transforms;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setTransforms(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->transforms = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getHitEvents(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->hitEvents;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setHitEvents(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->hitEvents = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getRefit(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->refit;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setRefit(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->refit = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getBullets(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->bullets;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setBullets(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->bullets = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getSleepIslands(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->sleepIslands;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setSleepIslands(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->sleepIslands = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Profile_00024Raw_getSensors(JNIEnv*, jclass, jlong _address) {
    b2Profile* _self = (b2Profile*) _address;
    return (jfloat) _self->sensors;
}
JNIEXPORT void JNICALL Java_box2d_b2Profile_00024Raw_setSensors(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Profile* _self = (b2Profile*) _address;
    _self->sensors = value;
}

// b2WorldDef
JNIEXPORT jint JNICALL Java_box2d_b2WorldDef__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2WorldDef);
}
JNIEXPORT jlong JNICALL Java_box2d_b2WorldDef_00024Raw_b2WorldDef_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2WorldDef();
}
JNIEXPORT jlong JNICALL Java_box2d_b2WorldDef_00024Raw_b2WorldDef(JNIEnv*, jclass) {
    return (jlong) new b2WorldDef();
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2WorldDef*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2WorldDef_00024Raw_getGravity(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jlong) &_self->gravity;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setGravity(JNIEnv*, jclass, jlong _address, jlong value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->gravity = *((b2Vec2*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2WorldDef_00024Raw_getRestitutionThreshold(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jfloat) _self->restitutionThreshold;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setRestitutionThreshold(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->restitutionThreshold = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2WorldDef_00024Raw_getHitEventThreshold(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jfloat) _self->hitEventThreshold;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setHitEventThreshold(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->hitEventThreshold = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2WorldDef_00024Raw_getContactHertz(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jfloat) _self->contactHertz;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setContactHertz(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->contactHertz = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2WorldDef_00024Raw_getContactDampingRatio(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jfloat) _self->contactDampingRatio;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setContactDampingRatio(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->contactDampingRatio = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2WorldDef_00024Raw_getMaxContactPushSpeed(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jfloat) _self->maxContactPushSpeed;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setMaxContactPushSpeed(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->maxContactPushSpeed = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2WorldDef_00024Raw_getMaximumLinearSpeed(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jfloat) _self->maximumLinearSpeed;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setMaximumLinearSpeed(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->maximumLinearSpeed = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2WorldDef_00024Raw_getEnableSleep(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jboolean) _self->enableSleep;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setEnableSleep(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->enableSleep = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2WorldDef_00024Raw_getEnableContinuous(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jboolean) _self->enableContinuous;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setEnableContinuous(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->enableContinuous = value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2WorldDef_00024Raw_getUserData(JNIEnv*, jclass, jlong _address) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    return (jlong) _self->userData;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldDef_00024Raw_setUserData(JNIEnv*, jclass, jlong _address, jlong value) {
    b2WorldDef* _self = (b2WorldDef*) _address;
    _self->userData = (void*) value;
}

// b2WorldId
JNIEXPORT jint JNICALL Java_box2d_b2WorldId__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2WorldId);
}
JNIEXPORT jlong JNICALL Java_box2d_b2WorldId_00024Raw_b2WorldId(JNIEnv*, jclass) {
    return (jlong) new b2WorldId();
}
JNIEXPORT void JNICALL Java_box2d_b2WorldId_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2WorldId*) _address;
}
JNIEXPORT jshort JNICALL Java_box2d_b2WorldId_00024Raw_getGeneration(JNIEnv*, jclass, jlong _address) {
    b2WorldId* _self = (b2WorldId*) _address;
    return (jshort) _self->generation;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldId_00024Raw_setGeneration(JNIEnv*, jclass, jlong _address, jshort value) {
    b2WorldId* _self = (b2WorldId*) _address;
    _self->generation = value;
}
JNIEXPORT jshort JNICALL Java_box2d_b2WorldId_00024Raw_getIndex1(JNIEnv*, jclass, jlong _address) {
    b2WorldId* _self = (b2WorldId*) _address;
    return (jshort) _self->index1;
}
JNIEXPORT void JNICALL Java_box2d_b2WorldId_00024Raw_setIndex1(JNIEnv*, jclass, jlong _address, jshort value) {
    b2WorldId* _self = (b2WorldId*) _address;
    _self->index1 = value;
}

// B2_Base
JNIEXPORT jint JNICALL Java_box2d_B2_1Base__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_Base);
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Base_00024Raw_getVersion(JNIEnv*, jclass) {
    static thread_local b2Version _cache = B2_Base::getVersion();
    _cache = B2_Base::getVersion();
    return (jlong) &_cache;
}

// b2Version
JNIEXPORT jint JNICALL Java_box2d_b2Version__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Version);
}
JNIEXPORT void JNICALL Java_box2d_b2Version_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Version*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2Version_00024Raw_getMajor(JNIEnv*, jclass, jlong _address) {
    b2Version* _self = (b2Version*) _address;
    return (jint) _self->major;
}
JNIEXPORT void JNICALL Java_box2d_b2Version_00024Raw_setMajor(JNIEnv*, jclass, jlong _address, jint value) {
    b2Version* _self = (b2Version*) _address;
    _self->major = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Version_00024Raw_getMinor(JNIEnv*, jclass, jlong _address) {
    b2Version* _self = (b2Version*) _address;
    return (jint) _self->minor;
}
JNIEXPORT void JNICALL Java_box2d_b2Version_00024Raw_setMinor(JNIEnv*, jclass, jlong _address, jint value) {
    b2Version* _self = (b2Version*) _address;
    _self->minor = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Version_00024Raw_getRevision(JNIEnv*, jclass, jlong _address) {
    b2Version* _self = (b2Version*) _address;
    return (jint) _self->revision;
}
JNIEXPORT void JNICALL Java_box2d_b2Version_00024Raw_setRevision(JNIEnv*, jclass, jlong _address, jint value) {
    b2Version* _self = (b2Version*) _address;
    _self->revision = value;
}

// B2_Body
JNIEXPORT jint JNICALL Java_box2d_B2_1Body__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_Body);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_defaultBodyDef(JNIEnv*, jclass, jlong result) {
    B2_Body::defaultBodyDef(*((b2BodyDef*) result));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_createBody(JNIEnv*, jclass, jlong worldId, jlong def, jlong result) {
    B2_Body::createBody(*((b2WorldId*) worldId), (b2BodyDef*) def, *((b2BodyId*) result));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_destroyBody(JNIEnv*, jclass, jlong bodyId) {
    B2_Body::destroyBody(*((b2BodyId*) bodyId));
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1Body_00024Raw_isValid(JNIEnv*, jclass, jlong id) {
    return (jboolean) B2_Body::isValid(*((b2BodyId*) id));
}
JNIEXPORT jint JNICALL Java_box2d_B2_1Body_00024Raw_getType(JNIEnv*, jclass, jlong bodyId) {
    return (jint) B2_Body::getType(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setType(JNIEnv*, jclass, jlong bodyId, jint type) {
    B2_Body::setType(*((b2BodyId*) bodyId), (b2BodyType) type);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setName(JNIEnv* _env, jclass, jlong bodyId, jstring name) {
    B2_Body::setName(*((b2BodyId*) bodyId), _env->GetStringUTFChars(name, 0));
}
JNIEXPORT jstring JNICALL Java_box2d_B2_1Body_00024Raw_getName(JNIEnv* _env, jclass, jlong bodyId) {
    return _env->NewStringUTF(B2_Body::getName(*((b2BodyId*) bodyId)));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setUserData(JNIEnv*, jclass, jlong bodyId, jlong userData) {
    B2_Body::setUserData(*((b2BodyId*) bodyId), (void*) userData);
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getUserData(JNIEnv*, jclass, jlong bodyId) {
    return (jlong) B2_Body::getUserData(*((b2BodyId*) bodyId));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getPosition(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2Vec2 _cache = B2_Body::getPosition(*((b2BodyId*) bodyId));
    _cache = B2_Body::getPosition(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getRotation(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2Rot _cache = B2_Body::getRotation(*((b2BodyId*) bodyId));
    _cache = B2_Body::getRotation(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getTransform(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2Transform _cache = B2_Body::getTransform(*((b2BodyId*) bodyId));
    _cache = B2_Body::getTransform(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setTransform(JNIEnv*, jclass, jlong bodyId, jlong position, jlong rotation) {
    B2_Body::setTransform(*((b2BodyId*) bodyId), *((b2Vec2*) position), *((b2Rot*) rotation));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getLocalPoint(JNIEnv*, jclass, jlong bodyId, jlong worldPoint) {
    static thread_local b2Vec2 _cache = B2_Body::getLocalPoint(*((b2BodyId*) bodyId), *((b2Vec2*) worldPoint));
    _cache = B2_Body::getLocalPoint(*((b2BodyId*) bodyId), *((b2Vec2*) worldPoint));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getWorldPoint(JNIEnv*, jclass, jlong bodyId, jlong localPoint) {
    static thread_local b2Vec2 _cache = B2_Body::getWorldPoint(*((b2BodyId*) bodyId), *((b2Vec2*) localPoint));
    _cache = B2_Body::getWorldPoint(*((b2BodyId*) bodyId), *((b2Vec2*) localPoint));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getLocalVector(JNIEnv*, jclass, jlong bodyId, jlong worldVector) {
    static thread_local b2Vec2 _cache = B2_Body::getLocalVector(*((b2BodyId*) bodyId), *((b2Vec2*) worldVector));
    _cache = B2_Body::getLocalVector(*((b2BodyId*) bodyId), *((b2Vec2*) worldVector));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getWorldVector(JNIEnv*, jclass, jlong bodyId, jlong localVector) {
    static thread_local b2Vec2 _cache = B2_Body::getWorldVector(*((b2BodyId*) bodyId), *((b2Vec2*) localVector));
    _cache = B2_Body::getWorldVector(*((b2BodyId*) bodyId), *((b2Vec2*) localVector));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getLinearVelocity(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2Vec2 _cache = B2_Body::getLinearVelocity(*((b2BodyId*) bodyId));
    _cache = B2_Body::getLinearVelocity(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getAngularVelocity(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getAngularVelocity(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setLinearVelocity(JNIEnv*, jclass, jlong bodyId, jlong linearVelocity) {
    B2_Body::setLinearVelocity(*((b2BodyId*) bodyId), *((b2Vec2*) linearVelocity));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setAngularVelocity(JNIEnv*, jclass, jlong bodyId, jfloat angularVelocity) {
    B2_Body::setAngularVelocity(*((b2BodyId*) bodyId), angularVelocity);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setTargetTransform(JNIEnv*, jclass, jlong bodyId, jlong target, jfloat timeStep) {
    B2_Body::setTargetTransform(*((b2BodyId*) bodyId), *((b2Transform*) target), timeStep);
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getLocalPointVelocity(JNIEnv*, jclass, jlong bodyId, jlong localPoint) {
    static thread_local b2Vec2 _cache = B2_Body::getLocalPointVelocity(*((b2BodyId*) bodyId), *((b2Vec2*) localPoint));
    _cache = B2_Body::getLocalPointVelocity(*((b2BodyId*) bodyId), *((b2Vec2*) localPoint));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getWorldPointVelocity(JNIEnv*, jclass, jlong bodyId, jlong worldPoint) {
    static thread_local b2Vec2 _cache = B2_Body::getWorldPointVelocity(*((b2BodyId*) bodyId), *((b2Vec2*) worldPoint));
    _cache = B2_Body::getWorldPointVelocity(*((b2BodyId*) bodyId), *((b2Vec2*) worldPoint));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyForce(JNIEnv*, jclass, jlong bodyId, jlong force, jlong point, jboolean wake) {
    B2_Body::applyForce(*((b2BodyId*) bodyId), *((b2Vec2*) force), *((b2Vec2*) point), wake);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyForceToCenter(JNIEnv*, jclass, jlong bodyId, jlong force, jboolean wake) {
    B2_Body::applyForceToCenter(*((b2BodyId*) bodyId), *((b2Vec2*) force), wake);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyTorque(JNIEnv*, jclass, jlong bodyId, jfloat torque, jboolean wake) {
    B2_Body::applyTorque(*((b2BodyId*) bodyId), torque, wake);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyLinearImpulse(JNIEnv*, jclass, jlong bodyId, jlong impulse, jlong point, jboolean wake) {
    B2_Body::applyLinearImpulse(*((b2BodyId*) bodyId), *((b2Vec2*) impulse), *((b2Vec2*) point), wake);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyLinearImpulseToCenter(JNIEnv*, jclass, jlong bodyId, jlong impulse, jboolean wake) {
    B2_Body::applyLinearImpulseToCenter(*((b2BodyId*) bodyId), *((b2Vec2*) impulse), wake);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyAngularImpulse(JNIEnv*, jclass, jlong bodyId, jfloat impulse, jboolean wake) {
    B2_Body::applyAngularImpulse(*((b2BodyId*) bodyId), impulse, wake);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getMass(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getMass(*((b2BodyId*) bodyId));
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getRotationalInertia(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getRotationalInertia(*((b2BodyId*) bodyId));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getLocalCenterOfMass(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2Vec2 _cache = B2_Body::getLocalCenterOfMass(*((b2BodyId*) bodyId));
    _cache = B2_Body::getLocalCenterOfMass(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getWorldCenterOfMass(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2Vec2 _cache = B2_Body::getWorldCenterOfMass(*((b2BodyId*) bodyId));
    _cache = B2_Body::getWorldCenterOfMass(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setMassData(JNIEnv*, jclass, jlong bodyId, jlong massData) {
    B2_Body::setMassData(*((b2BodyId*) bodyId), *((b2MassData*) massData));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getMassData(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2MassData _cache = B2_Body::getMassData(*((b2BodyId*) bodyId));
    _cache = B2_Body::getMassData(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_applyMassFromShapes(JNIEnv*, jclass, jlong bodyId) {
    B2_Body::applyMassFromShapes(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setLinearDamping(JNIEnv*, jclass, jlong bodyId, jfloat linearDamping) {
    B2_Body::setLinearDamping(*((b2BodyId*) bodyId), linearDamping);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getLinearDamping(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getLinearDamping(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setAngularDamping(JNIEnv*, jclass, jlong bodyId, jfloat angularDamping) {
    B2_Body::setAngularDamping(*((b2BodyId*) bodyId), angularDamping);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getAngularDamping(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getAngularDamping(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setGravityScale(JNIEnv*, jclass, jlong bodyId, jfloat gravityScale) {
    B2_Body::setGravityScale(*((b2BodyId*) bodyId), gravityScale);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getGravityScale(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getGravityScale(*((b2BodyId*) bodyId));
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1Body_00024Raw_isAwake(JNIEnv*, jclass, jlong bodyId) {
    return (jboolean) B2_Body::isAwake(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setAwake(JNIEnv*, jclass, jlong bodyId, jboolean awake) {
    B2_Body::setAwake(*((b2BodyId*) bodyId), awake);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_enableSleep(JNIEnv*, jclass, jlong bodyId, jboolean enableSleep) {
    B2_Body::enableSleep(*((b2BodyId*) bodyId), enableSleep);
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1Body_00024Raw_isSleepEnabled(JNIEnv*, jclass, jlong bodyId) {
    return (jboolean) B2_Body::isSleepEnabled(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setSleepThreshold(JNIEnv*, jclass, jlong bodyId, jfloat sleepThreshold) {
    B2_Body::setSleepThreshold(*((b2BodyId*) bodyId), sleepThreshold);
}
JNIEXPORT jfloat JNICALL Java_box2d_B2_1Body_00024Raw_getSleepThreshold(JNIEnv*, jclass, jlong bodyId) {
    return (jfloat) B2_Body::getSleepThreshold(*((b2BodyId*) bodyId));
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1Body_00024Raw_isEnabled(JNIEnv*, jclass, jlong bodyId) {
    return (jboolean) B2_Body::isEnabled(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_disable(JNIEnv*, jclass, jlong bodyId) {
    B2_Body::disable(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_enable(JNIEnv*, jclass, jlong bodyId) {
    B2_Body::enable(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setFixedRotation(JNIEnv*, jclass, jlong bodyId, jboolean flag) {
    B2_Body::setFixedRotation(*((b2BodyId*) bodyId), flag);
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1Body_00024Raw_isFixedRotation(JNIEnv*, jclass, jlong bodyId) {
    return (jboolean) B2_Body::isFixedRotation(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_setBullet(JNIEnv*, jclass, jlong bodyId, jboolean flag) {
    B2_Body::setBullet(*((b2BodyId*) bodyId), flag);
}
JNIEXPORT jboolean JNICALL Java_box2d_B2_1Body_00024Raw_isBullet(JNIEnv*, jclass, jlong bodyId) {
    return (jboolean) B2_Body::isBullet(*((b2BodyId*) bodyId));
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_enableContactEvents(JNIEnv*, jclass, jlong bodyId, jboolean flag) {
    B2_Body::enableContactEvents(*((b2BodyId*) bodyId), flag);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Body_00024Raw_enableHitEvents(JNIEnv*, jclass, jlong bodyId, jboolean flag) {
    B2_Body::enableHitEvents(*((b2BodyId*) bodyId), flag);
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_getWorld(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2WorldId _cache = B2_Body::getWorld(*((b2BodyId*) bodyId));
    _cache = B2_Body::getWorld(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}
JNIEXPORT jint JNICALL Java_box2d_B2_1Body_00024Raw_getShapeCount(JNIEnv*, jclass, jlong bodyId) {
    return (jint) B2_Body::getShapeCount(*((b2BodyId*) bodyId));
}
JNIEXPORT jint JNICALL Java_box2d_B2_1Body_00024Raw_getJointCount(JNIEnv*, jclass, jlong bodyId) {
    return (jint) B2_Body::getJointCount(*((b2BodyId*) bodyId));
}
JNIEXPORT jint JNICALL Java_box2d_B2_1Body_00024Raw_getContactCapacity(JNIEnv*, jclass, jlong bodyId) {
    return (jint) B2_Body::getContactCapacity(*((b2BodyId*) bodyId));
}
JNIEXPORT jlong JNICALL Java_box2d_B2_1Body_00024Raw_computeAABB(JNIEnv*, jclass, jlong bodyId) {
    static thread_local b2AABB _cache = B2_Body::computeAABB(*((b2BodyId*) bodyId));
    _cache = B2_Body::computeAABB(*((b2BodyId*) bodyId));
    return (jlong) &_cache;
}

// b2BodyDef
JNIEXPORT jint JNICALL Java_box2d_b2BodyDef__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2BodyDef);
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyDef_00024Raw_b2BodyDef_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2BodyDef();
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyDef_00024Raw_b2BodyDef(JNIEnv*, jclass) {
    return (jlong) new b2BodyDef();
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2BodyDef*) _address;
}
JNIEXPORT jint JNICALL Java_box2d_b2BodyDef_00024Raw_getType(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jint) _self->type;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setType(JNIEnv*, jclass, jlong _address, jint value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->type = (b2BodyType) value;
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyDef_00024Raw_getPosition(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jlong) &_self->position;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setPosition(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->position = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyDef_00024Raw_getRotation(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jlong) &_self->rotation;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setRotation(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->rotation = *((b2Rot*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyDef_00024Raw_getLinearVelocity(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jlong) &_self->linearVelocity;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setLinearVelocity(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->linearVelocity = *((b2Vec2*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2BodyDef_00024Raw_getAngularVelocity(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jfloat) _self->angularVelocity;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setAngularVelocity(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->angularVelocity = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2BodyDef_00024Raw_getLinearDamping(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jfloat) _self->linearDamping;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setLinearDamping(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->linearDamping = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2BodyDef_00024Raw_getAngularDamping(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jfloat) _self->angularDamping;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setAngularDamping(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->angularDamping = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2BodyDef_00024Raw_getGravityScale(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jfloat) _self->gravityScale;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setGravityScale(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->gravityScale = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2BodyDef_00024Raw_getSleepThreshold(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jfloat) _self->sleepThreshold;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setSleepThreshold(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->sleepThreshold = value;
}
JNIEXPORT jstring JNICALL Java_box2d_b2BodyDef_00024Raw_getName(JNIEnv* _env, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return _env->NewStringUTF(_self->name);
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setName(JNIEnv* _env, jclass, jlong _address, jstring value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->name = _env->GetStringUTFChars(value, 0);
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyDef_00024Raw_getUserData(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jlong) _self->userData;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setUserData(JNIEnv*, jclass, jlong _address, jlong value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->userData = (void*) value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyDef_00024Raw_getEnableSleep(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jboolean) _self->enableSleep;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setEnableSleep(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->enableSleep = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyDef_00024Raw_getIsAwake(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jboolean) _self->isAwake;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setIsAwake(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->isAwake = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyDef_00024Raw_getFixedRotation(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jboolean) _self->fixedRotation;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setFixedRotation(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->fixedRotation = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyDef_00024Raw_getIsBullet(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jboolean) _self->isBullet;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setIsBullet(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->isBullet = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyDef_00024Raw_getIsEnabled(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jboolean) _self->isEnabled;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setIsEnabled(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->isEnabled = value;
}
JNIEXPORT jboolean JNICALL Java_box2d_b2BodyDef_00024Raw_getAllowFastRotation(JNIEnv*, jclass, jlong _address) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    return (jboolean) _self->allowFastRotation;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyDef_00024Raw_setAllowFastRotation(JNIEnv*, jclass, jlong _address, jboolean value) {
    b2BodyDef* _self = (b2BodyDef*) _address;
    _self->allowFastRotation = value;
}

// b2BodyId
JNIEXPORT jint JNICALL Java_box2d_b2BodyId__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2BodyId);
}
JNIEXPORT jlong JNICALL Java_box2d_b2BodyId_00024Raw_b2BodyId(JNIEnv*, jclass) {
    return (jlong) new b2BodyId();
}
JNIEXPORT void JNICALL Java_box2d_b2BodyId_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2BodyId*) _address;
}
JNIEXPORT jshort JNICALL Java_box2d_b2BodyId_00024Raw_getGeneration(JNIEnv*, jclass, jlong _address) {
    b2BodyId* _self = (b2BodyId*) _address;
    return (jshort) _self->generation;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyId_00024Raw_setGeneration(JNIEnv*, jclass, jlong _address, jshort value) {
    b2BodyId* _self = (b2BodyId*) _address;
    _self->generation = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2BodyId_00024Raw_getIndex1(JNIEnv*, jclass, jlong _address) {
    b2BodyId* _self = (b2BodyId*) _address;
    return (jint) _self->index1;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyId_00024Raw_setIndex1(JNIEnv*, jclass, jlong _address, jint value) {
    b2BodyId* _self = (b2BodyId*) _address;
    _self->index1 = value;
}
JNIEXPORT jshort JNICALL Java_box2d_b2BodyId_00024Raw_getWorld0(JNIEnv*, jclass, jlong _address) {
    b2BodyId* _self = (b2BodyId*) _address;
    return (jshort) _self->world0;
}
JNIEXPORT void JNICALL Java_box2d_b2BodyId_00024Raw_setWorld0(JNIEnv*, jclass, jlong _address, jshort value) {
    b2BodyId* _self = (b2BodyId*) _address;
    _self->world0 = value;
}

// B2_Geometry
JNIEXPORT jint JNICALL Java_box2d_B2_1Geometry__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(B2_Geometry);
}
JNIEXPORT void JNICALL Java_box2d_B2_1Geometry_00024Raw_makeBox(JNIEnv*, jclass, jfloat halfWidth, jfloat halfHeight, jlong result) {
    B2_Geometry::makeBox(halfWidth, halfHeight, *((b2Polygon*) result));
}
JNIEXPORT jint JNICALL Java_box2d_B2_1Geometry_00024Raw_getMAX_1POLYGON_1VERTICES(JNIEnv*, jclass) {
    return (jint) B2_Geometry::MAX_POLYGON_VERTICES;
}

// b2MassData
JNIEXPORT jint JNICALL Java_box2d_b2MassData__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2MassData);
}
JNIEXPORT jlong JNICALL Java_box2d_b2MassData_00024Raw_b2MassData_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2MassData();
}
JNIEXPORT jlong JNICALL Java_box2d_b2MassData_00024Raw_b2MassData(JNIEnv*, jclass) {
    return (jlong) new b2MassData();
}
JNIEXPORT void JNICALL Java_box2d_b2MassData_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2MassData*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2MassData_00024Raw_getCenter(JNIEnv*, jclass, jlong _address) {
    b2MassData* _self = (b2MassData*) _address;
    return (jlong) &_self->center;
}
JNIEXPORT void JNICALL Java_box2d_b2MassData_00024Raw_setCenter(JNIEnv*, jclass, jlong _address, jlong value) {
    b2MassData* _self = (b2MassData*) _address;
    _self->center = *((b2Vec2*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2MassData_00024Raw_getMass(JNIEnv*, jclass, jlong _address) {
    b2MassData* _self = (b2MassData*) _address;
    return (jfloat) _self->mass;
}
JNIEXPORT void JNICALL Java_box2d_b2MassData_00024Raw_setMass(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2MassData* _self = (b2MassData*) _address;
    _self->mass = value;
}
JNIEXPORT jfloat JNICALL Java_box2d_b2MassData_00024Raw_getRotationalInertia(JNIEnv*, jclass, jlong _address) {
    b2MassData* _self = (b2MassData*) _address;
    return (jfloat) _self->rotationalInertia;
}
JNIEXPORT void JNICALL Java_box2d_b2MassData_00024Raw_setRotationalInertia(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2MassData* _self = (b2MassData*) _address;
    _self->rotationalInertia = value;
}

// b2Polygon
JNIEXPORT jint JNICALL Java_box2d_b2Polygon__1_1sizeOf(JNIEnv*, jclass) {
    return sizeof(b2Polygon);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Polygon_00024Raw_b2Polygon_1placed(JNIEnv*, jclass, jlong _placement_address) {
    return (jlong) new((void*)_placement_address) b2Polygon();
}
JNIEXPORT jlong JNICALL Java_box2d_b2Polygon_00024Raw_b2Polygon(JNIEnv*, jclass) {
    return (jlong) new b2Polygon();
}
JNIEXPORT void JNICALL Java_box2d_b2Polygon_00024Raw_destroy(JNIEnv*, jclass, jlong _address) {
    delete (b2Polygon*) _address;
}
JNIEXPORT jlong JNICALL Java_box2d_b2Polygon_00024Raw_getVertices(JNIEnv*, jclass, jlong _address, jint _index) {
    b2Polygon* _self = (b2Polygon*) _address;
    return (jlong) &_self->vertices[_index];
}
JNIEXPORT void JNICALL Java_box2d_b2Polygon_00024Raw_setVertices(JNIEnv*, jclass, jlong _address, jint _index, jlong value) {
    b2Polygon* _self = (b2Polygon*) _address;
    _self->vertices[_index] = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Polygon_00024Raw_getNormals(JNIEnv*, jclass, jlong _address, jint _index) {
    b2Polygon* _self = (b2Polygon*) _address;
    return (jlong) &_self->normals[_index];
}
JNIEXPORT void JNICALL Java_box2d_b2Polygon_00024Raw_setNormals(JNIEnv*, jclass, jlong _address, jint _index, jlong value) {
    b2Polygon* _self = (b2Polygon*) _address;
    _self->normals[_index] = *((b2Vec2*) value);
}
JNIEXPORT jlong JNICALL Java_box2d_b2Polygon_00024Raw_getCentroid(JNIEnv*, jclass, jlong _address) {
    b2Polygon* _self = (b2Polygon*) _address;
    return (jlong) &_self->centroid;
}
JNIEXPORT void JNICALL Java_box2d_b2Polygon_00024Raw_setCentroid(JNIEnv*, jclass, jlong _address, jlong value) {
    b2Polygon* _self = (b2Polygon*) _address;
    _self->centroid = *((b2Vec2*) value);
}
JNIEXPORT jfloat JNICALL Java_box2d_b2Polygon_00024Raw_getRadius(JNIEnv*, jclass, jlong _address) {
    b2Polygon* _self = (b2Polygon*) _address;
    return (jfloat) _self->radius;
}
JNIEXPORT void JNICALL Java_box2d_b2Polygon_00024Raw_setRadius(JNIEnv*, jclass, jlong _address, jfloat value) {
    b2Polygon* _self = (b2Polygon*) _address;
    _self->radius = value;
}
JNIEXPORT jint JNICALL Java_box2d_b2Polygon_00024Raw_getCount(JNIEnv*, jclass, jlong _address) {
    b2Polygon* _self = (b2Polygon*) _address;
    return (jint) _self->count;
}
JNIEXPORT void JNICALL Java_box2d_b2Polygon_00024Raw_setCount(JNIEnv*, jclass, jlong _address, jint value) {
    b2Polygon* _self = (b2Polygon*) _address;
    _self->count = value;
}

// b2BodyType
JNIEXPORT jint JNICALL Java_box2d_b2BodyType__1getb2_1staticBody(JNIEnv*, jclass) {
    return b2_staticBody;
}
JNIEXPORT jint JNICALL Java_box2d_b2BodyType__1getb2_1kinematicBody(JNIEnv*, jclass) {
    return b2_kinematicBody;
}
JNIEXPORT jint JNICALL Java_box2d_b2BodyType__1getb2_1dynamicBody(JNIEnv*, jclass) {
    return b2_dynamicBody;
}


// on load callback executed by the JVM once the lib is loaded
JNIEXPORT jint JNI_OnLoad(JavaVM* vm, void*) {
    javaVm = vm;
    
    JNIEnv* env;
    if (vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK) {
        return JNI_ERR;
    }
    jniThreadEnv = JniThreadEnv(env);
    
    return JNI_VERSION_1_6;
}
} // /extern "C"
