package LearnBayStack;


import java.util.Scanner;

public class maxElementHR2 {
	static java.util.Stack<Long> stack = new java.util.Stack<Long>();
	static java.util.Stack<Long> maxStack = new java.util.Stack<Long>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Long total = sc.nextLong();
		for (Long i = 0L; i < total; i++) {
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				Long data = sc.nextLong();
				if (stack.isEmpty() && maxStack.isEmpty()) {
					stack.push(data);
					maxStack.push(data);
				} else {
					stack.push(data);
					if (maxStack.peek() < data && !maxStack.isEmpty()) {
						maxStack.push(data);
					}

				}
				break;
			case 2:
				Long d = stack.pop();
				if (maxStack.peek() == d && !maxStack.isEmpty()) {
					maxStack.pop();
				}
				break;
			case 3:
				System.out.println(getMax());
				break;
				default:
					break;
			}
			
			
		}

	}

	private static Long getMax() {
		// TODO Auto-generated method stub
		if(!maxStack.isEmpty()){
		return maxStack.peek();
		}
		return 0L;
	}

}
