 package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo_select {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println(" driver loaded... ");
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "system","roshan");
	System.out.println("connected successfully .... ");
	}
}
