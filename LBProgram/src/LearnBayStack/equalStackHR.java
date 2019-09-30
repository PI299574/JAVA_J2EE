package LearnBayStack;

import java.util.Scanner;

public class equalStackHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		int[] arr3=new int[n3];
		
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n3;i++){
			arr3[i]=sc.nextInt();
		}
		
		java.util.Stack <Integer> st1=new java.util.Stack<Integer>();
		java.util.Stack <Integer> st2=new java.util.Stack<Integer>();
		java.util.Stack <Integer> st3=new java.util.Stack<Integer>();
		
		
		
		int sum1=0, sum2=0, sum3=0;
		for(int i=n1-1;i>=0;i--){
			sum1=sum1+arr1[i];
			st1.push(arr1[i]);
		}
		for(int i=n2-1;i>=0;i--){
			sum2=sum2+arr2[i];
			st2.push(arr2[i]);
		}
		for(int i=n3-1;i>=0;i--){
			sum3=sum3+arr3[i];
			st3.push(arr3[i]);
		}
		
		while(!((sum1==sum2) && (sum2==sum3))){
			if(sum1>sum2 || sum1 >sum3){
				sum1=sum1-st1.pop();
			}
			else if(sum2>sum1 || sum2 >sum3){
				sum2=sum2-st2.pop();
			}
			else if(sum3>sum2 || sum3 >sum1){
				sum3=sum3-st3.pop();
			}
			
	
				
		}
		System.out.println(sum1);
				
	}

}
