package StringProgram;

import java.util.Scanner;

//i like this program very much
//much very program this like i”
//1) Reverse the individual words, we get the below string.
//"i ekil siht margorp yrev hcum"
//2) Reverse the whole string from start to end and you get the desired output.
//"much very program this like i"
public class ReverseWordInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		reverseWordInString(s);
	}

	private static void reverseWordInString(String s) {
		// TODO Auto-generated method stub
		String []str=s.split(" ");
		String rev="";
		for(String s1:str){
			rev=rev+reverse(s1)+" "; //step 1
		}

		System.out.println(reverse(rev));  //step 2
	}

	private static String reverse(String str) {
		char[] array=str.toCharArray();
		for(int i=0,j=array.length-1;i<j;i++,j--){
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		return String.valueOf(array);
	}

}
