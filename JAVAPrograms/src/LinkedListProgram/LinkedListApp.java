package LinkedListProgram;

class LinkedList{

	class Node{
		int data ;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void inserAtLast(int data){
		Node newNode=new Node(data);
		if(null==head){
			head=newNode;
		}else{
			Node current=head;
			while(null!=current.next){
				current=current.next;
			}
			current.next=newNode;
		}
	}

	public void display(Node head){
		Node current =head;
		while(null!=current){
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("");
	}
}




public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedList list=new LinkedList();
		list.inserAtLast(10);
		list.inserAtLast(20);
		list.inserAtLast(30);
		list.inserAtLast(40);
		list.inserAtLast(50);
		list.display(list.head);

	}

}
