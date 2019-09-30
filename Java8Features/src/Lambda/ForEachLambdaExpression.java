package Lambda;

import java.util.ArrayList;

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
	}

}


/*Note that lambda expressions can only be used to implement functional interfaces. In the above example also, 
the lambda expression implements Consumer Functional Interface.*/