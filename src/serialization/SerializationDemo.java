package serialization;

import java.io.*;

public class SerializationDemo implements Serializable {//implementing the interface makes it serializable
//public class SerializationDemo
	String name, city, birthday;
	transient int mobile; //we can also make static, if we don't want to serialize the variable.
	int age;
	
	public static void main(String[] args){
		SerializationDemo e = new SerializationDemo();
		e.name = "David";
		e.city = "Melbourne";
		e.mobile = 112233344;
		e.age = 30;
		e.birthday = "june";
		
		try{
			FileOutputStream fileOut = new FileOutputStream("david.txt");//create
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
		}
		catch(IOException i){
			i.printStackTrace();
		}
	}
}
