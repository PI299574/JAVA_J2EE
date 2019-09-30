package LearnBayQueue;

import java.util.LinkedList;

public class stackUsuing1Queue {

	java.util.Queue<Integer> queue=new LinkedList<>();
	
	public void push (int data){
		
		if(!queue.isEmpty()){
			
			int size=queue.size();
			queue.add(data);
			while(size>0){
				queue.add(queue.poll());
				size--;
			}
		}
		else{
			queue.add(data);
		}
	}
	
	public int pop(){
		int data=-1;
		if(!queue.isEmpty()){
			data=queue.poll();
		}
		return data;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stackUsuing1Queue stack=new stackUsuing1Queue();
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
