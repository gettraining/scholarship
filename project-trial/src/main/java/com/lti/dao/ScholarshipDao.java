package com.lti.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.ScholarshipStudentStatus;
@Repository
public class ScholarshipDao extends GenericDao {
	
	@Transactional
	public void addScholarship(ScholarshipStudentStatus status) {
		entityManager.merge(status);
			
	}

}
