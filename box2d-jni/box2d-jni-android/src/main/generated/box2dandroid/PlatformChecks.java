package box2dandroid;


public class PlatformChecks {

    protected PlatformChecks() { }

    public static final int PLATFORM_WINDOWS = 1;
    public static final int PLATFORM_LINUX = 2;
    public static final int PLATFORM_MACOS = 4;
    public static final int PLATFORM_ANDROID = 8;
    public static final int PLATFORM_OTHER = -2147483648;
    
    private static int platformBit = PLATFORM_OTHER;
    
    public static void setPlatformBit(int platformBit) {
        PlatformChecks.platformBit = platformBit;
    }
    
    public static void requirePlatform(int supportedPlatforms, String name) {
        if ((supportedPlatforms & platformBit) == 0) {
            throw new RuntimeException(name + " is not supported on this platform. If you think this is a mistake, make sure the correct platform is set by calling PlatformChecks.setPlatformBit().");
        }
    }
}
