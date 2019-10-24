package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.DaoRegisterInst;
import com.lti.entity.InstituteRegistration;

@Service
public class ServiceInstituteRegis {
	
	@Autowired
	private DaoRegisterInst registerDao;
	
	public void register(InstituteRegistration inst){
		registerDao.save(inst);
		//code for sending email here
	}
}
