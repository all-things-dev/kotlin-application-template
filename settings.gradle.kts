rootProject.name = "kotlin-application-template"

// Global plugin management
pluginManagement {
	// Project level repositories for plugins
	repositories {

		// Google mirror of Maven Central for optimized performance
		google()

		// Maven Central (primary) plugin repository
		mavenCentral()

		// Gradle plugin repository
		gradlePluginPortal()

		// Spring repository for milestone plugins
		maven("https://repo.spring.io/milestone")
	}
}

// Global dependency management
dependencyResolutionManagement {
	/**
	 * Project level repositories for dependencies.
	 *
	 * Gradle uses its own repository by default.
	 * Maven repository needs to be explicitly configured.
	 */
	repositories {

		// Google mirror of Maven Central for optimized performance
		google()

		// Maven Central (primary) artifact repository
		mavenCentral()

		// Spring repository for milestone artifacts
		maven("https://repo.spring.io/milestone")
	}
}

// Project modules
include("web-app")

