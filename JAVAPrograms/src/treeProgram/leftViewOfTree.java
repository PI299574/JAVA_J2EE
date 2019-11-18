package treeProgram;

import java.util.LinkedList;
import java.util.Queue;

//Idea: do level Order traversal print only the fist node
public class leftViewOfTree {

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
		leftView(tree1.root);

	}

	private static void leftView(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode> queue=new LinkedList<>();
		if(null==root){
			return;
		}else{
			queue.add(root);
			TreeNode current=null;

			while(!queue.isEmpty()){

				int n=queue.size();
				System.out.println("Size of queue= "+n);
				for(int i=1;i<=i;i++){
					current=queue.poll();
					if(i==n) {
						System.out.print(current.data+" ");
					}


					if(null!=current.leftChild){
						queue.add(current.leftChild);
					}
					if(null!=current.rightChild){
						queue.add(current.rightChild);
					}

				}
			}
		}
	}

}
