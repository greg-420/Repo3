package day07;

public class CommandLineArgumentExample {
	public static void main(String[] city){ //how to parse an argument in city?
		
		String cityNames[] = city;

		for (int i = 0; i < city.length; i++)
		{
			System.out.println(cityNames[i]);
		}
		
		for (String element : city) //for each loop
		{
			System.out.println(element);
		}
		
		int max = (city[0].equals("Paris")) ?  5 : 6;
		
		System.out.println(max);
		
	}
}
