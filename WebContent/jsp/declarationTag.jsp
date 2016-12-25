
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@page buffer="8kb"  %>
	

	<!-- private int id =  500;
	System.out.println(id); -->
	
	<%! int id= 500; %>
	Student ID: <%= id %>
	
	<hr/>
	
	<%@page import="java.util.Date" %>
	Time is: <%= new Date() %>
	
	

</body>
</html>