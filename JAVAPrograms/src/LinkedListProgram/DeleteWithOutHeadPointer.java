package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

public class DeleteWithOutHeadPointer {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.inserAtLast(10);
		list.inserAtLast(20);
		list.inserAtLast(30);
		list.inserAtLast(40);
		list.inserAtLast(50);
		list.display();

		deleteGivenNode(list.head.next.next);//deleting 3rd node //30
		list.display();


	}

	private static void deleteGivenNode(Node deleteThisNode) {
		// TODO Auto-generated method stub
		//list.display();
		Node temp=deleteThisNode.next;

		deleteThisNode.data=temp.data;

		deleteThisNode.next=temp.next;

	}

}
