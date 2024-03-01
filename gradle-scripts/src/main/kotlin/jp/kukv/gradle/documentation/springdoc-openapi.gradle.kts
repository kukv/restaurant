package jp.kukv.gradle.documentation

import jp.kukv._extensions.library
import jp.kukv._extensions.libs

plugins {
    id("jp.kukv.gradle.lang.java")
    id("org.springdoc.openapi-gradle-plugin")
}

dependencies {
    implementation(libs.library("springdoc-openapi-starter-webmvc-ui"))
}
