package day09;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DevCode{
	public static void logic() {
	
	try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int n = sc.nextInt();
			
		} 
	
	catch (InputMismatchException e) {
		System.out.println("Enter a number!");
	}
	
	finally {
		System.out.println("Exiting program");
	}
	
	}
	
	
}
