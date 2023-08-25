package dev.workingtheory.reference.service

import dev.workingtheory.reference.HelloWorldRepository
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
public class HelloWorldService
{
	private val logger = LogManager.getLogger(HelloWorldService::class.java)

	private final val repository: HelloWorldRepository

	constructor(repository: HelloWorldRepository)
	{
		this.repository = repository
	}

	fun getGreetingMessage(name: String): String
	{
		return "Hello, $name"
	}

	fun printMetrics()
	{
		logger.info("Current time is ${LocalDateTime.now()}")
	}
}