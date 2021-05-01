package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo4_PS_DML {
	public static void main(String[] args)throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(" driver loaded... ");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "system","roshan");
		System.out.println("connected successfully .... ");
		
	/* 
		PreparedStatement pst= con.prepareStatement("Insert into emp values(?,?,?)");
		pst.setInt(1, 3);
		pst.setString(2, "Aman");
		pst.setInt(3, 25);
		int p=pst.executeUpdate();
		System.out.println(p+" row inserted ");
	*/
		
	/*
	 	PreparedStatement pst1= con.prepareStatement("update emp set age=? where id=?");
		pst1.setInt(1, 30);
		pst1.setInt(2, 3);
		int k=pst1.executeUpdate();
		System.out.println(k+" row updated ");
	*/	

		PreparedStatement pst2= con.prepareStatement("delete from emp where id>?");	
		pst2.setInt(1, 109);				
		int b=pst2.executeUpdate();
		System.out.println(b+" row deleted ");
	
}
}
