package LearnBay;

import java.util.Scanner;

public class SelectionSort {

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
		//int keyElement=2;
		int arr[]=new int[]{12,10,15,11,14};
		
		selectionSort(arr,n);
		for(int i=0;i< n;i++)
			System.out.println(arr[i]+ " ");
	}
//find the minimum index element and put it at starting position 
	//choose small swap with first
	private static void selectionSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<n;i++){
			int minIdx=i;
			for(int j=i+1;j<n;j++)
				{      if(arr[j]<arr[minIdx])
					minIdx=j;
				}
			
				int temp=arr[i];
				arr[i]=arr[minIdx];
				arr[minIdx]=temp;
			
		}
		
	}

}
