package LearnBayTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class queuepair{
	TreeNode root;
	int height;
	
	public queuepair(TreeNode root,int height){
		this.root=root;
		this.height=height;
	}

	public  String toString() {
		return "queuepair [root=" + root.data + ", height=" + height + "]";
	}
	
}


public class VerticleOrderTraversal {
	public static HashMap<Integer, List<Integer>> map = new HashMap<>();
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
  printInVerticleOrder(tree.root,0);
 // printInVerticleOrderrecursive(tree.root,0);
  
  /*for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
		System.out.println("Distance : "+entry.getKey()+"  Values : "+entry.getValue() );
	}*/
  
	}

	private static void printInVerticleOrderrecursive(TreeNode root, int height) {
		// TODO Auto-generated method stub
		
		if(null==root){
			return;
		}
		List<Integer> list=new ArrayList();
		
		if(map.containsKey(height)){
			list = (ArrayList<Integer>) map.get(height);
		}
		else{
			list=new ArrayList();
		}
		
		list.add(root.data);
		map.put(height, list);
		
		printInVerticleOrderrecursive(root.leftChild,height-1);
		printInVerticleOrderrecursive(root.rightChild,height+1);
	}

	private static void printInVerticleOrder(TreeNode root, int height) {
		// TODO Auto-generated method stub
		
		Queue<queuepair> queue=new LinkedList<>();
		
		HashMap<Integer,List<Integer>> hmap=new HashMap<>();
		List<Integer> list=null;
		if(null==root){
			return ;
		}else{
			queuepair current=new queuepair(root,height);
			queue.offer(current);
			//int rootHeight=height;
			
			while(!queue.isEmpty()){
				current=queue.poll();
				
				root=current.root;
				height=current.height;
				//System.out.println(current.toString());
				
				if(hmap.containsKey(height)){
					list = hmap.get(height);
				}else{
					list=new ArrayList<>();
				}
				
				
				list.add(root.data);
				hmap.put(height, list);
				if(null!=root.leftChild){
					current=new queuepair(root.leftChild,height-1);
					queue.offer(current);
					
				}
				if(null!=root.rightChild){
					current=new queuepair(root.rightChild,height+1);
					queue.offer(current);
				}
			}
			
			
			for(Map.Entry<Integer, List<Integer>> m:hmap.entrySet()){
				System.out.println("height "+m.getKey());
				System.out.println("Node is "+m.getValue());
			}
				
			
		}
	}

}
