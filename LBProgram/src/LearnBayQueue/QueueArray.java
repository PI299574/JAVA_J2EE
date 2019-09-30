package LearnBayQueue;

class Queue{
	private int rear;
	private int front;
	private int size;
	private int arr[];
	public Queue(int size){
		this.size=size;
		this.rear=-1;
		this.front=0;
		this.arr=new int[size];
	}
	
	public void enqueue(int data){
		if(IsFull()){
			System.out.println("queue is Full");
		}
		else{
		rear++;
		arr[rear]=data;
	}
	}
	
	public int dequeue(){
	
		if(IsEmpty()){
			System.out.println("queue is empty");
			return -1;
		}
		
		int data=arr[front];
		front++;
		return data;
	}
	public boolean IsFull(){
		return (rear==size-1);
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
}


public class QueueArray {

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
