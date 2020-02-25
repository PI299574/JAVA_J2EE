package DP;
/*
Examples:
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.


The naive solution for this problem is to generate all subsequences of both given sequences and 
find the longest matching subsequence. This solution is exponential in term of time complexity.
 Let us see how this problem possesses both important properties of a Dynamic Programming (DP) Problem.

1) Optimal Substructure:
Let the input sequences be X[0..m-1] and Y[0..n-1] of lengths m and n respectively. 
And let L(X[0..m-1], Y[0..n-1]) be the length of LCS of the two sequences X and Y.
 Following is the recursive definition of L(X[0..m-1], Y[0..n-1]).

If last characters of both sequences match (or X[m-1] == Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = 1 + L(X[0..m-2], Y[0..n-2])

If last characters of both sequences do not match (or X[m-1] != Y[n-1]) then
L(X[0..m-1], Y[0..n-1]) = MAX ( L(X[0..m-2], Y[0..n-1]), L(X[0..m-1], Y[0..n-2]) )

Examples:
1) Consider the input strings “AGGTAB” and “GXTXAYB”. Last characters match for the strings. So length of LCS can be written as:
L(“AGGTAB”, “GXTXAYB”) = 1 + L(“AGGTA”, “GXTXAY”)
longest-common-subsequence
2) Consider the input strings “ABCDGH” and “AEDFHR. Last characters do not match for the strings. So length of LCS can be written as:
L(“ABCDGH”, “AEDFHR”) = MAX ( L(“ABCDG”, “AEDFHR”), L(“ABCDGH”, “AEDFH”) )

So the LCS problem has optimal substructure property as the main problem can be solved using solutions to subproblems.


 */
public class LongestCommonSubSequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String s1 = "AGGTAB"; 
		    String s2 = "GXTXAYB";
		    
		   int length= longestCommonSubSequencelengthDP(s1,s2);
		   System.out.println("Longest Commonlength is ********** "+length);
	}

	private static int longestCommonSubSequencelengthDP(String s1, String s2) {
		
		if(s1.length()==0 || s2.length()==0){
			return 0;
		}
		
		int m=s1.length();
		int n=s2.length();
		
		int [][]matrix=new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0){
					matrix[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)){
					matrix[i][j]=matrix[i-1][j-1]+1;
				}
				else{
					matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
			}
		}
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		return matrix[m][n];
		// TODO Auto-generated method stub
		
	}

}
/*
Time Complexity of the above implementation is O(mn)
*/