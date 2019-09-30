package LearnBay;

public class StackLinkedList {

	public Node top=null;
	
	class Node{
		int d;
		Node next;
		public Node(int data){
			d=data;
			next=null;
		}
	}
	public void push(int d){
		
		Node newnode=new Node(d);
		
		if (top==null){
			top=newnode;
			top.next=null;
			return;
		}
		
		
		newnode.next=top;
		top=newnode;
		return;
	}
	public Node pop(){
		if(top==null){
		System.out.println("empty stack");
		}
		Node current=top;
		top=top.next;
		return current;
	}
	
	public void display(){
		if(top==null){
			System.out.println("empty stack");
			}
		Node current=top;
		while(current!=null){
			System.out.print(current.d+ " ");
			current=current.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList list1=new StackLinkedList();
		int arr1[]={11,20,31,42,50,89,98,100};
		for(int i=0;i<arr1.length;i++){
			list1.push(arr1[i]);
		}
		
		
		/*
		list1.display();
		System.out.print(" ");
		list1.pop();
		list1.display();
		*/
		
			
		}
	

}
