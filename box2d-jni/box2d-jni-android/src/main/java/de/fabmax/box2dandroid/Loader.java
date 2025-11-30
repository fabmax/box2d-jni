package de.fabmax.box2dandroid;

import android.util.Log;
import box2dandroid.PlatformChecks;

import java.util.concurrent.atomic.AtomicBoolean;

public class Loader {

    private static final AtomicBoolean isLoaded = new AtomicBoolean(false);

    public static void load() {
        if (!isLoaded.getAndSet(true)) {
            System.loadLibrary("Box2dJniBindings");
            PlatformChecks.setPlatformBit(PlatformChecks.PLATFORM_ANDROID);
            Log.i("box2d-jni", "Loaded native libraries");
        }
    }
}
