package jp.kukv.gradle.documentation

plugins {
    java
    id("org.dddjava.jig-gradle-plugin")
}

tasks {
    classes {
        mustRunAfter(clean)
    }

    jigReports {
        dependsOn(clean, classes)
    }
}
