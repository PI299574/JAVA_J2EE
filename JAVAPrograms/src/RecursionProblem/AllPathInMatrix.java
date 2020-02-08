package RecursionProblem;
/*
 
Count all possible paths from top left to bottom right of a mXn matrix

The problem is to count all the possible paths from top left to bottom right of a mXn matrix 
with the constraints that from each cell you can either move only to right or down

Examples :

Input :  m = 2, n = 2;
Output : 2
There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

Input :  m = 2, n = 3;
Output : 3
There are three paths
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)

 */
public class AllPathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int totalNoOfpath=noOfPath(3,3);
		System.out.println("totalNoOfpath**********"+totalNoOfpath);
	}

	private static int noOfPath(int m, int n) {
		// TODO Auto-generated method stub
		
		if(m==1 || n==1){
			return 1;
		}
		return  noOfPath(m-1,n)    //down
			   +noOfPath(m, n-1);   //right
	  	      // +noOfPath(m-1, n-1)  //diaqonal
	
		
	}

}
