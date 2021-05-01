package connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Demo6_CS_Fun {
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(" driver loaded... ");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "system","roshan");
		System.out.println("connected successfully .... ");
		
		CallableStatement stmt=con.prepareCall("{ ? = call addnumber(?,?)}");  
		stmt.setInt(2,10);  
		stmt.setInt(3,454);  
		stmt.registerOutParameter(1,Types.INTEGER);  
		stmt.execute();  
		  
		System.out.println("Sum Of Numbers=  "+stmt.getInt(1)); 
		
	}
}
