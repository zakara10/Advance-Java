/*
7 Steps to Connect Application to database
1)Import the package
2)Load and Register driver
3)Create Connection
4)Create Statement
5)Execute the query
6)process the results
7)close connection
 */

package connection;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo_select {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println(" driver loaded... ");
	String url="jdbc:oracle:thin:@localhost:1521:xe";  // Url is used to distinguish which database you are using, For example--> Your pc have more than one database to use the oracle , we need url for it
	Connection conn = DriverManager.getConnection(url, "system","roshan");
	System.out.println("connected successfully .... ");
	}
}
