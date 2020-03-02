package arrayProgram;
/*
Given an unsorted array of size n. Array elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

Examples:

 
Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 
2 is missing and 3 occurs twice 

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1


Use count array)

Approach:

    Create a temp array temp[] of size n with all initial values as 0.
    Traverse the input array arr[], and do following for each arr[i]
        if(temp[arr[i]] == 0) temp[arr[i]] = 1;
        if(temp[arr[i]] == 1) output “arr[i]” //repeating
    Traverse temp[] and output the array element having value as 0 (This is the missing element)

Time Complexity: O(n)
Auxiliary Space: O(n)
 */
public class FindMissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = { 7, 3, 4, 5, 5, 6, 2 }; 
        int n = arr.length; 
        printTwoElements(arr, n); 
	}

	private static void printTwoElements(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp[]=new int[n+1];
		for(int i=0;i<n;i++){
			if(temp[arr[i]]==1){
				System.out.println("Repeating no is "+arr[i]);
			}
			if(temp[arr[i]]==0){
				temp[arr[i]]=1;
			}
		}
		for(int i=1;i<n;i++)
		if(temp[i]==0){
			System.out.println("missing no is "+i);
		}
	}

}
