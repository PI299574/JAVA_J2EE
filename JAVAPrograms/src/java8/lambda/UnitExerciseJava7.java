package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UnitExerciseJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list=Arrays.asList(new Person("pintu","Gpt",26),
				new Person("Amit","Gupta",34),new Person("Anita","varma",22));

		//sort list by last name
		//create method that print all elements in the list
		//create method that print all the perosn having last name beginning with 'G'

		//java 7 implementation
		//1
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.lastName.compareTo(o2.lastName);
			}
		});
		//2
		for(Person p:list){
			System.out.println(p.toString());
		}

		//3
		printlastNameStartWithC(list,new Condition(){
			@Override
			public boolean test(Person P) {
				// TODO Auto-generated method stub
				return P.getLastName().startsWith("G");
			}

		});

		printlastNameStartWithC(list,new Condition(){
			@Override
			public boolean test(Person P) {
				// TODO Auto-generated method stub
				return P.getFirstName().startsWith("A");
			}

		});
	}
	///3

	static void printlastNameStartWithC(List<Person> list,Condition condition){
		for(Person p:list){
			if(condition.test(p)) {
				System.out.println(p.toString());
			}
		}
	}
	interface Condition{
		public boolean test(Person P);
	}
}
