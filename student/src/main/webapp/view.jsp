<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
</head>
<body>
Student Details
<c:if test="${not empty studentList}">
<table>
<tr>
<th>ID</th>
<th>UserName</th>
<th>Password</th>
</tr>
<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.id }</td>
<td>${student.username}</td>
<td>${student.password}</td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>