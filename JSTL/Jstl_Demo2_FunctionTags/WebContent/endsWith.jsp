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
	<c:set var="String" value="Welcome to JSP programming"/>  
	<c:if test="${fn:endsWith(String, 'programming')}">  
	<p>String ends with programming<p>  
	</c:if>   
	<c:if test="${fn:endsWith(String, 'JSP')}">  
    <p>String ends with JSP<p>  
    </c:if>    
</body>
</html>