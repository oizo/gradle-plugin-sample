
sourceSets {
    getByName("main").apply {
        java.srcDirs("../plugin/src/main/kotlin")
        resources.srcDirs("../plugin/src/main/resources")
    }
}
