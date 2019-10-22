rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "Secure App"
include(
    ":app",
    ":remote",
    ":local",
    ":repository",
    ":domain",
    ":core",
    ":authentication"
)