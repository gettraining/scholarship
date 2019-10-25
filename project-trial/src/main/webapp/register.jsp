<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<base href="/project-trial/">
<link href="resources/CSS/register.css" rel="stylesheet">
<script src="resources/jquery-3.4.1.js"></script>
<!-- script src="resources/JS/main.js"></script -->
</head>
<body>
	<div class=" container">
		<form action="register.lti" method="post">
			<h2 align="center">Institute Registration Request Form</h2>
			<div class="card-layout">
				<table id="table1" ; cellspacing="5px" cellpadding="5%"; align="center">
					<tr>
						<td align="right">Institute Category :</td>
						<td><select id="input" name="studentDomicileState" onchange="optionCheck()">
								<option value="">A</option>
								<option value="Maharashtra">B</option>
								<option value="Kerala">C</option>
						</select></td>
					</tr>
					<tr>
					<td align="right">Name:</td>
					<td><input id="name" type="text" name="studentName" style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">State :</td>
						<td><select id="input" name="studentDomicileState" onchange="optionCheck()">
								<option value="">------------Select State------------</option>
								<option value="Maharashtra">Maharashtra</option>
								<option value="Kerala">Kerala</option>
						</select></td>
					</tr>
					<tr>
					<td align="right">District:</td>
					<td>
						<div id="output">
							<select>
								<option></option>
							</select>
						</div>

					</td>
				</tr>
				<tr>
					<td align="right">Institute Code:</td>
					<td><input id="name" type="text" name="studentName" style="width: 200px;"></td>
					</tr>
					<tr>
					<td align="right">DISE Code:</td>
					<td><input id="name" type="text" name="studentName" style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">Location :</td>
						<td><select id="input" name="studentDomicileState" onchange="optionCheck()">
								<option value="">------------Select State------------</option>
								<option value="Maharashtra">Maharashtra</option>
								<option value="Kerala">Kerala</option>
						</select></td>
					</tr>
				</table>
			</div>
		</form>


		 

		 Affiliated University/Board Name:<input type="text"
			name="uniBoardName"><br /> Set Password:<input
			type="password" name="pwd"><br /> Confirm Password:<input
			type="password" name="confirmpass"><br />
	</div>

	<div>
		<h2>Proof Of Exisitance Of Institue</h2>
		Institute Establishment/Registration Ceritificate: <input type="text"
			name="instEstabCerti">
	</div>
	<div>
		<h2>Affiliated To:</h2>
		University/Board Affiliation Certificate: <input type="text"
			name="boardAfflCerti">
	</div>


	<div>
		<h2>Address</h2>
		Address:<input type="text" name="address"> Pincode:<input
			type="text" name="pincode"><br />
	</div>
	<div>
		<h2>Contact Details</h2>
		Principal Name:<input type="text" name="principalName"> Mobile
		Number:<input type="tel" name="contactNo"><br />

	</div>
	<div>
		<br /> <br /> <input type="checkbox" name="agree">ALL THE
		DETAILS AND DOCUMENTS SUBMITTED BY US ARE VALID AND TRUE. <br />IF
		FOUND GUILTY OF SUBMITTING INVALID DOCUMENTS, WE MAYU BE HELD
		RESPONSIBLE FOR THAT ACT BY US.
	</div>
	<div>
		<button type="submit" value="submit">Submit</button>
		<button type="reset" value="reset">Reset</button>
	</div>
	</form>
	</div>
</body>
</html>