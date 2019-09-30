package LearnBayStack;

import java.util.Scanner;
import java.util.Stack;


public class SortStackusuingOneStack {

	private static Stack<Integer> sortStack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		
		java.util.Stack<Integer> helperstack = new java.util.Stack(); 
		
		//push 1st element of main stack into helper stack
		helperstack.push(stack.pop());
		while(!stack.isEmpty()){
			
		int var=stack.pop();
		
		//check if main stack pop element is greater or less than helper stack peek element
		if(var>helperstack.peek()){
			helperstack.push(var);   //push into helperstack if greater
		}
		else{
			while(!helperstack.isEmpty() && var<helperstack.peek()){
				
				stack.push(helperstack.pop()); //else pop the helper top elemnt 1st till main stack top(var) is lesss than helper top eelment and push into main stack.
			}
			helperstack.push(var);//finally push into helper element.
		}
		}
		while(!helperstack.isEmpty()){   //helper element is having elemene in acending order
			stack.push(helperstack.pop());
		}
		return stack;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//push all element into main stack
		
		java.util.Stack<Integer> stack = new java.util.Stack();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			stack.push(sc.nextInt());
		}
		
		stack=sortStack(stack);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
	}

	

}
