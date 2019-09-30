package LearnBaySorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr={12,14,11,13,17,10,9,14};
		
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			int temp=arr[j];
			while(j > 0 && temp <arr[j] ){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
	}

}
