package service;

import java.sql.SQLException;
import java.util.List;

import pojo.Person;

public interface ListPersonService {
	List<Person> makeList () throws ClassNotFoundException, SQLException;
}
