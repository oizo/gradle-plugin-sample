
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("io.hvam.android.plugin")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")
    defaultConfig {
        applicationId = "io.hvam.android.plugin.demo"
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Deps.kotlin)
    implementation(Deps.androidx.app_compat)
    implementation(Deps.androidx.core_ktx)
    implementation(Deps.androidx.constraintlayout)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidx.junit)
    androidTestImplementation(Deps.androidx.espresso_core)
}
