package problems;

import java.util.ArrayList;
import java.util.List;


public class Problem10 { //find common elements in three sorted arrays
	static void common(int[] a1, int[] a2, int[] a3)
	{
		int s1 = a1.length;
		int s2 = a2.length;
		int s3 = a3.length;
		
		List<Integer> sublist1 = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < s1; i++)
		{
			if (i == 0)
			{
				for (int j = 0; j < s2; j++)
				{
					if (a1[i] == a2[j])
						{
							sublist1.add(a1[i]);
							break;
						}
				}
			}
			else if (a1[i] != a1[i - 1])
			{		
				for (int j = 0; j < s2; j++)
				{
					if (a1[i] == a2[j])
						{
							sublist1.add(a1[i]);
							break;
						}
				}
			}
		}
		
		for (int i = 0; i < sublist1.size(); i++)
		{
				for (int j = 0; j < s3; j++)
				{
					if (sublist1.get(i) == a3[j])
						{
							list.add(sublist1.get(i));
							break;
						}
				}
		}
		
		
		for (int x : list)
		{
			System.out.print(x + " ");
		}
	}

	public static void main (String[] args)
	{
		int[] arr1 = {1, 5, 10, 20, 40, 100, 100};
		int[] arr2 = {6, 7, 20, 70, 100, 100, 100, 100, 1000};
		int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 100, 120};
		
		common(arr1, arr2, arr3);

		
	}
}
