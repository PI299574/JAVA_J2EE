package LearnBayQueue;

import java.util.LinkedList;
//ask again with 2 queue and 1 queue
public class StackUsuingQueue {

	java.util.Queue<Integer> queue1=new LinkedList<>();
	java.util.Queue<Integer> queue2=new LinkedList<>();
	
	
	public void push(int data){
		
		if(!queue1.isEmpty()){
			while(!queue1.isEmpty()){
				queue2.add(queue1.poll());
			}
			queue1.add(data);
		}else{
			queue1.add(data);
		}
		if(!queue2.isEmpty()){
			while(!queue2.isEmpty())
			queue1.add(queue2.poll());
		}
			
	}
	
	public int pop(){

		int data=-1;
		if(!queue1.isEmpty()){
			data=queue1.poll();
		}
		return data;
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsuingQueue stack=new StackUsuingQueue();
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
