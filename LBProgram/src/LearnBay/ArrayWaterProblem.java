package LearnBay;

import java.util.Scanner;

public class ArrayWaterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//int arr[]=new int[n];
		int arr[]=new int[]{3,0,0,2,0,0,4};
		int n=arr.length;
		int low=0, lowMax=0;
		int right=n-1,rightMax=0;
		int result=0;
		while(low<=right){
			
			if(arr[low]<arr[right]){
			if(lowMax<arr[low]){
				
				lowMax=arr[low];
			}
			else{
				result+=lowMax-arr[low];
			}
			low++;
			}
			else{
				if(rightMax<arr[right]){
					
					rightMax=arr[right];
				}
				else{
					result+=rightMax-arr[right];
				}
				right--;
				}
			}
		
	System.out.println(result);
	}
		
	}


