package StringProgram;

import java.util.HashMap;
import java.util.Map;

/*
Given a string with repeated characters, the task is to rearrange characters in a string so that no two adjacent characters are same.
Note : It may be assumed that the string has only lowercase English alphabets.
Examples:
Input: aaabc 
Output: abaca 
Input: aaabb
Output: ababa 
Input: aa 
Output: Not Possible

Input: aaaabc 
Output: Not Possible
 The idea is to store the frequency of each character in an unordered_map and compare maximum frequency of
  character with the difference of string length and maximum frequency number. If the maximum frequency 
  is less than the difference then it can be arranged otherwise not
 */
public class RearrangeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "geeksforgeeks"; 
		String str = "aaaabc"; 
        if (isPossible(str.toCharArray())) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
	}

	private static boolean isPossible(char[] charArray) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hmap=new HashMap<>();
		for(char c:charArray){
			if(hmap.containsKey(c)){
				hmap.put(c, hmap.get(c)+1);
			}else{
				hmap.put(c, 1);
			}
		}
		int max_Freq=0;
		for(Map.Entry<Character, Integer> m:hmap.entrySet()){
			if(m.getValue()>max_Freq){
				max_Freq=m.getValue();
			}
		}
		if(max_Freq<=charArray.length-max_Freq+1){
			return true;
		}
		return false;
	}

}
