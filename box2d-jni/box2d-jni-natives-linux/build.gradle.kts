java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    withSourcesJar()
}

tasks["sourcesJar"].apply {
    this as Jar
    exclude("**/*.dylib")
    exclude("**/*.sha1")
}

tasks.register<Exec>("generateNativeProjectLinux") {
    group = "native build"
    workingDir = File("$rootDir/../box2d-native/build")
    commandLine = listOf("cmake", "-DCMAKE_BUILD_TYPE=Release", "-DBOX2D_AVX2=On", "..")

    doFirst {
        delete("$rootDir/../box2d-native/build")
        mkdir("$rootDir/../box2d-native/build")
    }
}

tasks.register<Exec>("buildNativeLibLinux") {
    dependsOn(":box2d-jni:generateJniNativeBindings")

    group = "native build"
    workingDir = File("$rootDir/../box2d-native/build")
    commandLine = listOf("cmake", "--build", ".", "--config", "Release")
    if (!workingDir.exists()) {
        dependsOn("generateNativeProjectLinux")
    }

    val resourcesDir = "${projectDir}/src/main/resources/de/fabmax/box2djni/linux/"
    doFirst {
        delete(resourcesDir)
    }
    doLast {
        copy {
            from("$rootDir/../box2d-native/build/lib/x64")
            include("*.so")
            into(resourcesDir)
        }
        Sha1Helper.writeHashes(File(resourcesDir))
    }
}

dependencies {
    implementation(project(":box2d-jni"))
}
