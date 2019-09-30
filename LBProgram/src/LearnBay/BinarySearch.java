package LearnBay;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 14, 15, 18, 20 };
		int key = 18;
		int low = 0, high = array.length - 1;
		System.out.println(binarySearch(array, low, high, key));
	}

	private static boolean binarySearch(int[] array, int low, int high, int key) {
		// TODO Auto-generated method stub
		int mid = (low + high) / 2;
		System.out.println(low + " " + high + " " + mid);
		if (low <= high) {
			if (array[mid] == key) {
				return true;
			}
			if (array[mid] > key) {
				return binarySearch(array, low, mid - 1, key);
			}
			return binarySearch(array, mid + 1, high, key);
		}
		return false;
	}
}
