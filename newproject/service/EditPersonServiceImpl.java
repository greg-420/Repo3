package service;

import java.sql.SQLException;

import dao.*;
import pojo.Person;

public class EditPersonServiceImpl implements EditPersonService {

	@Override
	public void editPersonService(Person p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDAO refPersonDAO = new PersonDAOImpl();
		refPersonDAO.updatePerson(p);
	}

}
