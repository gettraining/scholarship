<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <script>
                function validate(){
                    var code=document.getElementById("mcode").value;
                    var pass=document.getElementById("password").value;
                 
                    var p1="minister1234"; var p2="hellominister";
                    if(code==p1 && pass==p2){
                    	  window.open("ministerFetching.jsp");
                        
                    }
                    else{
                    	alert("Invalid Credentials");
                    	window.open("minister.jsp");
                    }
                }
                      
          </script>
    <form>
        Enter your code:<input type ="text" id="mcode">
        Enter your password:<input type="password" id="password">
        <button type="submit" onclick="validate()">Submit</button>
        </form>
</body>
</html>