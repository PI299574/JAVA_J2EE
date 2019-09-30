package LearnBayStack;

import java.util.Scanner;

public class Pallindrome {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Stack<Character>  st=new java.util.Stack<>();
		
		String revString="";
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    for(int i=0;i<s.length();i++){
	    	st.push(s.charAt(i));
	    }
	    
	    for(int i1=0;i1<s.length();i1++){
	    	revString+=st.pop();
	    }
	    
	    System.out.println("Reverse String is ===========  "+revString);
	    if(s.equals(revString)){
	    	System.out.println("Pallindrome");
	    }
	    else{
	    	System.out.println("Not Pallindrome");
	    }
	}

}
