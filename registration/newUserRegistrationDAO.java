package registration;
import java.util.*;
import java.sql.*;
public class newUserRegistrationDAO {
	
	private ArrayList<newUserCreation> userData = new ArrayList<>();
	
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    final String DB_URL = "jdbc:mysql://database-1.cvjxwnkisjb7.us-east-1.rds.amazonaws.com:3306/users";
    final String USER = "admin";
    final String PASS = "admin123";
    Connection conn = null;
	
	
	//create
	public void addNewUser(newUserCreation user) {
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("Connecting to database...");
	    	
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		      System.out.println("Creating table in given database...");
		      Statement stmt = conn.createStatement();
		      String sql = "INSERT INTO `testTable` (`AccountID`,`firstName`,`lastName`,`age`) VALUES (?,?,?,?);";

		     		      
		      System.out.println(sql);
		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		//System.out.println("Added new user: " + user.getFirstName() + " " + user.getLastName());
	}
	
	//read
	
	
	//update
	
	//delete

}
