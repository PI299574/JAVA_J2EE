package LearnBayQueue;

public class CircularQueue {

	int front;
	int rear;
	 int maxSize;
	 int currentSize;
	int arr[];
	public CircularQueue(int size){
		this.front=0;
		this.rear=0;
		this.maxSize=size;
		this.currentSize=0;
		this.arr=new int[size];
		
	}
	
	 public void enque(int data){
		if(IsFull()){
			System.out.println("Queue is Full");
		}
		else{
		arr[rear]=data;
		rear=(rear+1)%maxSize;
		currentSize++;
	 }
	 }
	 public int deque(){
		 int data=0;
			if(IsEmpty()){
				System.out.println("Queue is Empty");
			}
			else{
				
			data=arr[front];
			//arr[front]=-1;
			front=(front+1)%maxSize;
			currentSize--;
		 }
			return data;
		 }
	public boolean IsFull() {
		// TODO Auto-generated method stub
		return (currentSize==maxSize);
	}
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return (currentSize==0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularQueue queue=new CircularQueue(5);
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
	
	
	
		queue.enque(60);
		System.out.println(queue.deque());
	}

}
