package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;

import com.lti.entity.InstituteRegistration;
import com.lti.service.ServiceInstituteRegis;

@Controller
public class ControllerInstitute {
	
	@Autowired
	private ServiceInstituteRegis instituteService;
	
	@RequestMapping(path="/register.lti",method=RequestMethod.POST)
	
	public String register(InstituteRegistration institute/*,@RequestParam("instestcerti")MultipartFile instestcerti,@RequestParam("univcerti")MultipartFile univcerti*/, Map model){
		
		instituteService.register(institute);
		return "institutelogin.jsp";
	}
	
}
