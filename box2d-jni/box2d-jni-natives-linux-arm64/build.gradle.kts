java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    withSourcesJar()
}

tasks["sourcesJar"].apply {
    this as Jar
    exclude("**/*.so")
    exclude("**/*.sha1")
}

tasks.register<Exec>("generateNativeProjectLinuxArm64") {
    group = "native build"
    workingDir = File("$rootDir/../box2d-native/build")
    commandLine = listOf("cmake", "-DCMAKE_BUILD_TYPE=Release", "..")

    doFirst {
        delete("$rootDir/../box2d-native/build")
        mkdir("$rootDir/../box2d-native/build")
    }
}

tasks.register<Exec>("buildNativeLibLinuxArm64") {
    dependsOn(":box2d-jni:generateJniNativeBindings")

    group = "native build"
    workingDir = File("$rootDir/../box2d-native/build")
    commandLine = listOf("cmake", "--build", ".", "--config", "Release")
    if (!workingDir.exists()) {
        dependsOn("generateNativeProjectLinuxArm64")
    }

    val resourcesDir = "${projectDir}/src/main/resources/de/fabmax/box2djni/linuxarm64/"
    doFirst {
        delete(resourcesDir)
    }
    doLast {
        copy {
            from("$rootDir/../box2d-native/build/lib/arm64")
            include("*.so")
            into(resourcesDir)
        }
        Sha1Helper.writeHashes(File(resourcesDir))
    }
}

dependencies {
    implementation(project(":box2d-jni"))
}