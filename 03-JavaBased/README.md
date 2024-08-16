# Java-based Container Configurations

Ultimately, Spring framework went a step further to eliminate any inputs on XML-based configuration files.
It offers purely Java codes to implement Spring IoC container configurations.
In order to do the tricks, it brings two important annotations: `@Configuration` and `@Bean`
Let's dive into these configurations.<br>

## `@Configuration` Annotation
`@Configuration` is a class level annotation, similar to `@SpringBootAppcation`, but `@SpringBootApplication` is like
combination of `@Configuration`,`@EnableAutoConfiguration` and `@ComponentScan`.
`@Configuration` class declare beans through `@Bean` annotation methods. 
