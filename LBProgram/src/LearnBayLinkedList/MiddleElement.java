package LearnBayLinkedList;

public class MiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();

		list1.insertAtLast(10);
		list1.insertAtLast(20);
		list1.insertAtLast(30);
		list1.insertAtLast(40);
		list1.insertAtLast(50);
		list1.insertAtLast(60);
		list1.insertAtLast(90);
		list1.insertAtLast(100);
		list1.insertAtLast(110);
		Node midElement=findMiddleElment(list1.head);
		System.out.println("MidElement  "+midElement.data);
	}

	private static Node findMiddleElment(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		
		while(null!=fast && null!=fast.next){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}

}
