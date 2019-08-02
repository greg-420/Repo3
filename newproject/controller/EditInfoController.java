package controller;

import java.sql.SQLException;
import java.util.Scanner;

import pojo.Person;
import service.EditPersonService;
import service.EditPersonServiceImpl;

public class EditInfoController {
	public void prompt() throws ClassNotFoundException, SQLException{
	EditPersonService refEditService = new EditPersonServiceImpl();
	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	System.out.println("Enter id:");
	int id = sc.nextInt();
	sc.nextLine();
	p.setId(id);

	System.out.println("Enter new name:");
	String name = sc.nextLine();
	p.setName(name);
	
	
	System.out.println("Enter new password:");
	String password = sc.nextLine();
	p.setPassword(password);
	
	System.out.println("Enter new dob:");
	String dob = sc.nextLine();
	p.setDob(dob);
	
	//set names.
	refEditService.editPersonService(p);
	sc.close();
	}
}
