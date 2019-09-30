package arrayProgram;
/*
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3*/
public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
			int arr[]={16,17,4,3,5,2}; //17,5,2
			int n=arr.length;
			//leader(arr,n);
			leader1(arr,n);
	}

	private static void leader1(int[] arr, int n) {
		// TODO Auto-generated method stub
		int max=arr[n-1];
		System.out.println(max);
		for(int i=n-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.println(arr[i]);
			}
		}
	}

	private static void leader(int[] arr, int n) {
		// TODO Auto-generated method stub
		//System.out.println(arr[n-1]);
		for(int i=0;i<n;i++){
			if(arr[i]==Math.max(arr[i],max(i+1,arr))){
				System.out.println(arr[i]);
			}
		}
	}

	private static int max(int i, int[] arr) {
		// TODO Auto-generated method stub
		int max=0;
		for(int k=i;k<arr.length;k++){
			max=Math.max(max, arr[k]);
		}
		return max;
	}

}
