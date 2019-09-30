package arrayProgram;

/*Example:
Input:
3
1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6


Explanation:
Testcase 1: Starting from first subarray of size k = 3,
we have 3 as maximum. Moving the window forward, maximum element are as 3, 4, 5, 5, 5 and 6. */

public class MaximumOfAllSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr={1,2,3,1,4,5,2,3,6};
		int n=arr.length;
		int k=3;
		findmaxofsubarrayofSizeK(arr,k,n);
		
	}

	private static void findmaxofsubarrayofSizeK(int[] arr, int k, int n) {
		// TODO Auto-generated method stub
		int maxValue=0;
		for(int i=0;i<n-k+1;i++){
			int maxK=max(arr,i,k+i);
			//System.out.println("Maxim**********"+maxK);
			if(maxValue<maxK)
			{	maxValue=maxK;}
			System.out.println(maxValue);
			
		}
	}

	private static int max(int[] arr, int i, int k) {
		// TODO Auto-generated method stub
		int maximum=0;
		for(int j=i;j<k;j++){
			maximum=Math.max(maximum, arr[j]);
		}
		return maximum;
	}

}
