<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Institute Registration Request Form</h1>
	</div>
	<form action="register.lti" method="post">
		<div>
			<h2>Basic Details</h2>
			Institute Category: <select name="category"><br/>
				<option value="abc">Abc</option>
				<option value="qwe">qwe</option>
				<option value="asd">asd</option>
				<option value="adii">Adii</option>
			</select> 
			
			Name:<input type="text" name="name"><br/>
			 State: <select name="state">
				<option value="abc">Abc</option>
				<option value="qwe">qwe</option>
				<option value="asd">asd</option>
				<option value="adii">Adii</option>
			</select> 
			
			District :<select name="district"><br/>
				<option value="abc">Abc</option>
				<option value="qwe">qwe</option>
				<option value="asd">asd</option>
				<option value="adii">Adii</option>
			</select> 
			
			Institute code:<input type="text" name="code"> 
			
			DISE code:<input type='' text" name="discCode"><br/> 
			
			Location:<select name="location"><br/>
				<option value="abc">Abc</option>
				<option value="qwe">qwe</option>
		</select>
			Affiliated University/Board Name:<input type="text" name="uniBoardName"><br/>
			
			Set Password:<input type="password" name="pwd"><br/>
			
			Confirm Password:<input type="password" name="confirmpass"><br/>
			</div>
			
			<div>
			<h2>Proof Of Exisitance Of Institue</h2>
			Institute Establishment/Registration Ceritificate:
			<input type="text" name="instEstabCerti">
			</div>
			<div>
			<h2>Affiliated To:</h2>
			University/Board Affiliation Certificate:
			<input type="text" name="boardAfflCerti">
			</div>
			
			
			</div>
			<div>
			<h2>Address</h2>
			Address:<input type="text" name="address">
				
			Pincode:<input type="text" name="pincode"><br/>
			</div>
			<div>
			<h2>Contact Details</h2>
			Principal Name:<input type="text" name="principalName">
			Mobile Number:<input type="tel" name="contactNo"><br/>
			
				</div>
				<div>
				<br/><br/>
				<input type="checkbox" name="agree">ALL THE DETAILS AND DOCUMENTS SUBMITTED BY US ARE VALID AND TRUE.
				<br/>IF FOUND GUILTY OF SUBMITTING INVALID DOCUMENTS, WE MAYU BE HELD RESPONSIBLE FOR THAT ACT BY US.
				</div>
				<div>
				<button type="submit" value="submit">Submit</button>
				<button type="reset" value="reset">Reset</button>
				</div>
</form>
</body>
</html>