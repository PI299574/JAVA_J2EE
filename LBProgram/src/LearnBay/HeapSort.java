package LearnBay;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		/*int n=sc.nextInt();
		int keyElement=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
	    }*/
		int n=5;
		int keyElement=2;
		int arr[]=new int[]{12,10,15,11,14};
		
		for(int i=n/2-1; i>=0 ;i--){
			
			heapify(arr,n,i);      //to make a max heap.
			
		}
		
		
		for(int i=n-1;i>=0;i--){
			
			//replace last element wit root(max) element and again heapify as heap is distorted
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);  //since array is distorted so again heapify the root of tree.
		}
		
		for(int i=0;i< n;i++)
		System.out.println(arr[i]+ " ");
	}

	private static void heapify(int[] arr, int n, int root) {
		// TODO Auto-generated method stub
		
		
		int left=2*root+1;
		int right=2*root+2;
		int largest =root;
		
		if(left<n && arr[left] >arr[largest]){
			largest=left;
		}
		
		if(right<n && arr[right]>arr[largest]){
			largest=right;
		}
		
		if(largest!=root){
			int temp=arr[largest];
			arr[largest]=arr[root];
			arr[root]=temp;
			heapify(arr,n,largest);   //just to fail the condition
		}
		
	}

}
