package LeetCodeProgramEASY;
/*
 Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 */
public class sumOddLengthSubarrays {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5 };
		OddLengthSubarraySum(nums);
	}

	private static void OddLengthSubarraySum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j=j+2){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
				}
				System.out.println();
			}
		}
		System.out.println("Sum is "+sum);
	}
}
