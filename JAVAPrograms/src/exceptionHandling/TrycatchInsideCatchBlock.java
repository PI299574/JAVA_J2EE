package exceptionHandling;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TrycatchInsideCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int a=0;int b=5;
			int c=b/a;
		}catch(Exception e){
			int a=0;int b=5;
			try{
				int c=b/a;
				 System.out.println(c);
			}
			catch(ArithmeticException e1){
				e1.printStackTrace(System.out);
			}
			System.out.println("pppppppppppp");
            e.printStackTrace(System.out);
		}
		
	}

}
