package LearnBayStack;

import java.util.Scanner;

public class MaxElementHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		Long n=sc.nextLong();
		Long max=0L;
		java.util.Stack<Long> stack = new java.util.Stack();
		for(Long i=0L;i<n;i++){
			int ch=sc.nextInt();
			switch(ch){
			case 1:
				Long d=sc.nextLong();
				max=Math.max(max, d);
				stack.push(max);
				break;
			case 2:
				if(!stack.isEmpty()){
					Long s=stack.pop();
					if(max==s ){
						max=stack.peek();
					}
				}
				break;
			case 3:
				System.out.println(stack.peek());
				break;
				default:break;
			}
		}
	}

}
