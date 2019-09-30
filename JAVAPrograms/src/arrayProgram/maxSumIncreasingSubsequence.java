package arrayProgram;

import java.util.Arrays;
import java.util.OptionalInt;

/*arr={1 101 2 3 100 4 5}
Increasing=Subsequence 
(1,101); (1,2,3,100); (1,2,3,4,5).
Out of these (1, 2, 3, 100) has maximum sum,i.e., 106.*/
public class maxSumIncreasingSubsequence {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 101, 2, 3, 100, 4, 5};
		int n=arr.length;
		System.out.println("Maximum sum is "+incresingSubsequence(arr,n));
	}

	private static int incresingSubsequence(int[] arr, int n) {
		// TODO Auto-generated method stub
		int maxSumSubarray[] =new int[n];
		for(int i=0;i<n;i++){
			maxSumSubarray[i]=arr[i];
		}
		int maxSum=0;
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					maxSumSubarray[i]=Math.max(maxSumSubarray[i], (maxSumSubarray[j]+arr[i]));
				}
			}
		}
		
		System.out.print("maxSumSubarray ");
		for(int i=1;i<n;i++){
			System.out.println(maxSumSubarray[i]+" ");
			//maxSum=Math.max(maxsumarray[i], maxsumarray[i-1]);
		}
		return maxSum;
	}

/**/
	
	
}
