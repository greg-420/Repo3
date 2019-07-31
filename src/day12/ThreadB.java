package day12;

public class ThreadB extends Thread implements Runnable{ //more flexibility. can extend some other class. best practice.
	@Override
	public void run(){
		for (int i = 0; i < 3; i++)
			{
				try{
				Thread.sleep(100);
				}
				catch (Exception e){
					System.out.println(e);
				}
				System.out.println(i);
				System.out.println(getName());
			}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadB t1 = new ThreadB();
		ThreadB t2 = new ThreadB();
		ThreadB t3 = new ThreadB();
		ThreadB t4 = new ThreadB();
		ThreadB t5 = new ThreadB();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t5.setName("t5");

		t1.start();
		t2.start();
		t3.start();
		t3.join();
		t4.start();
		t5.start();

		
	}

}
