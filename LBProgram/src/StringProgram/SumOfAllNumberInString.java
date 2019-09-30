package StringProgram;

import java.util.Scanner;

/*
Input:  1abc23
Output: 24

Input:  geeks4geeks
Output: 4

Input:  1abc2x30yz67
Output: 100

Input:  123abc
Output: 123*/
public class SumOfAllNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int total=findsumOfAllNumber(s);
		System.out.println(total);
		
	}

	private static int findsumOfAllNumber(String s) {
		// TODO Auto-generated method stub
		int sum=0;
		String temp="";
		
		for(int i=0;i<s.length();i++){
			
			if(Character.isDigit(s.charAt(i))){
				temp=temp+s.charAt(i);
			}else{
				
				sum=sum+Integer.parseInt(temp);
				temp="0";
				
			}
			
		}
		sum=sum+Integer.parseInt(temp);
		System.out.println("sum "+sum);
		return sum;
	}

}
