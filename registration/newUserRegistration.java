package registration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class newUserRegistration {
	Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newUserCreation user = new newUserCreation(null, null, null, null, null, 0);
		methodClass method = new methodClass();
		//first name
		user.setFirstName(method.firstName());
		//System.out.println(user.getFirstName());
		//last name
		user.setLastName(method.lastName());
		//phonenumber
		user.setPhoneNumber(method.phoneNumber());
		//email
		user.setEmail(method.email());
		//username
		user.setUserName(method.userName());
		//age
		user.setAge(method.age());

		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		final String DB_URL = "jdbc:mysql://database-2.cvjxwnkisjb7.us-east-1.rds.amazonaws.com:3306/newUsers";
		final String USER = "admin";
		final String PASS = "admin123";

		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");

			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			PreparedStatement ps = conn.prepareStatement("INSERT INTO newUsers (FirstName, LastName, PhoneNumber, Email, UserName, Age) VALUES (?, ?, ?, ?, ?, ?)");
			//what are the different kinds of prepared statements
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getPhoneNumber());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getUserName());
			ps.setInt(6, user.getAge());
			System.out.println(ps);
			ps.execute();	
		     		      
			System.out.println("Added to tables in given database...");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}
