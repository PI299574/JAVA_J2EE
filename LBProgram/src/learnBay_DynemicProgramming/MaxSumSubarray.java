package learnBay_DynemicProgramming;

public class MaxSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3,-4,1,2}; 
	    int n = arr.length; 
	    int max_sum = maxSubArraySumDP(arr, 0, n-1);
	    System.out.println(max_sum);
	}

	private static int maxSubArraySumDP(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low==high){
			return arr[low];
		}
		int mid=(low+high)/2;
		
		return Math.max(Math.max(maxSubArraySumDP(arr,low,mid), maxSubArraySumDP(arr,mid+1,high)), maxSubArraySumDPcrossSum(arr,low,mid,high));
		
	}

	private static int maxSubArraySumDPcrossSum(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		
		int maxLeftSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=mid;i>=low;i--){
			sum=sum+arr[i];
			if(sum>maxLeftSum){
				maxLeftSum=sum;
			}
		}
		int maxRightSum=Integer.MIN_VALUE;
		sum=0;
		for(int i=mid+1;i<=high;i++){
			sum=sum+arr[i];
			if(sum>maxRightSum){
				maxRightSum=sum;
			}
		}

		return (maxRightSum+maxLeftSum);
	}

}
