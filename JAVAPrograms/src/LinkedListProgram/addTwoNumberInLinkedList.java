package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

public class addTwoNumberInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList(); 
        l1.inserAtLast(6); 
        l1.inserAtLast(0); 
        l1.inserAtLast(0); 
        LinkedList l2 = new LinkedList(); 
        l2.inserAtLast(8); 
        l2.inserAtLast(5); 
        l2.inserAtLast(0); 
        LinkedList l3 = new LinkedList(); 
        Node head = sum(l1.head, l2.head); 
        l3.display(head);
        //System.out.print("Null"); 
	}

	private static Node sum(Node head1, Node head2) {
		// TODO Auto-generated method stub
		
		head1=reverse(head1);
		head2=reverse(head2);
		 
		Node dummyNode = new Node(0); 
        Node current=dummyNode;
        int carry = 0,sum; 
        while(head1 != null || head2 != null) 
        { 
        	int data1=(head1!=null)?head1.data:0;
        	int data2=(head2!=null)?head2.data:0;
            sum = carry + data1 + data2;  
            carry = sum / 10; 
            int data=sum%10;
            current.next=new Node(data);
            if(head1!=null) head1=head1.next; 
            if(head2!=null) head2 = head2.next; 
            current=current.next;
            if(carry>0){
            	current.next=new Node(carry);
            }
        } 
  
       return reverse(dummyNode.next);
	    
	}

	private static Node reverse(Node head) {
		// TODO Auto-generated method stub
		
		Node prev=null;
		Node next=null;
		Node current=head;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}

}
