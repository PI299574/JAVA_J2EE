package LearnBayArray;

public class leftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1,2,3,4,6 d=3
		// op= 4,6,1,2,3

		int arr[] = new int[] { 1, 2, 3, 4, 6 };
		int d = 3;

		while (d > 0) {
			int temp = arr[0];
			int i;
			for (i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = temp;
			d--;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
