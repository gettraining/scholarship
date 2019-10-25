package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentMarksDto;
import com.lti.entity.ScholarshipStudentStatus;
import com.lti.service.MinisterService;

@Controller
@SessionAttributes("studentStatus")
public class MinisterController {
	
	@Autowired
	private MinisterService service;
	
	@RequestMapping(path="/minister.lti",method=RequestMethod.POST)
	
	public String fetchByStatus(Map model) {
		String status="VERIFIED BY STATE";
		List<ScholarshipStudentStatus> studentStatus= service.fetchByStatus(status);
		model.put("studentStatus", studentStatus);
		return "fetch.jsp";
		
	}

}
