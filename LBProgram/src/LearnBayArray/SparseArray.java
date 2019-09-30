package LearnBayArray;

import java.util.Scanner;

/*
 Sample Input
 4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output

2
1
0*/
public class SparseArray {
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

		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(string)) {
				count++;
			}
		}

		return count;
	}

}
