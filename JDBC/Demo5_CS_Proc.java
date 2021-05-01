package connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo5_CS_Proc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(" driver loaded... ");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "system","roshan");
		System.out.println("connected successfully .... ");
	
		CallableStatement stmt=con.prepareCall("{call updateage(?,?)}");  
		stmt.setInt(1,3);  
		stmt.setInt(2,35); 		 
		stmt.execute();  
		System.out.println("Done ");
		  
	}
}
