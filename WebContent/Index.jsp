<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JobPortal</title>
</head>
<body bgcolor="#777777">
	
	<form method="post" action="ControllerServlet"><br>
		<br>
		Enter Employee ID <br> 
		<input type="text" name="ID"><br>
		<br>
		Enter Employee Name <br> 
		<input type="text" name="name"><br>
		<br>  
		
		Email <br>
		<br> 
		<input type="text" name="email"><br> 
		<br>
		Salary <br> 
		<input type="text" name="salary"><br>
		<br> 
		
		Enter Department ID <br> <input type="text" name="deptID"><br>
		<br> 
		Enter Department Name <br> <input type="text" name="deptName"><br>
		<br> 
		Enter Department Location <br> <input type="text" name="deptLoc"><br>
		<br>
		<input type="submit"> 
	</form>


</body>
</html>