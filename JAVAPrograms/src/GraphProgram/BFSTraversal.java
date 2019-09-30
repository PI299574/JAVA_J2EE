package GraphProgram;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Graph {

	LinkedList<Integer> adjencyList[];
	int noOfVertex;

	@SuppressWarnings("unchecked")
	public Graph(int size) {
		this.noOfVertex = size;
		adjencyList = new LinkedList[noOfVertex];
		for (int i = 0; i < noOfVertex; i++) {
			adjencyList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(Graph graph, int u, int v) {
		graph.adjencyList[u].addFirst(v);
		graph.adjencyList[v].addFirst(u);
	}

	public void BFSTraversal(int source) {
		// step 1
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[noOfVertex];
		// Create a queue for BFS
		Queue<Integer> queue = new LinkedList<>();
		// Mark the current node as visited and enqueue it
		queue.add(source);
		visited[source] = true;

		// step 2:

		while (!queue.isEmpty()) {
			// Dequeue a vertex from queue and print it
			int data = queue.poll();
			System.out.print(data + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			/*for (int i : adjencyList[data]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}*/

			//or
			Iterator<Integer> it=adjencyList[data].listIterator();
			while(it.hasNext()){
				int data1=it.next();
				if(!visited[data1]){
					visited[data1]=true;
					queue.add(data1);

				}
			}

		}

	}
}

public class BFSTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
		/*
		g.addEdge(g, 0, 1);
		g.addEdge(g,0, 2);
		g.addEdge(g,1, 2);
		g.addEdge(g,2, 0);
		g.addEdge(g,2, 3);
		g.addEdge(g,3, 3);

		System.out.println("Following is Breadth First Traversal "+
				"(starting from vertex 2)");

		g.BFSTraversal(2);*/

		Graph graph = new Graph(6);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 4);
		graph.addEdge(graph, 3, 4);
		graph.addEdge(graph, 3, 5);
		graph.addEdge(graph, 4, 5);
		graph.BFSTraversal(0);

	}

}
