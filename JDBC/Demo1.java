package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println(" driver loaded... ");
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Connection con = DriverManager.getConnection(url, "system","roshan");
	System.out.println("connected successfully .... ");
	
	Statement st=con.createStatement();
	ResultSet rs = st.executeQuery("select * from emp");
	while(rs.next()){	  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3));
	}
	rs.close();
	}
}
