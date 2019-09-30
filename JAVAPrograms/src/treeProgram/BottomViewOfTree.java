package treeProgram;


import java.util.Map;
import java.util.TreeMap;



public class BottomViewOfTree {
public static Map<Integer,Integer> map=new TreeMap<>();
public static void main(String[] args) {
		// TODO Auto-generated method stub
BinarySearchTree tree=new BinarySearchTree();
		
		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
 20   40  60   80 */
  tree.insert(50);
  tree.insert(30);
  tree.insert(20);
  tree.insert(40);
  tree.insert(70);
  tree.insert(60);
  tree.insert(80);
  tree.insert(100);
  
  BinarySearchTree tree1=new BinarySearchTree();
 	/*	
 		 			20
                   /  \
                 8     22
               /   \    \
             5      10    25
            /         \      
           3           14
                 
   				
   				*/	
 		tree1.insert(20);
 		tree1.insert(8);
 		tree1.insert(22);
 		tree1.insert(5);
 		tree1.insert(3);
 		//tree1.insert(4);
 		tree1.insert(25);
 		tree1.insert(10);
 		tree1.insert(14);
  
  bottomView(tree1.root,0);
  for(Map.Entry<Integer,Integer> m:map.entrySet()){
	 // System.out.println(m.getKey()+" ");
	  System.out.println(m.getValue()+" ");
  }
}
private static void bottomView(TreeNode root, int height) {
	// TODO Auto-generated method stub
	if(null==root){
		return;
	}
	 map.put(height, root.data);
	 
	bottomView(root.leftChild,height-1);
	bottomView(root.rightChild,height+1);
	
	
}
}