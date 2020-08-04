import base.implementation
import base.classpath
import base.projectImplementation
import dependencies.*
import org.gradle.api.artifacts.dsl.DependencyHandler

const val domain = ":domain"
const val data = ":data"

fun DependencyHandler.appDependencies() {
    appProjects()
    daggerWithAndroid()
    coroutinesWithAndroid()
    architectureComponents()
    material()
    navigationComponent()
    implementation(Dependencies.picasso)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.kotlinStdlib)
    implementation(Dependencies.constraitLayout)
    implementation(Dependencies.recyclerView)
    testAndroidDependencies()
}

fun DependencyHandler.classPathDependencies() {
    classpath("com.android.tools.build:gradle:$kotlinAndroidGradleVersion")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
}

private fun DependencyHandler.appProjects() {
    projectImplementation(domain)
    projectImplementation(data)
}