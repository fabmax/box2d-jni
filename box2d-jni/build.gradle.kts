plugins {
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.mavenPublish) apply false
}

subprojects {
    group = "de.fabmax.box2d-jni"
    version = "2.0.0"

    if (name != "box2d-jni-android") {
        apply(plugin = "java-library")

        tasks["jar"].apply {
            this as Jar
            from("$rootDir/LICENSE", "$rootDir/NOTICE.md")
        }
    }
}
