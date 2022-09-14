<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HELLO FROM JSP TO USERS</h1>
	<c:forEach items="${usernames}" var="item">
    <h1>${item}</h1><br>
	</c:forEach>
</body>
</html>