package HibernateImp;

public class SpringData_JPA_Hibernate {

}
/*
 What Is Java Persistence API?

The Java Persistence API provides a specification for persisting, reading, and managing data from your Java object to relational tables in the database.

What Is Hibernate Framework?

Hibernate is an object-relational mapping solution for Java environments. Object-relational mapping or ORM is the programming technique
to map application domain model objects to the relational database tables. Hibernate is a Java-based ORM tool that provides a framework
for mapping application domain objects to the relational database tables and vice versa.

Hibernate provides a reference implementation of the Java Persistence API that makes it a great choice as ORM tool with benefits of loose coupling.


Note that JPA is a specification and Hibernate is a JPA provider or implementation.
What Is Spring Data JPA?

Spring Data is a part of the Spring Framework. The goal of Spring Data repository abstraction is to significantly reduce the amount of
boilerplate code required to implement data access layers for various persistence stores.

Spring Data JPA is not a JPA provider. It is a library/framework that adds an extra layer of abstraction on the top of our
JPA provider (like Hibernate).



Now, you are familiar with Definition of JPA, Hibernate, and Spring Data JPA. Now, let's discuss the difference between Hibernate and Spring Data JPA.
What Is the Difference Between Hibernate and Spring Data JPA?

Hibernate is a JPA implementation, while Spring Data JPA is a JPA Data Access Abstraction. Spring Data offers a solution to GenericDao custom
implementations. It can also generate JPA queries on your behalf through method name conventions.

With Spring Data, you may use Hibernate, Eclipse Link, or any other JPA provider. A very interesting benefit is that you can control
transaction boundaries declaratively using the @Transactional annotation.

Spring Data JPA is not an implementation or JPA provider, it's just an abstraction used to significantly reduce the amount of boilerplate
code required to implement data access layers for various persistence store.

Hibernate provides a reference implementation of the Java Persistence API that makes it a great choice as an ORM tool with benefits of loose coupling.

Remember, Spring Data JPA always requires the JPA provider such as Hibernate or Eclipse Link.


JPA and Hibernate Difference

JPA is a specification for accessing, persisting and managing the data between Java objects and the relational database.
As the definition says its API, it is only the specification. There is no implementation for the API. JPA specifies the set of
rules and guidelines for developing the interfaces that follows standard. Straight to the point : JPA is just guidelines to implement
the Object Relational Mapping (ORM)  and there is no underlying code for the implementation.

Where as, Hibernate is the actual implementation of JPA guidelines. When hibernate implements the JPA specification, this will be certified
by the JPA group upon following all the standards mentioned in the specification. For example, JPA guidelines would provide information of
mandatory and optional features to be implemented as part of the JPA implementation.

Hibernate is a JPA provider. When there is new changes to the specification, hibernate would release its updated implementation for the
JPA specification. Other popular JPA providers are Eclipse Link (Reference Implementation), OpenJPA, etc. You can find the latest release
of JPA providers.

In summary, JPA is not an implementation, it will not provide any concrete functionality to your application.  Its purpose is to
provide a set of rules and guidelines that can be followed by JPA implementation vendors to create an ORM implementation in a standardized manner.  
This allows the underlying JPA implementation to be swapped and for developers to easily transition (think knowledge wise) from one implementation
 to another.  Hibernate is the most popular JPA provider.
 
 

As you state JPA is just a specification, meaning there is no implementation. You can annotate your classes as much as you would like with
JPA annotations, however without an implementation nothing will happen. Think of JPA as the guidelines that must be followed or an interface,
 while Hibernate's JPA implementation is code that meets the API as defined by the JPA specification and provides the under the hood functionality.

When you use Hibernate with JPA you are actually using the Hibernate JPA implementation. The benefit of this is that you can swap out
Hibernate's implementation of JPA for another implementation of the JPA specification. When you use straight Hibernate you are locking
into the implementation because other ORMs may use different methods/configurations and annotations, therefore you cannot just switch
over to another ORM.
*/