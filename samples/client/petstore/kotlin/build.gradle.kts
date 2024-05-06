plugins {
    kotlin("jvm") version "1.9.23"
    id("org.checkerframework") version "0.6.33"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.checkerframework:checker-qual:3.42.0")
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("junit:junit:4.13.2")
}

group = "org.openapijsonschematools"
version = "1.0.0"
description = "OpenAPI Kotlin"


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    withSourcesJar()
    withJavadocJar()
}

kotlin {
    jvmToolchain(17)
}

tasks.wrapper {
    gradleVersion = "8.1.1"
}