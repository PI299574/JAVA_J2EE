package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

/*
Input : 1->2->3->4->5->6->NULL
Output : 2->1->4->3->6->5->NULL

Input : 1->2->3->4->5->NULL
Output : 2->1->4->3->5->NULL
 */
public class PairWiseSwapLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.inserAtLast(10);
		list.inserAtLast(20);
		list.inserAtLast(30);
		list.inserAtLast(40);
		list.inserAtLast(50);
		list.inserAtLast(60);
		list.display();
		pairwiseSwapViaDatA(list.head);
		list.display();

		pairwiseSwapViaNode(list.head);

	}


	private static void pairwiseSwapViaDatA(Node head) {
		// TODO Auto-generated method stub

		Node current=head;
		while(null!=current && null!=current.next){
			int temp=current.data;
			current.data=current.next.data;
			current.next.data=temp;
			current=current.next.next;
		}

	}


	private static void pairwiseSwapViaNode(Node head) {
		// TODO Auto-generated method stub

		Node current =head;

	}

}
