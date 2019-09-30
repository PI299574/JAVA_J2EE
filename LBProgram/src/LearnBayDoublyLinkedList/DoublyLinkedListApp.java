package LearnBayDoublyLinkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DoublyLinkedList list=new DoublyLinkedList();
		list.insertAtFirst(10);
		list.insertAtFirst(20);
		list.insertAtFirst(30);
		list.insertAtFirst(40);
		list.insertAtFirst(50);
		list.printforwrd();
		list.printbackward();
		
		list.insertAtLast(60);
		list.insertAtLast(70);
		list.insertAtLast(80);
		list.insertAtLast(90);
		list.insertAtLast(100);
		list.printforwrd();
		list.printbackward();
		list.inserAfter(60, 65);
		list.inserAfter(70, 75);
		list.printforwrd();
		list.printbackward();
		
		
		list.deleteFirst();
		list.printforwrd();
		list.printbackward();
		
		list.deleteLast();
		list.printforwrd();
		list.printbackward();
		
		list.deleteAfter(65);
		list.printforwrd();
		list.printbackward();
		list.deleteAfter(80);
		list.printforwrd();
		list.printbackward();
	}

}
