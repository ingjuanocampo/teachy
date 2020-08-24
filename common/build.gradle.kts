import dependencies.Android.compileAndroidSdkVersion
import dependencies.Android.minAndroidSdkVersion
import org.gradle.kotlin.dsl.kotlin

plugins {
    id("com.android.library")
    kotlin ("android")
    kotlin("kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(compileAndroidSdkVersion)


    defaultConfig {
        minSdkVersion(minAndroidSdkVersion)
        targetSdkVersion(compileAndroidSdkVersion)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    commonDependencies()
}
