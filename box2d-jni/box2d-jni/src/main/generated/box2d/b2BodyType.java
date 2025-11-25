package box2d;

public enum b2BodyType {

    b2_staticBody(getb2_staticBody()),
    b2_kinematicBody(getb2_kinematicBody()),
    b2_dynamicBody(getb2_dynamicBody());
    public final int value;
    
    b2BodyType(int value) {
        this.value = value;
    }

    private static native int _getb2_staticBody();
    private static int getb2_staticBody() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_staticBody();
    }

    private static native int _getb2_kinematicBody();
    private static int getb2_kinematicBody() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_kinematicBody();
    }

    private static native int _getb2_dynamicBody();
    private static int getb2_dynamicBody() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_dynamicBody();
    }

    private static final int LUT_SIZE = 256;
    private static final b2BodyType[] enumValues = values();
    private static final b2BodyType[] enumLut = new b2BodyType[LUT_SIZE];
    
    static {
        for (int i = 0; i < enumValues.length; i++) {
            final b2BodyType it = enumValues[i];
            if (it.value >= 0 && it.value < LUT_SIZE) {
                enumLut[it.value] = it;
            }
        }
    }
    
    public static b2BodyType forValue(int value) {
        b2BodyType enumValue = null;
        if (value >= 0 && value < LUT_SIZE) {
            enumValue = enumLut[value];
        } else {
            for (int i = 0; i < enumValues.length; i++) {
                final b2BodyType it = enumValues[i];
                if (it.value == value) {
                    enumValue = it;
                    break;
                }
            }
        }
        if (enumValue == null) {
            throw new IllegalArgumentException("Invalid ordinal value for enum b2BodyType: " + value);
        }
        return enumValue;
    }
}
