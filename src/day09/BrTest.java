package day09;

import java.io.*;
import java.sql.Date;

public class BrTest {
	public static void main (String[] args) throws NumberFormatException, IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.printf("Enter an integer\n");
//		int a = Integer.parseInt(br.readLine());
//		System.out.printf("Enter a string\n");
//		String b = br.readLine();
//		System.out.printf("Your input is a: %d and b: %s", a, b);
		Date date = new Date(4,5,6);
		System.out.printf("%tT", date);
	}
}
