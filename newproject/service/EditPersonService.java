package service;

import java.sql.SQLException;

import pojo.Person;

public interface EditPersonService {
	void editPersonService(Person p) throws ClassNotFoundException, SQLException;
}
