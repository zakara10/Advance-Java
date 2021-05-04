<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="String" value="Welcome to javatpoint"/>  
	<c:if test="${fn:containsIgnoreCase(String, 'javatpoint')}">  
    <p>Found javatpoint string<p>  
	</c:if>  
	<c:if test="${fn:containsIgnoreCase(String, 'JAVATPOINT')}">  
    <p>Found JAVATPOINT string<p>  
	</c:if>      
</body>
</html>