package DP;

/*
 https://www.youtube.com/watch?v=PwDqpOMwg6U&list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr&index=40
 https://www.techiedelight.com/calculate-sum-elements-sub-matrix-constant-time/
 
 (sum[i][j])From 00 to ij=mat[i-1][j-1]+sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1];
 
 (Sum)from r1,c1 to r2,c2)= sum[r2][c2]-sum[r2][c1-1]-sum[r1-1][c2]+sum[r1-1][c1-1]
 
 */
public class SumOfAllSubMatrixOfAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat =
			{
				{ 0, 2, 5, 4, 1 },
				{ 4, 8, 2, 3, 7 },
				{ 6, 3, 4, 6, 2 },
				{ 7, 3, 1, 8, 3 },
				{ 1, 5, 7, 9, 4 }
			};

			// (r1, c1) and (r2, c2) represents top-left and bottom-right
			// coordinates of the sub-matrix
			int r1 = 1, c1 = 1, r2 = 3, c2 = 3;

			// calculate sub-matrix sum
			
			findSubmatrixSumfrom00(mat);
			//System.out.print(findSubmatrixSum(mat, r1, c1, r2, c2));
			int sum=findsumofAllSubmatrixbetweenSourceAndDestination(mat,r1, c1, r2, c2);
			System.out.println("Sum is "+sum);
		}
	
	static int sum[][];
	private static void findSubmatrixSumfrom00(int[][] mat) {
		// TODO Auto-generated method stub
		int row=0;int col=0;
		if(mat.length!=0){
			row=mat.length;
			col=mat[0].length;
		}
	    sum=new int[row+1][col+1];
		for(int i=1;i<sum.length;i++){
			for(int j=1;j<sum[i].length;j++){
				sum[i][j]=mat[i-1][j-1]+sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1];
			}
		}
	    
	    System.out.println("Sum of all submtrix from {0,0} is **************");
		for(int i=0;i<sum.length;i++){
			for(int j=0;j<sum[i].length;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int findsumofAllSubmatrixbetweenSourceAndDestination(
			int[][] mat, int r1, int c1, int r2, int c2) {
		// TODO Auto-generated method stub
	
		r1++;
		r2++;
		c1++;
		c2++;
		return (sum[r2][c2]-sum[r2][c1-1]-sum[r1-1][c2]+sum[r1-1][c1-1]);
		
	}
}


