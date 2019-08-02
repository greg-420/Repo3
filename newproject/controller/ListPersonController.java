package controller;

import java.sql.SQLException;
import java.util.List;

import pojo.Person;
import service.ListPersonService;
import service.ListPersonServiceImpl;

public class ListPersonController {
	public void foo() throws ClassNotFoundException, SQLException{
		ListPersonService ref= new ListPersonServiceImpl();
		List<Person> l = ref.makeList();
		for (Person p : l) //to test function
		{
			System.out.println(p.getId() + " " + p.getName() + " " + p.getPassword() + " " + p.getDob());
		}
	}
}
