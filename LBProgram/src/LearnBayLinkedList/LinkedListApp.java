package LearnBayLinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list=new  LinkedList();
		list.insertAtFirst(10);
		list.insertAtFirst(20);
		list.insertAtFirst(30);
		list.insertAtFirst(40);
		list.insertAtLast(60);
		list.insertAtLast(70);
		list.insertAtLast(80);
		list.insertAtLast(90);
		list.insertAfter(60, 65);
		list.deleteFirst();
		list.deleteFirst();
		list.deleteLast();
		list.deleteLast();
		list.deleteAfter(60);
		list.delete(10);
		
		System.out.println("Size*****"+list.getListsize());
		list.printList();
		
	}

}
