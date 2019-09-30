package LearnBayArray;

import java.util.Scanner;


//5 10 8 12 6 9 4--->
//3 4 6 2 1 8 9--->4 <6 >3< 2> 8< 9> 1 
public class ZigZagArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int flag=0;
		
		for(int i=0;i<n-1;i++){
			if(flag==0){
				if(array[i]>array[i+1]){
					flag=1;
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
				else{
					flag=1;
				}
			}
			if(flag==1){
				if(array[i]<array[i+1]){
					flag=0;
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
				else{
					flag=0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");;
		}
		
		
	}

	 static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i;
		i=j;
		j=temp;
				
	}

}
