package com.lti.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentInfo;
import com.lti.entity.ScholarshipStudentStatus;
import com.lti.service.ScholarshipService;

@Controller
@SessionAttributes("validstudent")
public class ScholarshipController {
	
	@Autowired
	private ScholarshipService service;
	
	@RequestMapping(path="/apply.lti", method=RequestMethod.POST)
	
	public String addScholarship(Map model,HttpServletRequest request) {
		
		StudentInfo st=(StudentInfo)  request.getSession().getAttribute("validstudent");
		
		ScholarshipStudentStatus status=new ScholarshipStudentStatus();
		
		status.setStatus("APPLIED");
		
		service.addScholarship(status,st.getStudentId());
		
		return "confirmation.jsp";
		
		
		
		
		
	}
	

}
