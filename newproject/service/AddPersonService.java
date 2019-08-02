package service;

import java.sql.SQLException;

import pojo.Person;

public interface AddPersonService {
	void addPersonService(Person p) throws ClassNotFoundException, SQLException;
}
