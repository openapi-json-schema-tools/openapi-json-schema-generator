import org.checkerframework.gradle.plugin.CheckerFrameworkExtension

plugins {
    `java-library`
    `maven-publish`
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
    checkerFramework("org.checkerframework:checker:3.42.0")
}

configure<CheckerFrameworkExtension> {
    checkers = listOf(
        "org.checkerframework.checker.nullness.NullnessChecker"
    )
}

group = "org.openapijsonschematools"
version = "1.0.0"
description = "petstore"
java.sourceCompatibility = JavaVersion.VERSION_17

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        artifact(testsJar)
    }
}

tasks.wrapper {
    gradleVersion = "8.7"
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    enabled = false
    options.encoding = "UTF-8"
}
