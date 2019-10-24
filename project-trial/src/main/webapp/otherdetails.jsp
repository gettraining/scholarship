<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="otherdetails.lti" method="post">
   PRESENT CLASSCOURSE<input type="text" name="presentClass"/></br></br>
   PRESENT CLASSCOURSE YEAR<input type="number" name="presentClassYear"/></br></br>
   MODE OF STUDY<select><option value="Fulltime">FULLTIME</option>
                        <option value="Parttime">PART-TIME</option>
                </select>
   UNIVERSITY/BOARD NAME<input type="text" name="universityBoardName" /> </br> </br>
   PREVIOUS CLASS/COURSE<input type="text" name="previousClass"/>
   PREVIOUS PASSING YEAR<input type="number" name="previousPassingYear"/>

  ADMISSION DETAILS<input type="number" name="admissionFee"/>
    TUITION FEE<input type="number" name="tutionFee"/> 
    OTHER FEE <input type="number" name="otherFee"/>
    <button type="submit">SUBMIT</button>
</form>

</body>
</html>