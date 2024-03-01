package jp.kukv.gradle.dependency

plugins {
    id("com.github.ben-manes.versions")
}

fun String.isNonStable(): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(this)
    return isStable.not()
}

tasks {
    dependencyUpdates {
        rejectVersionIf {
            candidate.version.isNonStable()
        }

        rejectVersionIf {
            candidate.version.isNonStable() && !currentVersion.isNonStable()
        }

        resolutionStrategy {
            componentSelection {
                all {
                    if (candidate.version.isNonStable() && !currentVersion.isNonStable()) {
                        reject("Release candidate")
                    }
                }
            }
        }

        checkForGradleUpdate = true
        outputFormatter = "json"
        outputDir = "build/dependencyUpdates"
        reportfileName = "report"
    }
}
