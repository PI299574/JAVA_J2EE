package RecursionProblem;
/*
 There are n people standing in a circle waiting to be executed. 
 The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, 
 a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle 
 (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, 
 who is given freedom. Given the total number of persons n and a number k which indicates that k-1 persons are skipped
  and kth person is killed in circle. The task is to choose the place in the initial circle so that you are the last one
   remaining and so survive.
 

For example, if n = 5 and k = 2, then the safe position is 3. Firstly, the person at position 2 is killed, 
then person at position 4 is killed, then person at position 1 is killed. Finally, the person at position 5 
is killed. So the person at position 3 survives.
If n = 7 and k = 3, then the safe position is 4. The persons at positions 3, 6, 2, 7, 5, 1 are killed in order, 
and person at position 4 survives.

J(n.k)=(J(n-1.k) +K-1)%n +1
 */
public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, k=2;
       int x = safePosition(n,k);
       System.out.println(x);
	}

	private static int safePosition(int n, int k) {
		// TODO Auto-generated method stub
   if(n==1){
	   return 1;
   }
		return 1+ (safePosition(n-1, k)+k-1)%n;
	}

}
