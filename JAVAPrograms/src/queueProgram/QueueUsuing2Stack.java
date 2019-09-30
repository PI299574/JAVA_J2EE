package queueProgram;


import java.util.Stack;

public class QueueUsuing2Stack {

	
	Stack<Integer> stack1=new java.util.Stack<>();
	Stack<Integer> stack2=new java.util.Stack<>();
	
	public void enqueue(Integer data){
		if(!stack1.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			stack2.push(data);
		}else{
		stack1.push(data);
		}
		
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
	}
	public Integer dequeue(){
		Integer data =-1;
		if(!stack1.isEmpty()){
			data = stack1.pop();
		}
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsuing2Stack que = new QueueUsuing2Stack();
		que.enqueue(14);
		que.enqueue(24);
		que.enqueue(4);
		que.enqueue(10);

		System.out.println(que.dequeue());
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());

		que.enqueue(20);
		que.enqueue(22);
		que.enqueue(23);
		System.out.println(que.dequeue());
	}

}
