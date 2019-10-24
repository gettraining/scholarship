<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="marks.lti" method="post">
<div>
<h3>10th CLASS</h3>
ROLL NUMBER<input type="number" name="rollnumber"/>
BOARD NAME<input type="text" name="boardname"/></br></br>
PASSING YEAR<input type="text" name="passingyear"/>
% OBTAINED:<input type="number" name="percentage"/>
<input type="hidden" value="{validstudent}">
<button type="submit">Submit</button>
</div>

</form>
</body>
</html>