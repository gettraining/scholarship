<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="family.lti" method="post">
<div>
    <h3>FAMILY DETAILS</h3>
    RELIGION <select name="studentReligion"> <option value="HINDU">HINDU</option>
                      <option value="CHRISTIAN">CHRISTIAN</option></select> </br></br>
                      
    CASTE<input type="text" name="studentCaste"/>  </br></br>
    
    FATHER NAME<input type="text" name="studentFatherName"/></br></br>
    
    MOTHER NAME<input type="text" name="studentMotherName"/></br></br>
    
    ANNUAL FAMILY INCOME<input type="number" name="studentFamIncome"></br></br>
    
 	FATHER PROFESSION:  <input type="text" name="studentFatherProff"/></br></br>
 	
 	MOTHER PROFESSION:  <input type="text" name="studentMotherProff"/></br></br>
 	
 
    STATE<select name="studentState"><option value="Maharashtra">Maharashtra</option>
        <option value="Goa">Goa</option>
    </select> 
    </br></br>
    DISTRICT<select name="studentDistrict"><option value="Mumbai">Mumbai</option>
        <option value="Panji">Panji</option>
    </select> 
    </br></br>
    BLOCK<input type="text" name="studentBlock"> 
    </br></br>
     TALUKA<input type="text" name="studentTaluka">
    </br></br>
    HOUSE NO.<input type="text" name="studentHouseNo"/><br/></br>
    
    STREET NO.<input type="text" name="studentStreetNo"/><br/></br>
    
    PINCODE <input type="text" name="studentPincode"/><br/></br>
    
       MARITAL STATUS<select name="studentMaritalStatus">
        <option value="unmarried">Unmarried</option>
        <option value="married">Married</option>
    </select></br></br>
    <button type="submit">SUBMIT</button>
</div>
</form>
</body>
</html>