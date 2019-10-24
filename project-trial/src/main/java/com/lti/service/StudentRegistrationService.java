package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.GenericDao;
import com.lti.entity.StudentRegistration;

@Service
public class StudentRegistrationService {
	
	@Autowired
	private GenericDao genericDao;
	
	public void addStudent(StudentRegistration st){
		genericDao.upsert(st);
		
	}

}
