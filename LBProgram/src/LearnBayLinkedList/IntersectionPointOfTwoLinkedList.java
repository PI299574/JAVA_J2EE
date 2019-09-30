package LearnBayLinkedList;

public class IntersectionPointOfTwoLinkedList {

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
		list2.insertAtLast(90);
		list2.insertAtLast(100);

		int size1 = list1.getListsize();
		int size2 = list2.getListsize();
		findInterSectionPoint(list1.head, list2.head, size1, size2);
	}

	private static void findInterSectionPoint(Node head1, Node head2, int size1, int size2) {
		// TODO Auto-generated method stub
		int size = Math.abs(size2 - size1);

		if (size1 > size) {
			while (size > 0) {
				head1 = head1.next;
				size--;
			}

		} else {
			while (size > 0) {
				head2 = head2.next;
				size--;
			}
		}
		// System.out.println(head1.data);
		while (head1.data != head2.data && head1.next != null && head2.next != null) {
			head1 = head1.next;
			head2 = head2.next;
		}

		// System.out.println(head1.data);
		System.out.println(head2.data);

	}

}
