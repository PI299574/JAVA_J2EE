package LearnBayGraph;

public class GraphApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph=new Graph(4);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(3, 0);
		
		System.out.println(graph.nvertex);
		System.out.println(graph.totatVertex);
	}

}
