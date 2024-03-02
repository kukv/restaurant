pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

includeBuild("gradle-scripts")
includeBuild("reservations")

rootProject.name = "restaurant"
