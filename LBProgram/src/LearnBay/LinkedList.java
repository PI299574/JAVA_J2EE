package LearnBay;

import java.util.Scanner;

import LearnBay.LinkedList.Node;



public class LinkedList {
public static Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*LinkedList l1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		l1.insertlast(20);	
		l1.insertlast(30);
		l1.insertbefore(15);
		l1.insertbefore(25);
		l1.insertAfter(15,35);
		//l1.deleteFirst();
		//l1.deleteLast();
		//l1.delete(20);
		l1.displayLink();
		l1.midElement();
		//l1.reverseListIterative(head);
		l1.reverselistRecursive(head);
		*/
		int arr1[]={11,20,31,42,31,90,11};
		
		LinkedList list1=new LinkedList();
		for(int i=0;i<arr1.length;i++){
			list1.insertlast(arr1[i]);
		}
		//list1.displayLink(head);
		
		//boolean Ispallindrome=list1.pallindrome(head);
		//System.out.println(Ispallindrome);
		
		
		int k=4;
		int kthData= KthNodedata(head,k);
		System.out.println(kthData);
		
	}

	
	

private static int KthNodedata(Node head, int k) {
	// TODO Auto-generated method stub
	
	Node current=head;
	int count=0;
	while(count<k){
		current=current.next;
		count++;
	}
	
	
	Node first=head;
	while(current!=null){
		current=current.next;
		first=first.next;
	}
	
	return first.data;
}
	private boolean pallindrome(Node head) {
		// TODO Auto-generated method stub
		
		
		Node first=midElement();
		System.out.println("First"+first.data);
		Node firsthalf=head;
		while(firsthalf.next.data!=first.data){
			
			firsthalf=firsthalf.next;
			
		}
		firsthalf.next=null;
		displayLink(head);
		
		Node current=first.next;
		
		Node Secondhalf=reverselistRecursive(current);
		
		displayLink(current);
		
		while(firsthalf!=null && Secondhalf!=null)
		{
		if(firsthalf.data!=Secondhalf.data){
			return false;
		}
		else{
			
			firsthalf=firsthalf.next;
			Secondhalf=Secondhalf.next;
			
		}
		return true;
		}
		return false;
		
	}

	private Node reverselistRecursive(Node head) {
		// TODO Auto-generated method stub
		//System.out.println("start"+head.data+ " ");
		if(head==null){
			return null;
		}
		//System.out.println(head.data+ " ");
		reverselistRecursive(head.next);
		//System.out.println("last"+head.data+ " ");
		return head;
	}

	private Node midElement() {
		// TODO Auto-generated method stub
	
		Node first=head;
		Node second=head;
		while(second.next!=null && second.next.next!=null){
			first=first.next;
			second=second.next.next;
		}
		
		
		//System.out.println("Mid element "+ first.data);
		return first;
	}

	private void reverseListIterative(Node head) {
		// TODO Auto-generated method stub
		Node current=head;
		Node next=null;
		Node prev=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		System.out.println("Reverse list");

		while(head!=null){
			System.out.println(head.data + " ");
			head=head.next;
		
		}
	}

	private void delete(int d) {
		// TODO Auto-generated method stub
		
		Node prev_node=head;
		Node current=head;
		if(head==null){
			return;
		}
	while(current.data!=d){
		prev_node=current;
		current=current.next;
	}
	
	System.out.println("current data"+current.data);
	System.out.println("prev data"+prev_node.data);
	
	prev_node.next=prev_node.next.next;
	current=null;
	}

	private void deleteLast() {
		// TODO Auto-generated method stub
		Node last=head;
		Node prev=head;
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		while(last.next!=null){
			prev=last;
			last=last.next;
			System.out.println("prev"+prev.data);
			System.out.println("last"+last.data);
		}
		prev.next=null;
		last=null;
		
		
		
	}

	private void deleteFirst() {
		// TODO Auto-generated method stub
		Node first=head;
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		
		head=head.next;
		first=null;
	}

	private void insertAfter(int Prev_data, int data) {
		
		// TODO Auto-generated method stub
		
		Node newNode=new Node(data);
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		else{
			Node PrevNode=head;
			while(PrevNode!=null ){
				
				if(PrevNode.data==Prev_data){
				//System.out.println(" 'After inserted' data is present");
					newNode.next=PrevNode.next;
					PrevNode.next=newNode;
					return;
				}
				PrevNode=PrevNode.next;
			}
		}
		
	}

	private void insertlast(int d) 
	
	{
		// TODO Auto-generated method stub
		Node newNode=new Node(d);
		if(head==null){
			head=newNode;
			return;
			
		}
		newNode.next=null;
		Node last=head;
		while(last.next!=null){
			last=last.next;
			
		}
		last.next=newNode;
		return;
	}

	private void displayLink(Node head) {
		// TODO Auto-generated method stub
	
		Node first=head;
		while(first!=null){
			System.out.println(first.data+ " ");
			first=first.next;
		}
		
	}

	private void insertbefore(int d) {
		// TODO Auto-generated method stub
		Node newNode=new Node(d);
		if(head==null){
			head=newNode;
		}
		newNode.next=head;
		head=newNode;
	}
	
	
	
	

}
