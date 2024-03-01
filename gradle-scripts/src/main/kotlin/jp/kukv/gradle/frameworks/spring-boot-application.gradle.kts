package jp.kukv.gradle.frameworks

import gradle.kotlin.dsl.accessors._ff4b6d65ba4a02d3c13400923b20ad2d.implementation
import gradle.kotlin.dsl.accessors._ff4b6d65ba4a02d3c13400923b20ad2d.runtimeOnly
import jp.kukv._extensions.library
import jp.kukv._extensions.libs

plugins {
    id("jp.kukv.gradle.lang.java")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    implementation(libs.library("spring-boot-starter"))
    implementation(libs.library("spring-boot-starter-validation"))

    implementation(libs.library("mybatis-spring-boot-starter"))
    runtimeOnly(libs.library("postgresql-jdbc"))

    testImplementation(libs.library("spring-boot-starter-test"))
}

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
    test {
        useJUnitPlatform()
    }
}
