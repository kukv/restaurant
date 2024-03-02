package jp.kukv.gradle.frameworks

import jp.kukv._extensions.bundle
import jp.kukv._extensions.library
import jp.kukv._extensions.libs

plugins {
    id("jp.kukv.gradle.lang.java")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    implementation(libs.bundle("spring-boot-starter-api"))
    implementation(libs.bundle("spring-boot-starter-mybatis"))
    implementation(libs.bundle("spring-boot-starter-logging"))

    developmentOnly(libs.library("spring-boot-devtools"))
    annotationProcessor(libs.library("spring-boot-configuration-processor"))

    testImplementation(libs.bundle("spring-boot-starter-test"))
}

tasks {
    test {
        useJUnitPlatform()
    }
}
