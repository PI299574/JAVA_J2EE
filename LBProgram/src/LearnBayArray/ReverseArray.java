package LearnBayArray;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0,j=array.length-1;j>i;i++,j--){
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
