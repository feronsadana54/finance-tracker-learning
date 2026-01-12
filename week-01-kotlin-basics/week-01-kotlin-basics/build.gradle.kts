plugins {
    kotlin("jvm") version "2.2.21"
    application
}

group = "com.feron"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass = "app.MainKt"
}

tasks.test {
    useJUnitPlatform()
}