// Plugins common for sub-modules
plugins {

	// Spring Boot plugin configuration
	id("org.springframework.boot")

	// Spring Boot dependency management configuration
	id("io.spring.dependency-management")

	// Kotlin compiler plugin for JVM
	kotlin("jvm")

	// Kotlin plugin for Spring
	kotlin("plugin.spring")
}

group = "dev.all_things.reference"
version = "1.0.0-SNAPSHOT"

// Spring Boot dependency overrides
extra["slf4j.version"] = "2.0.9"

// Enabled by 'Java' plugin
java {

}

// Enabled by 'Kotlin' plugin
kotlin {

	// JDK specific toolchain configuration
	jvmToolchain(21)

	compilerOptions {
		freeCompilerArgs.add("-Xjsr305=strict")
	}
}

// JUnit platform configuration
tasks.withType<Test> {
	useJUnitPlatform()
}

// Dependencies common for sub-modules
dependencies {

	// Logging
	implementation("org.springframework.boot:spring-boot-starter-log4j2")
	implementation("com.lmax:disruptor:3.4.4") // Required by Log4j2 for asynchronous logging

	// Spring framework
	implementation("org.springframework.boot:spring-boot-starter-web") {

		// Disabling default 'logback' logging in favor of Log4j2
		exclude("org.springframework.boot", "spring-boot-starter-logging")

		/**
		 * Disabling (unused but) vulnerable snakeyaml v1.33 dependency due to CVE-2022-41854 and CVE-2022-1471.
		 *
		 * CVE-2022-41854 6.5 Out-of-bounds Write vulnerability with medium severity found
		 * CVE-2022-1471 9.8 Deserialization of Untrusted Data vulnerability with high severity found
		 *
		 * Spring Boot v3.2.0 fixes the vulnerability.
		 */
		exclude("org.yaml", "snakeyaml")
	}

	// Testing
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}