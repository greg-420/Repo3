package dao;

import java.sql.*;
import java.util.*;

import connection.DBConnectionDAOImpl;
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
	public List<Person> listPersons() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection refDB = DBConnectionDAOImpl.connect();
		Statement st = refDB.createStatement();
		List<Person> l = new ArrayList<Person>();
		String sql = "SELECT id, name, password, dob FROM persons";
		ResultSet rs = st.executeQuery(sql); //if you wanna print something.
		
//		
		// Extract data from result set
		
		while (rs.next()){
//			System.out.println( "\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			Person p = new Person();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPassword(rs.getString(3));
			p.setDob(rs.getString(4));
			l.add(p);
		}
		return l;
	}

	@Override
	public void getPersonByID(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//get connection
		Connection refDB = DBConnectionDAOImpl.connect();
		Statement st = refDB.createStatement();
		
		String sql = "SELECT id, name, password, dob FROM persons WHERE id = " + id;
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) +" " +  rs.getString(4) );
		

	}

	@Override
	public void removePerson(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//get connection
		Connection refDB = DBConnectionDAOImpl.connect();
		Statement st = refDB.createStatement();
		
		String sql = "DELETE from persons WHERE id = " + id + "";
		st.executeUpdate(sql);
	}

}
