package LearnBay;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=sc.nextInt();
			}
		}*/
		
		
		int arr[][]={{1,2,3,14},{4,5,6,13},{7,8,9,15}};
		int row=3;
		int col=4;
		
		
				
		
		int currentRow=0;
		int currentCol=0;
		
		while(currentRow<row && currentCol<col){
		for(int i=currentCol;i<col;++i){
			System.out.print(arr[currentRow][i]+" ");
		}
		currentRow++;
		for(int i=currentRow;i<row;++i){
			System.out.print(arr[i][col-1]+" ");
		}
		col--;
		if(currentRow<row){
		
		for(int i=col-1;i>=0;--i){
			System.out.print(arr[row-1][i]+" ");
		}
		row--;}
		if(currentCol<col){
		
		for(int i=row-1;i>0;--i){
			System.out.print(arr[i][currentCol]+" ");
		}
		currentCol++;}
		
		}
	}

}
