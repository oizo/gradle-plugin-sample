plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.5.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
}

sourceSets {
    getByName("main").apply {
        java.srcDirs("../plugin/src/main/kotlin")
        resources.srcDirs("../plugin/src/main/resources")
    }
}
