package com.lti.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentOtherDetails;

@Repository
public class OtherDetailsDao extends GenericDao {
	@Transactional
	public void addOtherDetails(StudentOtherDetails student ){
		entityManager.merge(student);
		
	}
	

}
