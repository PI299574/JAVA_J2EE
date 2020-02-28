package greedyProblem;


/*
 How to find the largest number with given digit sum s and number of digits d?

Examples:

Input  : s = 9, d = 2
Output : 90

Input  : s = 20, d = 3
Output : 992


A Simple Solution is to consider all m digit numbers and keep
 track of maximum number with digit sum as s. A close upper bound on time complexity of this solution is O(10m).
 */
public class Largestnumberpossible {

	public static void main(String []args){
		 int s = 20, m = 3; 
	     findLargest(m, s);
	}

	private static void findLargest(int m, int s) {
		// TODO Auto-generated method stub
		 if(m==0 || s==0){
			 return;
		 }
		 if(s>9*m){
			 System.out.println("Sum is not possible");
		 }
		 
		 int result[]=new int[m];
		 for(int i=0;i<m;i++){
			 if(s>9){
				 result[i]=9;
				 s=s-9;
			 }else{
				 result[i]=s;
				 s=0;
			 }
		 }
		 System.out.println("Largest number is **********");
		 for(int i=0;i<m;i++){
			 System.out.print(result[i]);
		 }
	}
}
