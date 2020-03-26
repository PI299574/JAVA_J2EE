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
	int[] dp=new int[n]; //contain sum at each element , same like LIS count
	
	for(int i=0;i<n;i++){
		dp[i]=arr[i];
	}
	for(int i=1;i<n;i++){
		for(int j=0;j<=i;j++){
			if(arr[i]>arr[j]  && dp[i]<(arr[i]+dp[j])){
				dp[i]=arr[i]+dp[j];
			}
		}
	}
	int maxSum=0;
	for(int i=0;i<n;i++){
		System.out.print(dp[i]+" ");
		maxSum=Math.max(maxSum, dp[i]);
	}
	System.out.println();
		return maxSum;
	}

}
