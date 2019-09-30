package LearnBayStack;

import java.util.ArrayList;

class Stack2{
	
	int top;
	int size;
	ArrayList arraylist;
	
	
	/*public Stack2(){
		arraylist=new ArrayList<>();
		top=-1;
		size=0;
	}*/
	public Stack2(int size){
		arraylist=new ArrayList<>();
		top=-1;
		this.size=size;
	}
	
	@SuppressWarnings("unchecked")
	public void push(Object data){
		if(IsFull()){
			System.out.println("stack is Full");
		}
		else{
				top++;
		arraylist.add(data);
		}
	}
	public  Object pop(){
		if(IsEmpty()){
			System.out.println("stack is empty");
		}

		
		Object data;
		data=arraylist.get(top);
		arraylist.remove(top);
		top--;
		return data;
	}
	
	public Object peek(){
		if(IsEmpty()){
			System.out.println("stack is empty");
		}
		Object data;
		data=arraylist.get(top);
		return data;
	}
	public boolean IsEmpty(){
		return (arraylist.isEmpty());
	}
	
	public boolean IsFull(){
	return (size==arraylist.size());
	}
}



public class StackUsuingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack2 stack=new Stack2(2);
      stack.push("abc");
      stack.push("def");
      stack.push("g");
      stack.push("hi");
      
      while(!stack.IsEmpty()){
    	  System.out.println(stack.pop());
      }
    // System.out.println(stack.size);
	}

}
