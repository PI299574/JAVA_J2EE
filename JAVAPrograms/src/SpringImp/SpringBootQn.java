package SpringImp;

public class SpringBootQn {

}


/*
What is Spring Boot? Why should you use it?
Spring Boot is another Java framework from Sring umbrella which aims to simplify the use of Spring Framework for Java development.
It removes most of the pain associated with dealing with Spring e.g. a lot of configuration and dependencies and a lot of manual setups.

Why should you use it? Well, Spring Boot not only provides a lot of convenience by auto-configuration a lot of things for you but also
improves the productivity because it lets you focus only on writing your business logic.

For example, you don't need to setup a Tomcat server to run your web application. You can just write code and run it as Java application because
it comes with an embedded Tomcat server. You can also create a JAR file or WAR file for deployment based on your convenience.

In short, there are many reasons to use Spring Boot. In fact, it's now the standard way to develop Java application with Spring framework.



2. What are some important features of using Spring Boot?
This is a good subjective question and used by the interviewer to gauge the experience of a candidate with Spring Boot. Anyway,
following are some of the important features of Spring Boot framework:

1. Starter dependency
This feature aggregates common dependencies together. For example, if you want to develop Spring MVC based RESTful services then instead of
including Spring MVC JAR and Jackson JAR file into classpath you can just specify spring-boot-web-starter and it will automatically download
both those JAR files. Spring Boot comes with many such starter dependencies to improve productivity.

2. Auto-Configuration
This is another awesome features of Spring Boot which can configure many things for you. For example,
If you are developing Spring web application and Thymeleaf.jar is present on the classpath then it can automatically
configure Thymeleaf template resolver, view resolver, and other settings.
 A good knowledge of auto-configuration is required to become an experienced Spring Boot developers.

3. Spring Initializer
A web application which can create initial project structure for you. This simplifies initial project setup part.

4. Spring Actuator
This feature provides a lot of insights of a running Spring boot application.
For example, you can use Actuator to find out which beans are created in Spring's application context and which request path are mapped to controllers.

5. Spring CLI
This is another awesome feature of Spring Boot which really takes Spring development into next level.
It allows you to use Groovy for writing Spring boot application which means a lot more concise code.


3. What is auto-configuration in Spring boot? how does it help? Why Spring Boot is called opinionated?
There are a lot of questions in this one question itself, but let's first tackle auto-configuration. As explained in the previous example,
it automatically configures a lot of things based upon what is present in the classpath.

For example, it can configure JdbcTemplate if its present and a DataSource bean are available in the classpath.
It can even do some basic web security stuff if Spring security is present in the classpath.
the point is auto-configuration does a lot of work for you with respect to configuring beans, controllers, view resolvers etc, hence it helps a lot in creating a Java application.

Now, the big questions come, why it's considered opinionated? Well because it makes a judgment on its own. Sometimes it imports things which you don't want,
 but don't worry, Spring Boot also provides ways to override auto-configuration settings.

It's also disabled by default and you need to use either @SpringBootApplication or @EnableAutoConfiguration annotations on the Main class to enable the
auto-configuration feature.

4. What is starter dependency in Spring Boot? how does it help?
This question is generally asked as a follow-up of the previous question as it's quite similar to auto-configuration and many developers get confused between both of them.
As the name suggests, starter dependency deal with dependency management.

After examining several Spring-based projects Spring guys notice that there is always some set of libraries which are used together
e.g. Spring MVC with Jackson for creating RESTful web services. Since declaring a dependency in Maven's pom.xml is the pain, they
combined many libraries into one based upon functionality and created this starter package.

This not only frees you from declaring many dependencies but also fees you from compatibility and version mismatch issue.
Spring Boot starter automatically pulls compatible version of other libraries so that you can use them without worrying about any compatibility issue.



5. What is the difference between @SpringBootApplication and @EnableAutoConfiguration annotation?
Even though both are essential Spring Boot application and used in the Main class or Bootstrap class there is a subtle difference between them.
The @EnableAutoConfiguration is used to enable auto-configuration but @SpringBootApplication does a lot more than that.

It also combines @Configuration and @ComponentScan annotations to enable Java-based configuration and component scanning in your project.

The @SpringBootApplication is in fact combination of @Configuration, @ComponentScan and @EnableAutoConfiguration annotations.


6. What is Spring Initializer? why should you use it?
One of the difficult things to start with a framework is initial setup, particularly if you are starting from scratch and
you don't have a reference setup or project. Spring Initializer addresses this problem in Spring Boot.

It's nothing but a web application which helps you to create initial Spring boot project structure and provides Maven
or Gradle build file to build your code.

7. What is Spring Actuator? What are its advantages?
This is an interesting Spring Boot question and mostly asked on Java roles which also has some support responsibility.
Spring Actuator is another cool Spring Boot feature which allows seeing inside a running application.

Yes, you read it correctly. It allows you to see inside an application. Since Spring Boot is all about auto-configuration
it makes debugging difficult and at some point in time, you want to know which beans are created in Spring's Application Context
and how Controllers are mapped. Spring Actuator provides all that information.

It provides several endpoints e.g. a REST endpoint to retrieve this kind of information over the web.
It also provides a lot of insight and metrics about application health e.g. CPU and memory usage, number of threads etc.

It also comes with a remote shell which you can use to securely go inside Spring Boot application and run some command to
expose the same set of data. You can even use JMX to control this behavior at runtime.
Btw, it's important to secure your Spring Actuator endpoints because it exposes a lot of confidential information and a
 potentially dangerous one-two. For example, by using /showdown endpoint you can kill a Spring Boot application.


8. What is Spring Boot CLI? What are its benefits?
Spring Boot CLI is a command line interface which allows you to create Spring-based Java application using Groovy.
Since it's used Groovy, it allows you to create Spring Boot application from the command line without ceremony e.g.
you don't need to define getter and setter method, or access modifiers, return statements etc.

It's also very powerful and can auto-include a lot of library in Groovy's default package if you happen to use it.

For example, if you use JdbcTempalte, it can automatically load that for you. If you are interested in learning Spring Boot CLI, I recommend reading Spring Boot in Action book, another masterpiece from Craig Walls after Spring in Action.

best book to learn Spring Boot framework



9. Where do you define properties in Spring Boot application?
You can define both application and Spring boot related properties into a file called application.properties.
 You can create this file manually or you can use Spring Initializer to create this file, albeit empty.

You don't need to do any special configuration to instruct Spring Boot load this file. If it exists in
classpath then Spring Boot automatically loads it and configure itself and application code according.

For example, you can use to define a property to change the embedded server port in Spring Boot, which is also our next question.



10. Can you change the port of Embedded Tomcat server in Spring boot? If Yes, How?
Yes, we can change the port of Embedded Tomcat Server in Spring Boot by adding a property called server.port in the application.properties file.

As explained in the previous question, this property file is automatically loaded by Spring Boot and can be used to configure both
Spring Boot as well as application code.

11. What is the difference between an embedded container and a WAR?
The main difference between an embedded container and a WAR file is that you can Spring Boot application as a JAR from the command prompt without
setting up a web server. But to run a WAR file, you need to first set up a web server like Tomcat which has Servlet container and then you need
to deploy WAR there.


12. What embedded containers does Spring Boot support?
Spring Boot support three embedded containers: Tomcat, Jetty, and Undertow.
By default, it uses Tomcat as embedded containers but you can change it to Jetty or Undertow.


13. What are some common Spring Boot annotations?
Some of the most common Spring Boot annotations are @EnableAutoConfiguration, @SpringBootApplication, @SpringBootConfiguration, and @SpringBootTest.

The @EnableAutoConfiguration is used to enable auto-configuration on Spring Boot application,
while @SpringBootApplication is used on the Main class to allow it to run a JAR file.
@SpringBootTest is used to run unit test on Spring Boot environment.


14. Can you name some common Spring Boot Starter POMs?
Some of the most common Spring Boot Start dependencies or POMs are spring-boot-starter,
spring-boot-starter-web, spring-boot-starter-test.
You can use spring-boot-starter-web to enable Spring MVC in Spring Boot application.


15. Can you control logging with Spring Boot? How?
Yes, we can control logging with Spring Boot by specifying log levels on application.properties file.
Spring Boot loads this file when it exists in the classpath and it can be used to configure both Spring Boot and application code.

Spring Boot uses Commons Logging for all internal logging and you can change log levels by adding following lines in the application.properties file:

logging.level.org.springframework=DEBUG
logging.level.com.demo=INFO

*
) What does the @SpringBootApplication annotation do internally?

As per the Spring Boot doc, the @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration,
and @ComponentScan with their default attributes. Spring Boot enables the developer to use a single annotation instead of using multiple.
But, as we know, Spring provided loosely coupled features that we can use for each individual annotation as per our project needs.

2) How to exclude any package without using the basePackages filter?

There are different ways you can filter any package. But Spring Boot provides a trickier option for achieving this without
touching the component scan. You can use the exclude attribute while using the annotation  @SpringBootApplication. See the following code snippet:

@SpringBootApplication(exclude= {Employee.class})

public class FooAppConfiguration {}


3) How to disable a specific auto-configuration class?

You can use the exclude attribute of@EnableAutoConfiguration, if you find any specific auto-configuration classes
that you do not want are being applied.

//By using "exclude"

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})


On the other foot, if the class is not on the classpath, you can use the excludeName attribute of the annotation and
specify the fully qualified name instead.

//By using "excludeName"

@EnableAutoConfiguration(excludeName={Foo.class})


Also, Spring Boot provides the facility to control the list of auto-configuration classes to exclude by
using the spring.autoconfigure.exclude property. You can add into the application.properties.
And you can add multiple classes with comma separated.

//By using property file

spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration


4) What is Spring Actuator? What are its advantages?

This is one of the most common interview questions in Spring Boot. As per the Spring doc:

    "An actuator is a manufacturing term that refers to a mechanical device for moving or controlling something.
    Actuators can generate a large amount of motion from a small change."

As we know, Spring Boot provides lots of auto-configuration features that help developers quickly develop production components.
But if you think about debugging and how to debug, if something goes wrong, we always need to analyze the logs and dig through the data
flow of our application to check to see what's going on. So, the Spring Actuator provides easy access to those kinds of features.
It provides many features, i.e. what beans are created, the mapping in the controller, the CPU usage, etc.
Automatically gathering and auditing health and metrics can then be applied to your application.

It provides a very easy way to access the few production-ready REST endpoints and fetch all kinds of information from the web.
But by using these endpoints, you can do many things to see here the endpoint docs. There is no need to worry about security;
if Spring Security is present, then these endpoints are secured by default using Spring Security’s content-negotiation strategy.
Or else, we can configure custom security by the help of RequestMatcher.

5) How to enable/disable the Actuator?

Enabling/disabling the actuator is easy; the simplest way is to enable features to add the dependency
(Maven/Gradle) to the spring-boot-starter-actuator, i.e. Starter. If you don't want the actuator to be enabled, then don't add the dependency.

Maven dependency:

<dependencies>

<dependency>

<groupId>org.springframework.boot</groupId>

<artifactId>spring-boot-starter-actuator</artifactId>

</dependency>

</dependencies>


6) What is the Spring Initializer?

This may not be a difficult question, but the interviewer always checks the subject knowledge of the candidate.
It's often that you can't always expect questions that you have prepared. However, this is a very common question asked almost all of the time.

The Spring Initializer is a web application that generates a Spring Boot project with everything you need to start it quickly.
As always, we need a good skeleton of the project; it helps you to create a project structure/skeleton properly.


7) What is a shutdown in the actuator?

Shutdown is an endpoint that allows the application to be gracefully shutdown.
This feature is not enabled by default. You can enable this by using management.endpoint.shutdown.enabled=true in your application.properties file.
But be careful about this if you are using this.

8) Is this possible to change the port of Embedded Tomcat server in Spring boot?

Yes, it's possible to change the port. You can use the application.properties file to change the port.
But you need to mention "server.port" (i.e. server.port=8081). Make sure you have application.properties in your project classpath;
REST Spring framework will take care of the rest. If you mention server.port=0 , then it will automatically assign any available port.

9) Can we override or replace the Embedded Tomcat server in Spring Boot?

Yes, we can replace the Embedded Tomcat with any other servers by using the Starter dependencies.
You can use spring-boot-starter-jetty  or spring-boot-starter-undertow as a dependency for each project as you need.

10) Can we disable the default web server in the Spring Boot application?

The major strong point in Spring is to provide flexibility to build your application loosely coupled.
 Spring provides features to disable the web server in a quick configuration.
 Yes, we can use the application.properties to configure the web application type, i.e.  spring.main.web-application-type=none.
 
 What are Spring Boot Starter Projects?

 Starters are a set of convenient dependency descriptors that you can include in your application.
 You get a one-stop-shop for all the Spring and related technology that you need, without having to hunt through sample code
 and copy paste loads of dependency descriptors.

For example, if you want to get started using Spring and JPA for database access, just include the spring-boot-starter-data-jpa dependency
in your project, and you are good to go.
Q : Can you explain more about Starters with an example?

Let’s consider an example starter - Spring Boot Starter Web.

If you want to develop a web application or an application to expose restful services, Spring Boot Start Web is the starter to pick.
Lets create a quick project with Spring Boot Starter Web using Spring Initializr.

Dependency for Spring Boot Starter Web

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>


Dependencies can be classified into:

    Spring - core, beans, context, aop
    Web MVC - (Spring MVC)
    Jackson - for JSON Binding
    Validation - Hibernate Validator, Validation API
    Embedded Servlet Container - Tomcat
    Logging - logback, slf4j

Any typical web application would use all these dependencies. Spring Boot Starter Web comes pre packaged with these.
As a developer, I would not need to worry about either these dependencies or their compatible versions.
Q : What are the other Starter Project Options that Spring Boot provides?

Spring Boot also provides other starter projects including the typical dependencies to develop specific type of applications

    spring-boot-starter-web-services - SOAP Web Services
    spring-boot-starter-web - Web & RESTful applications
    spring-boot-starter-test - Unit testing and Integration Testing
    spring-boot-starter-jdbc - Traditional JDBC
    spring-boot-starter-hateoas - Add HATEOAS features to your services
    spring-boot-starter-security - Authentication and Authorization using Spring Security
    spring-boot-starter-data-jpa - Spring Data JPA with Hibernate
    spring-boot-starter-data-rest - Expose Simple REST Services using Spring Data REST

Q : How does Spring enable creating production ready applications in quick time?

Spring Boot aims to enable production ready applications in quick time. Spring Boot provides a few non functional features out of the box like caching, logging, monitoring and embedded servers.

    spring-boot-starter-actuator - To use advanced features like monitoring & tracing to your application out of the box
    spring-boot-starter-undertow, spring-boot-starter-jetty, spring-boot-starter-tomcat - To pick your specific choice of Embedded Servlet Container
    spring-boot-starter-logging - For Logging using logback
    spring-boot-starter-cache - Enabling Spring Framework’s caching support

What is the minimum baseline Java Version for Spring Boot 2 and Spring 5?

Spring Boot 2.0 requires Java 8 or later. Java 6 and 7 are no longer supported.

Q : Why do we need spring-boot-maven-plugin?
spring-boot-maven-plugin provides a few commands which enable you to package the code as a jar or run the application
    spring-boot:run runs your Spring Boot application.
    spring-boot:repackage repackages your jar/war to be executable.
    spring-boot:start and spring-boot:stop to manage the lifecycle of your Spring Boot application (i.e. for integration tests).
    spring-boot:build-info generates build information that can be used by the Actuator.

Q : How can I enable auto reload of my application with Spring Boot?

Use Spring Boot Developer Tools.
Adding Spring Boot Developer Tools to your project is very simple.
Add this dependency to your Spring Boot Project pom.xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
</dependency>

Restart the application.

Q : What and Why Embedded Servers?

Think about what you would need to be able to deploy your application (typically) on a virtual machine.

    Step 1 : Install Java
    Step 2 : Install the Web/Application Server (Tomcat/Websphere/Weblogic etc)
    Step 3 : Deploy the application war

What if we want to simplify this?

How about making the server a part of the application?
You would just need a virtual machine with Java installed and you would be able to directly deploy the application on the virtual machine.
Isn’t it cool?

This idea is the genesis for Embedded Servers.

When we create an application deployable, we would embed the server (for example, tomcat) inside the deployable.

    For example, for a Spring Boot Application, you can generate an application jar which contains Embedded Tomcat.
    You can run a web application as a normal Java application!

Embedded server is when our deployable unit contains the binaries for the server (example, tomcat.jar).
Q : How can I add custom JS code with Spring Boot?
Create a folder called static under resources folder. You can put your static content in that folder.
For your example the path to myapp.js would be resources\static\js\myapp.js
You can refer to it in jsp using
<script src="/js/myapp.js"></script>

Error : HAL browser gives me unauthorized error - Full authentication is required to access this resource. How can I fix it?

{
  "timestamp": 1488656019562,
  "status": 401,
  "error": "Unauthorized",
  "message": "Full authentication is required to access this resource.",
  "path": "/beans"
}

Two options
Option 1 : Disable security

application.properties
management.security.enabled: FALSE

Option 2 : Search for password in the log and pass it in the request header

Q : What is Spring Data?
Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the
special traits of the underlying data store. It makes it easy to use data access technologies, relational and non-relational databases,
map-reduce frameworks, and cloud-based data services.

To make it simpler, Spring Data provides Abstractions (interfaces) you can use irrespective of underlying data source.

An example is shown below

interface TodoRepository extends CrudRepository<Todo, Long> {

You can define a simple repository and use it to insert, update, delete and retrieve todo entities from the database - without writing a lot of code.
Q : What is Spring Data REST?

Spring Data REST can be used to expose HATEOAS RESTful resources around Spring Data repositories.

An example using JPA is shown below

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository
        extends PagingAndSortingRepository<Todo, Long> {

Without writing a lot of code, we can expose RESTful API around Spring Data Repositories.

A few example REST Services are shown below:
POST

    URL : http://localhost:8080/todos
    Use Header : Content-Type:application/json
    Request Content

{
  "user": "Jill",
  "desc": "Learn Hibernate",
  "done": false
}

Response Content

{
  "user": "Jill",
  "desc": "Learn Hibernate",
  "done": false,
  "_links": {
    "self": {
      "href": "http://localhost:8080/todos/1"
    },
    "todo": {
      "href": "http://localhost:8080/todos/1"
    }
  }
}

The response contains the href of the newly created resource.
Q : How does path=”users”, collectionResourceRel=”users” work with Spring Data Rest?

@RepositoryRestResource(collectionResourceRel = "users", path = "users")

public interface UserRestRepository extends
PagingAndSortingRepository<User, Long>

    path - The path segment under which this resource is to be exported.
    collectionResourceRel - The rel value to use when generating links to the collection resource. This is used when generating HATEOAS links.

Q : What happens in the background when a Spring Boot Application is “Run as Java Application”?

If you are using Eclipse IDE, Eclipse maven plugin ensures that as soon as you add a dependency or make a change to the class file,
it is compiled and ready in the target folder! And after that its just like any other Java application.

When you launch the java application, then the spring boot auto configuration magic kicks in.

    It launches up tomcat when it sees that you are developing a web application!

Q : Can we use jetty instead of tomcat in spring-boot-starter-web?

Remove the existing dependency on spring-boot-starter-web and add these in.

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>

Q : What is the difference between RequestMapping and GetMapping?
    RequestMapping is generic - you can use with GET, POST, PUT or any of the other request methods using the method attribute on the annotation.
    GetMapping is specific to GET request method. It’s just an extension of RequestMapping to improve clarity.

*/
