package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.OtherDetailsDao;
import com.lti.entity.StudentOtherDetails;
import com.lti.entity.StudentRegistration;

@Service
public class OtherDetailsService {
	@Autowired
	private OtherDetailsDao odao;
	
	public void addOtherDetails(StudentOtherDetails student ,int studentId ){
		StudentRegistration sr=(StudentRegistration) odao.fetchById(StudentRegistration.class, studentId);
		student.setStudentRegistration(sr);
		odao.addOtherDetails(student);
	}

}
