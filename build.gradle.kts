
plugins {
	id("org.springframework.boot") version "3.0.0-M5"
	id("io.spring.dependency-management") version "1.0.14.RELEASE"
	id("org.graalvm.buildtools.native") version "0.9.14"
	id("java")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
	withType<Test> {
		useJUnitPlatform()
	}
}
