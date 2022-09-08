package newUser;

import java.sql.*;
import java.util.HashMap;

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

	public void seeAllSQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");

			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected.");

			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM 			newUsers");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1) System.out.print(",  ");
					String columnValue = resultSet.getString(i);
					System.out.print(columnValue);
				}
				System.out.println("");
			}


		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void updateSQL(String name) {
		try {
		    PreparedStatement ps = null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");

			conn = DriverManager.getConnection(DB_URL,USER,PASS);			
			
	         String query = "update DemoTable set FirstName=? where FirstName=? ";
	         ps = conn.prepareStatement(query);
	         ps.setString(1, "Tom");
	         ps.setString(2, name);
	         ps.executeUpdate();
	         System.out.println("Record is updated successfully......");
			

		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
		public void deleteSQL(String name) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Connecting to database...");

				conn = DriverManager.getConnection(DB_URL,USER,PASS);	
				Statement statement = conn.createStatement();{
					String SQL = "DELETE FROM newUsers WHERE FirstName = '"+name+"' ";
					statement.executeUpdate(SQL);
					conn.close();
				}

			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}



		}
	}