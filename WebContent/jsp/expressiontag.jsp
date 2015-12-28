<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<!-- private int id= 500;
	Sysout(id); -->
 
ID=
<%! int id=50*10;  %>
<%= id %>


<!-- Create Method: --><br/>
<%!
int minVal(int[] arr){
	int min = arr[0];
	for(int i=0;i<arr.length;i++){
		if(min>arr[i]){
			min = arr[i];
		}
	}
	return min;
}
%>
<%! int[] arrVal = new int[]{56, 47, 2, 5, 99}; %>
<%= "Min value of  56, 47, 2, 5, 99 is: " + minVal(arrVal) %>

</body>
</html>