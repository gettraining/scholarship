<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="registerr.lti" method="post" >
              <h2 align="center"> Fresh Student Application Form:</h2>
              <table id="table1" ; cellspacing="5px" cellpadding="5%" ; align="center">
                    <tr>
                            <td align="right">State of Domicile :</td>
                            <td>
                                   <select name="studentDomicileState">
                                          <option value="">------------Select State------------</option>
                                          <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands
                                          </option>
                                          <option value="Andhra Pradesh">Andhra Pradesh</option>
                                          <option value="Tripura">Tripura</option>
                                          <option value="Uttaranchal">Uttaranchal</option>
                                          <option value="Uttar Pradesh">Uttar Pradesh</option>
                                          <option value="West Bengal">West Bengal</option>
                                          <option value="Maharashtra">Maharashtra</option>
                                   </select>
                            </td>
                     </tr>
                     <tr>
                            <td align="right">District</td>
                            <td>
                                   <select name="studentDomicileDistrict">
                                          <option value="volvo">Volvo</option>
                                          <option value="saab">Saab</option>
                                   </select>
                            </td>
                     </tr>
                     <tr>
                            <td align="right">Name:</td>
                            <td> <input type="text" placeholder="AS IN MARKSHEET" name="studentName" style="width:200px;">
                            </td>
                     </tr>
                     <tr>
                            <td align="right">Date Of Birth:</td>
                            <td><input type="date" id="dob" name="studentDob"></td>
                     </tr>
                     <tr>
                            <td align="right">Gender:</td>
                            <td><select name="studentGender" style="width:130px;">
                                          <option value="Male">Male</option>
                                          <option value="Female">Female</option>
                                         
                                   </select>
                            </td>
                     </tr>
                     <tr>
                            <td align="right">Mobile Number</td>
                            <td><input type="tel" style="width:200px;" name="studentMobileNo" id="contact_mobile"></td>
                     </tr>
                     <tr>
                            <td align="right">Email:</td>
                            <td><input type="email" name="studentEmail" style="width:200px;" id="contact_email" /></td>
                     </tr>
                     <tr>
                            <td align="right">Institute Code:</td>
                            <td><input type="text" style="width:200px;" name="instituteCode" id="inst_code" /></td>
                     </tr>
                     <tr>
                            <td align="right">Aadhar Number:</td>
                            <td><input type="text" style="width:200px;" name="studentAadharNo" id="aadhar_no" /></td>
                     </tr>
                     <tr>
                            <td align="right">Bank IFSC Code:</td>
                            <td><input type="text" style="width:200px;" name="studentBankIfsc" id="bank_ifsc/"></td>
                     </tr>
                     <tr>
                            <td align="right">Bank Account Number:</td>
                            <td><input type="text" style="width:200px;" name="studentBankAccNo" id="acc_no" /></td>
                     </tr>
                     <tr>
                            <td align="right">Bank Name:</td>
                            <td><input type="text" style="width:200px;" name="studentBankName" id="bank" /></td>
                            </td>
                     </tr>
                     <tr>
                            <td align="right">Set your Password</td>
                            <td><input type="password" style="width:200px;" name="studentPassword" id="set_pass" />
                            </td>
                     </tr>
                     <tr>
                            <td align="right">Confirm your Password</td>
                            <td><input type="password" style="width:200px;" name="confpassword" id="conf_pass" />
                     </tr>
                     <tr>
                            <td align="right">
                                   <input type="checkbox" value="confirm">
                            </td>
                            <td>ALL THE INFORMATION FURNISHED BY ME<br>
                                   IS TRUE TO BEST OF MY KNOWLEDGE.
                            </td>
                     </tr>
                     <tr>
                            <td> <button type="submit" style="font-size: 20px;margin-left: 160px;">Submit</button>
                            <td> <button type="reset" style="font-size: 20px;">Reset</button>
                            </td>
                     </tr> 
                     
             </table>
             </form>        
</body>
</html>