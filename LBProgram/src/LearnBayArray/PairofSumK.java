package LearnBayArray;

public class PairofSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[]{1,2,3,4,6,5};
		int k=7;
		
		int left=0,right=arr.length-1;
	
	while(left<right){
		
	if(arr[left]+arr[right]==k){
		System.out.println(arr[left] +" " +arr[right]);
		
		break;
	}
	
	else if(arr[left]+arr[right]>k){
		right--;
	}
		
	else{
		left++;
	}
	}
	
	
	}
	
	

}
