package LearnBayTree;

import LearnBayLinkedList.Node;

//convert a tree into DoublyLinkedList
public class TreeToDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTreeInsert tree = new BinarySearchTreeInsert();

		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
  tree.insertRecursive(50);
  tree.insertRecursive(30);
  tree.insertRecursive(20);
  tree.insertRecursive(40);
  tree.insertRecursive(70);
  tree.insertRecursive(60);
		
  convertToDDL(tree.root,null,null);
  
  while(tree.root.leftChild!=null){
	  tree.root=tree.root.leftChild;
	  
  }
    System.out.println(tree.root.data);
    
      // System.out.println(tree.root.leftChild.data);
    //System.out.println(tree.root.rightChild.rightChild.data);
  
	}

	private static void convertToDDL(TreeNode root,TreeNode head,TreeNode prev) {
		// TODO Auto-generated method stub
		
		if(null==root){
		return;
		}
		else{
			convertToDDL(root.leftChild,head,prev);	
			if(prev==null){
				head=root;
			}
			else{
				root.leftChild=prev;
				prev.rightChild=root;
			}
			prev=root;
			convertToDDL(root.rightChild,head,prev);	
		}
	}

}
