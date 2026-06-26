plugins {
    id("groovy-gradle-plugin")
    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.2.21")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}