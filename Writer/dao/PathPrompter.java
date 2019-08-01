package dao;

import java.util.Scanner;

public class PathPrompter {
	public static String prompt(Scanner sc){
		System.out.println("Please enter your path, with double instead of single backslash");
		String s = sc.nextLine();
		return s;
	}
}
