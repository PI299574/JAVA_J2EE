package StringProgram;

import java.util.Arrays;

/*
 Given a string S, remove all the consecutive duplicates.
  Note that this problem is different from Recursively remove all adjacent duplicates. 
  Here we keep one character and remove all subsequent same characters.
  

Examples:

Input  : aaaaabbbbbb
Output : ab

Input : geeksforgeeks
Output : geksforgeks

Input : aabccba
Output : abcba

 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char S1[] = "geeksforgeeks".toCharArray(); 
        removeDuplicates(S1); 
  
        char S2[] = "aaaaabcca".toCharArray(); 
        String s=removeDuplicates(S2); 
	System.out.println(s);
	}

	private static String removeDuplicates(char[] s1) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=1;i<s1.length;i++){
			if(s1[j]!=s1[i]){
				j++;
				s1[j]=s1[i];
				
			}
		}
		System.out.println(Arrays.copyOfRange(s1, 0, j + 1));		
		return String.valueOf(s1);
	}

}
