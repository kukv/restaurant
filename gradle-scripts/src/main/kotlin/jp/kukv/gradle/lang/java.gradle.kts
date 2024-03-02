package jp.kukv.gradle.lang

import gradle.kotlin.dsl.accessors._8d64fad5886059b90fb8a4487c92a243.main
import gradle.kotlin.dsl.accessors._8d64fad5886059b90fb8a4487c92a243.sourceSets
import gradle.kotlin.dsl.accessors._8d64fad5886059b90fb8a4487c92a243.test
import jp.kukv.extensions.libs
import jp.kukv.extensions.version

plugins {
    java
}

group = "jp.kukv"
version = "0.0.1-SNAPSHOT"

sourceSets {
    main {
        resources {
            srcDirs("src/main/java", "src/main/resources")
        }
    }
    test {
        resources {
            srcDirs("src/main/java", "src/main/resources")
            exclude("**/*.java")
        }
    }
}

tasks {
    compileJava {
        sourceCompatibility = libs.version("java").requiredVersion
    }
}
