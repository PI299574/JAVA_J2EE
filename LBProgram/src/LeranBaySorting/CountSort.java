package LeranBaySorting;

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1, 4, 1, 2, 7, 5, 2};
		
		//take countArray having count of array element.
		int countArray[]=new int[9];
		for(int i=0;i<countArray.length;i++){
			countArray[i]=0;
		}
		for(int i=0;i<arr.length;i++){
			countArray[arr[i]]++;
		}
		
		//take sum in acountArray 
		//sum will be current value+ previous sum at each location
		
		for(int i=1;i<countArray.length;i++){
			countArray[i]=countArray[i-1]+countArray[i];
		}
		
		//take outputArray 
		//find location of arr[i](1) in countarray[] and that will be the postion of arr[i] in outputarray
		
		int outputArray[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			outputArray[countArray[arr[i]]-1]=arr[i];
			--countArray[arr[i]];
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]=outputArray[i];
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
