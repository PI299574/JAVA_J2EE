package queueProgram;

public class Queue<T> {

	int rear=-1;
	int front=0;
	int size;
	T []array;
	public Queue(int size){
		this.size=size;
		array=(T[]) new Object[size];
	}
	public void enqueue(T data){
		if(IsFull()){
			System.out.println("Memory Overflow");
			return ;
		}
		array[++rear]=data;
	}
	
	public T dequeue(){
		T data=null;
		if(IsEmpty()){
			System.out.println("Memory underflow");
			return null;
		}
		data = array[front];
		front++;
		return data;
	}
	private boolean IsEmpty() {
		// TODO Auto-generated method stub
		boolean result=false;;
		
		if (rear==-1 || front>rear){
			front=0;
			rear=-1;
			result=true;
		}
		return result;
		
	}
	private boolean IsFull() {
		// TODO Auto-generated method stub
		return (rear==size-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue(10);
		System.out.println(queue.IsFull());
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
