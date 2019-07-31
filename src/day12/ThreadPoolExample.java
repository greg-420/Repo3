package day12;

import java.util.concurrent.*;

//Java Thread pool represents a group of worker threads that are waiting for the job and
//reuse many times.
//
//In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled and assigned a job by
//the service provider. After completion of the job, thread is contained in the thread pool again.
//better performance: It saves time because there is no need to create new thread.

class WorkerThread implements Runnable{
	
	WorkerThread(String s){
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5); //creating a pool of 5 threads
		for (int i = 0; i < 5; i++){
			Runnable worker = new WorkerThread(" " + i);
			executor.execute(worker);//calling execute method of Executor Service
		}
		executor.shutdown();
		while (!executor.isTerminated()){
			
		}
	}

}


//1235 

//