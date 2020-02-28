package DP;

import java.util.ArrayList;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5}; 
        int n = arr.length; 
        System.out.println("Sum of maximum sum "+ 
                            "increasing subsequence is "+ 
                              maxSumIS(arr, n)); 
	}

	private static int maxSumIS(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int currentMax;
		int maxSum=0;
		ArrayList<Integer> list=new  ArrayList<>();
		for(int i=0;i<n;i++){
			currentMax=Integer.MIN_VALUE;
			for(int j=i;j<n;j++){
				if(currentMax<arr[j]){
					currentMax=arr[j];
					list.add(arr[j]);
				}
			}
			int sum=0;
			System.out.println(list);
			for(Integer i1: list){
				sum=sum+i1;
			}
			System.out.println(sum);
			if(maxSum<sum){
				maxSum=sum;
			}
			list.clear();
		}
		
		return maxSum;
	}

}
