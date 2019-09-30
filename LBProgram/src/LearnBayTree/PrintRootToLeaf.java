package LearnBayTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintRootToLeaf {

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
  tree.insertRecursive(80);
  ArrayList<Integer> list=new ArrayList<>();
  printRootToLeaf(tree.root,list);
	}

	private static void printRootToLeaf(TreeNode root, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		TreeNode current=root;
		if(null==current){
			return;
		}else{
			
			list.add(root.data);
			printRootToLeaf(root.leftChild,list);
			if(null==root.leftChild && null==root.rightChild){
				//sta.pop();
				System.out.println(list);
			}
			printRootToLeaf(root.rightChild, list);
			//System.out.println("ppp "+list);
			list.remove(list.size()-1);

		}
		
	}

}
