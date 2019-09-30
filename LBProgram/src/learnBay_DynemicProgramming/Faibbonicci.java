package learnBay_DynemicProgramming;

import java.util.Scanner;

public class Faibbonicci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//int result=fibbonici(n);
	//int result=fibRec(n);
	int result=fibBrute(n);
	System.out.println("Fibbonicci is "+result);
	}

	private static int fibBrute(int n) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c=0;
		for(int i=0;i<n;i++){
			c=a+b;
			a=b;
			b=c;
			//System.out.println(c);
		}
		return c;
	}

	private static int fibRec(int n) {
		// TODO Auto-generated method stub
		if(n==0){return 0;}
		if(n==1){return 1;}

		return fibRec(n-1)+fibRec(n-2);
	}

	private static int fibbonici(int n) {
		// TODO Auto-generated method stub
		int fibboArray[]=new int[n+1];
		if(n==0){return 0;}
		if(n==1){return 1;}
		//System.out.println("fibboArray[n] "+fibboArray[n]);
		if(fibboArray[n] != 0){
			return fibboArray[n];
		}else{
			return fibboArray[n]=fibbonici(n-1)+fibbonici(n-2); 
		}
	}

}
