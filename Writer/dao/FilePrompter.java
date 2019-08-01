package dao;

import java.util.*;

public class FilePrompter {
	public static String filePrompt(Scanner sc){
		System.out.println("Enter the name of the file");
		String filename = sc.nextLine();
		return filename;
	}
}
