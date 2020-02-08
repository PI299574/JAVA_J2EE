package GraphProgram;
/*
 Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island. For example,
  the below matrix contains 5 islands

Example:

Input : mat[][] = {{1, 1, 0, 0, 0},
                   {0, 1, 0, 0, 1},
                   {1, 0, 0, 1, 1},
                   {0, 0, 0, 0, 0},
                   {1, 0, 1, 0, 1} 
Output : 5




What is an island?
A group of connected 1s forms an island. For example, the below matrix contains 5 islands
 
This is a variation of the standard problem: “Counting the number of connected components in an undirected graph”. 


ApproacH:

A cell in 2D matrix can be connected to 8 neighbours. So, unlike standard DFS(), 
where we recursively call for all adjacent vertices, here we can recursively call for 8 neighbours only.
We keep track of the visited 1s so that they are not visited again 


 */

public class NoOfIslandProblem {
	
	static int ROW[]={1,1,0,-1,-1,-1,0,1};
	static int COL[]={0,1,1,1,0,-1,-1,-1};
	
	//int ROW[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
    //int COL[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
    static int totalRow=5;static int totalCol=5; 
    
    
	public static boolean ISsafeToMove(int row,int col, int[][]matrix, boolean [][]visited){
		if((row<totalRow && row>=0) && (col<totalCol && col>=0) && matrix[row][col]==1 && !visited[row][col]){
			return true;
		}
			
		return false;
	}
	

	private static void DFSTovisiteNeighbours(int[][] mat, boolean[][] visited,
			int row, int col) {
		// TODO Auto-generated method stub
		visited[row][col]=true;
		for(int i=0;i<8;i++){
			int adjecentRow=row+ROW[i];
			int adjecentCol=col+COL[i];
		if(ISsafeToMove(adjecentRow,adjecentCol,mat,visited)){
			DFSTovisiteNeighbours(mat,visited,adjecentRow,adjecentCol);   //visted the adjecent node
		}
		}
	}
	

	private static int DFSUtillToCountIsLand(int[][] mat) {
		// TODO Auto-generated method stub
		boolean visited[][]=new boolean[totalRow][totalCol];
		int count=0;
		for(int i=0;i<totalRow;++i){
			for(int j=0;j<totalCol;++j){
				if(mat[i][j]==1 && !visited[i][j]){
					DFSTovisiteNeighbours(mat,visited,i,j);
					++count;
				}
			}
		}
		return count;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1} 
	};
    
		int island=DFSUtillToCountIsLand(mat);
		System.out.println("************"+island);
	}

		
}
