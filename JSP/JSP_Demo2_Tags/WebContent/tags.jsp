<%@page import="java.util.Scanner"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--Tag 1  Scriplet -> Where you write your java code -->
	<%
		out.println(" I like Chicken !!! ");
		out.print(6+4);
	%>
	
	<!--Tag 2  Declarative -> Where you declare variables -->
	<%!
		int x = 5;
	%>
	
	<!--Tag 3  Directive -> When you want to import package <%@page %> -->
	<%
	
	%>
	
	<!--Tag 4  Expression -> When you show only output -->
	<%=
		x
	%>
</body>
</html>