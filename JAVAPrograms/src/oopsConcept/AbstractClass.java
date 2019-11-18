package oopsConcept;
/*


An abstract classs can NOT be instantiated by using new operator.
Becuase an abstract may have abstract methods i.e. methods without any body (or implementation).
Because an object can NOT have an abstract methods and JVM can NOT allocate memory of the abstract methods



very simple reason jvm playing to restrict us to instantiate abstract class and interface.

Assume compiler allow us to instantiate both ok.

So suppose my abstract class contains 5 abstract method means only method prototype no method body.

So as we know every method call creating a separate stack in jvm Java stack area That memory
 allocation happened based on method structure and after execute that stack is destroying right.

So if my method is not contains any body means how can jvm predict memory to allocate that method

Second if no body means no method execution so never it will destroy from your Java stack area there may
be a chance u can get memoryout error.

So to consider these 2 case compiler restrict us to instantiate both interface and abstract class



 */
public abstract   class AbstractClass {

	AbstractClass(){

	}
	abstract void m1();

	void m2(){
		System.out.println("ppp");
	}


	public static void main(String[] args) {
		//	AbstractClass s1=new AbstractClass(); //give compilation error
	}
}
