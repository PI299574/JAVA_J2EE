package LearnBayStack;

import java.util.Scanner;

public class EqualStackHR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int sum1 = 0, sum2 = 0, sum3 = 0;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] arr3 = new int[n3];

		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
			sum1 = sum1 + arr1[i];
		}
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
			sum2 = sum2 + arr2[i];
		}
		for (int i = 0; i < n3; i++) {
			arr3[i] = sc.nextInt();
			sum3 = sum3 + arr3[i];
		}

		int i = 0, j = 0, k = 0;
		while (sum1 != sum2 || sum2 != sum3) {
			if (sum1 > sum2 || sum1 > sum3) {
				sum1 = sum1 - arr1[i++];
			}
			if (sum2 > sum1 || sum2 > sum3) {
				sum2 = sum2 - arr2[j++];
			}
			if (sum3 > sum2 || sum3 > sum1) {
				sum3 = sum3 - arr3[k++];
			}

		}
		System.out.println(sum1);

	}

}
