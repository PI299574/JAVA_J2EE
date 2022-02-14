package DP;
/*
 Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.

Example 1:

Input:
A: [1,2,3,2,1]
B: [3,2,1,4,7]
Output: 3
Explanation: 
The repeated subarray with maximum length is [3, 2, 1].


OR

Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.

Examples :

    Input : X = “GeeksforGeeks”, y = “GeeksQuiz”
    Output : 5
    The longest common substring is “Geeks” and is of length 5.

    Input : X = “abcdxyz”, y = “xyzabcd”
    Output : 4
    The longest common substring is “abcd” and is of length 4.

    Input : X = “zxabcdezy”, y = “yzabcdezx”
    Output : 6
    The longest common substring is “abcdez” and is of length 6.
    
    
    
 Let m and n be the lengths of first and second strings respectively.

A simple solution is to one by one consider all substrings of first string and for every substring 
check if it is a substring in second string. Keep track of the maximum length substring.
 There will be O(m^2) substrings and 
 we can find whether a string is subsring on another string in O(n) time (See this).
 So overall time complexity of this method would be O(n * m2)

Dynamic Programming can be used to find the longest common substring in O(m*n) time.
 The idea is to find length of the longest common suffix for all substrings of both strings and store these lengths in a table.

    The longest common suffix has following optimal substructure property.

    If last characters match, then we reduce both lengths by 1
    LCSuff(X, Y, m, n) = LCSuff(X, Y, m-1, n-1) + 1 if X[m-1] = Y[n-1]
    If last characters do not match, then result is 0, i.e.,
    LCSuff(X, Y, m, n) = 0 if (X[m-1] != Y[n-1])

    Now we consider suffixes of different substrings ending at different indexes.
    The maximum length Longest Common Suffix is the longest common substring.
    LCSubStr(X, Y, m, n) = Max(LCSuff(X, Y, i, j)) where 1 <= i <= m and 1 <= j <= n 
 */
public class LongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String X = "GeeksforGeeks"; 
	     String Y = "GeeksQuiz"; 
	     
	    String s=largestCommonSubString(X,Y);
	    System.out.println("String is***** "+s +" Length is ***** "+s.length());
	}

	private static String largestCommonSubString(String x, String y) {
		// TODO Auto-generated method stub
		if(x==null || y==null){
			return null;
		}
		int m=x.length();
		int n=y.length();
		
		int matrix[][]=new int[m+1][n+1];
		int endIndex=x.length();
		int maxSize=0;
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 ||j==0){
					matrix[i][j]=0;
				}
				else if(x.charAt(i-1)==y.charAt(j-1)){
					matrix[i][j]=1+matrix[i-1][j-1];
					maxSize=Math.max(maxSize,matrix[i][j]);
				}
				else{
					matrix[i][j]=0;
					
				}
			}
		}
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		String commonSubString =x.substring((endIndex-maxSize),endIndex);
		System.out.println("Common SubString is ******** "+commonSubString);
		System.out.println("Max Length ****** "+maxSize);
		return commonSubString;
	}

}
