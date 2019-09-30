package LeranBaySorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6, 7};
		arr=mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}

	private static int[] mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
			
		}
		return arr;
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int n1=mid-low+1; //till mid 
		int n2=high-mid;  //after mid
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++){
			left[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++){
			right[i]=arr[(mid+1)+i];
		}
		
		int i=0;int j=0;int k=low;
		//int merge[]=new int[high];
		while(i<n1 && j<n2){
			if(left[i]<right[j]){
			arr[k++]=left[i++];	
			}
			else{
				arr[k++]=right[j++];
			}
		}
		
		while(i<n1){
			arr[k++]=left[i++];
		}
		while(j<n2){
			arr[k++]=right[j++];
		}
		
	}

}
