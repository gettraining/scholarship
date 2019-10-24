package com.lti.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentMarks12;

@Repository
public class Class12Dao extends GenericDao {

	@Transactional
	public void addMarks12(StudentMarks12 student) {
		entityManager.merge(student);
	}
}
