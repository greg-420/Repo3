package forkJoinDemoAsyncExample;

public class ForkJoin {
	public static void  main (String[] args){
		Fibonacci newFibonacciNumber = new Fibonacci(8);
		System.out.println(newFibonacciNumber.compute());
	}
}
