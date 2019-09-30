package LearnBayLinkedList;

public class KthnodeFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList list=new LinkedList();
		
		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtLast(50);
		list.insertAtLast(60);
		list.insertAtLast(70);
		int k=3;
		Node kthNode=kthElementFromLast(list.head,k);
		System.out.println("kth node is "+kthNode.data);
		
		kthElementFromLast2(list.head,k);
	}
	
	private static Node kthElementFromLast(Node head, int k) {
		// TODO Auto-generated method stub
		Node current=head;
		int size=getListsize(head);
		int kth=size-k-1;
		for(int i=0;i<=kth;i++){
			current=current.next;
		}
		return current;
	}

	private static int getListsize(Node head) {
		// TODO Auto-generated method stub
		Node current = head;
		int size = 0;
		if (head == null) {
			return 0;
		} else {
			while (current != null) {
				size++;
				current = current.next;
			}
		}
		return size;
	}
	private static void kthElementFromLast2(Node head,int k) {
		// TODO Auto-generated method stub
		Node first=head;
		Node Second=head;
		for(int i=0;i<k;i++){
			Second=Second.next;
		}
		while(Second!=null){
			first=first.next;
			Second=Second.next;
		}
		System.out.println("kth element by second approach"+first.data);
	}
	
	

}
