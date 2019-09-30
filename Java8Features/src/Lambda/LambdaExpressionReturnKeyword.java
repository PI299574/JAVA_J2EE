package Lambda;

interface Multiply{
	public int multiply(int a,int b);
}

public class LambdaExpressionReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiply m=(a,b)->{ 
			return a*b;
		};
		
		System.out.println(m.multiply(10, 20));
		
	}

}
