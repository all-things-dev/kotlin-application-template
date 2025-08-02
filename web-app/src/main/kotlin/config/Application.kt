package config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

/**
 * Acts as the entry point of the application and allows configuration of application startup properties.
 */
@ConfigurationPropertiesScan
@SpringBootApplication(scanBasePackages = ["config", "dev.workingtheory"])
public class Application : SpringBootServletInitializer()
{
	/**
	 * Configures {@link #main} as starting point of the application.
	 *
	 * @param builder instance of [SpringApplicationBuilder] for configuring application startup properties.
	 * @return configured [SpringApplicationBuilder] instance.
	 */
	override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder
	{
		return builder.sources(Application::class.java)
	}

	/**
	 * Apparently, Kotlin doesn't support static methods.
	 * Thus, [KotlinReferenceApplication.main] is required for implementing actual startup logic.
	 */
	companion object KotlinReferenceApplication
	{
		/**
		 * Application starting point.
		 *
		 * @param args program arguments.
		 */
		@JvmStatic
		fun main(args: Array<String>)
		{
			runApplication<Application>(*args)
		}
	}
}
