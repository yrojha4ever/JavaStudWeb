<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3> Student Information </h3>
	
	<form action="student" method="post">
		<fieldset>
			<legend>Student Form</legend>
		
			ID : <input type="text" name="id" /> <br/>
			Name: <input type="text" name="name"/> <br/>
			Address: <input type="text" name="address"/> <br/>
			
			Gender: <input type="radio" name="gender" value="Male"/> Male
			&nbsp; &nbsp;
			<input type="radio" name="gender" value="Female"/> Female <br/>
			
			Country:
			<select name="country">
				<option value=""> --Select Country-- </option>
				<option value="America"> America </option>
				<option value="Japan"> Japan </option>
				<option value="UK"> UK </option>
				<option value="China"> China </option>
				<option value="Nepal"> Nepal </option>
			</select>
			
			<img alt="" src="img/sunrise.jpg" style="width:50px;height:50px">
			
			<br/><br/>
			<input type="submit" value="Submit"/>
			
			
		</fieldset>
	</form>


</body>
</html>