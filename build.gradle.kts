plugins {
    kotlin("jvm") version "2.0.21"
    kotlin("plugin.serialization") version "1.6.10" // Serializador
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // Serializable JSON
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    // Serializable XML
    implementation("io.github.pdvrieze.xmlutil:serialization-jvm:0.90.3")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}