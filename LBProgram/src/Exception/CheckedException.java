package Exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		 //thowing exception because FileNotFoundException is not handled at compile time.
        FileReader file = new FileReader("C:\\test\\a.txt");  
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
        	 //thowing exception because IOException is not handled at compile time.
            System.out.println(fileInput.readLine());
         
        fileInput.close();
    }
//Solution is IOException is parent of FileNotFoundException. So if we use thows keyword with IOException at method level.
	//then this error will go.
	
}
