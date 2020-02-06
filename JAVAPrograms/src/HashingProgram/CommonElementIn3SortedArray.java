package HashingProgram;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80 

Let the current element traversed in ar1[] be x, in ar2[] be y and in ar3[] be z. We can have following cases inside the loop.

    If x, y and z are same, we can simply print any of them as common element and move ahead in all three arrays.
    Else If x < y, we can move ahead in ar1[] as x cannot be a common element.
    Else If x > z and y > z), we can simply move ahead in ar3[] as z cannot be a common element

*
*
*/
public class CommonElementIn3SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int ar1[] = {1, 5, 10, 20, 40, 80};
			int ar2[] = {6, 7, 20, 80, 100};
			int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
			//Output: 20, 80
			
			int i=0,j=0,k=0;
			while(i < ar1.length && j<ar2.length && k<ar3.length){
				if(ar1[i]==ar2[j] && ar2[j]==ar3[k]){
					System.out.print(ar1[i]+" ");
					i++;j++;k++;
				}
				//x<y
				else if(ar1[i]<ar2[j]){
					i++;
				}
				//y<z
				else if(ar2[j]<ar3[k]){
					j++;
				}
				
				//z>x && z>y
				else{
					k++;
				}
				
			}
	}

}
