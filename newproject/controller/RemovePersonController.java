package controller;

import java.sql.SQLException;
import java.util.Scanner;

import service.DeletePersonService;
import service.DeletePersonServiceImpl;

public class RemovePersonController {
	public void removeController() throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of entry you wish to remove");
		int id = sc.nextInt();
		DeletePersonService refDelService = new DeletePersonServiceImpl();
		refDelService.deletePersonService(id);
	}
	
	
}
