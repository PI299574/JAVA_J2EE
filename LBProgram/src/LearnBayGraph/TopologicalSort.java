package LearnBayGraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {

	int v;
	LinkedList<Integer> []adjList;
	
	
	public TopologicalSort(int v){
		this.v=v;
		adjList=new LinkedList[v];
		for(int i=0;i<v;i++){
			adjList[i]=new LinkedList<>();
		}
	}
	
	
	public void addEdge(int u,int v){
		adjList[u].add(v);
	}
	
	
	public void topologicalSort(){
		
		boolean visited[]=new boolean[v];
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0;i<v;i++){
			visited[i]=false;
		}
		
		for(int i=0;i<v;i++){
			if(visited[i]==false){
				topologicalSortUtill(visited,stack,i);
			}
			
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}
	
	private void topologicalSortUtill(boolean[] visited, Stack<Integer> stack, int i) {
		// TODO Auto-generated method stub
		
		visited[i]=true;
		Iterator<?> it=adjList[i].iterator();
		int temp;
		while(it.hasNext()){
			temp=(int) it.next();
		
			if(visited[temp]==false){
				topologicalSortUtill(visited,stack,temp);
			}
		}
		stack.push(i);
	}

public static void printGraph(TopologicalSort g){
		
		for(int i=0;i<g.v;i++){
		System.out.println("Adjecncy list of Vertev "+ i +" is ");
		
		for(Integer i1:g.adjList[i]){
			System.out.print("-->"+ i1+" ");
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        printGraph(g);
        
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
	}

}
