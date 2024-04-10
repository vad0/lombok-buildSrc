import root.Utils

plugins {
    id("java")
}

group = "vad0"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    Utils.waitSecond()
    useJUnitPlatform()
}
