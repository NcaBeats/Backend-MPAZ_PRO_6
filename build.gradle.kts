plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(ktorLibs.plugins.ktor)
    alias(libs.plugins.kotlin.serialization)
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

application {
    mainClass = "io.ktor.server.netty.EngineMain"
}

kotlin {
    jvmToolchain(21)
}
dependencies {
    implementation(ktorLibs.serialization.kotlinx.json)
    implementation(ktorLibs.server.auth)
    implementation(ktorLibs.server.auth.jwt)
    implementation(ktorLibs.server.config.yaml)
    implementation(ktorLibs.server.contentNegotiation)
    implementation(ktorLibs.server.core)
    implementation(ktorLibs.server.cors)
    implementation(ktorLibs.server.di)
    implementation(ktorLibs.server.netty)
    implementation(ktorLibs.server.resources)
    implementation(ktorLibs.server.routingOpenapi)
    implementation(ktorLibs.server.swagger)
    implementation(libs.postgresql)
    implementation("io.ktor:ktor-client-resources:3.6.0")
    implementation("io.ktor:ktor-server-content-negotiation:3.6.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.6.0")
    implementation("org.jetbrains.exposed:exposed-core:1.3.1")
    implementation("org.jetbrains.exposed:exposed-r2dbc:1.3.1")
    implementation("com.h2database:h2:2.4.240")
    implementation("io.r2dbc:r2dbc-h2:1.1.0.RELEASE")

    testImplementation(kotlin("test"))
    testImplementation(ktorLibs.server.testHost)
}
