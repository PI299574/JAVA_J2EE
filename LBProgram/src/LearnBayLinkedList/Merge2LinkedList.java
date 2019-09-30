package LearnBayLinkedList;

public class Merge2LinkedList {

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

		LinkedList list2 = new LinkedList();
		list2.insertAtLast(70);
		list2.insertAtLast(80);
		list2.insertAtLast(85);
		list2.insertAtLast(95);
		list2.insertAtLast(105);
		list2.insertAtLast(110);
		Node current = mergesortedList(list1, list2);
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(" ");
	}

	private static Node mergesortedList(LinkedList list1, LinkedList list2) {
		// TODO Auto-generated method stub

		Node mergeNode = new Node(0);
		Node current = mergeNode;
		Node head1 = list1.head;
		Node head2 = list2.head;

		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				current.next = head1;
				head1 = head1.next;
			} else {
				current.next = head2;
				head2 = head2.next;

			}
			current = current.next;
		}

		if (null == head2) {
			current.next = head1;
		}
		if (null == head1) {
			current.next = head2;
		}

		return mergeNode.next;
	}

}
