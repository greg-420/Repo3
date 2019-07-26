package problems;

import java.util.Arrays;
import java.util.stream.Stream;

class Flag{
	private static boolean flag = false;
	public static void set(boolean value){
		flag = value;
	}
	public static boolean get(){
		return flag;
	}
}

public class Problem9 {
	
	static void goo(String x, String arg, Flag f)
	{
		if (f.get())
			return;
		f.set((x.equals(arg)));
	}
	
	static boolean foo(String arg, String[] arr)
	{
        Stream<String> stream1 = Arrays.stream(arr);
        Flag f = new Flag();
		stream1.forEach(x -> goo(x, arg, f));
		return f.get();
	}
	public static void main(String[] args) //using Java 1.8 streams
	{
		String[] arr = {"Fred", "John", "Andy", "Bob", "Mike"};
		if (foo("J", arr))
			System.out.println("Match found!");
		else System.out.println("Match not found!");
	}
}
