package arrayProgram;

import java.util.HashMap;
import java.util.Scanner;

/*Input : arr[] = {10, 2, -2, -20, 10}, 
k = -10
Output : 3
Subarrays: arr[0...3], arr[1...4], arr[3..4]
have sum exactly equal to -10.

Input : arr[] = {9, 4, 20, 3, 10, 5},
    k = 33
Output : 2
Subarrays : arr[0...2], arr[2...4] have sum
exactly equal to 33.*/
public class SubarraySumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int n=7;//5 ;//sc.nextInt();
		int k=7;//-10; //sc.nextInt();
		//int arr[]=new int[n];
		//int arr[] = {10, 2, -2, -20, 10};
		int arr[] = {3,4,-7,1,3,3,1,-4};
		/*for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}*/
		subArraySum(arr,n,k);
		//System.out.println("No of subArray present "+SubArraySum1(arr,n,k));
	}

	private static int SubArraySum1(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map=new HashMap<>();//store previous sum value
		int curr_sum=0; int sum=k; int result=0;
		
		for(int i=0;i<n;i++){
			curr_sum=curr_sum+arr[i];
			
			//To check current sum is equal to sum
			if(curr_sum==sum){
				result++;
			}
			
			//If map contaiun currentssum then increase result value by current sum value
			if(map.containsKey(curr_sum-sum)){
				result=result+map.get(curr_sum-sum);
			}
			//if current sum is presnt in map then increment it by 1 or 1st time make caount value=1
			if(map.containsKey(curr_sum)){
				map.put(curr_sum, map.get(curr_sum)+1);
			}
			else{
				map.put(curr_sum, 1);
			}
			
		}
		return result;
	}

	private static void subArraySum(int[] arr, int n,int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int currentSum=0;
			for(int j=i;j<n;j++){
				currentSum=currentSum+arr[j];
				if(currentSum==k){
				printArray(arr,i,j);
				System.out.println(" ");
				}
			}
		}
	}

	private static void printArray(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("i= "+i +" "+ "j= "+j);
		for(int k=i;k<=j;k++){
			System.out.print(arr[k]+" ");
		}
	}

}
