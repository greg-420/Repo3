package application;

import java.sql.SQLException;

import controller.AddPersonController;
import controller.EditInfoController;
import controller.GetPersonController;
import controller.ListPersonController;
import controller.RemovePersonController;

public class Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		AddPersonController refAdd = new AddPersonController();
		EditInfoController refEdit = new EditInfoController();
		ListPersonController refList = new ListPersonController();
		RemovePersonController refDelete = new RemovePersonController();
		GetPersonController refGet = new GetPersonController();
//		refAdd.prompt();
//		refEdit.prompt();	
		refList.foo();
//		refDelete.removeController();
//		refList.foo();
//		refGet.getPersonController();	
	}
}
