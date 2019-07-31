package day12;

class A{ //singleton
	
	private static final A refA = new A();
	
	private A(){
	}
	
	public static A getInstance(){
		return refA;
	}
	
	void foo(){
		System.out.println("Hello");
	}
}

public class FactoryImpl {
	public static void main(String[] args){
		A instanceA = A.getInstance();
		instanceA.foo();
	}
}
