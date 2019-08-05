package forkJoinDemoAsyncExample;

import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer>{
	
	int n = 0;
	
	Fibonacci(int k){
		n = k;
	}

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		if (this.n == 0)
				return 0;
		if (this.n == 1 || this.n == 2)
			return 1;
		Fibonacci left = new Fibonacci(n - 2);
		left.fork();
		Fibonacci right = new Fibonacci(n - 1);

		return right.compute() + left.join();
	}
	
}
