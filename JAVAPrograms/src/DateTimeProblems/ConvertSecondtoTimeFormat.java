package DateTimeProblems;

import java.util.Scanner;

public class ConvertSecondtoTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in seconds********");
		int no= sc.nextInt();
		
		int second=no%60;
		
		int minute = (no%3600)/60;
		
		int hour= (no%24)/3600;
		
		System.out.println("Hr "+hour+" mm "+minute +" ss "+second);
		
		
	}

}
