package jp.kukv.gradle.format

plugins {
    id("com.diffplug.spotless")
}

repositories {
    mavenCentral()
}

spotless {
    kotlinGradle {
        target("*.gradle.kts", "**/*.gradle.kts")
        targetExclude("**/build/**/*.kts")

        ktlint()
    }
}
