package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.InstituteInfo;
import com.lti.service.ILoginServiceInterface;

@Controller
@SessionAttributes("validinstitute")
public class ILoginController {
	
	@Autowired
	ILoginServiceInterface iLoginServiceInterface;
	
	@RequestMapping(path="/institutelogin.lti",method=RequestMethod.POST)
	
	public String loginServiceHandler(@RequestParam("instcode") long code,@RequestParam("instpassword") String password,Map model) {
		
		InstituteInfo info=iLoginServiceInterface.loginService(code);
		
		if(password.equals(info.getInstitutePwd())&&code==(info.getInstituteCode())){
			model.put("validstudent", info);
			return "redirect:confirm.jsp";
		}
		else {
			return "institutelogin.jsp";
		}
		
		
		
		
	}

}
