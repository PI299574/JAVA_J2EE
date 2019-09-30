package Collection;


/*Singleton pattern is a design pattern which restricts a class to instantiate its multiple objects. 
It is nothing but a way of defining a class.
Class is defined in such a way that only one instance of class is created in the complete execution of program or project. 
It is used where only a single instance of class is required to control the action throughout the execution.
A singleton class shouldn’t have multiple instances in any case and at any cost. 
Singleton classes are used for logging, driver objects, caching and thread pool, database connections.

How to create Singleton design pattern?

To create the singleton class, we need to have static member of class, private constructor and static factory method.

    Static member: It gets memory only once because of static, itcontains the instance of the Singleton class.
    Private constructor: It will prevent to instantiate the Singleton class from outside the class.
    Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.



*
*
*/
/*
How to Make:
	1. make the constructor private in java so that no class can access the constructor and hence cannot instantiate it.
	2. Singleton pattern helps us to keep only one instance of a class at any time.
	3. The purpose of singleton is to control object creation by keeping private constructor.
*/

/*Saves memory because object is not created at each request. Only single instance is reused again and again.
There are two forms of singleton design pattern

Early initialization : In this method, class is initialized whether it is to be used or not. 
Main advantage of this method is its simplicity. 
You initiate the class at the time of class loading. 
Its drawback is that class is always initialized whether it is being used or not.

Lazy initialization : In this method, class in initialized only when it is required.
It can save you from instantiating the class when you don’t need it. 
Generally lazy initialization is used when we create a singleton class.

Early Instantiation: creation of instance at load time.
Lazy Instantiation: creation of instance when required.(below example)*/
public class SingletonClassLazyInstantiation {

	private static SingletonClassLazyInstantiation singeInstance=null;
	public String s ;
	private SingletonClassLazyInstantiation(){
		s="Hello World!!";
	}
	
	static SingletonClassLazyInstantiation getInstance(){
		if(singeInstance==null){
			System.out.println("11111");
			singeInstance=new SingletonClassLazyInstantiation(); //instance will be created at request time
		}
		
		return singeInstance;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClassLazyInstantiation x=SingletonClassLazyInstantiation.getInstance();
		SingletonClassLazyInstantiation y=SingletonClassLazyInstantiation.getInstance();
		
		System.out.println(x.s);
		System.out.println(y.s);
	}

}
