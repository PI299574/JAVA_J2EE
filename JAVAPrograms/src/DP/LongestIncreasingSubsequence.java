package DP;
/*
 The Longest Increasing Subsequence (LIS) problem is to find the length of the 
 longest subsequence of a given sequence such that all elements of the subsequence 
 are sorted in increasing order. 
 For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
longest-increasing-subsequence

More Examples:

Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input : arr[] = {50, 3, 10, 7, 40, 80}
Output : Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}

 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {50, 3, 10, 7, 40, 80};
		int len=maxLIS(arr,arr.length);
		System.out.println("length is *************** "+len);
		
	}

	private static int maxLIS(int[] arr, int n) {
		// TODO Auto-generated method stub
		int []temp=new int[n];
		for(int i=0;i<n;i++){
			temp[i]=1;
		}
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]){
					temp[i]=Math.max(temp[i], temp[j]+1);
				}
			}
		}
		
		
		int maxLength=0;
		for(int i=0;i<n;i++){
			System.out.print(temp[i]+" ");
			maxLength=Math.max(maxLength, temp[i]);
		}
		System.out.println();
		return maxLength;
	}

}
