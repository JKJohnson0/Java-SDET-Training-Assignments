package newUser;

import java.sql.*;

public class UserDao {
	
	Userobject user = new Userobject(null, null, null, null, null, 0);

	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	final String DB_URL = "jdbc:mysql://database-2.cvjxwnkisjb7.us-east-1.rds.amazonaws.com:3306/newUsers";
	final String USER = "admin";
	final String PASS = "admin123";

	Connection conn = null;

	public void insertSQL(Userobject user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");

			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Connected.");
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO newUsers (FirstName, LastName, PhoneNumber, Email, UserName, Age) VALUES (?, ?, ?, ?, ?, ?)");
		     		      
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getPhoneNumber());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getUserName());
			ps.setInt(6, user.getAge());
			System.out.println(ps);
			ps.execute();
			
			System.out.println("All items successfully added.");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


}
