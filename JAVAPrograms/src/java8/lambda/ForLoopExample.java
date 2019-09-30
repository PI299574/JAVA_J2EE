package java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person("pintu","Gpt",26),
				new Person("Amit","Gupta",34),new Person("Anita","varma",22));
		//java 7
		for(Person p:list){
			System.out.println(p);
		}

		//java 8
		System.out.println("Usuing lambda for each loop");
		list.forEach(p->System.out.println(p));  //for each looks for consumer type arguments...internal operator

		//method reference
		System.out.println("Usuing method reference example");
		list.forEach(System.out::println);
	}

}
