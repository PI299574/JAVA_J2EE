package DP;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

    All numbers (including target) will be positive integers.
    The solution set must not contain duplicate combinations.

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]

Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]


 */
public class CombinationSumUniqueResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int arr[]={10,1,2,7,6,1,5};
	     
	     int target=8;
	     Arrays.sort(arr);  //Imp to avoid repeatation of list
	     ArrayList<Integer> list=new ArrayList<>();
	     ArrayList<ArrayList<Integer>> results = new ArrayList<>();
	     targetSum(arr,0,target,0,list,results);
		}

		private static void targetSum(int[] arr, int sum, int target, int start, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> results) {
			// TODO Auto-generated method stub
			//System.out.println("Sum is 11111111**********"+sum);
			if(sum>target){
				return ;
			}
			if(sum==target){
				results.add(new ArrayList<>(list));
				for(Integer i: list){
					System.out.print(i+" ");
				}
				System.out.println();
				return;
			}
			int prev=-1;
			for(int i=start;i<arr.length;i++){
				if(prev!=arr[i]){  //to remove duplicates
				list.add(arr[i]);
				//System.out.println("Sum is ****"+sum);
				targetSum(arr, sum+arr[i], target, i+1, list,results);
				list.remove(list.size()-1);
				prev=arr[i];
				}
			}
		}
}