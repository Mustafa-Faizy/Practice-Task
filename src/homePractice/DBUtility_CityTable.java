//package homePractice;
//
//import java.beans.Statement;
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBUtility_CityTable {
//
//	
//	private static Connection conn;
//	
//	private static Statement stmt;
//	
//	private static ResultSet resultSet;
//	
//	private static String dataBaseURL = "jdbc:postgresql://localhost:543d2/dvdrental";
//	
//	private static String dataBaseUserName = "postgres";
//	
//	private static String dataBasePassword = "root";
//	
//	private static String dataBaseQuery = "select * from public.city";
//	
//	public static void setUpConnection() {
//		
//		try {
//			conn = DriverManager.getConnection(dataBaseURL, dataBaseUserName, dataBasePassword);
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void runQuery() {
//		
//		try {
//			stmt = conn.createStatement();
//			resultSet = stmt.execute();
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
