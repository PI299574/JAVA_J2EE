package DP;
/*
 Given two strings str1 and str2, find the shortest string that has both str1 and str2 as subsequences.

Examples :

Input:   str1 = "geek",  str2 = "eke"
Output: "geeke"

Input:   str1 = "AGGTAB",  str2 = "GXTXAYB"
Output:  "AGXGTXAYB"

1) Find Longest Common Subsequence (lcs) of two given strings. For example, lcs of “geek” and “eke” is “ek”.

2) Insert non-lcs characters (in their original order in strings) to the lcs found above, and return the result. So “ek” becomes “geeke” which is shortest common supersequence.

Let us consider another example, str1 = “AGGTAB” and str2 = “GXTXAYB”. LCS of str1 and str2 is “GTAB”. Once we find LCS, we insert characters of both strings in order and we get “AGXGTXAYB”

How does this work?
We need to find a string that has both strings as subsequences and is shortest such string. If both strings have all characters different, then result is sum of lengths of two given strings. If there are common characters, then we don’t want them multiple times as the task is to minimize length. Therefore, we fist find the longest common subsequence, take one occurrence of this subsequence and add extra characters.


Length of the shortest supersequence  = (Sum of lengths of given two strings) -
                                        (Length of LCS of two given strings) 
 */
public class ShortestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
