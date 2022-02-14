package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

/*
Given a linked list, write a function to reverse every k nodes (where k is an input to the function).

Example:
    Input: 1->2->3->4->5->6->7->8->NULL, K = 3
    Output: 3->2->1->6->5->4->8->7->NULL 
 */
public class ReverseLinkedListInGroupOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist = new LinkedList(); 
        
        /* Constructed Linked List is 1->2->3->4->5->6-> 
           7->8->8->9->null */
        llist.inserAtLast(1); 
        llist.inserAtLast(2); 
        llist.inserAtLast(3); 
        llist.inserAtLast(4); 
        llist.inserAtLast(5); 
        llist.inserAtLast(6); 
        llist.inserAtLast(7); 
        llist.inserAtLast(8); 
        llist.inserAtLast(9); 
          
        System.out.println("Given Linked List"); 
        llist.display(llist.head); 
          
        llist.head = reverse(llist.head, 3); 
  
        System.out.println("Reversed list"); 
        llist.display(llist.head); 
	}
	public static Node reverse(Node head, int k) {
		// TODO Auto-generated method stub
		Node next=null;Node prev = null;
		Node current=head;
		int x=0;
		while(x<k && current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			x++;
		}
		if(next!=null){
			head.next=reverse(next,k);
		}
		
		return prev;
	}

}
