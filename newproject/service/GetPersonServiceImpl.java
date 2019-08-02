package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.PersonDAO;
import dao.PersonDAOImpl;

public class GetPersonServiceImpl implements GetPersonService {

	@Override
	public void getPersonService() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id you wish to get");
		int id = sc.nextInt();
		
		PersonDAO refPersonDAO = new PersonDAOImpl();
		refPersonDAO.getPersonByID(id);
	}

}
