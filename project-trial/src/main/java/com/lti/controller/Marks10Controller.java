package com.lti.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentInfo;
import com.lti.entity.StudentMarks10;
import com.lti.service.Class10Service;

@Controller
@SessionAttributes("validstudent")
public class Marks10Controller {
	
	@Autowired
	private Class10Service service;
	
	@RequestMapping(path="/marks.lti",method=RequestMethod.POST)

	public String addMarks10(StudentMarks10 student, HttpServletRequest request, Map model) {
		StudentInfo st=(StudentInfo) request.getSession().getAttribute("validstudent");
			
		service.addMarks10(student,st.getStudentId());
		
		return "studentmarks12.jsp";
		
	}

}
