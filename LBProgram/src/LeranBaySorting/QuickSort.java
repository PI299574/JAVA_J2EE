package LeranBaySorting;
/*The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, 
put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
and put all greater elements (greater than x) after x. All this should be done in linear time.*/

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={11,12,1,9,13,8,10};
		
		arr=quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	private static int[] quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high){
			int pivot=getPivotElement(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
		return arr;
	}

	private static int getPivotElement(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int i=low-1;
		int pivot=arr[high];
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}

}
