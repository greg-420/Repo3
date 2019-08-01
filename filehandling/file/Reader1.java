package file;

import java.io.*;
public class Reader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = null;
		try{
			//Open the file that is the first command line parameter
			FileInputStream fs = new FileInputStream("c:\\file\\demo.txt");
			//FileInputStream fs = new FileInputStream("sample.txt"); //relative path
			//c:\\MyFile.txt absolute path
			//Get the object of DataInputStream
			in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			
			//Read file line by line.
			while ((str = br.readLine()) != null){
				//Print the content on the console
				System.out.println(str);
			}
		}
		catch (Exception e){//catch exception if any
			//system.err.println("Error: " + e.getMessage());
			System.out.println("file not found...");
		}
		finally {
			in.close();
			//close the input stream.
		}
	}

}
