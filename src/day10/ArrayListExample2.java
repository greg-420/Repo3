package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<String> refList = new ArrayList<>();
		String name;
		boolean flag = false;
		
		while (true){
			System.out.println("Please enter a name");
			name = sc.nextLine();
			for (String i : refList){
				if (name.equals(i))
					{
						flag = true;
						break;
					}
			}
			if (flag)
			{
				System.out.println("Name already present!");
				flag = false;
			}
			else {
				refList.add(name);
				System.out.println(refList);
			}
		}
	}
}
