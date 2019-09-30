package java8.lambda;

import java.util.Arrays;
import java.util.List;

public class anStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person("pintu","Gpt",26),
				new Person("Amit","Gupta",34),new Person("Anita","varma",22));

		list.stream()
		.filter(p->p.getLastName().startsWith("G"))
		.forEach(p->System.out.println(p.getFirstName()));

		long count=list.stream()
				.filter(p->p.getLastName().startsWith("G"))
				.count();
		System.out.println(count);

		long count1=list.parallelStream()  //make the streaming fast
				.filter(p->p.getLastName().startsWith("G"))
				.count();
		System.out.println(count1);
	}



}
