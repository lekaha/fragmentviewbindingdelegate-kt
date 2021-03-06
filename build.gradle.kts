// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://clojars.org/repo/") }
        maven { setUrl("https://jitpack.io") }
        maven { setUrl("https://maven.google.com") }
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://clojars.org/repo/") }
        maven { setUrl("https://jitpack.io") }
        maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { setUrl("https://maven.google.com") }
        jcenter()
    }
}

task("clean") {
    delete(rootProject.buildDir)
}
