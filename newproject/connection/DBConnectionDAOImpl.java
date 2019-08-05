package connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import jdbc.MyConnection;

public class DBConnectionDAOImpl {
	
	private static DBConnectionDAOImpl refDB;
	
	private  DBConnectionDAOImpl(){}
	
	public static DBConnectionDAOImpl getInstance(){
		if (refDB == null)
			refDB = new DBConnectionDAOImpl();
		return refDB;
	}
	
	
//	public static Connection connect() throws ClassNotFoundException, SQLException{
//		String connectionURL = "jdbc:mysql://localhost:3306/clt6"; //use clt6 as database name
//		String uname = "root";
//		String pwd = "root";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection ref = DriverManager.getConnection(connectionURL, uname, pwd);
//		return ref;
//	}
	
	public static Connection connect(){ // no need to handle exception here.
		Connection con = null;
		FileReader fReader = null;
		//Create properties object.
		Properties propRef = new Properties();
		
		try{
			fReader = new FileReader ("db.properties");
			//Load jdbc related properties in above file.
			propRef.load(fReader);
			//load driver class
			Class.forName(propRef.getProperty("db_driver_class")); // this key can be anything "key"
			con = DriverManager.getConnection(
					propRef.getProperty("db_url"),
					propRef.getProperty("db_username"),
					propRef.getProperty("db_password"));
					
		}
	catch (IOException | ClassNotFoundException | SQLException e){
		System.out.println("DBConnection2 => DB connection Error..");
		
	}
	return con;}
	
	
}
