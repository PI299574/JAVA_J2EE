package DP;
/*

Minimum number of jumps to reach end

Given an array of integers where each element represents the max number of steps that
 can be made forward from that element. Write a function to return the minimum number 
 of jumps to reach the end of the array (starting from the first element). 
 If an element is 0, then cannot move through that element.

Example:

Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 ->9)

First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
 */
public class MinimumNoOfJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
          int n=arr.length;
		  int count = minNoOfJump(arr,n);
		  System.out.println(count);
	}

	private static int minNoOfJump(int[] arr, int n) {
		// TODO Auto-generated method stub
	
		int jump[]=new int[n];
		jump[0] = 0; 
		  
		for(int i=1;i<arr.length;i++){
			jump[i]=-1;
			for(int j=0;j<=i;j++){
				if(j+arr[j]>=i && jump[j]!=-1){
					jump[i]=Math.min(jump[j]+1, jump[i]);
					break;
				}
			}
		}
		
		return jump[n-1];
	}

}
