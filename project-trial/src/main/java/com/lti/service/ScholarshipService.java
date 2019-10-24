package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ScholarshipDao;
import com.lti.entity.ScholarshipStudentStatus;
import com.lti.entity.StudentRegistration;
@Service
public class ScholarshipService {

		@Autowired
		private ScholarshipDao dao;
		
		public void addScholarship(ScholarshipStudentStatus status,int studentId) {
		StudentRegistration s=(StudentRegistration) dao.fetchById(StudentRegistration.class,studentId);
		status.setStudentRegistration(s);
		dao.addScholarship(status);
	
		
	}

}
