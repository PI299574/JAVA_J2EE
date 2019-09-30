package LearnBayLinkedList;

public class StackUsuingLinkedlist {

	LinkedList list=new LinkedList();
	Node head=null;
	
	//inserFirst
	public void push(int data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			newnode.next=head;
			head=newnode;
		}
	}
	
	//deleteFirst
	public int pop(){
		int data=-1;
		if(head==null){
			System.out.println("empty list");
		}
		else{
			data=head.data;
			head=head.next;
		}
		return data;
	}
	
	public void print(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+ " ");
			current=current.next;
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsuingLinkedlist stack=new StackUsuingLinkedlist();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.print();
	}

}
