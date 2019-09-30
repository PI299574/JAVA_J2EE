package LearnBay;

public class DynemicArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int k=9;
		int array[][]=new int[k][];
		int count=0;
		for(int i=0;i<array.length;i++){
				array[i]=new int[i+1];
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++)
			array[i][j]=count++;
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++)
			System.out.print(array[i][j]+ " ");
			System.out.println(" ");
		}
	}

}
