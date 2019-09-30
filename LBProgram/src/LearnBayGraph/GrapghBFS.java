package LearnBayGraph;

import java.util.LinkedList;
import java.util.Queue;

public class GrapghBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g=new Graph(5);
		g.addVertex('S');
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		
		g.addEdges(0, 1);
		g.addEdges(0, 2);
		g.addEdges(0, 3);
		g.addEdges(1, 4);
		g.addEdges(2, 4);
		g.addEdges(3, 4);
		 BFS(g);
	}

	private static void BFS(Graph g) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue=new LinkedList<>();
		
		
		g.vertex[0].wasVisted=true;
		g.dispayVertex(0);
		queue.offer(0);
		
		while(!queue.isEmpty()){
			int v1=queue.remove();
			int v2=g.getadjecyVertex(v1);
			//while((v2=g.getadjecyVertex(v1))!=-1){
			while(v2!=-1){
				g.vertex[v2].wasVisted=true;
				g.dispayVertex(v2);
				queue.offer(v2);
				v2=g.getadjecyVertex(v1);
			}
			
		}
		
	}

}
