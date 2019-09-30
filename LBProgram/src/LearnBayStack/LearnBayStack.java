package LearnBayStack;

import java.util.Scanner;

class CharStack{
	
	char []arr;
	int top;
	int size;
	public CharStack(int n){
		size=n;
		arr=new char[size];
		top=-1;
		
	}
	
	public void push(char ch){
		if(IsFull()){
			System.out.println("stack is full");
		}
		
		arr[++top]=ch;
	}
	private boolean IsFull() {
		// TODO Auto-generated method stub
		return (top==size-1);
	}

	public char pop(){
		char ch=' ';
		if(IsEmpty()){
			System.out.println("stack is empty");
		}
		ch=arr[top];
		top--;
		return ch;
	}

	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return (top==-1);
	}

	public char peek() {
		// TODO Auto-generated method stub
		char ch=' ';
		if(IsEmpty()){
			System.out.println("stack is empty");
		}
		ch=arr[top];
		
		return ch;
	}
}
public class LearnBayStack {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
		CharStack stack=new CharStack(n);
		CharStack stack1=new CharStack(n);
		
		String string=sc.next();
		for(int i=0;i<string.length();i++){
			stack.push(string.charAt(i));
		}
		
		System.out.println("reverse String is");
		
		for(int i=0;i<string.length();i++){
			
			char d=stack.pop();
			stack1.push(d);
			System.out.print(d);
		}
		boolean flag=false;
		while(!stack.IsEmpty() && !stack1.IsEmpty()){
		if(stack.peek()==stack1.peek()){
			stack.pop();
			stack1.pop();
			flag=true;;
		}
		else{
			flag=false;
		}
		}
		System.out.println(" "+flag);
	}

}
