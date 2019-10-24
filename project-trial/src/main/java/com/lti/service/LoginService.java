package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.controller.LoginServiceInterface;
import com.lti.dao.LoginDao;
import com.lti.dto.StudentInfo;
@Service
public class LoginService implements LoginServiceInterface{
	@Autowired
    private LoginDao dao;
	
	public StudentInfo loginService(long studAadhar){
		//StudentRegistration sr=new StudentRegistration();
		StudentInfo	 st = dao.fetchByAadhar(studAadhar);
		return st;
		
	}
    
	
	
}
