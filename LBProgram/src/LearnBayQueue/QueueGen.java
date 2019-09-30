package LearnBayQueue;

import java.util.ArrayList;

public class QueueGen {

	
	private int rear=-1;
	private int front=0;

	private ArrayList<Object> list;
	
	public QueueGen(){
		this.rear=-1;
		this.front=0;
		list =new ArrayList<>();
	}
	
	public void enqueue(Object data){
		rear++;
		list.add(data);
	}
	
	public Object dequeue(){
		Object data=list.get(front);
		front++;
		return data;
		
	}
	
	public boolean IsEmpty(){
		boolean result=false;
		
		if (rear==-1 || front>rear){
			result=true;
			front=0;
			rear=-1;
		}
		return result;
	}
	
	public int getSize(){
		return list.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueGen queue=new QueueGen();
		//System.out.println(queue.IsFull());
		System.out.println(queue.IsEmpty());
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       queue.enqueue(60);
       queue.enqueue(70);
       System.out.println(queue.dequeue());
}
		
	}


