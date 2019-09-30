package arrayProgram;


public class WaterTrappingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 0, 2, 1, 0, 1,3, 2, 1, 2, 1}; 

		//int arr[]   = {3, 0, 0, 2, 0, 4};
		
		//int arr[] = {2, 0, 2};
   int n = arr.length; 
     
   System.out.println("Maximum water that "
                  + "can be accumulated is " 
                  + findWater(arr, n)); 
	}

	private static int findWater(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int left=0,right=n-1;
		int left_max=0,right_max=0;
		int water=0;
		while(left<=right){
			if(arr[left]<arr[right]){
				
				if(arr[left]>left_max){
					left_max=arr[left];
				}else{
					water=water+left_max-arr[left];
					left++;
				}
			}
			
			if(arr[right]>right_max){
				right_max=arr[right];
			}else{
				water=water+right_max-arr[right];
				right--;
			}
			
		}
		
		return water;
	}

}
