package dao;

import java.sql.SQLException;
import java.util.List;
import pojo.Person;

public interface PersonDAO {
	public void addPerson(Person pRef) throws ClassNotFoundException, SQLException;
	public void updatePerson(Person pRef) throws ClassNotFoundException, SQLException;
	public List<Person> listPersons() throws ClassNotFoundException, SQLException;
	public void getPersonByID(int id) throws ClassNotFoundException, SQLException;
	public void removePerson(int id) throws ClassNotFoundException, SQLException;
}
