package GraphProgram;

import java.util.LinkedList;
import java.util.Stack;

class TopoGraph{
	int noOfVertex;
	LinkedList<Integer> adjencyList[];
	@SuppressWarnings("unchecked")
	public TopoGraph(int vertex){
		this.noOfVertex=vertex;
		adjencyList=new LinkedList[noOfVertex];
		for(int i=0;i<noOfVertex;i++){
			adjencyList[i]=new LinkedList<>();
		}
	}

	public void addEdge(int u ,int v){
		adjencyList[u].add(v);
	}
	public void topoSort(){
		Stack<Integer> stack =new Stack<>();
		boolean []visited =new boolean[noOfVertex];
		for(int i=0;i<noOfVertex;i++){
			if(!visited[i]){
				topoSortUtill(i,stack,visited);
			}
		}

		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}

	private void topoSortUtill(int source, Stack<Integer> stack, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[source]=true;

		for(int verticies : adjencyList[source]){
			if(!visited[verticies]){
				topoSortUtill(verticies,stack,visited);
			}
		}
		stack.push(source);
	}
}
public class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a graph given in the above diagram
		TopoGraph g = new TopoGraph(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("Following is a Topological " +
				"sort of the given graph");
		g.topoSort();
	}

}
