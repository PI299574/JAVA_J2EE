package LearnBayGraph;

import java.util.LinkedList;

public class AdjencyList {
	
	
	int v;
	LinkedList<Integer> list[];
	
	
	public AdjencyList(int v){
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList<>();
		}
	}

	
	public static void addEdge(AdjencyList g,int u,int v){
		g.list[u].addFirst(v);
		g.list[v].addFirst(u);
	}
	
	
	public static void printGraph(AdjencyList g){
		
		for(int i=0;i<g.v;i++){
		System.out.println("Adjecncy list of Vertev "+ i +" is ");
		
		for(Integer i1:g.list[i]){
			System.out.print("-->"+ i1+" ");
		}
		System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdjencyList graph=new AdjencyList(5);
		
		addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        printGraph(graph);
	}

}
