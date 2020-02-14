package arrayProgram;

/*Input:   arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
Output:  Index of element is 4
All elements on left of arr[4] are smaller than it
and all elements on right are greater.
 
Input:   arr[] = {5, 1, 4, 4};
Output:  Index of element is -1*/
public class ElementLeftSidesmallerrightSideGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		int index=findIndex(arr);
		System.out.println(index);
	}

	private static int findIndex(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<arr.length;i++){
			
			if(IsleftArraySmaller(i,arr) && IsrightArrayLarger(i,arr)){
				return i;
			}
			
		}
		
		return 0;
	}

	private static boolean IsrightArrayLarger(int start, int[] arr) {
		// TODO Auto-generated method stub
		
		int highest=arr[start];
		for(int i=start+1;i<arr.length;i++){
			if(highest>arr[i]){
				return true;
			}
		}
		return false;
	}

	private static boolean IsleftArraySmaller(int start, int[] arr) {
		// TODO Auto-generated method stub
		
		int smaller=arr[start];
		for(int i=0;i<start;i++){
			if(smaller<arr[i]){
				return true;
			}
		}
		
		return false;
	}

}
