package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentInfo;
import com.lti.entity.StudentRegistration;
import com.lti.service.LoginServiceInterface;

@Controller
@SessionAttributes("validstudent")
public class LoginController {

	@Autowired
	LoginServiceInterface loginServiceInterface;
	
	@RequestMapping(path= "/login.lti", method = RequestMethod.POST)
	public String loginServiceHandler(@RequestParam("aadharno") long studentAadharNo, 
			@RequestParam("password") String studentPassword, Map model){
	
		StudentInfo student=loginServiceInterface.loginService(studentAadharNo);	
	//StudentRegistration st=new StudentRegistration();
	
	 if(studentPassword.equals(student.getStudentPassword())){
			model.put("validstudent", student);
		 return "redirect:confirmation.jsp";
	 }
	 else
	 {
  return "login.jsp";
	}
}
}
