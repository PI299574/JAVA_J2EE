package DP;

public class SubsetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 34, 4, 12, 5, 2}; 
        int sum = 9; 
        int n = array.length; 
        if (isSubsetSum(array, n, sum) == true) 
            System.out.println("Found a subset"
                          + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
	}

	private static boolean isSubsetSum(int[] array, int n, int sum) {
		// TODO Auto-generated method stub
		
		if(sum==0){
			return true;
		}
		if(n==0 && sum!=0){
			return false;
		}
		
		if(sum<array[n-1]){                          //do not include it 
		return isSubsetSum(array, n-1, sum);	
		}
		else{
		return isSubsetSum(array, n-1, sum) || isSubsetSum(array, n-1, sum-array[n-1])	;  //nhi lo ya lo
		}
		
	}

}
