package stackProgram;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsuing1Queue<T> {

	Queue<T> queue=new LinkedList<T>();
	
	public void push(T data){
		if(queue.isEmpty()){
			queue.add(data);
		}else{
			int size=queue.size();
			queue.add(data);
			
			while(size>0){
				queue.add(queue.poll());
				size--;
			}
		}
	}
	public T pop(){
		T data=null;
		if(!queue.isEmpty()){
			data=queue.poll();
		}
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsuing1Queue<Integer> stack=new StackUsuing1Queue<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
