package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.dto.StudentInfo;

@Repository
public class LoginDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public StudentInfo fetchByAadhar(long aadharno) {
		String hpql="select s.studentId, s.studentName, s.studentPassword, s.studentAadharNo from StudentRegistration s where s.studentAadharNo=:tp";
		Query q= entityManager.createQuery(hpql);
		q.setParameter("tp", aadharno);
		Object[] arr = (Object[]) q.getSingleResult();
		StudentInfo s = new StudentInfo();
		s.setStudentId((Integer) arr[0]);
		s.setStudentName((String) arr[1]);
		s.setStudentPassword((String) arr[2]);
		return s;
	}
	

}
