package box2d;

public enum b2JointType {

    b2_distanceJoint(getb2_distanceJoint()),
    b2_filterJoint(getb2_filterJoint()),
    b2_motorJoint(getb2_motorJoint()),
    b2_mouseJoint(getb2_mouseJoint()),
    b2_prismaticJoint(getb2_prismaticJoint()),
    b2_revoluteJoint(getb2_revoluteJoint()),
    b2_weldJoint(getb2_weldJoint()),
    b2_wheelJoint(getb2_wheelJoint());
    public final int value;
    
    b2JointType(int value) {
        this.value = value;
    }

    private static native int _getb2_distanceJoint();
    private static int getb2_distanceJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_distanceJoint();
    }

    private static native int _getb2_filterJoint();
    private static int getb2_filterJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_filterJoint();
    }

    private static native int _getb2_motorJoint();
    private static int getb2_motorJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_motorJoint();
    }

    private static native int _getb2_mouseJoint();
    private static int getb2_mouseJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_mouseJoint();
    }

    private static native int _getb2_prismaticJoint();
    private static int getb2_prismaticJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_prismaticJoint();
    }

    private static native int _getb2_revoluteJoint();
    private static int getb2_revoluteJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_revoluteJoint();
    }

    private static native int _getb2_weldJoint();
    private static int getb2_weldJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_weldJoint();
    }

    private static native int _getb2_wheelJoint();
    private static int getb2_wheelJoint() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_wheelJoint();
    }

    private static final int LUT_SIZE = 256;
    private static final b2JointType[] enumValues = values();
    private static final b2JointType[] enumLut = new b2JointType[LUT_SIZE];
    
    static {
        for (int i = 0; i < enumValues.length; i++) {
            final b2JointType it = enumValues[i];
            if (it.value >= 0 && it.value < LUT_SIZE) {
                enumLut[it.value] = it;
            }
        }
    }
    
    public static b2JointType forValue(int value) {
        b2JointType enumValue = null;
        if (value >= 0 && value < LUT_SIZE) {
            enumValue = enumLut[value];
        } else {
            for (int i = 0; i < enumValues.length; i++) {
                final b2JointType it = enumValues[i];
                if (it.value == value) {
                    enumValue = it;
                    break;
                }
            }
        }
        if (enumValue == null) {
            throw new IllegalArgumentException("Invalid ordinal value for enum b2JointType: " + value);
        }
        return enumValue;
    }
}
