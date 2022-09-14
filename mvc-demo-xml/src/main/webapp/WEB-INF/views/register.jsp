<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.persistent.training.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HELLO FROM JSP</h1>
	<sf:form action = "#" 	modelAttribute = "employee" 	method="POST">
		<table>
			<tr>
				<td>Id</td>
				<td><sf:input path = "id" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><sf:input path = "name" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><sf:input path = "city" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type = "submit" name = "Add" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>