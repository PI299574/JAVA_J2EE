package LearnBay;

import java.util.Scanner;

public class CadburySamsung {
	static int s=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		int noOfCadbury=cadbury(m,n,p,q);
		System.out.println(noOfCadbury);
		
	}

	private static int cadbury(int m, int n, int p, int q) {
		// TODO Auto-generated method stub
		
		int count1 = 0,count2 = 0,count3 = 0,count4=0;
		
		
			count1=bar (count1 ,m,p);
			count2=bar (count2 ,m,q);
			count3=bar (count3 ,n,p);
			count4=bar (count4 ,n,q);
				
				
		return (count1+count2+count3+count4);
	}

	private static int bar(int count ,int len, int bre) {
		// TODO Auto-generated method stub
	
		if(len > bre){
 			if(len - bre >= 0 && len > 0 && bre > 0){
 				count = bar(count, (len - bre) , bre);
 				count = count+1;
 			}else{
 				return count;
 			}
 			
 		}else{
 			if(bre - len >= 0 && bre > 0 && len > 0){
 				count = bar(count, len, (bre - len));
 				count = count+1;
 			}else{
 				return count;
 			}
 			
 		}
		
		return count;
	}

	

}
