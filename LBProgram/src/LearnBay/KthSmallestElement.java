package LearnBay;

import java.util.Scanner;
/*
In QuickSort, we pick a pivot element, then move the pivot element to its correct position and partition the array around it. 
The idea is, not to do complete quicksort, but stop at the point where pivot itself is k’th smallest element. Also, not to recur 
for both left and right sides of pivot, but recur for one of them according to the position of pivot. 
The worst case time complexity of this method is O(n2), but it works in O(n) on averag*/


public class KthSmallestElement {

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
		KthSmallestElement element=new KthSmallestElement();
		int first=0,last=n-1;
		element.quickSort(arr,first,last,keyElement);
	/*	for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");*/
	}

	private void quickSort(int[] arr, int first, int last, int keyElement) {
		// TODO Auto-generated method stub
		
		if(first<last && keyElement<=last){
			
			int pivot=partition(arr,first,last);
			System.out.println("pivot is"+pivot);
			if(pivot+1==keyElement){
				
				System.out.println("Element is" +arr[pivot] );
			
			}
			 if(keyElement<pivot){
				quickSort(arr,first,pivot-1,keyElement);
			}
			
			quickSort(arr,pivot+1,last,keyElement);
		}
	}

	private int partition(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		
		int pivot=last;
		int i=first-1;
		for(int j=first;j<last;++j){
		
			if(arr[pivot]>=arr[j]){
		
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
			int temp=arr[pivot];
			arr[pivot]=arr[i+1];
			arr[i+1]=temp;
			return i+1;
			
		}
		
		
		
	}


