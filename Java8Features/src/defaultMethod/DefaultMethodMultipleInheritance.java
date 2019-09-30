package defaultMethod;

interface DefaultInheritance1{
	
	default void sayHello(){
		System.out.println(" In DefaultInheritance 1 ");
	}
}

interface DefaultInheritance12{
	
	default void sayHello(){
		System.out.println(" In DefaultInheritance 2 ");
	}
}

public class DefaultMethodMultipleInheritance implements DefaultInheritance1, DefaultInheritance12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DefaultMethodMultipleInheritance().sayHello();
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		DefaultInheritance1.super.sayHello();
		DefaultInheritance12.super.sayHello();
	}

}
/*Important Points:

Interfaces can have default methods with implementation from java 8 onwards.
Interfaces can have static methods as well similar to static method of classes.
Default methods were introduced to provide backward comparability for old interfaces
so that they can have new methods without effecting existing code.*/