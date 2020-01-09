package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

/*
 Given two linked lists, insert nodes of second list into first list at alternate positions of first list.
For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6, the first list should become
 5->12->7->10->17->2->13->4->11->6 and 
second list should become empty. The nodes of second list should only be inserted when there are positions available.
 For example, if the first list is 1->2->3 and second list is 4->5->6->7->8, then first list should become
  1->4->2->5->3->6 and second list to 7->8.

Use of extra space is not allowed (Not allowed to create additional nodes), i.e., 
insertion must be done in-place. Expected time complexity is O(n) where n is number of nodes in first list
 */
public class mergeListAtAlternatePositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.inserAtLast(10);
		list1.inserAtLast(100);
		list1.inserAtLast(30);
		list1.inserAtLast(40);
		list1.inserAtLast(50);

		LinkedList list2=new LinkedList();
		list2.inserAtLast(20);
		list2.inserAtLast(60);
		list2.inserAtLast(70);
		list1.display(list1.head);
	    list1.display(list2.head);
		Node n= merge(list1.head,list2.head);
	    list1.display(list1.head);
	    list1.display(n);
	    
		//System.out.println(n.data);
	}

	private static Node merge(Node head1, Node head2) {
		// TODO Auto-generated method stub
		System.out.println("****");
		if(head1==null && head2==null){
			return null;
		}
		
		Node current1=head1;
		Node current2=head2;
		Node next1=null;
		Node next2=null;;
		
		while(current1!=null && current2!=null){
			next1=current1.next;
			next2=current2.next;
			
			current1.next=current2;
			current2.next=next1;
			
			
			
			current1=next1;
			current2=next2;
		}
	
		head2=current2;
		return head2;
	}

}
