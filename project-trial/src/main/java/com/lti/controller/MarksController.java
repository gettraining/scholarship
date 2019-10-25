package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentMarksDto;
import com.lti.entity.ScholarshipStudentStatus;
import com.lti.service.MarksService;

@Controller
@SessionAttributes("studentStatus")
public class MarksController {
	
	@Autowired
	private MarksService service;
	
	@RequestMapping(path="/marks.lti",method=RequestMethod.POST)
	
	public String fetchMarks(Map model) {
		ScholarshipStudentStatus status=(ScholarshipStudentStatus) model.get("studentStatus");
		int id=status.getStudentRegistration().getStudentId();
		StudentMarksDto studentMarks=service.fetchMarksById(id);
		model.put("studentMarks", studentMarks);
		
		return "display.jsp";
		
	}
}
