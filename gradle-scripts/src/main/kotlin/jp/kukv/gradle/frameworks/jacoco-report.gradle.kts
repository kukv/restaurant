package jp.kukv.gradle.frameworks

import org.gradle.kotlin.dsl.jacoco

plugins {
    id("jp.kukv.gradle.lang.java")
    jacoco
}

tasks {
    jacocoTestReport {
        reports {
            xml.required = true
        }
    }
}
