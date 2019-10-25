package com.lti.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentMarks10;

@Repository
public class MarksDao extends GenericDao {

	@Transactional
	public void addMarks(StudentMarks10 student) {
		entityManager.merge(student);
	}
}
