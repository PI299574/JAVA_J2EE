package DP;
/*
 Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell) 
 such that all cells along the path are in increasing order with a difference of 1.

We can move in 4 directions from a given cell (i, j), i.e., we can move to 
(i+1, j) or (i, j+1) or (i-1, j) or (i, j-1) with the condition that the adjacent cells have a difference of 1.

Input:  mat[][] = {{1, 2, 9}
                   {5, 3, 8}
                   {4, 6, 7}}
Output: 4
The longest path is 6-7-8-9


 */
public class LongestPathInMatrixWithConstraints {
	static int totalR0W=0;
	static int totalCOL=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mat[][] = { { 1, 2, 9 }, 
                 { 5, 3, 8 }, 
                 { 4, 6, 7 } };

		 totalR0W=mat.length;
		 totalCOL=mat[0].length;
		 System.out.println("Length of the longest path is " + finLongestOverAll(mat,totalR0W,totalCOL)); 
	}

	private static int finLongestOverAll(int[][] mat,int row,int col) {
		// TODO Auto-generated method stub
		
		int result=1;
		int [][]visited=new int[row][col];
		for (int i = 0; i < row; i++) {
	         for (int j = 0; j < col; j++) {
	            visited[i][j] = -1;
	         }
	      }
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(visited[i][j]==-1){
					findLongestPathDFS(mat,visited,i,j);
				}
				result=Math.max(result,visited[i][j]);
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(visited[i][j]+" ");
			}
			System.out.println();
		}
		
		return result;
	}

	private static int findLongestPathDFS(int[][] mat, int[][] visited,
			int r, int c) {
		// TODO Auto-generated method stub
	
		if(visited[r][c]!=-1){
			return visited[r][c];
		}
		
		int down=Integer.MIN_VALUE;
		int up=Integer.MIN_VALUE;
		int right=Integer.MIN_VALUE;
		int left=Integer.MIN_VALUE;
		
		
		if(IsValid(r,c-1) && mat[r][c]-mat[r][c-1]==1){
			left=visited[r][c]=1+findLongestPathDFS(mat,visited,r,c-1);
		}
		if(IsValid(r-1,c) && mat[r][c]-mat[r-1][c]==1){
			up=visited[r][c]=1+findLongestPathDFS(mat,visited,r-1,c);
		}
		if(IsValid(r,c+1) && mat[r][c]-mat[r][c+1]==1){
			right=visited[r][c]=1+findLongestPathDFS(mat,visited,r,c+1);
		}
		if(IsValid(r+1,c) && mat[r][c]-mat[r+1][c]==1){
			down=visited[r][c]=1+findLongestPathDFS(mat,visited,r+1,c);
		}
		
		return  visited[r][c]=max(left,right,up,down);
	}

	private static int max(int left, int right, int up, int down) {
		// TODO Auto-generated method stub
		return Math.max(Math.max(Math.max(Math.max(up, down),left),right),1);
	}

	private static boolean IsValid(int r, int c) {
		// TODO Auto-generated method stub
		return (r<totalR0W && r>=0) && (c<totalCOL && c>=0);
	}



}
