package LearnBayLinkedList;

public class RotateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();

		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtLast(50);
		list.insertAtLast(60);
		list.insertAtLast(70);
		int k = 2;
		Node current = rotateLinkeList(list.head, k);
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(" ");
	}

	private static Node rotateLinkeList(Node head, int k) {
		// TODO Auto-generated method stub
		Node current = head;
		int i = 0;
		while (i < k && null != current.next) {
			current = current.next;
			i++;
		}
		Node head2 = current;
		while (head2.next != null) {
			head2 = head2.next;
		}
		head2.next = head;
		while (head2.next != current) {
			head2 = head2.next;
		}

		head2.next = null;

		return current;
	}

}
 