package SpringImp;

public class AllAnnotations {

}

/*
 Spring Boot Annotations

Spring Boot Annotations is a form of metadata that provides data about a program. In other words, annotations are 
used to provide supplemental information about a program. 
It is not a part of the application that we develop. 
It does not have a direct effect on the operation of the code they annotate. It does not change the action of the compiled program.



@Required: It applies to the bean setter method. It indicates that the annotated bean 
must be populated at configuration time with the required property, else it throws an exception BeanInitilizationException.

Example

    public class Machine   
    {  
    private Integer cost;  
    @Required  
    public void setCost(Integer cost)   
    {  
    this.cost = cost;  
    }  
    public Integer getCost()   
    {  
    return cost;  
    }     
    }  

@Autowired: Spring provides annotation-based auto-wiring by providing @Autowired annotation. 
It is used to autowire spring bean on setter methods, instance variable, and constructor. 
When we use @Autowired annotation, the spring container auto-wires the bean by matching data-type.

Example

    @Component  
    public class Customer  
    {  
    private Person person;  
    @Autowired  
    public Customer(Person person)   
    {   
    this.person=person;  
    }  
    }  

@Configuration: It is a class-level annotation. 
The class annotated with @Configuration used by Spring Containers as a source of bean definitions.

Example

    @Configuration  
    public class Vehicle  
    {  
    @BeanVehicle engine()  
    {  
    return new Vehicle();  
    }  
    }  

@ComponentScan: It is used when we want to scan a package for beans. 
It is used with the annotation @Configuration. We can also specify the base packages to scan for Spring Components.

Example

    @ComponentScan(basePackages = "com.javatpoint")  
    @Configuration  
    public class ScanComponent  
    {  
    // ...  
    }  

@Bean: It is a method-level annotation. 
It is an alternative of XML <bean> tag. 
It tells the method to produce a bean to be managed by Spring Container.

Example

    @Bean  
    public BeanExample beanExample()   
    {  
    return new BeanExample ();  
    }  

Spring Framework Stereotype Annotations

@Component: It is a class-level annotation. 
It is used to mark a Java class as a bean. 
A Java class annotated with @Component is found during the classpath.
The Spring Framework pick it up and configure it in the application context as a Spring Bean.

Example

    @Component  
    public class Student  
    {  
    .......  
    }  

@Controller: The @Controller is a class-level annotation. 
It is a specialization of @Component. It marks a class as a web request handler. 
It is often used to serve web pages. By default, it returns a string that indicates which route to redirect.
 It is mostly used with @RequestMapping annotation.

Example

    @Controller  
    @RequestMapping("books")  
    public class BooksController   
    {  
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)  
    public Employee getBooksByName()   
    {  
    return booksTemplate;  
    }  
    }  

@Service: It is also used at class level. It tells the Spring that class contains the business logic.

Example

    package com.javatpoint;  
    @Service  
    public class TestService  
    {  
    public void service1()  
    {  
    //business code  
    }  
    }  

@Repository: It is a class-level annotation. 
The repository is a DAOs (Data Access Object) that access the database directly.
The repository does all the operations related to the database.

    package com.javatpoint;  
    @Repository   
    public class TestRepository  
    {  
    public void delete()  
    {     
    //persistence code  
    }  
    }  

Spring Boot Annotations

    @EnableAutoConfiguration: It auto-configures the bean that is present in the classpath and configures it to run the methods.
     The use of this annotation is reduced in Spring Boot 1.2.0 release because developers provided an alternative of the annotation,
      i.e. @SpringBootApplication.
    @SpringBootApplication: It is a combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.

@Qualifier

This annotation is used along with the @Autowired annotation. When you need more control of the dependency injection process, @Qualifier can be used. @Qualifier can be specified on individual constructor arguments or method parameters. This annotation is used to avoid the confusion that occurs when you create more than one bean of the same type and want to wire only one of them with a property.

Consider an example where an interface BeanInterface is implemented by two beans, BeanB1 and BeanB2.

@Component

public class BeanB1 implements BeanInterface {

    //

}

@Component

public class BeanB2 implements BeanInterface {

    //

}


Now, if BeanA autowires this interface, Spring will not know which one of the two implementations to inject.

One solution to this problem is the use of the @Qualifier annotation.

@Component

public class BeanA {

    @Autowired

    @Qualifier("beanB2")

    private IBean dependency;

    ...

}


With the @Qualifier annotation added, Spring will now know which bean to autowire, where beanB2 is the name of BeanB2.
@Configuration

This annotation is used on classes that define beans. @Configuration is an analog for an XML configuration file – it is configured using Java classes. A Java class annotated with @Configuration is a configuration by itself and will have methods to instantiate and configure the dependencies.

Here is an example:

@Configuartion

public class DataConfig {

    @Bean

    public DataSource source() {

        DataSource source = new OracleDataSource();

        source.setURL();

        source.setUser();

        return source;

    }

    @Bean

    public PlatformTransactionManager manager() {

        PlatformTransactionManager manager = new BasicDataSourceTransactionManager();

        manager.setDataSource(source());

        return manager;

    }

}


@ComponentScan

This annotation is used with the @Configuration annotation to allow Spring to know the packages to scan for annotated components. @ComponentScan is also used to specify base packages using basePackageClasses or basePackage attributes to scan. If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.
@Bean

This annotation is used at the method level. The @Bean annotation works with @Configuration to create Spring beans. As mentioned earlier, @Configuration  will have methods to instantiate and configure dependencies. Such methods will be annotated with @Bean. The method annotated with this annotation works as the bean ID, and it creates and returns the actual bean.

Here is an example:

@Configuration

public class AppConfig {

    @Bean

    public Person person() {

        return new Person(address());

    }

    @Bean

    public Address address() {

        return new Address();

    }

}


@Lazy

This annotation is used on component classes. 
By default, all autowired dependencies are created and configured at startup. 
But if you want to initialize a bean lazily, you can use the @Lazy annotation over the class. 
This means that the bean will be created and initialized only when it is first requested for.
You can also use this annotation on @Configuration classes. 
This indicates that all @Bean methods within that @Configuration should be lazily initialized.

@Value

This annotation is used at the field, constructor parameter, and method parameter levels. 
The @Value  annotation indicates a default value expression for the field or parameter to initialize the property with.
As the @Autowired annotation tells Spring to inject an object into another when it loads your application context, 
you can also use the @Value annotation to inject values from a property file into a bean’s attribute. 
It supports both #{...} and ${...} placeholders.

Spring Boot Annotations
@EnableAutoConfiguration

This annotation is usually placed on the main application class. 
The @EnableAutoConfiguration  annotation implicitly defines a base “search package”.
This annotation tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

@SpringBootApplication

This annotation is used on the application class while setting up a Spring Boot project. 
The class that is annotated with the @SpringBootApplication  must be kept in the base package. 
The one thing that the @SpringBootApplication does is a component scan. But it will scan only its sub-packages. 
As an example, if you put the class annotated with @SpringBootApplication in the com.example,
then @SpringBootApplication will scan all its sub-packages, such as com.example.a, com.example.b, and com.example.a.x.

The @SpringBootApplication  is a convenient annotation that adds all the following:

     @Configuration 
     @EnableAutoConfiguration 
     @ComponentScan 

@CrossOrigin

This annotation is used both at the class and method levels to enable cross-origin requests. In many cases, the host that serves JavaScript will be different from the host that serves the data. In such a case, Cross-Origin Resource Sharing (CORS) enables cross-domain communication. To enable this communication, you just need to add the @CrossOrigin  annotation.

By default, the @CrossOrigin annotation allows all origin, all headers, the HTTP methods specified in the @RequestMapping annotation, and a maxAge of 30 min. You can customize the behavior by specifying the corresponding attribute values.

An example of using @CrossOrigin at both the controller and handler method levels is below:

@CrossOrigin(maxAge = 3600)

@RestController

@RequestMapping("/account")

public class AccountController {

    @CrossOrigin(origins = "http://example.com")

    @RequestMapping("/message")

    public Message getMessage() {

        // ...

    }

    @RequestMapping("/note")

    public Note getNote() {

        // ...

    }

}


In this example, both the getExample() and getNote() methods will have a maxAge of 3600 seconds. 
Also,getExample() will only allow cross-origin requests 
from http://example.com, while getNote()  will allow cross-origin requests from all hosts.


Spring MVC and REST Annotations

    @RequestMapping: It is used to map the web requests. It has many optional elements like consumes, header, method, name,
     params, path, produces, and value. We use it with the class as well as the method.

Example

    @Controller  
    public class BooksController   
    {  
    @RequestMapping("/computer-science/books")  
    public String getAllBooks(Model model)  
    {  
    //application code  
    return "bookList";  
    }  

    @GetMapping: It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)
    @PostMapping: It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates It is used instead of using: @RequestMapping(method = RequestMethod.POST)
    @PutMapping: It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates It is used instead of using: @RequestMapping(method = RequestMethod.PUT)
    @DeleteMapping: It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)
    @PatchMapping: It maps the HTTP PATCH requests on the specific handler method. It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)
    @RequestBody: It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request. When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.
    @ResponseBody: It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.
    @PathVariable: It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple @PathVariable in a method.
    @RequestParam: It is used to extract the query parameters form the URL. It is also known as a query parameter. It is most suitable for web applications. It can specify default values if the query parameter is not present in the URL.
    @RequestHeader: It is used to get the details about the HTTP request headers. We use this annotation as a method parameter. The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. We can use it multiple time in a method
    @RestController: It can be considered as a combination of @Controller and @ResponseBody annotations. The @RestController annotation is itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.
    @RequestAttribute: It binds a method parameter to request attribute. It provides convenient access to the request attributes from a controller method. With the help of @RequestAttribute annotation, we can access objects that are populated on the server-side.

 */
