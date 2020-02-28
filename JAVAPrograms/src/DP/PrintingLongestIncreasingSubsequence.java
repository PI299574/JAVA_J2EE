package DP;

import java.util.ArrayList;
import java.util.List;

public class PrintingLongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {50, 3, 10, 7, 40, 80};
		//int arr[]= {1, 101, 2, 3, 100, 4};
		int arr[]={10, 22, 9, 33, 21, 50, 41, 60, 80};
		printLIS(arr,arr.length);
		//System.out.println("length is *************** "+len);
	}

	private static void printLIS(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		List<Integer> longestList=new ArrayList<>();
		
		int currentMax;
		int maxsize=0;
		for(int i =0 ;i<n;i++){
			currentMax=Integer.MIN_VALUE;
			for(int j=i;j<n;j++){
				if(currentMax <arr[j]){
					list.add(arr[j]);
					currentMax=arr[j];
				}
			}
			if(!list.isEmpty())
			{
				if(maxsize<list.size()){
					maxsize=list.size();
					longestList=new ArrayList<>(list);
				}
			}
			list.clear();
		}
		for(Integer i:longestList){
			
				System.out.print(i+" ");
		
		}
	}

}
