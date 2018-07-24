<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:form action="updateemployee" method="post" modelAttribute="up">
<table>


<tr>
<td>ID</td>
<td><input type= "text" name="empId"value=${modelupdate.empId} readonly></td>
</tr>

<tr>
<td>Name</td>
<td><c:input path="empName"/></td>
<td><c:errors path="empName"></c:errors>
</tr>

<tr>
<td>Qualification</td>
<td><c:select path="empQualification" items="${myq}"></c:select></td>
</tr>
<tr>

<td><input type="submit" value="Update Employee"></td>
</tr>
</table>

</c:form>
</body>
</html>