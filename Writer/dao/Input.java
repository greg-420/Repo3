package dao;

import java.util.Scanner;

public class Input {
	static String inputLine(Scanner sc){
		System.out.println("Please enter your next line");
		String next = sc.nextLine();
		return next;
	}
}
