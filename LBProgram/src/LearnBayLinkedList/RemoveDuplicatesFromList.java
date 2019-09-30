package LearnBayLinkedList;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertAtLast(60);
		list.insertAtLast(70);
		list.insertAtLast(70);
		list.insertAtLast(70);
		list.insertAtLast(80);
		list.insertAtLast(90);
		list.insertAfter(60, 65);
		list.printList();
		removeDuplicates(list.head);
		list.printList();

	}

	public static void removeDuplicates(Node head) {
		// TODO Auto-generated method stub

		Node current = head;

		while (current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			}
			current = current.next;
		}

	}
}
