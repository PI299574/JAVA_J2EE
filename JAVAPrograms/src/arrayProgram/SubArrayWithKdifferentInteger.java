package arrayProgram;

import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithKdifferentInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={1,2,3,1,4,5,2,3,6};
		int n=arr.length;
		int k=3;
		Scanner sc=new Scanner(System.in);
		//int no=subarrayofSizeK(arr,k);
		//System.out.println(no);
	}

	private static int subarrayofSizeK(int[] arr, int k, int n) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){

			}
			return 0;
		}
		return 0;
	}
	private static boolean isUnique(int[] temparr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<temparr.length;i++){
			if(set.contains(temparr[i])){
				return false;
			}else{
				set.add(temparr[i]);
			}
		}
		return true;
	}

}
