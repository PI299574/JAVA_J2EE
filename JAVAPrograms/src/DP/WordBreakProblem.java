package DP;

import java.util.HashSet;

/*
 Given an input string and a dictionary of words, find out if the input string can be segmented into a
  space-separated sequence of dictionary words. See following examples for more details.
This is a famous Google interview question, also being asked by many other companies now a days.

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  cream, icecream, man, go, mango}

Input:  ilike
Output: Yes 
The string can be segmented as "i like".

Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung" 
or "i like sam sung"

The idea is simple, we consider each prefix and search it in dictionary. If the prefix is present in dictionary, 
we recur for rest of the string (or suffix). If the recursive call for suffix
 */
public class WordBreakProblem {

	private static HashSet<String> set=new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array of strings to be added in dictionary set. 
        String temp_dictionary[] = {"mobile","samsung","sam","sung",  
                            "man","mango","icecream","and",  
                            "go","i","like","ice","cream"}; 
                              
        // loop to add all strings in dictionary set  
        for(String s:temp_dictionary){
        	set.add(s);
        }
        
        System.out.println(wordBreak("ilikesamsung")); 
        System.out.println(wordBreak("iiiiiiii")); 
        System.out.println(wordBreak("")); 
        System.out.println(wordBreak("ilikelikeimangoiii")); 
        System.out.println(wordBreak("samsungandmango")); 
        System.out.println(wordBreak("samsungandmangok")); 
	}
	private static boolean wordBreak(String word) {
		// TODO Auto-generated method stub
		
		int size=word.length();
		if(size==0){
			return true;
		}
		
		for(int i=1;i<=size;i++){
			// Now we will first divide the word into two parts , 
            // the prefix will have a length of i and check if it is  
            // present in dictionary ,if yes then we will check for  
            // suffix of length size-i recursively. if both prefix and  
            // suffix are present the word is found in dictionary. 
			String prefix=word.substring(0,i);
			String suffix=word.substring(i, size);
			if(set.contains(prefix) && wordBreak(suffix)){
				return true;
			}
		}
		return false;
	}

}
