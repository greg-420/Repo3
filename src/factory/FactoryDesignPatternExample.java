package factory;

import java.util.Scanner;

public class FactoryDesignPatternExample { //at runtime, calling implemented class method through its interface reference
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Bank: ");
		String nameBank = sc.next();
		
		Bank refBank = BusinessLogic.myFactoryMethod(nameBank);
		refBank.offerCreditCard();
	}

}
