plugins {
    `kotlin-dsl`
    java
    `maven-publish`
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
    implementation(Deps.gradle_plugin)
}

tasks.register<Jar>("sourcesJar") {
    from(sourceSets.main.get().allJava)
    archiveClassifier.set("sources")
}

tasks.register<Jar>("javadocJar") {
    from(tasks.javadoc)
    archiveClassifier.set("javadoc")
}

publishing {
    publications {
        create<MavenPublication>("stringplugin") {
            artifactId = "stringplugin"
            artifact(tasks["sourcesJar"])
            artifact(tasks["javadocJar"])
            groupId = "io.hvam.android.plugin"
            version = "0.0.1"
            from(components["java"])
        }
    }
    repositories{
        maven {
            setUrl("my-custom-artifactory-url")
            credentials {
                username = "my-username"
                password = "my-password"
            }
        }
    }
}
