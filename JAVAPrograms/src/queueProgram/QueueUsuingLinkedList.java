package queueProgram;

class Qnode{
	int data;
	Qnode next;
	Qnode(int data){
		this.data=data;
	}
	
}

class QueueusuingLList{
	
	Qnode rear;
	Qnode front;
	public QueueusuingLList(){
		rear=null;
		front=null;
	}
	
	public void enqueue(int data){
		Qnode node=new Qnode(data);
		
		if(this.rear==null){
			this.rear=this.front=node;
			return;
		}
		
		this.rear.next=node;
		this.rear=node;
	}
	
	public int dequeue(){
		if(front ==null){
            this.rear=null;
			return -1;
		}
		int data=this.front.data;
		front=front.next;
		return data;
		
	}
}

public class QueueUsuingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
