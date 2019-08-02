package service;

import java.sql.SQLException;

import dao.PersonDAO;
import dao.PersonDAOImpl;

public class DeletePersonServiceImpl implements DeletePersonService {
	public void deletePersonService(int id) throws ClassNotFoundException, SQLException{
		PersonDAO refPersonDAO = new PersonDAOImpl();
		refPersonDAO.removePerson(id);
	}
}
