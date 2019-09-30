package treeProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class VerticalOrderTraversal {

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
  
  BinarySearchTree tree1=new BinarySearchTree();
	/*	
		 			20
                  /    \
                8       22
              /   \    	 \
            5      10     25
           /         \      
          3          14
                
  				
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
  
  verticalOrderTraversalRecursive(tree1.root,0);
  for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet()){
	  System.out.println(m.getKey());
	  System.out.println(m.getValue());
  }
  
	}
     public static HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
	private static void verticalOrderTraversalRecursive(TreeNode root,Integer height) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = null;
		if(null==root){
			return;
		}
		if(map.containsKey(height)){
			list=map.get(height);
		}else{
			list=new ArrayList<>();
		}
		list.add(root.data);
		map.put(height, list);
		
		verticalOrderTraversalRecursive(root.leftChild,height-1);
		verticalOrderTraversalRecursive(root.rightChild,height+1);
		
	}

}
