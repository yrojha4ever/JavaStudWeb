<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!-- 1. This line is needed to import JSTL core feature. Make sure you have jstl-1.2.jar library in web-inf lib folder. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	

<hr/> 2. c:out <br/> 
<!-- It is just like JSP expression tag but it is used for exression. It renders data to the page. -->
<c:out value="${employee.address.city }"></c:out> <br/>
Employee Name is John: <c:out value="${employee.name == 'John' }"></c:out> <br/>
<%-- <%= new java.util.Date() %> It does not work in c:out. --%>

<hr/>3. c:set   <br/><!-- c:set  tag is JSTL-friendly version of the setProperty action.-->
<c:set var="salary" scope="session" value="${5000*2}"/>
Salary is: <c:out value="${salary}"/>	

<hr/> 4. c:remove  <br/><!-- c:remove tag removes a variable from either a specified scope or the first scope.-->
<c:set var="empSalary" scope="session" value="${2000*2}"/>
<p>Before Remove Value: <c:out value="${empSalary}"/></p>
<c:remove var="empSalary"/>
<p>After Remove Value: <c:out value="${empSalary}"/></p>

<hr> 5. c:catch <br/>
<c:catch var ="catchException">
   <% int x = 5/0;%>
</c:catch>
<c:if test = "${catchException != null}">
   <p>The exception is : ${catchException} <br />
   There is an exception: ${catchException.message}</p>
</c:if>

<hr> 6. c:if It tests the condition.  <br/>
<c:set var="salary" scope="session" value="${5000*2}"/>
<c:if test="${salary > 4000}">   <!-- or salary gt 4000 -->
   <p>My salary is: ${salary} <p> <!-- OR <c:out value="${salary}"/> -->
</c:if><br/>
<c:if test="${employee.name ne null && employee.name eq 'John' }">
	Employee Name is: ${employee.name }
</c:if>

<hr> 7. c:choose,c:when,c:otherwise:  <br/>
<c:set var="salary" scope="session" value="${5000*2}"/>
<p>Your salary is : Rs.${salary}</p>
<c:choose>
    <c:when test="${salary <= 5000}">
       Salary is very low to survive.
    </c:when>
    <c:when test="${salary > 10000}">
        Salary is very good.
    </c:when>
    <c:otherwise>
        Good salary.
    </c:otherwise>
</c:choose>

<hr> 8. c:import : tag provides all of the functionality of the <include> action but also allows for inclusion of absolute URLs.<br/>
<c:import url="../directive/employeeDetail.jsp"/>
<%-- <c:import var="data" url="http://www.google.com"/>
<c:out value="${data}"/> --%>

<hr> 9. c:foreach: <br/>
<u>Rich Countries: </u><br/>
<c:forEach var="richCountry" items="${richCountries}">
	${richCountry} <br/>
</c:forEach>
<br/> For Tokens: <br/>
<c:forTokens items="Ram,Shyam,Hari" delims="," var="name">
   <c:out value="${name}"/><br/>
</c:forTokens>

<hr> 10. c:redirect = response.sendRedirect<br/>
<%-- <c:redirect url="http://www.google.com"/> --%>

<hr> 11. c:url: tag formats a URL into a string and stores it into a variable. This tag automatically performs URL rewriting when necessary. <br/>
<a href="<c:url value="/jsp/index.jsp"/>">TEST(Url rewriting)</a>  <br/>
<a href="/jsp/index.jsp">TEST(without url rewriting. using)</a>



</body>
</html>