package arrayProgram;

import java.util.Scanner;

/*Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 4
Output: 10*/
/*
In QuickSort, we pick a pivot element, then move the pivot element to its correct position and partition the array around it. 
The idea is, not to do complete quicksort, but stop at the point where pivot itself is k’th smallest element. Also, not to recur 
for both left and right sides of pivot, but recur for one of them according to the position of pivot. 
The worst case time complexity of this method is O(n2), but it works in O(n) on averag*/
//smallestOr largest: quick sort mechanism
public class KthSmallestelement {

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
		KthSmallestelement element=new KthSmallestelement();
		int first=0,last=n-1;
		element.quickSort(arr,first,last,keyElement);
	/*	for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");*/
	}

	private  void quickSort(int[] arr, int first, int last, int keyElement) {
		// TODO Auto-generated method stub
		if(first<last&& keyElement<=last){
			int pivot=getPartition(arr, first,last);
			if(pivot+1==keyElement){
				System.out.println("element is "+arr[pivot]);
			}
			if(keyElement<pivot){
				quickSort(arr, first, pivot-1, keyElement);
			}
			quickSort(arr, pivot+1, last, keyElement);
		}
	}

	private int getPartition(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		
		int i=first-1;
		int pivot=last;
		
		for(int j=first;j<last;++j){
			if(arr[j]<=arr[pivot]){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			int temp=arr[pivot];
			arr[pivot]=arr[i+1];
			arr[i+1]=temp;
		}
		return i+1;
	}

}
