package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args){
			Map<Integer, String> mapRef = new HashMap<Integer, String>();
			mapRef.put(52,  "John");
			mapRef.put(52,  "Oracle");
			mapRef.put(52,  "Oracle");
			mapRef.put(53,  "Adam");
			mapRef.put(51,  "Bob");
			mapRef.put(54,  "Oracle");
			mapRef.put(57,  "Oracle");
			
			for (Map.Entry temp:mapRef.entrySet()){
				System.out.println(temp.getKey() + " " + temp.getValue());
			}
			
			TreeMap refTreeMap = new TreeMap(mapRef);
			System.out.println("Sorted HashMap: " + refTreeMap);
	}
}
