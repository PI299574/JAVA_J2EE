package defaultMethod;

interface defaultMethod{
	public int square(int x);
	
	 default void sayHello(){
		System.out.println("Default method executed");
	}
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		defaultMethod df1=(x)->{return x*x;};
		//defaultMethod df2 = null ;
	System.out.println(df1.square(10));
	
	df1.sayHello();
	
	}

}
/*Before Java 8, interfaces could have only abstract methods.
The implementation of these methods has to be provided in a separate class. 
So, if a new method is to be added in an interface then its implementation code
has to be provided in the class implementing the same interface. To overcome this
issue, Java 8 has introduced the concept of default methods which allow the 
interfaces to have methods with implementation without affecting the classes that implement 
the interface.


The default methods were introduced to provide backward comparability so that existing
intefaces can use the lambda expressions without implementing the methods in the implementation
 class. 
Default methods are also known as defender methods or virtual extension methods.*/