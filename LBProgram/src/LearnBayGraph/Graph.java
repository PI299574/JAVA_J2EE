package LearnBayGraph;

public class Graph {

	int totatVertex;
	int nvertex;
	Vertex vertex[];
	int [][]adjMatrix;
	
	public Graph(int totalSize){
		this.totatVertex=totalSize;
		this.nvertex=0;
		vertex=new Vertex[totatVertex];
		adjMatrix=new int[totatVertex][totatVertex];
		
		for(int i=0;i<totatVertex;i++){
			for(int j=0;j<totatVertex;j++){	
				adjMatrix[i][j]=0;	
			}
		}
		}
	
	public void addVertex(char c){
		Vertex newVetex=new Vertex(c);
		vertex[nvertex++]=newVetex;
	}
	
	public void addEdges(int u,int v){
		adjMatrix[u][v]=1;
		//adjMatrix[v][u]=1;
	}

	public int getadjecyVertex(Integer peek) {
		// TODO Auto-generated method stub
		for(int i=0;i<nvertex;i++){
			if(adjMatrix[peek][i]==1 && vertex[i].wasVisted==false){
				return i;
			}
			//return -1;
		}
		return -1;
	}

	public void dispayVertex(int lebel) {
		// TODO Auto-generated method stub
		System.out.print(vertex[lebel].vertex);
	}
}
