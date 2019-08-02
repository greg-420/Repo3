package dao;

import java.sql.*;
import java.util.*;

import pojo.Person;

public class PersonDAOImpl implements PersonDAO {

	@Override
	public void addPerson(Person pRef) throws ClassNotFoundException, SQLException {
	
		//insert record
		Connection refDB = DBConnectionDAOImpl.connect();
		String sql = "INSERT INTO persons " + 
		"VALUES (" + pRef.getId()+ ", '" + pRef.getName() + "', '" + pRef.getPassword() + "', '" + pRef.getDob()+ "')";
		Statement st = refDB.createStatement(); 
		st.executeUpdate(sql);
		
		System.out.println("Data Inserted Successfully");
	}

	@Override
	public void updatePerson(Person p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection refDB = DBConnectionDAOImpl.connect();
		//edit a record
		int id = p.getId();
		PreparedStatement sql = refDB.prepareStatement("UPDATE persons SET name = ?, password = ?, dob = ? WHERE id = ?");
		sql.setString(1, p.getName());
		sql.setString(2, p.getPassword());
		sql.setString(3, p.getDob());
		sql.setInt(4, p.getId());

		sql.executeUpdate();
		System.out.println("Record Modified Successfully");
	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		List<Person> l = new ArrayList<Person>();
		return null;
	}

	@Override
	public void getPersonByID(int id) {
		// TODO Auto-generated method stub
		//get connection

	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		//get connection

	}

}
