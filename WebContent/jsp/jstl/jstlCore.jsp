<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<hr> 1. out <br/>
	<c:out value="5040"></c:out>
	
	<hr> 2. set <br/>
	<c:set var="salary" value="10000" />
	The salary is: <c:out value="${salary }"></c:out>
	
	<c:remove var="salary"/>
	
	<hr> 3. if <br/>
	<c:set var="salary" value="15000"/>
	<c:if test="${salary > 5000 }">
		<p> My salary is: ${salary } </p>
	</c:if>
	
	<hr> 4. choose, when, otherwise <br/>
	<c:set var="salary" value="15000" />

	<c:choose>
		<c:when test="${salary <= 5000 }">
			<p> Salary is Very low to survive: ${salary } </p>
		</c:when>
		<c:when test="${salary ge 10000 }">
			<strong> Salary is Very Good: ${salary } </strong>
		</c:when>
		<c:otherwise>
			Good Salary: ${salary }
		</c:otherwise>
	</c:choose>

	<hr> 5. For each loop <br/>
	<%request.setAttribute("countries", new String[]{"Nepal", "USA", "China", "Japan"});%>

	<c:forEach var="country" items="${countries }">
		<strong> ${country } </strong>  <br/>
	</c:forEach>


	<br/>FORMAT::>>>>>>>>Date : <%= new java.util.Date() %>  <br/>
	
	<c:set var="todayDate" value="<%= new java.util.Date() %>" />
	
	Today date is: <fmt:formatDate value="${todayDate }" pattern="yyyy-MM-dd"/>
	
	<p> Currency in USA
		<fmt:setLocale value="en_US"/>
		<fmt:formatNumber type="currency" value="1500000.4592"/>
	</p>


		<hr/> FUNCTIONS>>>>>>>>><br/>
	
	<c:set var="msg" value="Welcome to Java Web! JSTL Functions!"/>
	
	<hr/> 1. contains <br/>
	${fn:contains(msg, 'Java Web') } <br/>
	
	${fn:containsIgnoreCase(msg, 'jstl') } <br/>
	
	<c:if test="${fn:contains(msg, 'Java Web') }">
		<strong> Java Web is found in above message variable. </strong>
	</c:if>

	<hr> Length: ${fn:length(msg) }
	<hr> ${fn:toUpperCase(msg) }
	<hr> ${fn:toLowerCase(msg) }





</body>
</html>