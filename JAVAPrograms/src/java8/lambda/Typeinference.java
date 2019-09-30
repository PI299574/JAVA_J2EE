package java8.lambda;

public class Typeinference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringLengthLambda stringLength= s->s.length();
		//System.out.println(stringLength.getLength("Hello World"));
		printlambda(s->s.length());
	}

	public static void printlambda(StringLengthLambda s){
		System.out.println(s.getLength("Hello World"));
	}
	@FunctionalInterface  //so that other developer know that it is functional interface and can not add another method in this interface
	//as functional interface contain only one method
	interface StringLengthLambda{
		int getLength(String s);
	}

}
