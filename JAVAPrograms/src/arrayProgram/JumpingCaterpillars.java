package arrayProgram;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
Suppose that some caterpillars start from the bottom and jump to the next leaf. They eat the leaf before jumping to next. 
We are given an array which represents jump steps made by caterpillars. If the array is [2,4,7], it means caterpillar[0] 
will eat leaf 2,4,6.. caterpillar[1] will eat leaf 4,8,12.. 
and caterpillar­[2] will eat 7,14,21...0 represents ground. Calculate the number of uneaten leaves.

Let us assume that the caterpillar jumps to its next destination if the current leaf is eaten.
 This means, that if caterpillar[7] finds that leaf 28 is eaten, it will proceed to eat leaf 35.

Let c be the number of caterpillars and n be the number of leaves.

The obvious brute force solution is iterating over a bool array of size n for each caterpillar and mark it as true if eaten 
or false otherwise. It takes O(n*c) time
 */
public class JumpingCaterpillars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=10;
      int arr[]={2,3,5};
      
      /*  o/p=2
       The leaves eaten by the first caterpillar are (2, 4, 6, 8, 10).
The leaves eaten by the second caterpilllar are (3, 6, 9)
The leaves eaten by the third caterpilllar are (5, 10)
Ultimately, the uneaten leaves are 1, 7 and their number is 2
       */
      
      int n1=getUneatenLeaves(arr,n);
      System.out.println(n1);
      
	}

	private static int getUneatenLeaves(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		boolean leaves[]=new boolean[n];
		
		
		for(int j=0;j<arr.length;j++){
		for(int i=1;i<n;i++){
			//System.out.println("IIIIIIIIIII>>>>>>>>>>"+i);
			//System.out.println("leavs[i]>>>>>>>>>>>>>"+leaves[i]);
			//System.out.println("arr[j]****************"+arr[j]);
			if(leaves[i]==false  && i%arr[j]==0){
				leaves[i]=true;
			}
		}
		}
		int c=0;
		for(int i1=1;i1<n;i1++){
			if(!leaves[i1]){
				//System.out.println(i1);
				//System.out.println(leaves[i1]);
				c++;
			}
		}
		
		
		return c;
	}

}
