<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println(" driver loaded... ");
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Connection con = DriverManager.getConnection(url, "system","roshan");
	System.out.println("connected successfully .... ");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from student where rollno=4");
	rs.next();
%>
Rollno : <%= rs.getString(1) %>
Name   : <%= rs.getString(2) %>
</body>
</html>