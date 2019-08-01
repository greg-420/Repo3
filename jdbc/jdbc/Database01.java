package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step - 1: call your prepareConnnection() from MyConnection class
		Connection con = MyConnection.prepareConnection();
		
		//Execute a query
		System.out.println("Creating table in given database...");
		Statement st = con.createStatement();
		
		//create table
		String sql = "CREATE TABLE students " +
		"(mobile INTEGER not NULL, " +
				" name VARCHAR(25), " +
		" email varchar(35), " + 
				" PRIMARY KEY (mobile))";
		st.executeUpdate(sql); //for saving purpose
		System.out.println("Createedtable in given database...");
	}

}