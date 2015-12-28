<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- TODO 1: Import this line first: -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="msgString" value="Welcome to Java web! JSTL functions."/>

<hr/> 1. fn:contains() <br/>
<c:if test="${fn:contains(msgString, 'Java')}">
   'Java' is found in: '${msgString}'
</c:if>

<hr/> 2. fn:containsIgnoreCase() <br/>
<c:if test="${fn:containsIgnoreCase(msgString, 'Jstl')}">
   'Jstl' is found in: '${msgString}'
</c:if>

<hr/> 3. fn:length():  int length(java.lang.Object) <br/>
Length of string: "${msgString}"  is: ${fn:length(msgString)}

<hr/> 4. fn:toLowerCase(): fn:toUpperCase()  <br/>
Lower Case: "${msgString}"  is: ${fn:toLowerCase(msgString)} <br/>
Upper Case: "${msgString}"  is: ${fn:toUpperCase(msgString)}

<hr/> 5. fn:trim() <br/>
<c:set var="trimString" value="  Welcome to Java web!         "/>
Without Trim: Length: ${fn:length(trimString)} <br/>

<c:set var="trimString2" value="${fn:trim(trimString)}" />
<p>With Trim: (2) Length : ${fn:length(trimString2)}</p>


</body>
</html>