package MatriProblem;

public class MatrixPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		printMat(mat);
		
	}

	private static void printMat(int[][] mat) {
		// TODO Auto-generated method stub
		int row=mat.length;
		int c=mat[0].length-1;
		
		for(int i=0;i<row;i++){
			
			for(int j=c;j>=0;j--){
				System.out.print(" ");
				 System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			c--;
		}
	}

}
