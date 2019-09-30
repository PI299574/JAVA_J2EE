package LearnBayLinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.insertAtLast(60);
		list.insertAtLast(70);
		list.insertAtLast(80);
		list.insertAtLast(90);
		list.insertAfter(60, 65);
		list.printList();
		System.out.println("Reverse list is********");
		Node head = reveseList(list.head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	private static Node reveseList(Node head) {
		// TODO Auto-generated method stub
		Node next = null;
		Node current = head;
		Node previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

}
