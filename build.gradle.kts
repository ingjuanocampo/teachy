buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classPathDependencies()
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


allprojects {
    repositories {
        google()
        jcenter()

    }
}

configurations.all { isTransitive = false } // To keep clean architecture this configuration is required
