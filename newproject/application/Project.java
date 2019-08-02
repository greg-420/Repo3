package application;

import java.sql.SQLException;

import controller.AddPersonController;
import controller.EditInfoController;

public class Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
//		AddPersonController refAdd = new AddPersonController();
		EditInfoController refEdit = new EditInfoController();
//		refAdd.prompt();
		refEdit.prompt();	
	}
}
