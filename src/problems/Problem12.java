package problems;

import java.util.Arrays;

public class Problem12 { //find the second largest and second smallest element in an array
	
	static void foo(int[] arr)
	{
		if (arr.length < 2)
			{
				System.out.println("Array size must be 2 or more");
				return;
			}
		else {
			Arrays.sort(arr); //uses quicksort from  java.util.arrays
			int a = arr[0];
			int b = arr[arr.length - 1];
			for (int i = 0 ; i < arr.length; i++)
			{
				if (arr[i] != a)
				{
					a = arr[i];
					break;
				}
			}
			for (int i = arr.length - 1; i > -1; i--)
			{
				if (arr[i] != b)
				{
					b = arr[i];
					break;
				}
			}
			System.out.println("The second smallest integer is " + a);
			System.out.println("The second largest integer is " + b);
		}
	}

	public static void main(String[] args) {
		int[] newArray = {-1, 3, 5, -3, 5, -7, 8, -2, 3, 5, -9};
		foo(newArray);
		//if not allowed to use sort, then find smallest integer and largest integer, then find next smallest. 

	}

}
