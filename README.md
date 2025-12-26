# Kotlin Application Template
Template for developing future Kotlin applications.

## System Requirements

1. JDK 25 + Kotlin 2.3
2. Gradle 9.2
3. Spring Boot 4.0
4. Apache Tomcat 11.0

## Important Design Decisions

### Bean Proxying

For all applicable configuration annotations e.g. `@EnableAsync`, and `@EnableCaching` etc.,
`proxyTargetClass` needs to be set to `true` when proxy mode is `AdviceMode#PROXY` (which is set by default).
Default configuration (`mode = AdviceMode.PROXY` and `proxyTargetClass = false`) produces JDK proxy classes.
This is incompatible to be used with `ApplicationContext#getBean(Class)` e.g. `applicationContext.getBean(UserService.class)`.

### Bean Method Proxying

Method proxying is disabled for configuration classes with `@Configuration(proxyBeanMethods = false)`.
This is to avoid unnecessary proxying unless explicit calls to `@Bean` methods are required.  