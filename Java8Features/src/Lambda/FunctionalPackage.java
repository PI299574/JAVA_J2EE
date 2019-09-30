package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;



/*java.util.function Package:
The java.util.function package in Java 8 contains many built in functional interfaces like-

Predicate: The Predicate interface has an abstract method test which gives a Boolean value
as a result for the specified argument. Its prototype is
public Predicate
{
   public boolean test(T  t);
 }
BinaryOperator: The BinaryOperator interface has an abstract method apply which takes
two argument and returns a result of same type. Its prototype is
public interface BinaryOperator 
{
     public T apply(T x, T y);
}       
Function: The Function interface has an abstract method apply which takes argument of 
type T and returns a result of type R. Its prototype is
public interface Function 
{
   public R apply(T t);
}*/


public class FunctionalPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> list= Arrays.asList("geeks","geeksForGeeks","Bangalore","Geeksforweeks") ; 
		
		Predicate<String> p=(s)->{
			return s.startsWith("g");
			
		};
		
		for(String s: list){
			if(p.test(s)){
				System.out.println(s);
			}
		}
	}

}
