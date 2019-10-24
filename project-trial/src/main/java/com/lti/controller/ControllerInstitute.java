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
		
		institute.setCode(institute.getCode());
		institute.setName(institute.getName());
		institute.setDiscCode(institute.getDiscCode());
		institute.setAddress(institute.getAddress());
		institute.setPincode(institute.getPincode());
		institute.setCategory(institute.getCategory());
		institute.setLocation(institute.getLocation());
		institute.setPwd(institute.getPwd());
		institute.setPrincipalName(institute.getPrincipalName());
		institute.setState(institute.getState());
		institute.setDistrict(institute.getDistrict());
		institute.setUniBoardName(institute.getUniBoardName());
		institute.setContactNo(institute.getContactNo());
		institute.setBoardAfflCerti(institute.getBoardAfflCerti());
		institute.setInstEstabCerti(institute.getInstEstabCerti());
		
		
		instituteService.register(institute);
		return "confirm.jsp";
	}
	
}
