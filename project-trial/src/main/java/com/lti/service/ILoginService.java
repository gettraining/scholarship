package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ILoginDao;
import com.lti.dto.InstituteInfo;

@Service
public class ILoginService implements ILoginServiceInterface{
	
	@Autowired
	private ILoginDao dao;
	
	 public InstituteInfo  loginService(long code) {
		 
	 InstituteInfo info=dao.fetchByCode(code);
	 
	return info;
		 
	 }
	
	
	

}
