# Spring Bean Example Projects

[Spring Framework](https://spring.io/) provides __XML-based Configuration__, __Annotation-based Configuration__ and __Java-based Configuration__  to configure beans to be used in the application.
This project is demonstrating three different ways of configure beans in Spring Application.

## Spring IoC Container
Spring IoC container is the program that injects dependencies into an object and make it ready for our use.<br>
Spring IoC container classes are part of `org.springframework.beans` and `org.springframework.context` packages.<br>
Spring IoC container provides us different ways to decouple the object dependencies.<br>

`BeanFactory`: is the __root interface__ of Spring IoC container.<br>
&emsp;&emsp;&emsp;&darr;<br>
`ApplicationContext`: is the __child interface__ of `BeanFactory` interface that provide Spring AOP features, i18n etc<br>
&nbsp;|<br>
&nbsp;|&nbsp;&rarr;&emsp;`ClassPathXmlApplicationContext`: Load the file and get the container object from XML configuration file.<br>
&nbsp;|&nbsp;&rarr;&emsp;`FileSystemXmlApplicationContext`: Can be loaded from anywhere in the file system.<br>
&nbsp;|&nbsp;&rarr;&emsp;`AnnotationConfigApplicationContext`: we can use this to initialize the container and get the bean objects.<br>
&nbsp;|&nbsp;&rarr;&emsp;`WebApplicationContext`: <br>

## Spring Bean Configuration

Spring Framework provides three ways to configure beans to be used in the application.
1. __XML Based Configuration__ <br>
   To utilise the XML-based configuration, you need to create XML file under `resource` folder, and put `<bean id='instanceName' class='com.fullclassname' >'` to create Beans.<br>
   More details jump to [XML-Based Configuration](01_XMLBased/README.md)

2. __Annotation Based Configuration__ <br>
   By using `@Service` or `@Component` annotations. Scope details can be provided with `@Scope` annotation.<br>
   However, you still need put `<context:component-scan base-package="com.xxx.xx,com.yyy.yy" />` tag in your XML configuration file.<br>

3. __Java Based Configuration__ <br>
   Starting from Spring 3.0, we can configure Spring beans using java programs. <br>
   Some important annotations used for java based configuration are `@Configuration`, `@ComponentScan` and `@Bean`.<br>

## Spring Bean Scopes
There are five scopes defined for Spring Beans.<br>

1. __singleton__ <br>
   Only one instance of the bean will be created for each container. This is the default scope for the spring beans. While using this scope, make sure bean doesn't have shared instance variables otherwise it might lead to data inconsistency issues.
2. __prototype__ <br>
   A new instance will be created every time the bean is requested.
3. __request__ <br>
   This is same as prototype scope, however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.
4. __session__ <br>
   A new bean will be created for each HTTP session by the container.
5. __global-session__ <br>
   This is used to create global session beans for Portlet applications.


