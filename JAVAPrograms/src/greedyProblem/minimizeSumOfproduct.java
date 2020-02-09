package greedyProblem;

import java.util.Arrays;

/*
 Given two arrays, A and B, of equal size n, the task is to find the minimum value 
 of A[0] * B[0] + A[1] * B[1] +…+ A[n-1] * B[n-1]. Shuffling of elements of arrays A and B is allowed.

Examples :

Input : A[] = {3, 1, 1} and B[] = {6, 5, 4}.
Output : 23
Minimum value of S = 1*6 + 1*5 + 3*4 = 23.

Input : A[] = { 6, 1, 9, 5, 4 } and B[] = { 3, 4, 8, 2, 4 }
Output : 80.
Minimum value of S = 1*8 + 4*4 + 5*4 + 6*3 + 9*2 = 80.

The idea is to multiply minimum element of one array to maximum element of another array. Algorithm to solve this problem:

    Sort both the arrays A and B.
    Traverse the array and for each element, multiply A[i] and B[n – i – 1] and add to the total.

 */
public class minimizeSumOfproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 3, 1, 1 }; 
        int B[] = { 6, 5, 4 }; 
        int n = A.length; 
        ; 
        System.out.println(minValue(A, B, n)); 
	}

	private static int minValue(int[] a, int[] b, int n) {
		// TODO Auto-generated method stub
		
		Arrays.sort(a);
		Arrays.sort(b);
		int result=0;
		for(int i=0;i<n;i++){
			result=result+(a[i]*b[n-1-i]);
		}
		return result;
	}

}
