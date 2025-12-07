package box2d;

public enum b2TOIState {

    b2_toiStateUnknown(getb2_toiStateUnknown()),
    b2_toiStateFailed(getb2_toiStateFailed()),
    b2_toiStateOverlapped(getb2_toiStateOverlapped()),
    b2_toiStateHit(getb2_toiStateHit()),
    b2_toiStateSeparated(getb2_toiStateSeparated());
    public final int value;
    
    b2TOIState(int value) {
        this.value = value;
    }

    private static native int _getb2_toiStateUnknown();
    private static int getb2_toiStateUnknown() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_toiStateUnknown();
    }

    private static native int _getb2_toiStateFailed();
    private static int getb2_toiStateFailed() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_toiStateFailed();
    }

    private static native int _getb2_toiStateOverlapped();
    private static int getb2_toiStateOverlapped() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_toiStateOverlapped();
    }

    private static native int _getb2_toiStateHit();
    private static int getb2_toiStateHit() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_toiStateHit();
    }

    private static native int _getb2_toiStateSeparated();
    private static int getb2_toiStateSeparated() {
        de.fabmax.box2djni.Loader.load();
        return _getb2_toiStateSeparated();
    }

    private static final int LUT_SIZE = 256;
    private static final b2TOIState[] enumValues = values();
    private static final b2TOIState[] enumLut = new b2TOIState[LUT_SIZE];
    
    static {
        for (int i = 0; i < enumValues.length; i++) {
            final b2TOIState it = enumValues[i];
            if (it.value >= 0 && it.value < LUT_SIZE) {
                enumLut[it.value] = it;
            }
        }
    }
    
    public static b2TOIState forValue(int value) {
        b2TOIState enumValue = null;
        if (value >= 0 && value < LUT_SIZE) {
            enumValue = enumLut[value];
        } else {
            for (int i = 0; i < enumValues.length; i++) {
                final b2TOIState it = enumValues[i];
                if (it.value == value) {
                    enumValue = it;
                    break;
                }
            }
        }
        if (enumValue == null) {
            throw new IllegalArgumentException("Invalid ordinal value for enum b2TOIState: " + value);
        }
        return enumValue;
    }
}
