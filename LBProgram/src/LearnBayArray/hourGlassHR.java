package LearnBayArray;

import java.util.Scanner;

public class hourGlassHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int maxSum=getHourGlassMaxSum(arr);
        System.out.println(maxSum);
	}

	 static int getHourGlassMaxSum(int[][] arr) {
		// TODO Auto-generated method stub
		 
		 int maxSum=Integer.MIN_VALUE;
		 int sum=0;
		 for(int i=0;i<4;i++){
			 for(int j=0;j<4;j++){
				sum=arr[i][j]+ arr[i][j+1]+  arr[i][j+2] + arr[i+1][j+1]+ arr[i+2][j]+ arr[i+2][j+1]+ arr[i+2][j+2];
				if(sum>maxSum){
					maxSum=sum;
				}
				if(sum<0){
					maxSum=sum;
				}
			 }
		 }
		return maxSum;
	}

}
