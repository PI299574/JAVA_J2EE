package DP;
/*
 Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.

Examples :

Input:  n = 3
Output: 4
Below are the four ways
 1 step + 1 step + 1 step
 1 step + 2 step
 2 step + 1 step
 3 step

Input:  n = 4
Output: 7

 */
public class CountNoOfWayToCoverDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=3;
       int way=countWays(n);
       System.out.println(way);
	}

	private static int countWays(int n) {
		// TODO Auto-generated method stub
		
		int count[]=new int[n+1];

        // Initialize base values. There is one way to  
        // cover 0 and 1 distances and two ways to  
        // cover 2 distance 
		count[0]=1;
		count[1]=1;
		count[2]=2;
		for(int i=3;i<=n;i++){
			count[i]=count[i-1]+count[i-2]+count[i-3];
		}
		return count[n];
		
	}

}
