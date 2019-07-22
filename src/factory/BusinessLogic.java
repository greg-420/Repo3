package factory;

public class BusinessLogic {
	public static Bank myFactoryMethod(String reference){ //factory method: return type is interface
		if (reference.equals("dbs")) {
			return new DBSBank();
		} 
		else if (reference.equals("citi")){
			return new CitiBank();
		}
		else
			return new OtherBank();
		
	}//end of myFactoryMethod
	
}//end of BusinessLogic
