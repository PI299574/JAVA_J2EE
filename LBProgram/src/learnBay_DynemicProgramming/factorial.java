package learnBay_DynemicProgramming;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int result=fact(n);
		//int result=factrec(n);
		int result=factDynemicPrograming(n);
		System.out.println("Factorial is "+result);
	}

	private static int factDynemicPrograming(int n) {
		// TODO Auto-generated method stub
	int fact[]=new int[n+1];
	if(n==1){
		return 1;
	}
	if(fact[n]==0){
		return fact[n]=n*factDynemicPrograming(n-1);
	}
	else{
		return fact[n];
	}
	}

	private static int factrec(int n) {
		// TODO Auto-generated method stub
		if(n==1){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=n;i>=1;i--){
			fact=fact*i;
		}
		return fact;
	}

}
