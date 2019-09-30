package GraphProgram;

import java.util.LinkedList;

class AdjencyList{

	LinkedList<Integer> list[];
	int totalSize;


	@SuppressWarnings("unchecked")
	public AdjencyList(int size){
		this.totalSize=size;
		list=new LinkedList[totalSize];
		for(int i=0;i<totalSize;i++){
			list[i]=new LinkedList<>();
		}
	}

	public void addEdge(AdjencyList graph,int u,int v){

		graph.list[u].addFirst(v);
		graph.list[v].addFirst(u);

	}

	public void printGraph(AdjencyList graph){
		for(int i=0;i<graph.totalSize;i++){
			System.out.println("List at "+i+ " is");
			System.out.println(list[i]);
			for(int i1:list[i]){
				System.out.println(i1);

			}
		}
	}

}
public class AdjencyListGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjencyList graph=new AdjencyList(4);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 3);
		graph.printGraph(graph);

	}

}
