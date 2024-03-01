plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(dependencyPlugins.spring.boot)
    implementation(dependencyPlugins.spring.dependency.management)
    implementation(dependencyPlugins.springdoc.openapi)
    implementation(dependencyPlugins.jig)
    implementation(dependencyPlugins.spotless)
    implementation(dependencyPlugins.ben.manes.versions)
}
