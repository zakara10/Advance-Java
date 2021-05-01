package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo2_DML {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(" driver loaded... ");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "system","roshan");
		System.out.println("connected successfully .... ");
		Statement st= con.createStatement();
		
		int n=st.executeUpdate("Insert into emp values(109,'Lily',26)");
		System.out.println(n+" row inserted ");
		
		
	/*	int p=st.executeUpdate("Update Emp set esal=esal+500 where empid=113");
		System.out.println(p+" row updated  ");*/
		
	/*
	    int k=st.executeUpdate("Delete from  emp where empid>115");
		System.out.println(k+" rows deleted  ");*/
	}

}