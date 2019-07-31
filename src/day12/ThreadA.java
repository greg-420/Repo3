package day12;

public class ThreadA extends Thread {
	
	@Override 
	public void run(){
		System.out.println("thread is running hiii...");
	}
	
	
	public static void main(String args[]){
		
		ThreadA ta = new ThreadA();
		Thread t  = new Thread(ta); //create object of thread class.
		//ta.start() not good practice
		t.start(); //once we call start it invokes runs automatically
		ta.run(); //not good practice.
		t.run();
	}
	
	
}
