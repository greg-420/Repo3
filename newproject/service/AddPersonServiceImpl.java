package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import pojo.Person;

public class AddPersonServiceImpl implements AddPersonService {
	public void addPersonService(Person p) throws ClassNotFoundException, SQLException{ //call or invoke
		PersonDAO refPersonDAO = new PersonDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		p.setName(name);
		System.out.println("Enter date of birth");
		String dob = sc.nextLine();
		p.setDob(dob);
		System.out.println("Enter password");
		String password = sc.nextLine();
		p.setPassword(password);
		System.out.println("Enter id");
		int id = sc.nextInt();
		p.setId(id);
		refPersonDAO.addPerson(p);
		sc.close();
	}
}
