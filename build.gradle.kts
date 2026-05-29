plugins {
    kotlin("jvm") version "2.3.20"
}

group = "com.github.slavikjunior"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}