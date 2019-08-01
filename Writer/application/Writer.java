package application;


import java.io.*;
import java.util.*;

import dao.PathChecker;
import dao.PathPrompter;
import service.GetPath;

public class Writer {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		GetPath.getPath(sc);
		
		
//		try (BufferedWriter bw =
//                new BufferedWriter(new FileWriter(path)))
//		{ //run the main process here.
//			PathChecker.checkPath(path);
//		}
//		catch (IOException e)
//		{
//			System.out.println("Error in File Path!");
//		}
		
		
		
		
		
		
		
	}

}
