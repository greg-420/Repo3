package day06;

class SingletonClass{ //1.variable private 2. constructor private 3. get method has "logic": whether null or not
	private static SingletonClass ref; //null -> points to heap memory
	
	private SingletonClass(){
		System.out.println("hello");
	}
	
	public static SingletonClass getMethod(){
		if (ref == null) {
			ref = new SingletonClass();
		}
		return ref;
	} //end of getMethod
} //end of SingletonClass

public class SingletonDesignPatternExample {//only one instance of the class can be implemented

	public static void main(String[] args) { 
		//cannot create SingletonClass object cos private constructor
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		//used for DB Connection
		//mutable class vs immutable class
		//must do a lot of practice to remember the stuff
	}

}
