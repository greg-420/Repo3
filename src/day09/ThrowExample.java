package day09;

class User extends Throwable{
	public User(String ref){
		System.out.println(ref);
	}
	static void validateAge(int age){
		if (age < 18){
			User refUser = new User("Age can't be less than 18.");
			try {
				throw refUser; //can do garbage collection properly. can create separate method and call in catch block. best practice.
			} catch (User e) {
				System.out.println("Exception caught.."); //if no exception thrown, high possib
//				System.out.println("Age can't be less than 18.");
			} //points to a memory address.
			finally { //executes whether there is an exception or not
				System.out.println("closing files..");
			}
		}
	}
}



public class ThrowExample {

	public static void main(String[] args) { //for when there is no exception in java logic.
		// TODO Auto-generated method stub
		User.validateAge(10);
	}

}
