package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL = "jdbc:mysql://database-1.cvjxwnkisjb7.us-east-1.rds.amazonaws.com:3306/users";
	    final String USER = "admin";
	    final String PASS = "admin123";
	    
	    Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("Connecting to database...");
	    	
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		      System.out.println("Creating table in given database...");
		      Statement stmt = conn.createStatement();
		      //String sql = "INSERT INTO `testTable` (`AccountID`,`firstName`,`lastName`,`age`) VALUES ( 4,'Jay','C',21);";

		      String sql = "CREATE TABLE TestTable " + 
		                   "(SSN INTEGER not NULL, " +
		                   " firstName VARCHAR(255), " + 
		                   " lastName VARCHAR(255), " + 
		                   " age INTEGER(30));"; 		     		      
		      System.out.println(sql);
		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}