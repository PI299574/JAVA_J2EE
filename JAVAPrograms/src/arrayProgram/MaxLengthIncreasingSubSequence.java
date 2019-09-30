package arrayProgram;

/*Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input : arr[] = {50, 3, 10, 7, 40, 80}
Output : Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80*/
public class MaxLengthIncreasingSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int []arr={3,4,-1,0,6,2,3}; //4
		 int arr[]={10, 22, 9, 33, 21, 50, 41, 60, 80}; //7
		int n=arr.length;
		int mlength=maxLength(arr,n);
		System.out.println("Maximum length "+mlength);
	}

	private static int maxLength(int[] arr, int n) {
		// TODO Auto-generated method stub
		int maxLength=0;
		int temp[]=new int[n];
		
		for(int i=0;i<n;i++){
			temp[i]=1;//assuming each elemnt has length 1
		}
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					temp[i]=Math.max(temp[i],temp[j]+1);
				}
			}
		}
		
		for(int i=1;i<n;i++){
			
			maxLength=Math.max(temp[i], temp[i-1]);
			//System.out.println("Temp Array is " +temp[i-1]);
		}
		System.out.println(temp[n-1]);
		return maxLength;
		
	}

}
