package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader2{
	public static void main(String args[]) throws IOException {
		FileReader frRef = null;
		try {
			//get data from this file using a file reader.
			frRef = new FileReader("sample.txt");
			
			//To store the contents read via File Reader
			BufferedReader br = new BufferedReader(frRef);
			
			//Read br and store a line in 'data', print data
			String s;
			while ((s = br.readLine()) != null){
				System.out.println(s);
			}
		}
		
		catch (IOException e){
			System.out.println("Sorry!! File not found...");
		}
		finally {
			frRef.close();
		}//end of finally
	}
}
