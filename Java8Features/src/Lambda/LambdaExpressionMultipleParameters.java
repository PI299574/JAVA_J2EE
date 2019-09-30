package Lambda;

interface Add{
	public void add(int a,int b);
}

public class LambdaExpressionMultipleParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add a1=(a,b)->{
			System.out.println(a+b);
			
		};
		a1.add(10, 20);
		
		//Add a2=(a,b)->a+b;
	}

}
