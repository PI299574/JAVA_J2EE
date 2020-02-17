package SortingAndSearching;

public class HeapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,12,9,5,6,10};
		HeapSorting hs = new HeapSorting();
        hs.buildHeap(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    
	}


	private static void buildHeap(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		
		//Step 1: Build max heap
		//n/2-1: after that leaf node start in heap tree so no need to heapify them to build max heap
		for(int i=n/2-1;i>=0;i--){
			heapify(arr,n,i);
		}
		//step 2: do heap sort
		for(int i=n-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			//swap(arr[0],arr[i]);  //swap root element with last elemnet, reduce the size by 1
			//and heapify root element so that heightest element at thr root ;
			heapify(arr,i,0);
		}
	}

	

	private static void heapify(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
	//get max of root,left,right , suppose i as root element
	int largestIndex=i;
	int leftIndex=2*i+1;
	int rightIndex=2*i+2;
	if(leftIndex < n && arr[leftIndex] > arr[largestIndex]){
		largestIndex = leftIndex;
	}
	if(rightIndex < n && arr[rightIndex] > arr[largestIndex]){
		largestIndex = rightIndex;
	}
	//if root is not larget , swap it and heapify the procees again
	if(largestIndex != i){
		//swap(arr[largestIndex] ,arr[i] );
		int temp=arr[largestIndex];
		arr[largestIndex]=arr[i];
		arr[i]=temp;
		//// Recursively heapify the affected sub-tree
		heapify(arr, n, largestIndex);
	}
	}
	

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
        int n = arr.length;
        for (int i=0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
	}
}
