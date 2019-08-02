package controller;

import java.sql.SQLException;

import service.GetPersonService;
import service.GetPersonServiceImpl;

public class GetPersonController {
	public void getPersonController() throws ClassNotFoundException, SQLException{
		GetPersonService refGetPersonService = new GetPersonServiceImpl();
		refGetPersonService.getPersonService();
	}
}
