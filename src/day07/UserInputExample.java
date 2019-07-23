package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput{
	
	void userAccess() throws IOException{
		BufferedReader brRef = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter a character: "); //input = java
		
		//char c = brRef.readLine().charAt(2); //commonly used method
		
		/*char c = (char) brRef.read();
		c = (char) brRef.read();
		c = (char) brRef.read();
		System.out.println(c);*/
		
		System.out.println("Enter a number: ");
		
		
		/*int firstDigit = brRef.read();
		int secondDigit = brRef.read();
		
		firstDigit -= 48;
		firstDigit = firstDigit * 10;
		secondDigit -= 48;*/
		
		int number = Integer.parseInt(brRef.readLine());
		
		System.out.println(number);
	}
}

public class UserInputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			UserInput ref = new UserInput();
			ref.userAccess(); //have to handle exception here as well.
	}

}
