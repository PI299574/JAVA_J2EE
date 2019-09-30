package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {
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
		printlastNameStartWithC(list,p->true,p->System.out.println(p.toString()));

		//3
		System.out.println("Last Name");
		printlastNameStartWithC(list,p->p.getLastName().startsWith("G"),p->System.out.println(p));
		System.out.println("first Name");
		printlastNameStartWithC(list,P->P.getFirstName().startsWith("A"),p->System.out.println(p.toString()));

		printlastNameStartWithC(list,P->P.getFirstName().startsWith("A"),p->System.out.println(p.getFirstName()));
	}
	///3

	static void printlastNameStartWithC(List<Person> list,Predicate<Person> predicate,Consumer<Person> consumer){
		for(Person p:list){
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
