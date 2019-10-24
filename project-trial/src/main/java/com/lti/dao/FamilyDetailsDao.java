package com.lti.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentFamilyDetails;
import com.lti.entity.StudentMarks10;

@Repository
public class FamilyDetailsDao extends GenericDao {
	
	@Transactional
	public void addFamilyDetails(StudentFamilyDetails student) {
		entityManager.merge(student);
	}
}
