package GraphProgram;

import java.util.ArrayList;
import java.util.LinkedList;
/*
Given a directed graph, a source vertex �s� and a destination vertex �d�, print all paths from given �s� to �d�. 

The idea is to do Depth First Traversal of given directed graph. Start the traversal from source. 
Keep storing the visited vertices in an array say �path[]�. If we reach the destination vertex,
 print contents of path[]. The important thing is to mark current vertices in path[]
 as visited also, so that the traversal doesn�t go in a cycle. 
 */
class PathGraph{
	int noOfVertex;
	LinkedList<Integer> adjencyList[];
	@SuppressWarnings("unchecked")
	public PathGraph(int vertex){
		this.noOfVertex=vertex;
		adjencyList=new LinkedList[noOfVertex];
		for(int i=0;i<noOfVertex;i++){
			adjencyList[i]=new LinkedList<>();
		}
	}
	public void addEdge(int u,int v){
		adjencyList[u].addFirst(v);
	}
	public void printAllpath(int source,int dest){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(source);
		boolean visted[]=new boolean[noOfVertex];
		printAllPAthUtill(source,dest,list,visted);
	}
	private void printAllPAthUtill(int source, int dest,
			ArrayList<Integer> list, boolean[] visted) {
		// TODO Auto-generated method stub
		visted[source]=true;
		if(source==dest){
			System.out.println(list);
			visted[source]=false;
			return;
		}
		for(int data: adjencyList[source]){
			if(!visted[data]){
				list.add(data);
				printAllPAthUtill(data,dest,list,visted);
				list.remove(data);
			}
		}
		visted[source]=false;
	}

}





public class AllPathSourceToDest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathGraph g = new PathGraph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(2,0);
		g.addEdge(2,1);
		g.addEdge(1,3);

		// arbitrary source
		int s = 2;

		// arbitrary destination
		int d = 3;

		System.out.println("Following are all different paths from "+s+" to "+d);
		g.printAllpath(s, d);
	}

}
