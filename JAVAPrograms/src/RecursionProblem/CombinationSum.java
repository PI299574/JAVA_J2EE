package RecursionProblem;

import java.util.ArrayList;

/*
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]

Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

 */
public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]={2,3,6,7};
    // int arr[]={10,1,2,7,6,1,5};
     int target=7;
     //int target=8;
     ArrayList<Integer> list=new ArrayList<>();
     //ArrayList<ArrayList> results = new ArrayList<>();
     targetSum(arr,0,target,0,list);
	}

	private static void targetSum(int[] arr, int sum, int target, int start, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		if(sum>target){
			return ;
		}
		if(sum==target){
			//results.add(new ArrayList<>(list));
			for(Integer i: list){
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		for(int i=start;i<arr.length;i++){
			list.add(arr[i]);
			targetSum(arr, sum+arr[i], target, i, list);
			list.remove(list.size()-1);
		}
	}

}
