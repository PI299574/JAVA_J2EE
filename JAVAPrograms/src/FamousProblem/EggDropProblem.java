package FamousProblem;

import java.util.ArrayList;
import java.util.Arrays;

/*
   n ==> Number of floors
  k ==> Number of Eggs
  eggDrop(n, k) ==> Minimum number of trials needed to find the critical
                    floor in worst case.
  eggDrop(n, k) = 1 + min{max(eggDrop(n-x,k), eggDrop(x-1,k-1)): 
                 x in {1, 2, ..., k}}
                 
 
we drop an egg from a floor x, there can be two cases (1) The egg breaks (2) The egg doesn’t break.

1) If the egg breaks after dropping from xth floor, then we only need to check for floors lower than x with 
remaining eggs; so the problem reduces to x-1 floors and k-1 eggs
2) If the egg doesn’t break after dropping from the xth floor, then we only need to check for floors higher 
than x; so the problem reduces to n-x floors and k eggs.

Since we need to minimize the number of trials in worst case, we take the maximum of two cases. We consider the max of 
above two cases for every floor and choose the floor which yields minimum number of trials. 
 */

public class EggDropProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no_of_floor=2;
		int no_Of_egg=10;
		
		//eggDrop(n,k)= Min(Max(1+eggDrop(n-x,k),eggDrop(x-1,k-1)))
		
		int no=eggDrop(no_of_floor,no_Of_egg);
System.out.println("************"+no);
	}

	private static int eggDrop(int n, int k) {
		// TODO Auto-generated method stub
		
		int result[][] = new int[n+1][k+1];
		//int min=Integer.MAX_VALUE;
		
		//f(n,1) = n.............(1,2 ....n)  n floor 1 egg condition
		//f(1, e) =1 ..............1 egg , n floor
		
		for(int i=0;i<n+1;i++){
			result[i][1]=i;
		}
		
		for(int i=0;i<k+1;i++){
			result[1][i]=1;
		}
		
		for(int i=2;i<n+1;i++){
			for(int j=2;j<k+1;j++){
				result[i][j]=Integer.MAX_VALUE;
				for(int x= 1;x < i; x++){
					int survivial_eggs=result[i-x][j];
					int broken_eggs=result[x-1][j-1];
					int temp= 1+Math.max(survivial_eggs,broken_eggs);
					if(temp<result[i][j]){
						result[i][j]=temp;
					}
				}
			}
		}
		
		for(int[] i:Arrays.asList(result)){
			System.out.println(i);
		}
		for(int[] i:Arrays.asList(result)){
			for(int k1:i){
				System.out.print(k1+" ");
			}
			System.out.println();
		}
		return result[n][k];
	}

}
