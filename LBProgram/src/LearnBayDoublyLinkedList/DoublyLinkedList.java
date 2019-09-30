package LearnBayDoublyLinkedList;

public class DoublyLinkedList {

	DoublyNode head;

	public DoublyLinkedList() {
		this.head = null;
	}

	public void insertAtFirst(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if (head == null) {
			head = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAtLast(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if (head == null) {
			head = newNode;
		} else {
			DoublyNode Current = head;
			while (Current.next != null) {
				Current = Current.next;
			}
			Current.next = newNode;
			newNode.prev = Current;
		}
	}

	public void inserAfter(int data1, int data2) {
		DoublyNode newNode = new DoublyNode(data2);
		if (head == null) {
			head = newNode;
		} else {
			DoublyNode Current = head;
			while (Current.next != null && Current.data != data1) {
				Current = Current.next;
			}
			DoublyNode temp = Current.next;
			Current.next = newNode;
			newNode.next = temp;
			temp.prev = newNode;
			newNode.prev = Current;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("empty list");
		} else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("empty list");
		} else {
			DoublyNode current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void deleteAfter(int data1) {
		System.out.println("In delete after");
		if (head == null) {
			System.out.println("empty list");
		} else {
			DoublyNode Current = head;
			while (Current.next != null && Current.data != data1) {
				Current = Current.next;
			}
			if(Current.data==data1 && Current.next.next!=null){
			DoublyNode temp = Current.next;
			Current.next = Current.next.next;
			temp.next.prev=Current;
		}
			else{
				Current.next=null;
				//System.out.println("data not found in list/ use deletelast to delete last element");
			}
		}
		
	}
	public void printforwrd() {
		DoublyNode current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(" ");
	}

	public void printbackward() {
		DoublyNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		DoublyNode prevElement = current;
		while (prevElement != null) {
			System.out.print(prevElement.data + " ");
			prevElement = prevElement.prev;
		}
		System.out.println(" ");
	}

}
