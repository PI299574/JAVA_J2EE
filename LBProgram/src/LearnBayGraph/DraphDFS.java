package LearnBayGraph;

import java.util.Stack;


//Depth First Search
public class DraphDFS {

	static Stack<Integer> stack=new Stack<>();
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
		
		DFS(g);
		
	}

	private static void DFS(Graph g) {
		// TODO Auto-generated method stub
		g.vertex[0].wasVisted=true;
		g.dispayVertex(0);
		stack.push(0);
		
		
		while(!stack.isEmpty()){
			int v=g.getadjecyVertex(stack.peek());
			if(v==-1){
				stack.pop();
			}else{
				stack.push(v);
				g.vertex[v].wasVisted=true;
				g.dispayVertex(v);
			}
		}
		/*
				for (int j = 0; j < g.nvertex; j++) {
					g.vertex[j].wasVisted = false;
				}*/
	}

}
