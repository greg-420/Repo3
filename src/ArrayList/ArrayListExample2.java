package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Thing{
	public Thing(String s){
		name = s;
	}
	String name;
	
	@Override
	public boolean equals(Object o){
		if (this.hashCode() != o.hashCode())
			return false;
		try{
			Thing t = (Thing) o;
			return ((this.name).equals(t.name));
		}
		catch (ClassCastException e)
		{
			System.out.println("Class cast exception!");
			return false;
		}

	}
	
	@Override
	public int hashCode(){
		return Objects.hash();
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}

//class Other{
//	@Override
//	public int hashCode(){
//		return Objects.hash();
//	}
//}

public class ArrayListExample2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Thing> refList = new ArrayList<>();
		String name;
		boolean flag = false;
		
		while (true){
			System.out.println("Please enter a name");
			name = sc.nextLine();
			Thing t = new Thing(name);
			for (Thing i : refList){
				if (t.equals(i))
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
				refList.add(t);
				System.out.println(refList);
			}
		}
//		Thing t = new Thing("John");
//		Other o = new Other();
//		System.out.println(t.equals(o));
	}
}
