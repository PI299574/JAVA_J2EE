package Lambda;
/*Java Lambda Expression Example: No Parameter*/


interface Drawable{
	public void draw();
}

public class FunctionalInterface {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable d=()->{
			System.out.println("Draw method");
		};
		d.draw();
	}

}




/*Functional Interface
Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called
 functional interface.Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.

Why use Lambda Expression
To provide the implementation of Functional interface.
Less coding.
Java Lambda Expression Syntax
(argument-list) -> {body}  
Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.
2) Arrow-token: It is used to link arguments-list and body of expression.
3) Body: It contains expressions and statements for lambda expression.*/

/*
 * without lambda
 * 
 * public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable d=new Drawable(){
		public void draw(){
		System.out.print("Draw method");}
		}
		d.draw();
	}

}
 * 
 * @FunctionalInterface Annotation
@FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method.
 In case more than one abstract methods are present, the 
compiler flags an ‘Unexpected @FunctionalInterface annotation’ message. However,
 it is not mandatory to use this annotation.
 * @FunctionalInterface
interface Drawable{
	public void draw();
}
 * 
 * 
 */

