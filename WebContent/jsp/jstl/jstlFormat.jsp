<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Date Formatting. -->
	<c:set var="todayDate" value="<%= new java.util.Date()%>"/>	
	Today Date: ${todayDate } <br/>
	Today Formatted Date is (1): <fmt:formatDate pattern="yyyy-MM-dd" value="${todayDate}" />
	
	<br/>Formatted Date (2):<fmt:formatDate type="date" value="${todayDate}"/>
	<br/>Formatted Date (3):<fmt:formatDate type="time" value="${todayDate}"/>
	
	
	<!-- Currency Formatting -->
	<c:set var="balance" value="150000.4590" />
	<p>Formatted Number: <fmt:formatNumber type="number" maxFractionDigits="3" value="${balance}" /></p>
	
	<p>Currency in USA :
	<fmt:setLocale value="en_US"/>
	<fmt:formatNumber value="${balance}" type="currency"/></p>
	
</body>
</html>