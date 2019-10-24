package com.lti.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.StudentInfo;
import com.lti.entity.StudentOtherDetails;
import com.lti.service.OtherDetailsService;

@Controller
@SessionAttributes("validstudent")
public class OtherDetailsController {
	@Autowired
	private  OtherDetailsService oservice;
	
	@RequestMapping(path="/otherdetails.lti" ,  method=RequestMethod.POST)
	
	public String addOtherDetails(StudentOtherDetails otherDetails, HttpServletRequest request, Map model){
		  StudentInfo st=(StudentInfo)request.getSession().getAttribute("validstudent");
		  oservice.addOtherDetails(otherDetails,st.getStudentId());
		  
		return"confirmation.jsp";
	}

	
}
