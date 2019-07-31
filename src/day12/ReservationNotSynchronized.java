package day12;

class Reserve implements Runnable{
	int available = 5; //alternative: use Integer class
	//call constructor for r to modify integer class.
	//create several reserves 
	int wanted;
	Reserve(int i ){
		wanted = i;
	}
	
	public void run() {
		try {
			Thread.sleep((long) (100 + Math.random()*1000));
		}
		catch (InterruptedException ie){
			
		}
		synchronized (this)
		{
			System.out.println("Available berths: "+available);
			String name = Thread.currentThread().getName();
			if (name == "Karthik")
				this.wanted = 3;
			else this.wanted = 2;
			if (available >= wanted){
			
				System.out.println(wanted + " Berths reserved for " + name);
				available = available - wanted;
			} //end of if
			else 
				System.out.println("Sorry... no berth available");
		}
	}
}

public class ReservationNotSynchronized {
	public static void main(String args[]){
		Reserve r = new Reserve(2); //tell that 2 berth is needed
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("Razli"); //Looking for 2
		t2.setName("Sulianto"); //Looking for 2
		t3.setName("Karthik"); //Looking for 3
		
		t1.start();
		t2.start();
		t3.start();
	}
}
