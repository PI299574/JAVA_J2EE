package LeranBaySorting;
/*The selection sort algorithm sorts an array by repeatedly finding the minimum element 
(considering ascending order) from unsorted part and putting it at the beginning.*/
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={11,12,1,9,13,8};
		
		arr=selectionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	private static int[] selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int tmp=arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
		}
		return arr;
	}

}
