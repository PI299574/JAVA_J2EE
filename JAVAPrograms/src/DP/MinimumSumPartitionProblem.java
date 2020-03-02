package DP;
/*
Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.

If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.

Example:


Input:  arr[] = {1, 6, 11, 5} 
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11        

 */
public class MinimumSumPartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 6, 11, 5} ;
		int minSum=getMin(arr,arr.length-1,0,0);
		System.out.println(minSum);
	}
	// Partition the set S into two subsets S1, S2 such that the
			// difference between the sum of elements in S1 and the sum
			// of elements in S2 is minimized
	private static int getMin(int[] arr, int n, int sumPartition1, int sumPartition2) {
		// TODO Auto-generated method stub
		
		
		
		// base case: if list becomes empty, return the absolute
				// difference between two sets
		if(n<0){
			return Math.abs(sumPartition1-sumPartition2);
		}
		

		// Case 1. include current item in the subset S1 and recur
		// for remaining items (n - 1)
		int include=getMin(arr, n-1, sumPartition1+arr[n], sumPartition2);
		
		
		// Case 2. exclude current item from subset S1 and recur for
				// remaining items (n - 1)
		int exclude=getMin(arr,  n-1,  sumPartition1, sumPartition2+arr[n]);
		
		return Math.min(include, exclude);
	}

}
