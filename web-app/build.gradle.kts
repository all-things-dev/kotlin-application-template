description = "Web application module"

plugins {

	// Gradle WAR plugin configuration
	war

	// Spring Boot parent configuration for dependency management
	id("dev.all_things.reference.spring-boot-parent")
}

// Module specific dependencies
dependencies {

	/**
	 * Excluding embedded Tomcat dependencies from the package,
	 * as they are provided by the Tomcat container itself.
	 *
	 * This configuration is made available by the Gradle 'war' plugin.
	 */
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
}
