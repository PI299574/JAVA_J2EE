package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctSubArray {

	/*
	Input :  arr[] = {1, 2, 3}
	Output : 10
	{1, 2, 3} is a subarray of length 3 with 
	distinct elements. Total length of length
	three = 3.
	{1, 2}, {2, 3} are 2 subarray of length 2 
	with distinct elements. Total length of 
	lengths two = 2 + 2 = 4
	{1}, {2}, {3} are 3 subarrays of length 1
	with distinct element. Total lengths of 
	length one = 1 + 1 + 1 = 3
	Sum of lengths = 3 + 4 + 3 = 10

	Input :  arr[] = {1, 2, 1}
	Output : 7

	Input :  arr[] = {1, 2, 3, 4}
	Output : 20*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		arr=largestDistinctsubarray(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k] +" ");
				}
				System.out.println();
				}
		}
		
		
	}

	private static int[] largestDistinctsubarray(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		int j=0;
		for(int i:set){
			arr[j]=i;
			j++;
		}
		return arr;
	}

}
