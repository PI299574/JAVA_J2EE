package LearnBayStack;

import java.util.Scanner;


public class MinElementStack {

	 
	java.util.Stack<Integer> stack=new java.util.Stack ();
	   
	   java.util.Stack<Integer> minStack=new java.util.Stack ();
	
	public void push(int data){
		if(stack.isEmpty()){
			 stack.push(data);
			 minStack.push(data); 
		}
		else{
			stack.push(data);
				 if(minStack.peek()>data){
					 minStack.push(data); 
			 }
		}
	}
	
	public int pop(){
		int d= stack.pop();
		   
		  if(d==minStack.peek()){
			  minStack.pop();
			  
		  }
		  return d;
	}
	
	public int getMin(){
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		MinElementStack minstack=new MinElementStack();
		minstack.push(13);
		minstack.push(25);
		minstack.push(10);
		minstack.push(8);
		minstack.pop();
		minstack.push(13);
		minstack.pop();
		
	 System.out.println(minstack.getMin());

	

}
}
