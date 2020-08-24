import dependencies.*
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.commonDependencies() {
    daggerWithAndroid()
    architectureComponents()
    uiCommons()
}