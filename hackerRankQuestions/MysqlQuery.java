package hackerRankQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlQuery {

	public static void makeQuery() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver") ;
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBNAME", "usrname", "pswd") ;
		Statement stmt = conn.createStatement() ;
		String query = "SELECT 'customer',id,customer_name FROM customet WHERE id NOT IN (SELECT DISTINCT customer_id FROM invoice) UNION ALL SELECT 'product', id, product_name FROM product WHERE id NOT IN (SELECT DISTINCT product_id FROM invoice_item;";
		ResultSet rs = stmt.executeQuery(query) ;
	}
	
}
