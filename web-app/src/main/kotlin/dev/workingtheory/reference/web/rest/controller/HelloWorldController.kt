package dev.workingtheory.reference.web.rest.controller

import dev.workingtheory.reference.service.HelloWorldService
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/hello")
public class HelloWorldController(private val helloWorldService: HelloWorldService)
{
	private val logger = LogManager.getLogger(HelloWorldController::class.java)

	@ResponseBody
	@RequestMapping("/{name}")
	fun sayHello(@PathVariable("name") name: String): String
	{
		helloWorldService.printMetrics()

		return helloWorldService.getGreetingMessage(name)
	}
}