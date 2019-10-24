package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.Class10Dao;
import com.lti.dao.FamilyDetailsDao;
import com.lti.entity.StudentFamilyDetails;
import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentRegistration;

@Service
public class FamilyDetailsService {
	
	@Autowired
	private FamilyDetailsDao famDetailsDao;
	
	public void addFamDetails(StudentFamilyDetails student, int studentId) {
		StudentRegistration s = (StudentRegistration) famDetailsDao.fetchById(StudentRegistration.class, studentId);
		student.setStudentRegistration(s);
		famDetailsDao.addFamilyDetails(student);
	}
}
