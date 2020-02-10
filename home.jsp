<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:voilet;
}</style>
</head>
<body>

<form:form action="gohere" method="post" modelAttribute="user"> 
<table border="2px">

<tr>
<td><form:label path="id"/>ID</td>
<td><form:input path="id"/></td>
<td><form:errors path="id" cssClass="error"/></td>
</tr><tr>
<td><form:label path="name"/>NAME</td>
<td><form:input path="name"/></td>
<td><form:errors path="name" cssClass="error"/></td>
</tr><tr>
<td><form:label path="email"/>EMAIL</td>
<td><form:input path="email"/></td>
<td><form:errors path="email" cssClass="error"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</table>
</form:form>
</body>
</html>