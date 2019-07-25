package day08;



public class DevCode {
	static void logic(int number){
		try {
//			int temp = number/0;
//			System.out.println(temp);
			
//			int a[] = {10, 20, 30, 40, 50};
//			a[50] = 5000;
//			System.out.println(a[50]);
			
//			String s = null;
//			System.out.println(s.length());
			
			int a[] = {1};
			System.out.println(a[0]);
		} 
		
//		catch (Exception e){
//			System.out.println("Exception is the superclass of all Exception classes");
//		} already catches exceptions. compiler doesn't read below
		
		catch (NullPointerException e){
			System.out.println("Null pointer!");
		}
		
		catch (ArithmeticException e) {
			System.out.println("A number can't be divided by 0");
		}
		
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("handled ArrayIndexOutOfBoundsException");
		}
		
		catch (Exception e){
			System.out.println("Exception is the superclass of all Exception classes");
		}
		

		
		finally {
			System.out.println("closing files");
		}
	}
}
