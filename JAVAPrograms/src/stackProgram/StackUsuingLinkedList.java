package stackProgram;

class StackNode{
	int data ;
	StackNode next;
	public StackNode(int data){
		this.data=data;
		this.next= null;
	}
}

class Stack1{
      StackNode top;
      Stack1(){
    	  this.top=null;
      }
      
      public void push(int data){
    	  StackNode node=new StackNode(data);
    	  if(node==null){
    		 System.out.println("memory overflow**********");
    	  }
    	  node.next=top;
    	  top=node;
    	 
      }
      
      public int pop(){
    	  if(top==null){
    		  System.out.println("underflow*********");
    	  }
    	  int data=top.data;
    	  top=top.next;
    	  return data;
      }
      
      public boolean IsEmpty(){
    	  return top==null;
      }
      
      public int peek(){
    	  if(IsEmpty()){
    		  
    	  }
    	  int data=top.data;
    	  return data;
      }
}

public class StackUsuingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
