package StringProgram;
/*
SSSEERRTADEEE write a program to output the following way to given string:S3E2R2T1A1D1E3
 */
public class CountCharacterandPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="SSSEERRTADEEE";
		countCharacter(s);
		
	}

	private static void countCharacter(String s) {
		// TODO Auto-generated method stub
		String result="";int count=1;
		
		for(int i=0;i<s.length()-1;++i){
			
			if(s.charAt(i)==s.charAt(i+1)){
				count++;
			}else{
				result=result+s.charAt(i)+count;
				//System.out.println("*********"+result);
				count=1;
			}
				
		}
		result=result+s.charAt(s.length()-1)+count;
		System.out.println(result);
	}

}
