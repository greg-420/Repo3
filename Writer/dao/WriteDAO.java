package dao;

import java.io.*;
import java.util.*;

public class WriteDAO {
	static void userWrite (Scanner sc, BufferedWriter bw) throws IOException{//prompt user to write lines into the file.
		System.out.println("Enter what you wish to write");
		String toWrite = sc.nextLine();
		bw.write(toWrite);
		bw.flush();
	}
	
	public static void write(String path, Scanner sc){
			try (BufferedWriter bw =
	            new BufferedWriter(new FileWriter(path, true))){//warning: Exceptions possible
				
//			File f = new File(path);
			userWrite(sc, bw);
		}
		
		catch (IOException e){
			System.out.println("Error in filename!");
		}
	}
}
