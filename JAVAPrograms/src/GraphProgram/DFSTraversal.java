package GraphProgram;

import java.util.LinkedList;
import java.util.Stack;

class DFSGraph{
	int noOfVertex;
	LinkedList<Integer> adjencyList[];
	@SuppressWarnings("unchecked")
	public DFSGraph(int Vertex){
		this.noOfVertex=Vertex;
		this.adjencyList=new LinkedList[noOfVertex];
		for(int i=0;i<noOfVertex;i++){
			adjencyList[i]=new LinkedList<Integer>();
		}

	}

	public void addEdge(DFSGraph graph,int u,int v){
		graph.adjencyList[u].addFirst(v);
		graph.adjencyList[v].addFirst(u);

	}

	public void DFSTraverse(int source){
		boolean []visited=new boolean[noOfVertex];
		Stack<Integer> stack=new Stack<>();
		stack.push(source);
		visited[source]=true;

		while(!stack.isEmpty()){
			int data=stack.pop();
			System.out.print(data+" ");
			for(int data1:adjencyList[data]){
				if(!visited[data1]){
					stack.push(data1);
					visited[data1]=true;
				}
			}
		}
	}
}

public class DFSTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSGraph graph=new DFSGraph(5);

		DFSGraph g = new DFSGraph(4);

		g.addEdge(g,0, 1);
		g.addEdge(g,0, 2);
		g.addEdge(g,1, 2);
		g.addEdge(g,2, 0);
		g.addEdge(g,2, 3);
		g.addEdge(g,3, 3);

		System.out.println("Following is Depth First Traversal "+
				"(starting from vertex 2)");

		g.DFSTraverse(2);
	}

}
