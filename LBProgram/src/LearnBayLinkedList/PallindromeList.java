package LearnBayLinkedList;

public class PallindromeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.insertAtLast(05);
		list1.insertAtLast(10);
		list1.insertAtLast(20);
		list1.insertAtLast(30);
		list1.insertAtLast(30);
		list1.insertAtLast(20);
		list1.insertAtLast(10);
		list1.insertAtLast(05);
	
		boolean pallindrome=checkPallindrome(list1.head);
		System.out.println(pallindrome);
	}

	private static boolean checkPallindrome(Node head) {
		// TODO Auto-generated method stub
		
		Node first=head;
		Node second=head;
		boolean pallindrome=false;
		while(null!=second && null!=second.next){
			second=second.next.next;
			first=first.next;
		}
		System.out.println("Mid element   " + first.data);
		Node firsthalf=head;
		while(firsthalf.next.data!=first.data){
			firsthalf=firsthalf.next;
		}
		firsthalf.next=null;
		firsthalf=head;
		
		System.out.println("first list is***");
        displayLink(firsthalf);
        
        //System.out.println("reverse second list***");
     	Node secondhalf=first.next;
     	
     	secondhalf=	reverseList(secondhalf);
     	
       	System.out.println("second list ******");
       	displayLink(secondhalf);
       	//System.out.println("comparision start");
     	while(firsthalf!=null && secondhalf!=null){
    	if(secondhalf.data!=firsthalf.data ){
 		pallindrome=false;
 		break;
		}
		else{
			secondhalf=secondhalf.next;
			firsthalf=firsthalf.next;
		}
    	pallindrome=true;
		}
     	//System.out.println("Is pallindrome"+pallindrome);
		return pallindrome;
	}

	private static void displayLink(Node head) {
		// TODO Auto-generated method stub
		Node current =head;
		while(current!=null){
		System.out.println(current.data+" ");
		current=current.next;
		}
	}

	private static Node reverseList(Node head) {
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
