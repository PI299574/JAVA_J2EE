package DP;

import java.util.Scanner;

public class MinimumOperation {

	public static int getMinNo(int a,int b){
		int c=0;
		while(a!=b){
			if(b<a){
				a=a-1;
			}
			else{
				a=a*2;
			}
			c++;
		}
		return c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=getMinNo(a, b);
		System.out.println(c);
		
	}

}
