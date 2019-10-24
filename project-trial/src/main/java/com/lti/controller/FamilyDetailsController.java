package com.lti.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentInfo;
import com.lti.entity.StudentFamilyDetails;
import com.lti.entity.StudentMarks10;
import com.lti.service.Class10Service;
import com.lti.service.FamilyDetailsService;

@Controller
@SessionAttributes("validstudent")
public class FamilyDetailsController {
	
	@Autowired
	private FamilyDetailsService service;
	
	@RequestMapping(path="/family.lti",method=RequestMethod.POST)

	public String addFamDetails(StudentFamilyDetails student, HttpServletRequest request, Map model) {
		StudentInfo st=(StudentInfo) request.getSession().getAttribute("validstudent");
			
		service.addFamDetails(student,st.getStudentId());
		
		return "otherdetails.jsp";
		
	}
}
