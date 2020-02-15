package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

/*
 Given a linked list of 0s, 1s and 2s, sort it.

Examples:

Input  : 2->1->2->1->1->2->0->1->0
Output : 0->0->1->1->1->1->2->2->2

Input : 2->1->0
Output : 0->1->2
 
 */
public class SortALinkedListOf012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);  
        head.next = new Node(2);  
        head.next.next = new Node(0);  
        head.next.next.next = new Node(1); 
        System.out.println("Linked List Before Sorting"); 
        printList(head);  
        head = sortList(head);   
        System.out.println("\nLinked List After Sorting"); 
        printList(head);  
	}
	private static Node sortList(Node head) {
		// TODO Auto-generated method stub
		
		Node zeroD=new Node(0);
		Node oneD=new Node(0);
		Node twoD=new Node(0);
		
		Node zero=zeroD;
		Node one=oneD;
		Node two=twoD;
		Node current=head;
		while(current!=null){
			if(current.data==0){
				zero.next=current;
				zero=zero.next;
				current=current.next;
			}
			else if(current.data==1){
				one.next=current;
				one=one.next;
				current=current.next;
			}
			else{
				two.next=current;
				two=two.next;
				current=current.next;
			}
		}
		
		zero.next=(oneD.next!=null?oneD.next:twoD.next);
		one.next=twoD.next;
		two.next=null;
		head=zeroD.next;
		return head;
	}
	public static void printList(Node node)  
    {  
        while (node != null)  
        {  
            System.out.print(node.data+" "); 
            node = node.next;  
        }  
    } 
}
