package dependencies

import base.*
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

object Dependencies {

    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"

    const val dagger = "com.google.dagger:dagger:$daggerVersion"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$daggerVersion"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"

    const val picasso = "com.squareup.picasso:picasso:$picassoVersion"

    const val extensions =  "androidx.lifecycle:lifecycle-extensions:$architectureComponentVersion"
    const val viewModel =  "androidx.lifecycle:lifecycle-viewmodel-ktx:$architectureComponentVersion"
    const val liveDataLifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:$architectureComponentVersion"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$architectureComponentVersion"

    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:$androidXVersion"
    const val androidCore = "androidx.core:core-ktx:$androidXVersion"
    const val constraitLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    const val recyclerView = "androidx.recyclerview:recyclerview:$recyclerViewXVersion"

    const val androidXLegacy = "androidx.legacy:legacy-support-v4:$androidLegacyXVersion"
    const val androidMaterial = "com.google.android.material:material:$materialVersion"

    const val navigationAndroid = "androidx.navigation:navigation-fragment-ktx:$navigationComponent"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:$navigationComponent"
}

object Android {
    const val compileAndroidSdkVersion = ANDROID_Q
    const val minAndroidSdkVersion = ANDROID_LOLLIPOP
}


object TestDependecies {
    const val junit = "junit:junit:$junitVersion"
    const val androidTest = "androidx.test:runner:$androidRunnerVersion"
    const val espresso = "androidx.test.espresso:espresso-core:$androidEspresso"

}

fun DependencyHandler.kotlinClassPath() {
    classpath("com.android.tools.build:gradle:$kotlinAndroidGradleVersion")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
}


fun DependencyHandler.dagger() {
    implementation(Dependencies.dagger)
    kotlinImplementation(Dependencies.daggerCompiler)
}

fun DependencyHandler.coroutines() {
    implementation(Dependencies.coroutineCore)
}

fun DependencyHandler.navigationComponent() {
    implementation(Dependencies.navigationAndroid)
    implementation(Dependencies.navigationUI)
}

fun DependencyHandler.material() {
    implementation(Dependencies.androidMaterial)
    implementation(Dependencies.androidXLegacy)
}

fun DependencyHandler.coroutinesWithAndroid() {
    coroutines()
    implementation(Dependencies.coroutineAndroid)
}

fun DependencyHandler.daggerWithAndroid() {
    dagger()
    implementation(Dependencies.daggerAndroidSupport)
    kotlinImplementation(Dependencies.daggerAndroidProcessor)
}

fun DependencyHandler.testDependencies() {
    testImplementation(TestDependecies.junit)
}

fun DependencyHandler.testAndroidDependencies() {
    testDependencies()
    androidTestImplementation(TestDependecies.androidTest)
    androidTestImplementation(TestDependecies.espresso)
}

fun DependencyHandler.architectureComponents() {
    implementation(Dependencies.viewModel)
    implementation(Dependencies.extensions)
    implementation(Dependencies.liveDataLifeCycle)
    implementation(Dependencies.liveData)
}







