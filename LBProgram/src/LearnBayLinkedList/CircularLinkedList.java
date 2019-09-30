package LearnBayLinkedList;

public class CircularLinkedList {

	
	Node tail;
	
	public CircularLinkedList(){
		this.tail=null;
	}
	
	public void insertAtBegin(int data){
		Node newNode=new Node(data);
		if(tail==null){
			tail=newNode;
			tail.next=tail;
		}
		else{
			newNode.next=tail.next;
			tail.next=newNode;
				
		}
	}
	
	public void dispalyList(){
		Node current=tail.next;
		
		while(current!=tail){
			System.out.println(current.data);
			current=current.next;
			
		}
		System.out.println(tail.data);
	}
}
