package problems;

class SortedArrays {
	int[] a1, a2, a3; //arrays
	int s1, s2, s3; //sizes
	public SortedArrays(int[] arr1, int[] arr2, int[] arr3){
		a1 = arr1;
		a2 = arr2;
		a3 = arr3;
	}
	
	int max(int s1, int s2, int s3){//return the maximum of three ints.
		int MAX = 0;
		if (s1 >= s2)
			MAX = s1;
		else MAX = s2;
		if (s3 >= MAX)
			MAX = s3;
		return MAX;
	}
	
	
	public void commonElements(int[] elements){
		//return common elements
		int MAX = this.max(s1, s2 , s3);
		int[MAX] temp = {};
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < s1 ; i++){
			if (i > 0 && a1[i-1] != a1[i])
			{
				for (int j = 0; j < s2;)
				{
					if (a1[i] == a2[j]);
					temp[counter1] = a1[i];
					break;
				}
			}
		}
	}
}

public class Problem10 { //find common elements in three sorted arrays
	public static void main (String[] args)
	{
		int[] arr1 = {1, 5, 10, 20, 40, 80};
		int[] arr2 = {6, 7, 20, 80, 100};
		int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

		SortedArrays refSA = new SortedArrays(arr1, arr2, arr3);
	}
}
