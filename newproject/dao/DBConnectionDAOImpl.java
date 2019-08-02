package dao;

import java.sql.*;

import jdbc.MyConnection;

public class DBConnectionDAOImpl {
	
	private static DBConnectionDAOImpl refDB;
	
	private  DBConnectionDAOImpl(){}
	
	public static DBConnectionDAOImpl getInstance(){
		if (refDB == null)
			refDB = new DBConnectionDAOImpl();
		return refDB;
	}
	
	
	public static Connection connect() throws ClassNotFoundException, SQLException{
		String connectionURL = "jdbc:mysql://localhost:3306/clt6"; //use clt6 as database name
		String uname = "root";
		String pwd = "root";
		Class.forName("com.mysql.jdbc.Driver");
		Connection ref = DriverManager.getConnection(connectionURL, uname, pwd);
		return ref;
	}
	
	
}
