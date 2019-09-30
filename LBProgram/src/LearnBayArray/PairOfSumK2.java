package LearnBayArray;

public class PairOfSumK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 6, 5 };
		int k = 7;
		/*int arr[] = {1, 4, 45, 6, 10, 18};
        int k = 16;*/
		boolean[] hash = new boolean[100000];

		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]] = true;
		}

		for (int i = 0; i < arr.length; ++i) {

			if ( k-arr[i] >=0 && hash[k - arr[i]] == true ) {
				System.out.println(arr[i] + " " + (k - arr[i]));
			}
			
		}

	}
}
