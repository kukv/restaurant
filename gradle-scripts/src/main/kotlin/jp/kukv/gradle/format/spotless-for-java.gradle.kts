package jp.kukv.gradle.format

plugins {
    id("com.diffplug.spotless")
}

spotless {
    java {
        target("src/**/*.java")
        googleJavaFormat()
    }
}
