package com.lti.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentInfo;
import com.lti.entity.StudentMarks12;
import com.lti.service.Class12Service;


@Controller
@SessionAttributes("validstudent")
public class Marks12Controller {

	@Autowired
	private Class12Service service;
	
	@RequestMapping(path="/marks12.lti",method=RequestMethod.POST)
	
	
	public String addMarks12(StudentMarks12 student,HttpServletRequest request,Map model) {
		
		StudentInfo st=(StudentInfo) request.getSession().getAttribute("validstudent");
		service.addMarks12(student,st.getStudentId());
		
		return "confirmation.jsp";
	}

}
