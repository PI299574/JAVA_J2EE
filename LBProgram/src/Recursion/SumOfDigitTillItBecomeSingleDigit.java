package Recursion;

import java.util.Scanner;

/*N = 999 -> 9+9+9 = 27-> 2+7 = 9
N = 789 -> 7+8+9= 24-> 2+4 = 6*/
public class SumOfDigitTillItBecomeSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		int sum=findSum(n);
		System.out.println("Sum is ************ "+sum);
	}

	private static int findSum(int n) {
		// TODO Auto-generated method stub
		
		if(n <10){
			return n;
		}
		int sum=0;
		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
		n=sum;
		return findSum(n);
	}

}
