package dao;

public class Counter {//counts the number of words in a string
	static int count(String str){
		String[] splitStr = str.trim().split("\\s+"); //split according to spaces and tabs.
		return splitStr.length;
	}
}
