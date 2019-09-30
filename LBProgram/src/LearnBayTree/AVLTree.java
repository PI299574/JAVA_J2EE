package LearnBayTree;

public class AVLTree {

	
	AVLTreeNode root;
	
	public AVLTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	
	
	
	private void insertData(int data) {
		// TODO Auto-generated method stub
		
		root=insertInAVLTree(data,root);
		
	}

	
	private AVLTreeNode insertInAVLTree(int data, AVLTreeNode root) {
		
		
		if(null==root){
			root=new AVLTreeNode(data);
		}
		else{
			if(root.data<data){
				root.rightChild=insertInAVLTree(data, root.rightChild);
	
				
				
				if(height(root.rightChild)-height(root.leftChild)>=2){
					
					if(data<root.leftChild.data){
						rightRotation(root);
					}
					else{
						doubleRotationWithLeftChild(root);
					}
				}
				
			}
			if(root.data>data){
				root.leftChild=insertInAVLTree(data,root.leftChild);
				if(height(root.rightChild)-height(root.leftChild)>=2){
				if(data<root.leftChild.data){
					rightRotation(root);
				}
				else{
					doubleRotationWithLeftChild(root);
				}
				}
			}
		}
		
		
		// TODO Auto-generated method stub
		return root;
	}



	/*	  	11
	   	/     
	    10      
	   /      
	 09   
	
	rightRotation=Clockwise rotation*/
	public AVLTreeNode rightRotation(AVLTreeNode root){
		AVLTreeNode current=root.leftChild;
		root.leftChild=null;
		current.rightChild=root;
		
		root.height=max(height(root.leftChild),height(root.rightChild))+1;
		current.height=max(height(current.leftChild),height(current.rightChild))+1;
		return current;
		
	}
	 
	 	/*11
          \
          12
          	\
   			13*/
	 //LeftRotation=AntiClockwise rotation
	public AVLTreeNode leftRotation(AVLTreeNode root){
		AVLTreeNode current=root.rightChild;
		root.leftChild=null;
		current.leftChild=root;
		root.height=max(height(root.leftChild),height(root.rightChild))+1;
		current.height=max(height(current.leftChild),height(current.rightChild))+1;
		return current;
	}
	/*	  	11
   			/     
    		09      
   			  \
 				10   

LeftrightRotation=LeftRotation +RightRotation */
	
	public AVLTreeNode doubleRotationWithLeftChild(AVLTreeNode root){
		
		root.leftChild=leftRotation(root.leftChild);
		return rightRotation(root);
		
	}
	
	/*	  	11
		     \
			  13      
		  	/	
			12
			   

RightLeftRotation=RightRotation + leftRotation */

public AVLTreeNode doubleRotationWithRightChild(AVLTreeNode root){

root.rightChild=rightRotation(root.rightChild);
return leftRotation(root);

}

private int height(AVLTreeNode root) {
	// TODO Auto-generated method stub
	if(null==root){
		return 0;
	}else{
		return root.height;
	}
}
public int max(int a, int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

private void preOrder(AVLTreeNode root) {
	// TODO Auto-generated method stub
if(null!=root){
	System.out.println(root.data+" ");
	preOrder(root.leftChild);
	preOrder(root.rightChild);
}
	
}
private void postOrder(AVLTreeNode root) {
	// TODO Auto-generated method stub
if(null!=root){
	
	preOrder(root.leftChild);
	preOrder(root.rightChild);
	System.out.println(root.data+" ");
}
}
private void InOrder(AVLTreeNode root) {
	// TODO Auto-generated method stub
if(null!=root){
	
	preOrder(root.leftChild);
	System.out.println(root.data+" ");
	preOrder(root.rightChild);
	
}	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AVLTree tree=new AVLTree();
		tree.insertData(10);
		tree.insertData(20);
		tree.insertData(05);
		tree.preOrder(tree.root);
		tree.postOrder(tree.root);
		tree.InOrder(tree.root);
		
	}



	


	
}
