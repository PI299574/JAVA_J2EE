package StringProgram;



import java.util.HashSet;
import java.util.Scanner;

class B{

}
interface C{

}
interface D{

}
class a extends B implements C ,D{

}


/*
 *
 *  for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.
abababcdefababcdab = 6
geeksforgeeks = 7
 *
 * Approach:
	 We use HashSet to store the characters in current window [i,j)[i, j)[i,j) (j=ij = ij=i initially).
	 Then we slide the index jjj to the right. If it is not in the HashSet, we slide jjj further.
	 Doing so until s[j] is already in the HashSet. At this point, we found the maximum size
	 of substrings without duplicate characters start with index iii. If we do this for all iii, we get our answer.*/
public class NoNRepeatingCharacterOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		System.out.println(getMaxNonRepeatingStringLength(s));
	}

	private static int getMaxNonRepeatingStringLength(String s) {
		// TODO Auto-generated method stub

		HashSet<Character> hset=new HashSet<>();

		int i=0,j=0,result=0;

		while(i<s.length() && j<s.length()){
			if(!hset.contains(s.charAt(j))){
				hset.add(s.charAt(j));
				j++;
				result=Math.max(result, j-i);
			}else{
				hset.remove(s.charAt(i));
				i++;
			}
		}
		return result;
	}

}
