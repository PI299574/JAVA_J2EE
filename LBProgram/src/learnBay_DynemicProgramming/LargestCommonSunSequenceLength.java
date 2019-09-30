package learnBay_DynemicProgramming;


/*LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.*/
public class LargestCommonSunSequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "AGGTAB"; 
	    String s2 = "GXTXAYB"; 
	    
	    char X[]=s1.toCharArray();
	    char Y[]=s2.toCharArray();
	    int m=s1.length();
	    int n=s2.length();
	    
	   int length= largestCommonSubsequenceLenghtDPApproach(X,Y,m,n);
	   System.out.println("Largest common length is "+length);
	    
	}

	private static int largestCommonSubsequenceLenghtDPApproach(char[] x, char[] y, int m, int n) {
		// TODO Auto-generated method stub
		//Step 1: take one matrix of below size
		int[][]mn=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				//step 2: initiallize 1st row and column of matrix with 0.
				if(i==0 || j==0){
					mn[i][j]=0;
				}
				
				else if(x[i-1] == y[j-1]){   //here we are checking index og char array not in matrix.
				    mn[i][j]=mn[i-1][j-1]+1;  //step 3:if char are matching then take daigonal and add 1.
				    
				    
			}
			    else{
				    mn[i][j]=Math.max(mn[i-1][j], mn[i][j-1]); //step 4:if not matching then take maximum value of adjecent , except daigonal.
			}
			}
		}
		
		return mn[m][n];
	}

}
