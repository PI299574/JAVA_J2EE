package LearnBayTree;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int fact=factorial(6);
		System.out.println(fact);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
	}

}
