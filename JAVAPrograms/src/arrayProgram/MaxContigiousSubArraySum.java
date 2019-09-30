package arrayProgram;


//Kadane Algorithm
// I/P:  {-2, -5, 6, -2, -3, 1, 5, -6}
// o/p=7
public class MaxContigiousSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		//7
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a)); 
	}

	private static int maxSubArraySum(int[] arr) {
		// TODO Auto-generated method stub
		
		int current_sum=0;
		int Max_sum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			current_sum+=arr[i];
			if(current_sum>Max_sum){
				Max_sum=current_sum;
			}
			if(current_sum<0){
				current_sum=0;
			}
		}
		return Max_sum;
	}

}
