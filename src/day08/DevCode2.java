package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DevCode2 {
//	1. Handle NullPointerException
//	2. Handle NumberFormatException / InputMismatchException
	
	public static void logic() throws IOException{
		try{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number :");
//		int number = sc.nextInt();
//		System.out.println(number);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number: ");
		int number = Integer.parseInt(br.readLine());
		System.out.println(number);
		}
	
	catch (NumberFormatException e){
		System.out.println("Number format exception!");
	}
	
	finally {
		System.out.println("closing files");
	}
	}
}
