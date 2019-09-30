package LearnBayLinkedList;

public class ListEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();

		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		//list.insertAtLast(50);
		//list.insertAtLast(60);
		//list.insertAtLast(90);
		//list.insertAtLast(100);
		
		String s=IsevenOrOdd(list.head);
		System.out.println(s);
	}

	private static String IsevenOrOdd(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		String s="";
		while(slow!=null){
			if(fast.next==null){
				
				s="ODD";
				break;
			}
		if(fast.next.next==null){
				s="EVEN";
				break;
			}
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return s;
	}

}
