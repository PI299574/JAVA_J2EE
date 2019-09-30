package LearnBayArray;

import java.util.Scanner;

public class MaxContiguouSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new  Scanner(System.in);
		//int n=sc.nextInt();
		int array[]=new int[]{-2, -3,-4,1,2};
		/*for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}*/
		
		int currentSum=0;
		int totalSum=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			currentSum=currentSum+array[i];
			
			if(currentSum>totalSum){
				totalSum=currentSum;
			}
			if(currentSum<0){
				currentSum=0;
			}
		}
		System.out.println(totalSum);
		
	}

}
