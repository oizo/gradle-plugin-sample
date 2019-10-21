package io.hvam.android.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

open class StringPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        println("Hello, String Plugin!")
        project.afterEvaluate {
            val android = extensions.findByName("android") as BaseExtension
            task("StringTask") {
                android.productFlavors.all { flavor ->
                    flavor.resValue("string", "my_plugin_string", "Hello, World! From plugin")
                    true
                }
            }
        }
    }

}
