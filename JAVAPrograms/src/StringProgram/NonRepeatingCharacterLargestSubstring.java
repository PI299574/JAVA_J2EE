package StringProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatingCharacterLargestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		System.out.println(getMaxNonRepeatingStringLength(s));
	}

	private static int getMaxNonRepeatingStringLength(String s) {
		// TODO Auto-generated method stub
		if(" ".equals(s) || s.length()==1){
			return 1;
		}
		List<String> strList=new ArrayList<>();
		for(int i=1;i<=s.length();++i){
			for(int j=0;j<=i;++j){
				String str = s.substring(j,i);
				if(IsNonRepeatingChar(str)){
					strList.add(str);
				}
			}
		}
		int maxSize=0;
		for(int i=0;i<strList.size();i++){
			System.out.println("String is "+strList.get(i)+" Size is "+strList.get(i).length());
			maxSize=Math.max(maxSize, strList.get(i).length());
		}
		return maxSize;
	}

	private static boolean IsNonRepeatingChar(String str) {
		// TODO Auto-generated method stub
		System.out.println("String***** is "+str);
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++){
			if(set.contains(str.charAt(i))){
				return false;
			}else{
				set.add(str.charAt(i));
			}
		}
		return true;
	}

}
