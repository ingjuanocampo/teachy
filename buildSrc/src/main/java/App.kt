import base.classpath
import base.projectImplementation
import dependencies.*
import org.gradle.api.artifacts.dsl.DependencyHandler

const val domain = ":domain"
const val data = ":data"
const val common = ":common"

fun DependencyHandler.appDependencies() {
    appProjects()
    daggerWithAndroid()
    coroutinesWithAndroid()
    architectureComponents()
    material()
    firebase()
    navigationComponent()
    uiCommons()
    testAndroidDependencies()
}

fun DependencyHandler.classPathDependencies() {
    classpath("com.android.tools.build:gradle:$kotlinAndroidGradleVersion")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    classpath ("com.google.gms:google-services:$googleServiceVersion")
}

private fun DependencyHandler.appProjects() {
    projectImplementation(domain)
    projectImplementation(data)
    projectImplementation(common)
}