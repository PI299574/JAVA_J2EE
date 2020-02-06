package GraphProgram;

import java.util.HashSet;
import java.util.LinkedList;

class CycleInDirectedGrapg{
	
	private LinkedList<Integer> adjList[];
	private int vertex;
    	
	

	
	@SuppressWarnings("unchecked")
	public CycleInDirectedGrapg(int size){
		this.vertex=size;
		adjList=new LinkedList[this.vertex];
		for(int i=0;i<this.vertex;i++){
			adjList[i]=new LinkedList<>();
		}
		
	}
	
	public void addEdge(int u,int v){
		adjList[u].add(v);
		//adjList[v].add(u);
	}
	
	public void printgraph(){
		for(int i=0;i<vertex;i++){
			System.out.print(i+"  >>>>>>>>>>>  ");
			for(Integer data:adjList[i]){
				System.out.print(data+" ");
			}
			System.out.println(" ");
		}
	}
	

	//take 3 hashset
	//whiteset contain all the vertex
	//grayset contain recently visited vertex
	//blackset contain vertex which has been visted along with his child.
	
	//if any vertex present in grayset..comming twice then it means cycle is present.
	
	
	
	
	
	public boolean detectCycle(){
		HashSet<Integer> whiteSet=new HashSet<>();
		HashSet<Integer> greySet=new HashSet<>();
		HashSet<Integer> blackSet=new HashSet<>();
		for(int i=0;i<vertex;i++){
			whiteSet.add(i);
		}
		for(int i=0;i<vertex;i++){
			if(detectCycleusuingDFS(i,whiteSet,greySet,blackSet)){
				return true;
			}
			
		}
		return false;
	}

	private boolean detectCycleusuingDFS(int source, HashSet<Integer> whiteSet,
			HashSet<Integer> greySet, HashSet<Integer> blackSet) {
		// TODO Auto-generated method stub
		addToDestSetFromSourceSet(source,whiteSet,greySet);
		
		for(Integer data:adjList[source]){
		if(blackSet.contains(data)){
			continue;
		}
		if(greySet.contains(data)){
			return true;
		}
		if(detectCycleusuingDFS(data,whiteSet,greySet,blackSet)){
			return true;
		}
		
		}
		
		addToDestSetFromSourceSet(source,greySet,blackSet);
		return false;
	}

	private void addToDestSetFromSourceSet(int source,
			HashSet<Integer> sourceSet, HashSet<Integer> destSet) {
		// TODO Auto-generated method stub
		sourceSet.remove(source);
		destSet.add(source);
	}
	

}


public class DirectedAcyclicGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleInDirectedGrapg graph = new CycleInDirectedGrapg(6);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 2);
	        graph.addEdge(3, 0);
	        graph.addEdge(3, 4);
	        graph.addEdge(4, 5);
	        graph.addEdge(5, 3);
	        graph.printgraph();
	        
	        System.out.println(graph.detectCycle());
	}

}
