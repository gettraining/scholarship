<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class=" container">
		<form action="login.lti" method="post" onsubmit="return validate()">
			<h2 align="center">Institute Registration Request Form</h2>
			<div class="card-layout">
				<table id="table1"  cellspacing="5px" cellpadding="5%"  align="center">
					<tr>
						<td align="right">Institute Category :</td>
						<td><select class="card" name="insitituteCategory">
								<option value="A">A</option>
								<option value="B">B</option>
								<option value="C">C</option>
						</select></td>
					</tr>

<form action="login.lti" method="post">
Enter your aadhar no:<input type="text" name="aadhar">
Enter your password:<input type="password" name="password">
<button type="submit">Submit</button>
</body>
</html>