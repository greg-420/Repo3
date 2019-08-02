package service;

import java.sql.SQLException;
import java.util.List;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import pojo.Person;

public class ListPersonServiceImpl implements ListPersonService {

	@Override
	public List<Person> makeList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PersonDAO refPersonDAO = new PersonDAOImpl();
		return refPersonDAO.listPersons();
	}
	
}
