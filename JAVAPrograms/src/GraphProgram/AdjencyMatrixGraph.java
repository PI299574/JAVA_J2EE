package GraphProgram;

class AdjencyMatrix<T>{

	class Vertex<T>{
		T v;
		//boolean wasVisted;
		public Vertex(T v){
			this.v=v;
		}
	}

	Vertex[] vertex;
	int currentVertexSize=0;
	int totalVertexSize;
	int adjency[][];
	public AdjencyMatrix(int size){
		this.totalVertexSize=size;
		vertex=new Vertex[totalVertexSize];
		this.adjency=new int[totalVertexSize][totalVertexSize];
		for(int i=0;i<totalVertexSize;i++){
			for(int j=0;j<totalVertexSize;j++){
				adjency[i][j]=0;
			}
		}
	}

	public void addEdge(int u ,int v){
		adjency[u][v]=1;
	}

	public void addVertex(T v){
		Vertex v1=new Vertex(v);
		vertex[currentVertexSize]=v1;
		currentVertexSize++;
	}

	public void printGraph(){
		for(int i=0;i<totalVertexSize;i++){
			for(int j=0;j<totalVertexSize;j++){
				System.out.print(adjency[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}

public class AdjencyMatrixGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjencyMatrix graph=new AdjencyMatrix(4);

		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');


		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);

		System.out.println(graph.totalVertexSize);
		System.out.println(graph.currentVertexSize);
		graph.printGraph();
	}

}
