package com.lti.service;

import java.lang.reflect.GenericDeclaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.Class10Dao;
import com.lti.dao.GenericDao;
import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentRegistration;

@Service
public class Class10Service {
	
	@Autowired
	private Class10Dao dao;
	
	/*public StudentRegistration fetchSidByAadhar(long aadharNo) {
		
		StudentRegistration sr=(StudentRegistration) dao.fetchSidByAadhar(aadharNo) ;
		return sr;
		
	}
	*/
	public void addMarks10(StudentMarks10 student, int studentId) {
		StudentRegistration s = (StudentRegistration) dao.fetchById(StudentRegistration.class, studentId);
		student.setStudentRegistration(s);
		dao.addMarks(student);
	}
}
