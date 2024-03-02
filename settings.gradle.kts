pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

includeBuild("gradle-scripts")
includeBuild("internal-api/reservations")

rootProject.name = "restaurant"
