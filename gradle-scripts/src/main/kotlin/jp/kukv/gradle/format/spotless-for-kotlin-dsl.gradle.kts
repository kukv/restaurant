package jp.kukv.gradle.format

plugins {
    id("com.diffplug.spotless")
}

repositories {
    mavenCentral()
}

spotless {
    kotlin {
        target("gradle-scripts/**/*.kt")
        targetExclude("gradle-scripts/build/**/*.kt")

        ktlint()
    }
    kotlinGradle {
        target("*.gradle.kts", "**/*.gradle.kts")
        targetExclude("**/build/**/*.kts")

        ktlint()
    }
}
