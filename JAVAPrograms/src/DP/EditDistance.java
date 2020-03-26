package DP;
/*
 Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits 
 (operations) required to convert ‘str1’ into ‘str2’.

    Insert
    Remove
    Replace

All of the above operations are of equal cost.

Examples:

Input:   str1 = "geek", str2 = "gesek"
Output:  1
We can convert str1 into str2 by inserting a 's'.

Input:   str1 = "cat", str2 = "cut"
Output:  1
We can convert str1 into str2 by replacing 'a' with 'u'.

Input:   str1 = "sunday", str2 = "saturday"
Output:  3
Last three and first characters are same.  We basically
need to convert "un" to "atur".  This can be done using
below three operations. 
Replace 'n' with 'r', insert t, insert a

Soln: https://www.youtube.com/watch?v=We3YDTzNXEk
 */
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str1 = "sunday"; 
        String str2 = "saturday"; 
        System.out.println(editDistDP(str1, str2, str1.length(), str2.length())); 
	}

	private static int editDistDP(String str1, String str2, int length1,
			int length2) {
		// TODO Auto-generated method stub
		
		int dp[][]= new int[length1+1][length2+1];
		for(int i =0;i<=length1;i++){
			for(int j=0;j<=length2;j++){
				if(i==0){
					dp[i][j]=j;
				}
				else if(j==0){
					dp[i][j]=i;
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1)){
				dp[i][j]=dp[i-1][j-1];
				}
				else{
					dp[i][j]=1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]);
				}
			}
		}
		return dp[length1][length2];
	}

}
