package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class UnitExerciseJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list=Arrays.asList(new Person("pintu","Gpt",26),
				new Person("Amit","Gupta",34),new Person("Anita","varma",22));

		//sort list by last name
		//create method that print all elements in the list
		//create method that print all the perosn having last name beginning with 'G'

		//java 7 implementation
		//1
		Collections.sort(list,(P1,P2)->P1.getLastName().compareTo(P2.getLastName()));
		//2
		/*for(Person p:list){
			System.out.println(p.toString());
		}*/
		printlastNameStartWithC(list,p->true);

		//3
		System.out.println("Last Name");
		printlastNameStartWithC(list,p->p.getLastName().startsWith("G"));
		System.out.println("first Name");
		printlastNameStartWithC(list,P->P.getFirstName().startsWith("A"));
	}
	///3

	static void printlastNameStartWithC(List<Person> list,Predicate<Person> predicate){
		for(Person p:list){
			if(predicate.test(p)) {
				System.out.println(p.toString());
			}
		}
	}

}
