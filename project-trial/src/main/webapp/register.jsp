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
<script src="resources/JS/register.js"></script>
</head>
<body>
	<div class=" container">
		<form action="register.lti" method="post" onsubmit="return validate()">
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
					<tr>
						<td align="right">Name:</td>
						<td><input id="name" type="text" name="insitituteName"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">State :</td>
						<td><select id="input" name="insitituteState" onchange="optionCheck()">
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
						<td><input id="insitituteCode" type="text" name="insitituteCode"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">DISE Code:</td>
						<td><input id="diseCode" type="text" name="diseCode"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">Location :</td>
						<td><select id="instituteLocation" name="instituteLocation"
							onchange="optionCheck()">
								<option value="">------------Select State------------</option>
								<option value="Maharashtra">Maharashtra</option>
								<option value="Kerala">Kerala</option>
						</select></td>
					</tr>
					<tr>
						<td align="right">Affiliated University/Board Name:</td>
						<td><input id="university" type="text" name="university"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">Set your Password:</td>
						<td><input type="password" style="width: 200px;"
							name="setPassword" id="setPassword" /></td>
					</tr>
					<tr>
						<td align="right">Confirm your Password:</td>
						<td><input type="password" style="width: 200px;"
							name="confPassword" id="confPassword" />
					</tr>
					<tr>
						<td align="right">Institute Establishment/Registration
							Ceritificate:</td>
						<td><input id="instituteCertificate" type="text" name="instituteCertificate"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">University/Board Affiliation Certificate:</td>
						<td><input id="universityCertificate" type="text" name="universityCertificate"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">Address:</td>
						<td><input id="address" type="text" name="address"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">Principal Name:</td>
						<td><input id="principalName" type="text" name="principalName"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right">Mobile Number:</td>
						<td><input id="insititueMobile" type="text" name="insititueMobile"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td align="right"><input type="checkbox" value="confirm">
						</td>
						<td>ALL THE INFORMATION FURNISHED BY ME <br> IS TRUE TO
							BEST OF MY KNOWLEDGE.
						</td>
					</tr>
				</table>
				<div class="button-layout">
					<button id="submit" type="submit">Submit</button>
					<button id="reset" type="reset">Reset</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>