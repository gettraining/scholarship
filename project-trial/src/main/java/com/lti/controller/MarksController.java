package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.StudentMarksDto;
import com.lti.entity.ScholarshipStudentStatus;
import com.lti.service.MarksService;

@Controller

public class MarksController {
	
	@Autowired
	private MarksService service;
	
	@RequestMapping(path="/marks.lti",method=RequestMethod.POST)
	
	public String fetchMarks(Map model) {
		StudentMarksDto studentMarks=service.fetchMarksById();
		model.put("studentMarks", studentMarks);
		return ".jsp"
		
		
	}
}
