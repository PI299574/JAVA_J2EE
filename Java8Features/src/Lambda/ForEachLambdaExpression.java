package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ForEachLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		
		list.add("patna");
		list.add("Aurangabad");
		list.add("Mumbai");
		list.add("Calcutta");
		list.add("Bangalore");
		
		
		list.forEach((n)->{
			System.out.println(n);
		});
		
		System.out.println("Ascending order******");
		list.stream().sorted().forEach(s->System.out.println(s));
		
		

		System.out.println("Ascending order******");
		list=(ArrayList<String>) list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list.forEach(System.out::printf);
	}

}


/*Note that lambda expressions can only be used to implement functional interfaces. In the above example also, 
the lambda expression implements Consumer Functional Interface.*/