package box2dandroid;

public enum b2ShapeType {

    b2_circleShape(getb2_circleShape()),
    b2_capsuleShape(getb2_capsuleShape()),
    b2_segmentShape(getb2_segmentShape()),
    b2_polygonShape(getb2_polygonShape()),
    b2_chainSegmentShape(getb2_chainSegmentShape());
    public final int value;
    
    b2ShapeType(int value) {
        this.value = value;
    }

    private static native int _getb2_circleShape();
    private static int getb2_circleShape() {
        de.fabmax.box2dandroid.Loader.load();
        return _getb2_circleShape();
    }

    private static native int _getb2_capsuleShape();
    private static int getb2_capsuleShape() {
        de.fabmax.box2dandroid.Loader.load();
        return _getb2_capsuleShape();
    }

    private static native int _getb2_segmentShape();
    private static int getb2_segmentShape() {
        de.fabmax.box2dandroid.Loader.load();
        return _getb2_segmentShape();
    }

    private static native int _getb2_polygonShape();
    private static int getb2_polygonShape() {
        de.fabmax.box2dandroid.Loader.load();
        return _getb2_polygonShape();
    }

    private static native int _getb2_chainSegmentShape();
    private static int getb2_chainSegmentShape() {
        de.fabmax.box2dandroid.Loader.load();
        return _getb2_chainSegmentShape();
    }

    private static final int LUT_SIZE = 256;
    private static final b2ShapeType[] enumValues = values();
    private static final b2ShapeType[] enumLut = new b2ShapeType[LUT_SIZE];
    
    static {
        for (int i = 0; i < enumValues.length; i++) {
            final b2ShapeType it = enumValues[i];
            if (it.value >= 0 && it.value < LUT_SIZE) {
                enumLut[it.value] = it;
            }
        }
    }
    
    public static b2ShapeType forValue(int value) {
        b2ShapeType enumValue = null;
        if (value >= 0 && value < LUT_SIZE) {
            enumValue = enumLut[value];
        } else {
            for (int i = 0; i < enumValues.length; i++) {
                final b2ShapeType it = enumValues[i];
                if (it.value == value) {
                    enumValue = it;
                    break;
                }
            }
        }
        if (enumValue == null) {
            throw new IllegalArgumentException("Invalid ordinal value for enum b2ShapeType: " + value);
        }
        return enumValue;
    }
}
