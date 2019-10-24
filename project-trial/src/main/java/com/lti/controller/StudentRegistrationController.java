package com.lti.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.StudentRegistration;
import com.lti.service.StudentRegistrationService;

@Controller
public class StudentRegistrationController {
	
	@Autowired
	private StudentRegistrationService service;
	
	@RequestMapping(path="/registerr.lti",method=RequestMethod.POST)
	public String addStudent(StudentRegistration student,Map model){
		
		
		service.addStudent(student);
		return "login.jsp";
	}

}
