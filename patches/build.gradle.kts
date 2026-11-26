group = "app.xenocord"

patches {
    about {
        name = "Xenocord"
        description = "Morphe patches focused exclusively on X (formerly Twitter)"
        source = "https://github.com/xxm-cmyk/XenoCord"
        author = "Xenocord contributors"
        contact = "https://github.com/xxm-cmyk/XenoCord/issues"
        website = "https://github.com/xxm-cmyk/XenoCord"
        license = "GNU General Public License v3.0 or later"
    }
}

dependencies {
    compileOnly("com.github.REAndroid:ARSCLib:a28c6fb2a7")

    // Used by JsonGenerator.
    implementation(libs.gson)

    implementation(libs.morphe.patches.library)
}

tasks {
    register<JavaExec>("checkStringResources") {
        description = "Checks resource strings for invalid formatting"

        dependsOn(compileKotlin)

        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("app.morphe.util.resource.CheckStringKt")
    }

    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("app.morphe.util.PatchListGeneratorKt")
    }
    // Used by gradle-semantic-release-plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}
