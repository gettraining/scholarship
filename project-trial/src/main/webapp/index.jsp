<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<base href="/project-trial/">
<link href="resources/CSS/main.css" rel="stylesheet">
<script src="resources/jquery-3.4.1.js"></script>
<script src="resources/JS/main.js"></script >
</head>
<body>
	<div class="header">
		<img src="resources/Images/logo.jpg" />
	</div>
	<nav id="navbar"> 
	<a href="confirm.jsp" class="menu">HOME</a> 
	<a href="#" class="menu">ABOUT US</a> 
	<a href="#" class="menu">CONTACT US</a> 
	<a id = "registration" href="#"  class="menu">REGISTRATION</a> 
	<a id = "login" href="#" class="menu">LOGIN</a> 
	</nav>
	<div id="dropdown" class = "dropdown-layout">
		<div id="dropdown-content" class="dropdown-content">
			<a id="studentRegistration" href = "studentRegistration.jsp">STUDENT</a>
			<a id="register" href = "register.jsp">INSTITUTE</a>
		</div>
		<div id="dropdown-content1" class="dropdown-content1">
			<a id="studentlogin" href = "studentlogin.jsp">STUDENT</a>
			<a id="institutelogin" href = "institutelogin.jsp">INSTITUTE</a>
			<a id="state" href = "#">STATE</a>
			<a id="minister" href = "minister.jsp">MINISTRY</a>
		</div>
	</div>
	
	<div>
		<p></p>
	</div>
	<div class="layout">
		<div class="updates">
			<div class="marquee">
				<h4>
					<img src="resources/Images/874-8745231_announcement-announce-icon-png-white.png"
						height="27px" width="27px" /> <span>LATEST UPDATES</span>

				</h4>
				<h1>LATEST UPDATES</h1>
			</div>
		</div>
		<div class="slogin">
			<div class="marquee">
				<h4>
					<img src="resources/Images/user_login.png" height="27px" width="27px" /> <span>HELPDESK</span>

				</h4>
				<h1>HELPDESK</h1>
			</div>
		</div>
	</div>
</body>
</html>