package LearnBayStack;

import java.util.Scanner;

public class SimpleTextEditor1HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		String s="";
		java.util.Stack<String>  stack=new java.util.Stack();
		for(int i=0;i<total;i++){
			int number=sc.nextInt();
			switch(number){
			case 1:
				stack.push(s);
				String st=sc.next();
				s=s+st;
				break;
			case 2:
				stack.push(s);
				int k=sc.nextInt();
				s=s+s.substring(0,s.length()-k);
				break;
			
			case 3:
				int k1=sc.nextInt();
				System.out.println(s.charAt(k1-1));
				break;
			case 4:
				stack.pop();
				break;
				default:break;
					
				
		}
	}
	}
}
