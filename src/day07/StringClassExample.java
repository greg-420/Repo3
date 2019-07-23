package day07;

public class StringClassExample {

	String ref1 = "Python";
	String ref2 = "Python";
	
	String ref3 = new String("Scala");
	String ref4 = new String("Scala");
	
	Person ref5 = new Person("Java");
	Person ref6 = new Person("Java");
	
	/*void scenario1(){
		if (ref3 == ref4){
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	} //end of scenario 1*/
	
	void scenario2(){
		if (ref3.equals(ref6)){
			System.out.println(ref3.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("same");
		}
		else {
			System.out.println(ref3.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("not same");
			//establish hash is same then check value using .equals
		}
	} //end of scenario 2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClassExample ref = new StringClassExample();
		//ref.scenario1();
		ref.scenario2();
	}

}
