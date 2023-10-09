import org.jetbrains.kotlin.gradle.dsl.JvmTarget

description = "kotlin-application-parent"

// Convention plugin configuration
plugins {
	// Enables convention definitions in src/main/kotlin
	`kotlin-dsl`
}

// Java compiler configuration
java {

	/*
	 	Gradle v8.4 supports Kotlin DSL v1.9.10 which lacks support for Java 21 target.

		Although Kotlin compiler options are sufficient for Gradle,
		IntelliJ often complains if this Java target compatibility is not explicitly set.
	 */
	targetCompatibility = JavaVersion.VERSION_20
}

// Kotlin compiler configuration
kotlin {

	// JDK specific toolchain configuration
	jvmToolchain(21)

	compilerOptions {

		// Gradle v8.4 supports Kotlin DSL v1.9.10 which lacks support for Java 21 target.
		jvmTarget = JvmTarget.JVM_20
	}
}

// 'buildSrc' specific dependencies
dependencies {

	// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20-Beta2")
	implementation("org.jetbrains.kotlin:kotlin-allopen:1.9.20-Beta2")

	// Spring Boot
	implementation("org.springframework.boot:spring-boot-gradle-plugin:3.1.4")
}