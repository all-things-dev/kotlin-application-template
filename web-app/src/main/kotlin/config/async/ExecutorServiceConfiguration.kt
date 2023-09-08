package config.async

import org.springframework.context.annotation.AdviceMode
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

/**
 * Provides beans and configuration required for application thread pool.
 */
@EnableScheduling
@Configuration(proxyBeanMethods = false)
@EnableAsync(mode = AdviceMode.PROXY, proxyTargetClass = true)
public class ExecutorServiceConfiguration
{

}