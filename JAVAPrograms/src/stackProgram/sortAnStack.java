package stackProgram;

import java.util.Scanner;
import java.util.Stack;

public class sortAnStack {

	public static java.util.Stack<Integer> sortStack(java.util.Stack<Integer> mainStack){
		
		java.util.Stack<Integer> helperStack=new java.util.Stack<Integer>();
		Integer x=(Integer) mainStack.pop();
		helperStack.push(x);
		while(!mainStack.isEmpty()){
			int var =(Integer) mainStack.pop();
			if(var > helperStack.peek()){
				helperStack.push(var);
			}else{
				while(!helperStack.isEmpty() && var < helperStack.peek()){
					mainStack.push(helperStack.pop());
				}
				helperStack.push(var);
			}
		}
		while(!helperStack.isEmpty()){
			mainStack.push(helperStack.pop());
		}
		return mainStack;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
