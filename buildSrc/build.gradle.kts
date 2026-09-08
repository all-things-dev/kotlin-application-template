import org.jetbrains.kotlin.gradle.dsl.JvmTarget

description = "kotlin-application-parent"

// Convention plugin configuration
plugins {
	// Enables convention definitions in src/main/kotlin
	`kotlin-dsl`
}

// Java compiler configuration
java {

	/**
	 * Configuring Java target compatibility.
	 *
	 * Although Kotlin compiler options are sufficient for Gradle,
	 * IntelliJ often complains if this Java target compatibility is not explicitly set.
	 */
	targetCompatibility = JavaVersion.VERSION_26
}

// Kotlin compiler configuration
kotlin {

	// JDK specific toolchain configuration
	jvmToolchain(27)

	compilerOptions {

		// Kotlin target compatibility
		jvmTarget = JvmTarget.JVM_26
	}
}

// 'buildSrc' specific dependencies
dependencies {

	// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.4.20")
	implementation("org.jetbrains.kotlin:kotlin-allopen:2.4.20")

	// Spring Boot
	implementation("org.springframework.boot:spring-boot-gradle-plugin:4.1.1")
}