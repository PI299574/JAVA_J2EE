package treeProgram;

import java.util.LinkedList;
import java.util.Queue;

/*
Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.
       10                       10 ------> NULL
      / \                       /      \
     3   5              =>     3 ------> 5 --------> NULL
    / \   \                  /  \         \
   4   1   2                4 --> 1 -----> 2 -------> NULL
 */

class Node{
	int data;
	Node left;
	Node right;
	Node nextRight;
	public Node(int data){
		this.data=data;
	}
}
public class ConnectNodesAtSameLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Constructed binary tree is 
        10 
      /   \ 
    8      2 
  /         \ 
3            90 
*/
Node root = new Node(10); 
root.left = new Node(8); 
root.right = new Node(2); 
root.left.left = new Node(3); 
root.right.right = new Node(90); 

// Populates nextRight pointer in all nodes 
connect(root); 

// Let us check the values of nextRight pointers 
System.out.println("Following are populated nextRight pointers in \n" + 
"the tree (-1 is printed if there is no nextRight)"); 
System.out.println("nextRight of "+ root.data +" is "+ 
((root.nextRight != null) ? root.nextRight.data : -1)); 
System.out.println("nextRight of "+ root.left.data+" is "+ 
((root.left.nextRight != null) ? root.left.nextRight.data : -1)); 
System.out.println("nextRight of "+ root.right.data+" is "+ 
((root.right.nextRight != null) ? root.right.nextRight.data : -1)); 
System.out.println("nextRight of "+  root.left.left.data+" is "+ 
((root.left.left.nextRight != null) ? root.left.left.nextRight.data : -1)); 
System.out.println("nextRight of "+  root.right.right.data+" is "+ 
((root.right.right.nextRight != null) ? root.right.right.nextRight.data : -1)); 
	}

	private static void connect(Node root) {
		// TODO Auto-generated method stub
		
		//Idea is to use level order traversal , just add the removed element from Queue as nextright to current node 
		Queue<Node> queue =new LinkedList<>();
		queue.add(root);
		
		  queue.add(null);   // // null marker to represent end of current level   IMP
		while(!queue.isEmpty()){
			Node current = queue.peek();
			queue.remove();
			//// next element in queue represents next  
            // node at current Level  
			if(current!=null){
				current.nextRight=queue.peek();   ///IMP
			}
			
			if(null!=current.left){
				queue.add(current.left);
			}
			if(null!=current.right){
				queue.add(current.right);
			}
			// if queue is not empty, push NULL to mark  
            // nodes at this level are visited 
			else if(!queue.isEmpty()){   //IMP
				queue.add(null);
			}
		}
	
	}

}
