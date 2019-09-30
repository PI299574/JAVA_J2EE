package LearnBayGraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintAllPathSouceToDest {

	int v;
	LinkedList<Integer> adj[];
	
	
	public PrintAllPathSouceToDest(int vertex){
		this.v=vertex;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList<>();
		}
	}
	
	
	public void addEdge(int u,int v){
		adj[u].add(v);
	}
	
	
	private void printAllPath(int s, int d) {
		// TODO Auto-generated method stub
		
		boolean visted[]=new boolean[v];
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(s);
		
		printAllPathUtill(s,d,visted,list);
		
	}
	
	
	
	
	private void printAllPathUtill(int s, int d, boolean[] visted, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		visted[s]=true;
		if(s==d){
			System.out.print(list +" ");
		}
		
		for(Integer i:adj[s]){
			if(visted[i]==false){
				list.add(i);
				printAllPathUtill(i,d,visted,list);
				list.remove(i);
			}
		}
		visted[s]=false;  //have to know
	}


	public void printPath(PrintAllPathSouceToDest g){
		for(int i=0;i<g.v;i++){
			for(Integer i1:g.adj[i]){
				System.out.print(i1+ " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintAllPathSouceToDest g = new PrintAllPathSouceToDest(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(1,3);
        
        int s=2;
        int d=3;
        
        System.out.println("All path from "+s +"  to "+d);
        
        g.printAllPath(s,d);
		
	}


	

}
