package LearnBayLinkedList;

public class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
		}
	}

	public void insertAfter(int data1, int data2) {
		Node newNode = new Node(data2);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null && current.data != data1) {
				current = current.next;
			}
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		} else {
			head = head.next;
		}
	}
	
	public void deleteLast(){
		Node current=head;
		Node temp=null;
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{
			while(current.next!=null){
				temp=current;
				current=current.next;
			}
			System.out.println("ii"+current.data);
			temp.next=null;
			
		}
	}

	public void deleteAfter(int data){
		Node current=head;
		
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{
			while(current!=null && current.data!=data){
				current=current.next;
			}
			current.next=current.next.next;
			
		}
	}
	public void delete(int data){
		Node current=head;
		
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{
			while(current.next!=null && current.next.data!=data){
				current=current.next;
			}
			current.next=current.next.next;
			
		}
	}
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	public int getListsize() {
		
		
		Node current = head;
		int size = 0;
		if (head == null) {
			return 0;
		} else {
			while (current != null) {
				size++;
				current = current.next;
			}
		}
		return size;
	}

	
	

}
