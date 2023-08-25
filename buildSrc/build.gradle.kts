description = "kotlin-application-parent"

// Convention plugin configuration
plugins {
	// Enables convention definitions in src/main/kotlin
	`kotlin-dsl`
}

// 'buildSrc' specific dependencies
dependencies {

	// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
	implementation("org.jetbrains.kotlin:kotlin-allopen:1.9.10")

	// Spring Boot
	implementation("org.springframework.boot:spring-boot-gradle-plugin:3.1.3")
}