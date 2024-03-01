package jp.kukv.gradle.lang

plugins {
    java
}

group = "jp.kukv"
version = "0.0.1-SNAPSHOT"

tasks {
    compileJava {
        sourceCompatibility = "21"
    }
}
