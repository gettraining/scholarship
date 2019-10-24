package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.Class10Dao;
import com.lti.dao.Class12Dao;
import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentMarks12;
import com.lti.entity.StudentRegistration;

@Service
public class Class12Service {
	
	@Autowired
	private Class12Dao dao;
	
	
	public void addMarks12(StudentMarks12 student, int studentId) {
		StudentRegistration s = (StudentRegistration) dao.fetchById(StudentRegistration.class, studentId);
		student.setStudentRegistration(s);
		dao.addMarks12(student);
	}
}
