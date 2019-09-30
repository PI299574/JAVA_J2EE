package LearnBay;

public class TwoLinkedListMerge {

	
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			data=d;
			next=null;
		}
	} 
	
	public static Node head1;
	public static Node head2;
	public static Node head;
	
	public void insertList(int d,int list){
		Node newNode=new Node(d);
		
		if(list==1){
			if(head1==null){
				head1=newNode;
				return;
			}
			newNode.next=null;
			
			Node current=head1;
			while(current.next!=null)
				current=current.next;
			
			current.next=newNode;
			return;
		}
		if(list==2){
			if(head2==null){
				head2=newNode;
				return;
			}
			newNode.next=null;
			
			Node current=head2;
			while(current.next!=null)
				current=current.next;
			
			current.next=newNode;
			return;
		}
		
	}
	
	public Node merge(Node head1, Node head2) {
		// TODO Auto-generated method stub
		  if(head1==null ){
			//head=head2;
			return head2;
		}
		else if(head2==null){
			//head=head1;
			return head1;
		}
			if(head1.data<head2.data){
			head=head1;
			head1=head1.next;
		}
		else {
		head=head2;
		head2=head2.next;
		}
		Node current=head;
		while(head1!=null || head2!=null){
			
			if(head1==null ){
				current.next=head2;
				return head;
			}
			else if(head2==null){
				current.next=head2;
				return head2;
			}
			if(head1.data<head2.data){	
	current.next=head1;
	current=current.next;
	head1=head1.next;
	
			}
			else{
				current.next=head2;
				current=current.next;
				head2=head2.next;
			}
			}
		head.next=null;
		return head;
	}	
	
	private Node mergeNode(Node head2) {
		// TODO Auto-generated method stub
		
		if(head1==null){
			return head2;
		}
		if(head1==null){
			return head1;
		}
		Node root=null;
		if(head1.data<head2.data){
			root=head1;
			head1=head1.next;
		}
		else{
			root=head2;
			head2=head2.next;
		}
		
		
	Node current=root;
		while(true){
			
			if(head1.data<head2.data){
				current.next=head1;
				current=head1;
				head1=head1.next;
				if(head1==null){
					current.next=head2;
					break;
				}
			}
			
			else {
				current.next=head2;
				current=head2;
				head2=head2.next;
				if(head2==null){
					current.next=head1;
					break;
				}
			}
		}
	
		return root;
		
	}

	public void display(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoLinkedListMerge list1=new TwoLinkedListMerge();
		TwoLinkedListMerge list2=new TwoLinkedListMerge();
		TwoLinkedListMerge list=new TwoLinkedListMerge();
		
		int arr1[]={11,20,31,42,50,89,98,100};
		int arr2[]={22,24,32,34,45};
		
		for(int i=0;i<arr1.length;i++){
			list1.insertList(arr1[i], 1);
		}
		for(int i=0;i<arr2.length;i++){
			list2.insertList(arr2[i], 2);
		}
		list1.display(head1);
		System.out.println(" ");
		list2.display(head2);
		System.out.println(" ");
		
		//list.merge(head1,head2);
		 
		list.display(list1.mergeNode(head2));
	}

	

}
