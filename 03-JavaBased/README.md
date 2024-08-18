# Java-based Container Configurations

Ultimately, Spring framework went a step further to eliminate any inputs on XML-based configuration files.
It offers purely Java codes to implement Spring IoC container configurations.
In order to do the tricks, it brings two important annotations: `@Configuration` and `@Bean`
Let's dive into these configurations.<br>

## `@Configuration`
`@Configuration` is a class level annotation, similar to `@SpringBootAppcation`, but `@SpringBootApplication` is like
combination of `@Configuration`,`@EnableAutoConfiguration` and `@ComponentScan`.
`@Configuration` class declare beans through `@Bean` annotation methods. It used to take over XML files.<br>

## `@ComponentScan`
Use `@ComponentScan(basePackages={p1,p2})`<br> instead of `<context:component-scan base-package="p1,p2" />`

## `@PropertySource`
Use `@ProperySource({"classpath:application.properties", "classpath:db.properties"})`<br> instead of `<context:property-placeholder location="classpath:application.properties,classpath:db.properties" />`

## `@Bean`
Use `@Bean` <br>
instead of `<bean id="" class="" />`, `id` refer to the method name.<br>
To get the bean use `AnnotationConfigApplicationContext` class.

