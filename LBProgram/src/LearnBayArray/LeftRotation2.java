package LearnBayArray;

public class LeftRotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,2,3,4,6 d=3
		// op= 4,6,1,2,3

		int arr[] = new int[] { 1, 2, 3, 4, 6 };
		int d = 3;
		int[] tempArr = new int[d];
		for (int i = 0; i < d; i++) {
			tempArr[i] = arr[i];
		}

		for (int i = 0; i < arr.length - d; i++) {
			arr[i] = arr[i + d];
		}
		for (int i = arr.length - d, j = 0; i < arr.length; i++, j++) {
			arr[i] = tempArr[j];
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
