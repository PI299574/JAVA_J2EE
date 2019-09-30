package LearnBayArray;

import java.util.HashMap;
import java.util.Scanner;

public class SparseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String stringArray[] = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = sc.next();
		}

		int d = sc.nextInt();
		String queryArray[] = new String[d];

		for (int i = 0; i < d; i++) {
			queryArray[i] = sc.next();
		}

		for (int i = 0; i < d; i++) {
			int c = getCount(stringArray, queryArray[i]);
			System.out.println(c);
		}

	}

	static int getCount(String[] stringArray, String string) {
		// TODO Auto-generated method stub

		int count = 0;

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < stringArray.length; i++) {
			if (hm.containsKey(stringArray[i])) {
				hm.put(stringArray[i], hm.get(stringArray[i]) + 1);
			} else {
				hm.put(stringArray[i], 1);
			}
		}

		for (int i = 0; i < string.length(); i++) {

			if (hm.containsKey(string)) {
				count = hm.get(string);
			}
		}

		return count;
	}

}