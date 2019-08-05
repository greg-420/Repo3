//package day14;
//
//import java.util.Properties;
//
//public class DBConnection2 {
//	public static Connection myConnection(){ // no need to handle exception here.
//		Connection con = null;
//		FileReader fReader = null;
//		//Create properties object.
//		Properties propRef = new Properties();
//		
//		try{
//			fReader = new FileReader ("db.properties");
//			//Load jdbc related proerties in above file.
//			propRef.load(fReader);
//			//load driver class
//			Class.forName(propRef.getProperty("db_driver_class")); // this key can be anything "key"
//			con = DriverManager.getConnection(
//					propRef.getProperty("db_url");
//					propRef.getProperty("db_username"),
//					propRef.getProperty("db_password");
//					
//		}
//	}catch (IOException | ClassNotFoundException | SQLException e){
//		System.out.println("DBConnection2 => DB connection Error..");
//		
//	}
//	return con;
//}
