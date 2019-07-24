package day08;

import java.util.Scanner;

class Person{

	int id;
	String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}

public class ArrayExample {
	public static void main(String[] args){
		
		/*String[] str = {"Physics", "Chemistry", "Maths"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		} //traditional for loop
		
		for (String temp : str) {
			System.out.println(temp);
		} //foreach loop*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to enter: ");
		int number = sc.nextInt();
		Person pRef[] = new Person[number];
		
		for (int i = 0; i < pRef.length; i++) {
			System.out.println("Enter your Name : ");
			String name = sc.nextLine(); //check on internet
			
			System.out.println("Enter your ID : ");
			int id = sc.nextInt();

			
			pRef[i] = new Person();
			pRef[i].setName(name);
			pRef[i].setId(id);
			
		} // end of for loop
		for (Person person : pRef) {
			System.out.println(person.getId());//person is reference of Person class.
			System.out.println(person.getName());
		}
	}
}
