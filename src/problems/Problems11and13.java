package problems;

import java.util.ArrayList;
import java.util.List;

public class Problems11and13 { //remove duplicates from array

	static List<Integer> removeDuplicates(int arr[])
	{
		List<Integer> arrList = new ArrayList<>();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++)
		{
			for (int x : arrList)
				{
					if (arr[i] == x) //if x is already added
						{
							flag = false;
							break;
						}
				}
			if (flag)
				{
					arrList.add(arr[i]);
				}
			flag = true;
		}
		
		return arrList;
		
	}
	
	public static void main(String[] args){
		int[] arr1 = {1, 5, 2, 3, 7, 9, 9, 1, 1, 1, 2, 3, 6, 3, 4, 4, 4};
		List<Integer> removed = removeDuplicates(arr1);
		
		for (int x : removed)
			System.out.print(x + " ");
		System.out.println();
		
		System.out.println(removed.size());

	}
}
