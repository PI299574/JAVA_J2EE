package LearnBayStack;

import java.util.Scanner;

public class SimpleTextEditorHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		java.util.Stack<String> stack = new java.util.Stack();
		for (int i = 0; i < n; i++) {
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				stack.push(s);
				s = s + sc.next();
				break;
			case 2:
				stack.push(s);
				int kth = sc.nextInt();
				s = s.substring(0, s.length() - kth);
				break;
			case 3:
				int k = sc.nextInt();
				System.out.println(s.charAt(k - 1));
				break;
			case 4:
				s = stack.pop();
				break;
			default:
				break;
			}

		}

	}
}
