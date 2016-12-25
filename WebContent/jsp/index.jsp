<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	Server time is: <% out.println(new java.util.Date());  %>  <br/>
	<hr/>
	Result of 5 * 10 =  <%out.println(5 * 10); %>
	<hr/>
	Server time is: <%= new java.util.Date()  %>
	<hr/>
	<form action="welcome.jsp">
		Username <input type="text" name="username"> <br /> 
		Password <input type="text" name="password"> <br /> 
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>