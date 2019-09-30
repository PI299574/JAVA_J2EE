package LearnBayStack;

import java.util.Scanner;

public class Stack<T  extends Object> {

	T []stack;
	int top;
	int size;
	
	
	@SuppressWarnings("unchecked")
	public Stack(int n) {
		top=-1;
		size = n;
		stack = (T[])new Object[size];
		
	}

	public void push(T data){
		if(IsFull()){
			System.out.println("stack is full : Memoery Overflow");
		}
		top++;
		stack[top]=data;
	}
	
	public T pop(){
		if(IsEmpty()){
			System.out.println("stack is Empty : Memoery underflow");
		}
		T data =null;
		data=stack[top];
		top--;
		return data;
	}
	public T peek(){
		if(IsEmpty()){
			System.out.println("stack is Empty : Memoery underflow");
		}
		T data =null;
		data=stack[top];
		return data;
	}
	private boolean IsEmpty() {
		// TODO Auto-generated method stub
		return (top==-1);
	}

	private boolean IsFull() {
		// TODO Auto-generated method stub
		return (top==size-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Stack<String> stringStack=new Stack<>(size);
		Stack<Character> charStack=new Stack<>(size);
		Stack<Integer> intStack=new Stack<>(size);
		
		stringStack.push("Apple");
		stringStack.push("mango");
		stringStack.push("papaya");
		
		charStack.push('A');
		charStack.push('B');
		charStack.push('C');
		
		intStack.push(101);
		intStack.push(102);
		intStack.push(103);
		
		System.out.println(stringStack.peek());
		System.out.println(stringStack.pop());
		
		System.out.println(charStack.peek());
		System.out.println(charStack.pop());
		
		System.out.println(intStack.peek());
		System.out.println(intStack.pop());
	}
	

}
