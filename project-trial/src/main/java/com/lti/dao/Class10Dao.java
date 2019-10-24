package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentRegistration;

@Repository
public class Class10Dao extends GenericDao {
	
	/*public StudentRegistration fetchSidByAadhar(long aadharno) {
		String hql="select s.studentId from StudentRegistration s where s.studentAadharNo=:aadhar ";
		Query q= entityManager.createQuery(hql);
		q.setParameter("aadhar", aadharno);
		return (StudentRegistration) q.getSingleResult();
	}
	
	@Transactional
	public void upsert(Object obj){
		entityManager.merge(obj);
	}
	*/
	
	@Transactional
	public void addMarks(StudentMarks10 student) {
		entityManager.merge(student);
	}
}
