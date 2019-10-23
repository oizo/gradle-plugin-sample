
object Versions {
    const val kotlin = "1.3.50"
    const val android_gradle_plugin = "3.2.1"
    const val androidx_app_compat = "1.1.0"
    const val androidx_core_ktx = "1.1.0"
    const val androidx_junit = "1.1.1"
    const val androidx_espresso_core = "3.2.0"
    const val constraintlayout = "1.1.3"
    const val junit = "4.12"
}

object Androidx {
    const val app_compat = "androidx.appcompat:appcompat:${Versions.androidx_app_compat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.androidx_core_ktx}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val junit = "androidx.test.ext:junit:${Versions.androidx_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso_core}"
}

object Deps {
    val androidx = Androidx
    const val gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val junit = "junit:junit:${Versions.junit}"
}
