package day13;

import java.io.*;


public class Writer {

	public static void main(String[] args) throws IOException {
		 try (BufferedWriter bw =
                 new BufferedWriter(new FileWriter("C:\\Users\\gregory.gao\\Desktop\\abc1.txt", true))){//warning: Exceptions possible
			boolean newFile = false;
			
			File f = new File("C:\\Users\\gregory.gao\\Desktop\\abc1.txt");
			//System.out.println(f.exists()); //look for a real file
			
			//newFile = f.createNewFile(); //maybe create a file!
			System.out.println(newFile); //already there? true false
			System.out.println(f.exists());//look again //true false
			
			bw.write("this is filewriter8");
			bw.newLine();
			bw.write("thank you..");
			bw.newLine();
			bw.write("Java");
			bw.newLine();
			bw.write("SAP");
			bw.newLine();
			
			
			bw.write("this is filewriter8");
			bw.newLine();
			bw.write("thank you..");
			bw.newLine();
			bw.write("Java");
			bw.newLine();
			bw.write("SAP");
			bw.flush();
			
		}
		
		catch (IOException e){
			System.out.println("Sorry!! File not found...");
		}

	}

}
