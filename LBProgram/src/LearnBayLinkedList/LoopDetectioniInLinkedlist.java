package LearnBayLinkedList;

public class LoopDetectioniInLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();

		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtLast(50);
		list.insertAtLast(60);

		Node head = list.head;
		head.next.next.next.next.next.next = head.next.next;

		// list.printList();
		boolean loop = detectLoop(list.head);
		System.out.println("Is loop exists " + loop);
		breakloop(list.head);
		list.printList();

	}

	  private static boolean detectLoop(Node head) {
		// TODO Auto-generated method stub

		Node slowPointer = head;
		Node fastPointer = head;
		boolean loop = false;
		while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {

				loop = true;
				break;
			}
		}
		return loop;
	}

	private static void breakloop(Node head) {
		// TODO Auto-generated method stub
		Node slowPointer = head;
		Node fastPointer = head;
		boolean loop = false;
		while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {
				loop = true;
				break;
			}
		}
		if (loop) {
			fastPointer = head;
			Node prev = null;
			System.out.println("loop detected at " + slowPointer.data);
			while (slowPointer != fastPointer && fastPointer.next!=null ) {
				prev = slowPointer;
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
			System.out.println("Loops start at " + slowPointer.data);
			System.out.println();
			prev.next = null;
			
		}

	}

}
