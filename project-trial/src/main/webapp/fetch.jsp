<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Status</td>
<td>Student ID</td>
	<tr>
<c:forEach items="${studentStatus}" var="student">
	
    <tr>      
        <td><input type="text" value="${student.status}"></td>
        <td>${student.studentRegistration.studentId}</td>
        <td><a href="marks.lti">View More Details</a>
        
    </tr>
</c:forEach>

</table>
<button type="submit" onclick="">CHANGE STATUS</button>
</body>
</html>