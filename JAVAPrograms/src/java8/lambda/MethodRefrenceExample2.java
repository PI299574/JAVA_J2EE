package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefrenceExample2 {

	public static void main(String []args){
		List<Person> list=Arrays.asList(new Person("pintu","Gpt",26),
				new Person("Amit","Gupta",34),new Person("Anita","varma",22));



		printlastNameStartWithC(list,p->true,System.out::println);  //p->System.out.println(p) ....(p)->method(p)


	}


	static void printlastNameStartWithC(List<Person> list,Predicate<Person> predicate,Consumer<Person> consumer){
		for(Person p:list){
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
