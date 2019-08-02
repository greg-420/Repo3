package controller;

import java.sql.SQLException;
import java.util.*;

import pojo.Person;
import service.AddPersonServiceImpl;
import service.AddPersonService;

public class AddPersonController {
	public void prompt() throws ClassNotFoundException, SQLException{
		AddPersonService refaddPerson = new AddPersonServiceImpl();
		Person p = new Person();
		refaddPerson.addPersonService(p);
		//create person
	}
}
