package LinkedListProgram;

import LinkedListProgram.LinkedList.Node;

public class IntersectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  Sol-1 : Count Node in both the list and get absoulte differnce |list1.size-list2.size|
		  traverse till the diffrence from bigger list and then start traversing both the list
		  if node data get match then that will be intersection point

		  Sol-2: take one hashset and put all the data from list1 to hasset.
		  traverse 2nd list and check whethet seconmd list node data is present in 1st list or not if yes then that wil be intersection point

		  Sol -3:
		 */

		LinkedList list1=new LinkedList();
		list1.inserAtLast(10);
		list1.inserAtLast(20);
		list1.inserAtLast(30);
		list1.inserAtLast(40);
		list1.inserAtLast(50);

		LinkedList list2=new LinkedList();
		list2.inserAtLast(30);
		list2.inserAtLast(60);
		list2.inserAtLast(70);

		Node n= findIntersection(list1,list2);
		System.out.println(n.data);

	}

	private static Node findIntersection(LinkedList list1, LinkedList list2) {
		// TODO Auto-generated method stub

		int size1=getSize(list1);
		int size2=getSize(list2);
		int diff=Math.abs(size1-size2);
		Node head1 =list1.head;
		Node head2 =list2.head;
		if(size1>size2){
			while(head1!=null && diff!=0){
				head1=head1.next;
				diff--;
			}
		}else{
			while(head2!=null && diff!=0){
				head2=head2.next;
				diff--;
			}
		}
		while(head1.data!=head2.data && head1.next!=null && head2.next!=null){
			head1=head1.next;
			head2=head2.next;
		}

		return head1;
	}

	private static int getSize(LinkedList list) {
		// TODO Auto-generated method stub
		Node current=list.head;
		int size=0;
		while(current!=null){
			size++;
			current=current.next;
		}
		return size;
	}

}


